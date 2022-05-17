package fileHandeling;

public class Mobile {
	private String brandName;
    private String modelName;
    private double cost;
    private String screenSize;
    private String batteryLife;
    private String storageSpace;
    private int cameraPixels;

    //getter and setter
	public String getBrandName(){
		return this.brandName;
	}

	public void SetBrandName(String s){
		this.brandName=s;
	}


	public String getModelName(){
		return this.modelName;
	}
	public void SetModelName(String s){
		this.modelName=s;
	}

	public double getcost(){
		return this.cost;
	}


	public void Setcost(double s){
		this.cost=s;
	}

	public String getScreensize(){
		return this.screenSize;
	}

	public void SetScreenSize(String s){
		this.screenSize=s;
	}

	public String getBatteryLife(){
		return this.batteryLife;
	}


	public void SetBatteryLife(String s){
		this.batteryLife=s;
	}

	public String getStorageSpace(){
		return this.brandName;
	}


	public void SetStorageSpace(String s){
		this.storageSpace=s;
	}

	public int getCameraPixel(){
		return this.cameraPixels;
	}


	public void SetCameraPixel(int s){
		this.cameraPixels=s;
	}


    //constructor
	public Mobile(){

	}

	public String toString(){
		return "BrandName="+this.brandName+", "+"ModelName="+this.modelName+", "+"Cost in $="+this.cost+", "+"ScreenSize="+this.screenSize+", "+"BatteryLife="+this.batteryLife+", "+"StorageSpace="+this.storageSpace+", "+"Camera Pixels="+this.cameraPixels+", ";
	
	}


}
