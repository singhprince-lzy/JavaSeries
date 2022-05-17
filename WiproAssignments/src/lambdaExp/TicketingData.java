package lambdaExp;

public class TicketingData {
	private String schedule_no;
	public String getScheduleNo(){
		return this.schedule_no;
	}

	public void setSchedule(String str){
		this.schedule_no=str;
	}

	private String route_no;
	public String getRouteNo(){
		return this.route_no;
	}
	public void setroute_no(String str){
		this.route_no=str;
	}

	private int ticket_from_stop_id;
	public int getticket_from_stop_id(){
		return this.ticket_from_stop_id;
	}
	public void setticket_from_stop_id(int str){
		this.ticket_from_stop_id=str;
	}

	private int ticket_from_stop_seq_no;
	public int getticket_from_stop_seq_no(){
		return this.ticket_from_stop_seq_no;
	}
	public void setticket_from_stop_seq_no(int str){
		this.ticket_from_stop_seq_no=str;
	}

	private int ticket_till_stop_id;
	public int getticket_till_stop_id(){
		return this.ticket_till_stop_id;
	}
	public void setticket_till_stop_id(int str){
		this.ticket_till_stop_id=str;
	}

	private int ticket_till_stop_seq_no;
	public int getticket_till_stop_seq_no(){
		return this.ticket_till_stop_seq_no;
	}
	public void setticket_till_stop_seq_no(int str){
		this.ticket_till_stop_seq_no=str;
	}

	private String ticketDate;
	public String getticketDate(){
		return this.ticketDate;
	}
	public void setTicketDate(String str){
		this.ticketDate=str;
	}

	private String ticket_time;
	public String getticketTime(){
		return this.ticket_time;
	}
	public void setTicketTime(String str){
		this.ticket_time=str;
	}

	private double total_ticket_amount;
	public double getTotalAmount(){
		return this.total_ticket_amount;
	}
	public void setTotalAmount(double str){
		this.total_ticket_amount=str;
	}



    private float travelledKM;

    public float getTravelledKM() {
        return travelledKM;
    }
	public void setTravelledKM(float str){
		this.travelledKM=str;
	}

}
