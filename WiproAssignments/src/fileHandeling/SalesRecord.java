package fileHandeling;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SalesRecord {
	private Date date;
    private int customer_id;
    private int product_category;
    private String payment_method;
    private double amount;
    private double time_on_site;
    private int clicks_in_site;


    public SalesRecord() {
    }
// Constructor to initialize values
    public SalesRecord(Date date, int customer_id, int product_category, String payment_method, double amount, double time_on_site, int clicks_in_site) {
        this.date = date;
        this.customer_id = customer_id;
        this.product_category = product_category;
        this.payment_method = payment_method;
        this.amount = amount;
        this.time_on_site = time_on_site;
        this.clicks_in_site = clicks_in_site;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
    	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
        LocalDate d=LocalDate.parse(sdf,date);
    }

    public int getCustomer_id() {
        return this.customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_category() {
        return this.product_category;
    }

    public void setProduct_category(int product_category) {
        this.product_category = product_category;
    }

    public String getPayment_method() {
        return this.payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTime_on_site() {
        return this.time_on_site;
    }

    public void setTime_on_site(double time_on_site) {
        this.time_on_site = time_on_site;
    }

    public int getClicks_in_site() {
        return this.clicks_in_site;
    }

    public void setClicks_in_site(int clicks_in_site) {
        this.clicks_in_site = clicks_in_site;
    }

    @Override
    public String toString() {
        // The record must be returned in the below format
        // SalesRecord{date=xxx, customer_id=xx, product_category=xx, payment_method='xxx', amount=xx, time_on_site=xx, clicks_in_site=xx}
        return "SalesRecord{date=" +this.date+", customer_id="+this.customer_id+", product_category="+this.product_category+", payment_method="+this.payment_method+", amount="+this.amount+", time_on_site="+this.time_on_site+", clicks_in_site="+this.clicks_in_site+"}";

    }

}
