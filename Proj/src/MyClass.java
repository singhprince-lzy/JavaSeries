import java.util.*;

class Fruit
{
    int FruitId;
    String FruitName;
    int Price;
    int Rating;
    
    Fruit(int Fid,String Fname, int Fprice,int Frating){
        FruitId=Fid;
        FruitName=Fname;
        Price=Fprice;
        Rating=Frating;
    }
    
    public void setprice(int F,String Fn,int P, int R){
        FruitId=F;
        FruitName=Fn;
        Price=P;
        Rating=R;
    }
    
    public int getFruitId(){
        return FruitId;
        
    }
    
    public String getFruitName(){
        return FruitName;
    }
    public int getPrice(){
        return Price;
    }
    
    public int getRating(){
        return Rating;
    }
    
}


public class MyClass{
    
    static int FindMaxPriceByRating(Fruit fruit[],int param){
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].Rating>param){
                return fruit[i].FruitId;
            }
        } 
        return -1;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Fruit fruits[]=new Fruit[4];
        for(int i=0;i<4;i++){
        	int fid,rat,pri;
        	String fnm;
        	
            fid=sc.nextInt();
            fnm=sc.nextLine();
            pri=sc.nextInt();
            rat=sc.nextInt();
            
        }
        
        int rat=sc.nextInt();
        
        int res=MyClass.FindMaxPriceByRating(fruits,rat);
        if(res!=-1){
            System.out.println(res);
        }
        else{
            System.out.println("No such Fruit");
        }
		
	}
}

