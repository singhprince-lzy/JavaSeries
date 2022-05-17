package miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.transform.Source;

public class FlightInfo {
	java.util.Date formatter;
    
	public int fileLineCount(String fileName) throws IOException {
		 int recordCount = 0;
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			while (reader.readLine() != null) recordCount++;
			reader.close();

	      return recordCount;
	}
	
	public Routes[] readFromFile(String fileName) throws IOException {
		FlightInfo f=new FlightInfo();
        int numberOfRecords = f.fileLineCount(fileName);
        Routes[] route = new Routes[numberOfRecords- 1];
        

        // objects of different Routess
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName))) {
            br1.readLine();
            int index = 0;
            String line = null;
            while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
                Routes p = new Routes();
                p.setSource(arr[0]);
                p.setDest(arr[1]);
                p.setDist(Double.parseDouble(arr[2]));
                p.settime(arr[3]);
				p.setAirFare(arr[4]);                
               
             	route[index] = p;
            	index++;

            }
        
              
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    
        return route;
    }
	
	//function for showing direct flight
	public void AllshowDirectFlight(Routes [] r) {
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i].getSource()+" "+r[i].getDest()+" "+r[i].getDist()+" "+r[i].gettime()+" "+r[i].getAirFare()+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName="C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\miniproject\\route.csv";
		FlightInfo finfo=new FlightInfo();
		Routes [] r=finfo.readFromFile(fileName);
		
		System.out.println("Display all records from the file");
		//finfo.AllshowDirectFlight(r);
		String [] destinationCities= {"London","Frankfurt","Mumbai","Pune"};
		String source="Delhi";
		
		//finfo.showDirectFlight(source,destinationCities);
		finfo.ShowConnectedFlights(r, source, "London" );
		
		
	}
	
	public void ShowConnectedFlights(Routes [] r, String Source,String dest) {
		ArrayList<String>s=new ArrayList<String>();
		ArrayList<String>d=new ArrayList<String>();
		
		for(int i=0;i<r.length;i++) {
			s.add(r[i].getSource());
			d.add(r[i].getDest());
		}
		
		if(s.contains(Source) && d.contains(dest)) {
			if(r[s.indexOf(Source)].getDest().equals(r[d.indexOf(dest)].getSource())) {
				System.out.println(r[s.indexOf(Source)].getSource()+" "+r[s.indexOf(Source)].getDest()+" "+r[s.indexOf(Source)].getDist()+" "+r[s.indexOf(Source)].gettime()+" "+r[s.indexOf(Source)].getAirFare());
				System.out.println(r[d.indexOf(dest)].getSource()+" "+r[d.indexOf(dest)].getDest()+" "+r[d.indexOf(dest)].getDist()+" "+r[d.indexOf(dest)].gettime()+" "+r[d.indexOf(dest)].getAirFare());
			}
			else {
				System.out.println("Sorry no connected flight");
			}
		}else {
			System.out.println("Sorry no connected flight");
		}
	}
	
	
	
	
	
	
	

	private void showDirectFlight(String from,String[] to) throws IOException {
		FlightInfo f=new FlightInfo();
		String fileName="C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\miniproject\\route.csv";
		Routes [] r=f.readFromFile(fileName);
		ArrayList<String> DestinationCity= new ArrayList<String>();
		for(int i=0;i<r.length;i++) {
			DestinationCity.add(r[i].getDest());
		}
		Arrays.sort(to);
		
		
		for(int i=0;i<to.length;i++) {
			if(DestinationCity.contains(to[i])) {
				int index=DestinationCity.indexOf(to[i]);
				System.out.println(r[index].getSource()+" "+r[index].getDest()+" "+r[index].getDist()+" "+r[index].gettime()+" "+r[index].getAirFare()+" ");
				System.out.println();
			}else {
				System.out.println("We are sorry. At this point of time, we do not have any flight originating from "+from+" to "+to[i]);
			}
		}	
	}

}
