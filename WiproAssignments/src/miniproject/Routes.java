package miniproject;

import java.sql.Date;
import java.sql.Time;

public class Routes {

	private String Source;
	private String Dest;
	private String time;
	private double distance;
	private String Airfare;

	public Routes(){
		this.Source="";
		this.Dest="";
		this.distance=0;
		this.Airfare="";
	}

	public String getSource(){
		return this.Source;
	}

	public void setSource(String str){
		this.Source=str;
	}

	public String getDest(){
		return this.Dest;
	}

	public void setDest(String str){
		this.Dest=str;
	}

	public double getDist(){
		return this.distance;
	}

	public void setDist(double str){
		this.distance=str;
	}

	public String gettime(){
		return this.time;
	}

	public void settime(String str){
		this.time=str;
	}

	public String getAirFare(){
		return this.Airfare;
	}

	public void setAirFare(String str){
		this.Airfare=str;
	}

}
