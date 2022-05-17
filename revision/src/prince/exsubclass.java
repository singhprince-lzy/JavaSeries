package prince;
class errorsum extends Exception{
	int d,n;
	errorsum(int i,int j){
		n=i;
		d=j;
	}
	public String tostring() {
		return "result of "+n+"/"+d+"is not string";
	}
	
}

public class exsubclass {

	public exsubclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
