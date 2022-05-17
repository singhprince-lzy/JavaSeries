package functionalInterface;

public class Mobile {
	// Declare the attributes for the Mobile class
		private String brandName;
		private String modelNo;
		private double amount;
		private int quantity;
	    //Define parameterized constructors
	    public Mobile(String brandName, String modelNo, double amount, int quantity) {
			this.brandName=brandName;
			this.modelNo=modelNo;
			this.amount=amount;
			this.quantity=quantity;
	    }

	public Mobile() {
			// TODO Auto-generated constructor stub
		}

		//setters method
		public void setBrandName(String str){
			this.brandName=str;
		}

		public void setModelNo(String str){
			this.modelNo=str;
		}

		public void setamount(double amt){
			this.amount=amt;
		}

		public void setQuantity(int str){
			this.quantity=str;
		}

	// getters method
	    public String getBrandName() {
	        return this.brandName;
	    }

		public String getModelNo(){
			return this.modelNo;
		}

	    public double getAmount() {
	        return this.amount;
	    }

	    public int getQuantity() {
	        return this.quantity;
	    }

	   // Override the to String method

	   public String toString(){
		   return this.brandName+", "+this.modelNo+", "+this.amount+", "+this.quantity;
	   }

}
