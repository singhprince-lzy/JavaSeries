package pkg;

public class binary {

	public binary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class showbits{
			int numbits;
			
			showbits(int n){
				numbits=n;
			}
			
			void show(long val) {
				long mask =1;
				
				mask<<=numbits-1;
				
				int spacer=0;
				for(;mask!=0;mask>>>=1) {
					
				}
				
			}
		}

	}

}
