package fileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;

public class MobileStore {
	public static void main(String [] args) {
		MobileStore m= new MobileStore();
		List<Mobile>l=new ArrayList<Mobile>();
		l=m.findPhonePixelMoreThan12MP();
		System.out.println(l.size());
		System.out.println(l);
		
	}



    public MobileStore()
    {

    }
    public List<Mobile> readMobileData(String fileName)
    {
		
		List<Mobile> ls=new ArrayList<Mobile>();

		try(BufferedReader br1= new BufferedReader(new FileReader(fileName))){
			String line=null;
			int itr=0;
			while((line=br1.readLine())!=null){
				if(itr==0) {
					itr++;
					continue;
				}
				Mobile ms=new Mobile();
				String[] arr = line.split(",");
				ms.SetBrandName(arr[0]);
				ms.SetModelName(arr[1]);
				ms.Setcost(Double.parseDouble(arr[2]));
				ms.SetScreenSize(arr[3]);
				ms.SetBatteryLife(arr[4]);
				ms.SetStorageSpace(arr[5]);
				ms.SetCameraPixel(Integer.parseInt(arr[6]));
				ls.add(ms);
			}
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }

        return ls;
    }

    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
		String fileName="C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\mobile.csv";
		List<Mobile> ls=new ArrayList<Mobile>();
		ls=readMobileData(fileName);

		List<Mobile> res=new ArrayList<Mobile>();

		for(int i=0;i<ls.size();i++){
			if(ls.get(i).getBrandName().equals(brandName)){
				res.add(ls.get(i));
			}
		}
		

        return res;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {
		String fileName="C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\mobile.csv";
		List<Mobile> ls=new ArrayList<Mobile>();
		ls=readMobileData(fileName);

		List<Mobile> res=new ArrayList<Mobile>();
		double cp=0;
		for(int i=0;i<ls.size();i++){
			if((cp=ls.get(i).getcost())>=500){
				res.add(ls.get(i));
			}
		}
		

        return res;

      
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
		String fileName="C:\\Users\\Prince\\eclipse-workspace\\WiproAssignments\\src\\fileHandeling\\mobile.csv";
		List<Mobile> ls=new ArrayList<Mobile>();
		ls=readMobileData(fileName);

		List<Mobile> res=new ArrayList<Mobile>();
		int cam=0;
		for(int i=0;i<ls.size();i++){
			if((cam=ls.get(i).getCameraPixel())>12){
				res.add(ls.get(i));
			}
		}
		

        return res;
    }


}

