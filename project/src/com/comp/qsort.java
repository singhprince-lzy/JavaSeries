package com.comp;
class quicksort{
	static void qisort(char items[]) {
		qs(items,0,items.length-1);
	}
	
	private static void qs(char items[],int left,int right) {
		int i,j;
		char x,y;
		
		i=left;j=right;
		x=items[(left+right)/2];
		
		do {
			while((items[i]<x)&(i<right))i++;
			while((x<items[j])&(j>left))j--;
			
			if(i<=j) {
				y=items[i];
				items[i]=items[j];
				items[j]=y;
				i++;j--;
			}
		}while(i<=j);
		
		if(left<j)qs(items,left,j);
		if(i<right)qs(items,i,right);
	}
}


public class qsort {

	public static void main(String[] args) {
	char a[]= {'d','x','a','r','p','j','i'};
	int i;
	
	System.out.println("Originaml array: ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
	}
	System.out.println();
	
	quicksort.qisort(a);
	System.out.println("Sorted arry");
	for(i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	}

}
