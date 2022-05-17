package lambdaExp;
import java.util.*;
import java.io.*;

class DistanceComparator implements Comparator<TicketingData> {

	@Override
	public int compare(TicketingData o1, TicketingData o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getTravelledKM()-o1.getTravelledKM(), 0);
				//o2.getTravelledKM()-o1.getTravelledKM();
	}

}

public class TicketOperations {
	 public List<TicketingData> readTicketingData(String fileName)
	    {
			List<TicketingData> ls=new ArrayList<>();
			try(BufferedReader br1=new BufferedReader(new FileReader(fileName))){
				br1.readLine();
				String line=null;
				while((line=br1.readLine())!=null){
					String[] arr = line.split(",");
					TicketingData td=new TicketingData();
					td.setSchedule(arr[0]);
					td.setroute_no(arr[1]);
					td.setticket_from_stop_id(Integer.parseInt(arr[2]));
					td.setticket_from_stop_seq_no(Integer.parseInt(arr[3]));
					td.setticket_till_stop_id(Integer.parseInt(arr[4]));
					td.setticket_till_stop_seq_no(Integer.parseInt(arr[5]));
					td.setTicketDate(arr[6]);
					td.setTicketTime(arr[7]);
					td.setTotalAmount(Double.parseDouble(arr[8]));
					td.setTravelledKM(Float.parseFloat(arr[9]));
					
					ls.add(td);
				}

			}catch(FileNotFoundException e){
				e.getMessage();
			}catch(IOException e){
				e.getMessage();
			}
	        return ls;
	    }
	    //This method sorts the data based on the kms travelled by a bus (route)
	    public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList)
	    {
	    	Collections.sort(ticketingDataList, new DistanceComparator());
	        return ticketingDataList;
	    }

	    //This method calculates the total revenue from ticket collection amount
	    public double totalAmountCollected(List<TicketingData> ticketingDataList)
	    {
	    	//List<TicketingData>ticketingDataList= ticketingDataList1
	    	TicketCollection tc= (ticketingDataList1) -> {
	    		double sum=0;
		    	Iterator<TicketingData>itr=ticketingDataList1.iterator();
		    	while(itr.hasNext()) {
		    		TicketingData t= new TicketingData();
		    		t=itr.next();
		    		sum+=t.getTotalAmount();
		    	}
		    	return sum;
	    	};
	    	return tc.totalCollection(ticketingDataList);
	    }
	    
	    public static void main(String[] args) {
	    	TicketOperations ticketingOperations=new TicketOperations();
	        List<TicketingData> ticketingDataList,t;
	        final String fileName = "C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\lambdaExp\\sample.csv";
	        
	        ticketingDataList=ticketingOperations.readTicketingData(fileName);
	        
	        ticketingDataList=ticketingOperations.sortByKmsTravelled(ticketingDataList);
		    
	        for(int i=0;i<ticketingDataList.size();i++) {
	        	System.out.print(ticketingDataList.get(i).getScheduleNo()+", ");
	        	System.out.print(ticketingDataList.get(i).getRouteNo()+", ");
	        	System.out.print(ticketingDataList.get(i).getticket_from_stop_id()+", ");
	        	System.out.print(ticketingDataList.get(i).getticket_from_stop_seq_no()+", ");
	        	System.out.print(ticketingDataList.get(i).getticket_till_stop_id()+", ");
	        	System.out.print(ticketingDataList.get(i).getticket_till_stop_seq_no()+", ");
	        	System.out.print(ticketingDataList.get(i).getticketDate()+", ");
	        	System.out.print(ticketingDataList.get(i).getticketTime()+", ");
	        	System.out.print(ticketingDataList.get(i).getTotalAmount()+", ");
	        	System.out.print(ticketingDataList.get(i).getTravelledKM()+", ");
	        	System.out.println();
	        }
	        
	        System.out.println(ticketingOperations.totalAmountCollected(ticketingDataList));
	        
	    
	    }

}
