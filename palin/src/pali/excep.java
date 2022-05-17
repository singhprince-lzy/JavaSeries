package pali;

import java.util.*;

public class excep{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        
        int num=s;
        
        int sumOdd=0;
        int sumEven=0;
        
        int count=0;
        while(num>0){
            count++;
            if(count%2==0){
                sumEven+=num%10;
                
            }else{
                
                sumOdd+=num%10;
            }
            num=num/10;
        }
        
        if(sumOdd==sumEven){
            System.out.println("Equal");
            
        }else{
            System.out.println("Not Equal");
        }
    }
}
