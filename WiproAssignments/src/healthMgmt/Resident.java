package healthMgmt;

import java.util.Comparator;

public class Resident implements Comparator<Resident>{
	 private String fullName;
		private int socialSecurityNumber;
		private char gender;

		public String getFullName() {
	        return this.fullName;
	    }
		public void setFullName(String str){
			this.fullName=str;
		}

		public int getSSN() {
	        return this.socialSecurityNumber;
	    }
		public void setSSN(int str){
			this.socialSecurityNumber=str;
		}

		public char getGender() {
	        return this.gender;
	    }
		public void setGender(char str){
			this.gender=str;
		}



	    //getter setter

	    //constructor

	    public Resident(String fullName, int socialSecurityNumber, char gender) {
			this.fullName=fullName;
			this.socialSecurityNumber=socialSecurityNumber;
			this.gender=gender;
	    }

	    public Resident() {
			// TODO Auto-generated constructor stub
		}
		//override toString method
		public String toString(){
			return fullName;
			
		}
		
		@Override
		public int compare(Resident o1, Resident o2) {
			// TODO Auto-generated method stub
			return o1.getFullName().compareTo(o2.getFullName());
			
		}
		
		

}
