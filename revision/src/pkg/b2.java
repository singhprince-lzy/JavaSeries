package pkg;

class twodshape{
	double width,height;
	
	void showdim() {
		System.out.println("Width and height  are: "+width +"and"+height);
	}
}
class triangle extends twodshape{
	String style;
	
	double area() {
		return width*height /2;
		
	}
	
	void showstyle() {
		System.out.println("Triangle is "+ style);
	}
}

public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t1 =new triangle();
		triangle t2= new triangle();
		
		t1.width= 20;
		t1.height=30;
		t1.style="Filled";
		
		t2.width=10;
		t2.height=10;
		t2.style="Outlined";

	}

}
