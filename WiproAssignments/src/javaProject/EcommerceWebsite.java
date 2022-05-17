package javaProject;

import java.util.*;

public class EcommerceWebsite {
   public static int countTags(int items, int tags)
    {
		return items/tags;
    }
    public static int countTotalItemsPurchasedIncludingFreeItem(int amount,int priceOfEachItem, int tags)
    {
    	int count=0;
		while(amount>0) {
			count++;
			amount=amount-priceOfEachItem;
		}
		return count+countTags(count, tags);
    }

    public static void main (String[] args)
    {
		Scanner sc= new Scanner(System.in);
        // total money to be spent
        int amount=sc.nextInt();
        //  cost of each item
        int priceOfEachItem=sc.nextInt();
        // no of tags exchanged for one free item.
      int tags=sc.nextInt();
        System.out.println("The total number of items (purchased + free items) : "+countTotalItemsPurchasedIncludingFreeItem(amount , priceOfEachItem, tags));
    }


}