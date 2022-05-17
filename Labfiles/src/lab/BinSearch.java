package lab;

public class BinSearch {


	public static void BinarySearch(int arr[],int first,int last ,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
				
			}
			else if(arr[mid]==key) {
				int k=mid;
				System.out.println("Element is found at the Array index "+(k));
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element is not found in the array");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int key=11;
		int last=arr.length-1;
		try {
			BinarySearch(arr,0,last,key);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		

	}

}
