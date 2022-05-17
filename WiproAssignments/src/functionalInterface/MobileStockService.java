package functionalInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.*;
import java.io.*;

public class MobileStockService {
	public void displayAllProducts(List<Mobile> mobileList) {
		Iterator<Mobile>itr= mobileList.iterator();
		while(itr.hasNext()) {
			Mobile m= new Mobile();
			m=itr.next();
			System.out.print(m.getBrandName()+", ");
			System.out.print(m.getModelNo()+", ");
			System.out.print(m.getAmount()+", ");
			System.out.print(m.getQuantity());
			System.out.println();
		}
    }

    // This method will filter by the brand name
    public List<Mobile> filterByBrandName(List<Mobile> mobiles, Predicate<Mobile> pre) {
    	Predicate<Mobile> lesserthan = brandName -> ( );
        return null;
    }

    //Calculate total invoice amount for a particular brand of phone
    public double calculateInvoiceAmountForABrand(List<Mobile> mobileList) {
       // Use the Function Interface to perform the calculations
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileStockService mobileStockService;
		List<Mobile> mobileList;
		mobileStockService = new MobileStockService();
        mobileList = Arrays.asList(new Mobile("Redmi 9","A9",399,7),
                new Mobile("Vivo","X60 Pro",399,7),
                new Mobile("Samsung","W21",810,13),
                new Mobile("SonyXperia","X70",450,17),
                new Mobile("OPPO","F17 Pro",599,10));
        
        mobileStockService.displayAllProducts(mobileList);

	}

}
