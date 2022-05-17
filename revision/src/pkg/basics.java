package pkg;


class one {
	int a,b,c;
	int  volume;
	one(int i,int j,int k){
		a=i;
		b=j;
		c=k;
		volume=a*b*c;
	}


//return true if one has same value of the a,b,c;
  boolean sameblock(one ob){
	if((ob.a==a) &&(ob.b==b)&&(ob.c==c)) 
		return true;
	else return false;
}
  //return true if one volume == volume;
  boolean samevol(one ob) {
	  if(ob.volume==volume)
		  return true;
	  else return false;
  }
}


 public class basics {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 one obj1=new one(10,2,5);
		 one obj2=new one(10,2,5);
		 one obj3=new one(12,23,4);
		 
		 System.out.println("Obj1 has same dimension has obj2:"+ obj1.sameblock(obj2));
		 System.out.println("Obj1 has same dimension has obj3:"+ obj1.sameblock(obj3));
		 System.out.println("Obj1 has same volume has obj2:"+ obj1.samevol(obj2));
		
		
	}

}
