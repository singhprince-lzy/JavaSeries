package fileHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesAnalysis {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	// This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
	 public int countOfSalesRecords(String fileName) throws IOException{
         int recordCount = 0;
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		while (reader.readLine() != null) recordCount++;
		reader.close();

        return recordCount;
    }

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException {
        SalesRecord[] salesData = new SalesRecord[recordCount];
		try (BufferedReader br1 = new BufferedReader(new FileReader(fileName))) {
            int itr=0;
            int index = 0;
            String line = null;
            while ((line = br1.readLine()) != null) {
            	if(itr==0){
					itr++;
					continue;
				}
                String[] arr = line.split(",");
                SalesRecord p = new SalesRecord();
                try {
                	p.setDate(sdf.parse(arr[0]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                p.setCustomer_id(Integer.parseInt(arr[1]));
				p.setProduct_category(Integer.parseInt(arr[2]));
                p.setPayment_method(arr[3]);
				p.setAmount(Double.parseDouble(arr[4]));
				p.setTime_on_site(Double.parseDouble(arr[5]));
				p.setClicks_in_site(Integer.parseInt(arr[6]));
              
             salesData[index] = p;
            index++;

            }
        
              
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    
        return salesData;
     }

    public static void main(String[] args) throws ParseException, IOException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        // read the file purchase_details.csv
        String fileName = "C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\object_purchase.csv";
        // the count of lines in the file
        int count = salesAnalysis.countOfSalesRecords(fileName);
        //array to hold the sales records
        SalesRecord[] salesRecords = salesAnalysis.readRecords(fileName,count);

       // display the records that have been read from the file
        //System.out.println(p.length);
        for(int i =0;i<salesRecords.length;i++)
        {
           salesRecords[i].toString();
           
        }
    }  

}
