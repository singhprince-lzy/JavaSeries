package javatuts;

public class binsearch {
	static int binarysearch(int arr[],int beg,int end,int key) {
		
		while(beg<=end) {
		int mid=(beg+end)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid]>key) {
			
			binarysearch(arr,beg,mid-1,key);
		}
		else
		{
			binarysearch(arr,mid+1,end,key);
			
		}
		
	}
		return -1;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,7,1,9};
		int key=9;
		int index=binarysearch(arr,0,5,key);
		if(index==-1) {
			System.out.println("Key "+key+" is not in the array");
		}
		else {
			System.out.println("Key "+key+" is at index "+ index);
		}
		
		
		

	}

}
