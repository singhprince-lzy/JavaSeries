package com.comp;
class queue{
	private char q[];
	private int putloc,getloc;
	
	queue(int size){
		q=new char[size];
		putloc=getloc=0;
		
	}
	
	queue(queue ob){
		putloc=ob.putloc;
		getloc=ob.getloc;
		q=new char[ob.q.length];
	
	
	//copy elements
	for(int i=getloc;i<putloc;i++) {
		q[i]=ob.q[i];
		
	}
}
	//copy a queue with initial value
	queue(char a[]){
		putloc=0;
		getloc=0;
		q=new char[a.length];
		
		for(int i=0;i<a.length;i++) {
			put(a[i]);
		}
	}
	
	//put a char into the queue
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println("Queue is full ");
			return;
		}
		
		q[putloc++]=ch;
	}
	
	//Get the character from the queue.
	char get() {
		if(getloc==putloc) {
			System.out.println("Queue is in empty condition.");
			return(char)0;
			}
		
		return q[getloc++];
		
	}
}
public class q1 {

	public static void main(String[] args) {
		queue q1=new queue(10);
		
		char name[]= {'p','r','i','n','c','e'};
		queue q2= new queue(name);
		
		char ch;
		int i;
		//put some character in the queue q1.
		
		//this is for capital
		/*for(i=0;i<10;i++) {
			q1.put((char)('A'+i));
		}*/
		
		//This is for small
		for(i=0;i<10;i++) {
			q1.put((char)('A'+i+32));
		}
		queue q3=new queue(q1);
		
		
		//Show the queue.
		System.out.print("Content of the queue1: ");
		for(i=0;i<10;i++) {
			ch=q1.get();
			System.out.print(ch);
			
		}
		System.out.println("\n");
		
		System.out.print("Content of the queue2: ");
		for(i=0;i<6;i++) {
			ch=q2.get();
			System.out.print(ch);
			
		}
		System.out.println("\n");
		
		System.out.print("Content of the queue3: ");
		for(i=0;i<10;i++) {
			ch=q3.get();
			System.out.print(ch);
			
		}
	}

}
