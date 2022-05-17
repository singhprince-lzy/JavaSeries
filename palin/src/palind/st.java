package palind;

public class st {

	public static void main(String[] args) {
		
		int arr[]= {5,2,7,3,1};
		int i,j,key;
		for(i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=i&&arr[i]>key) {
				arr[i+1]=arr[i];
				j--;
			}
			arr[j]=key;
		}
	i=0;	
while(i<arr.length) {
	System.out.println(arr[i]);
	i++;
}
	}

}
