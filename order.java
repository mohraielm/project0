package sandwichapp;



import java.text.DateFormat;
import java.util.Date;

public class order {
    protected String time;
    protected sandwich sand;
    protected String name;
    
    public order(){
        name="";
        ordertime();
}
    public void ordertime(){
    Date now = new Date(); 
    DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, 
DateFormat.MEDIUM); 
    this.time = defaultDate.format(now);
    }

    
    public order(String user, sandwich c,String ordertime){
        
        this.name=user;
        this.sand=c;
        ordertime();
    }
    
    public String OrderInfo(){
        return String.format(time+" "+name+" "+sand.breadO()+" "+sand.veggieO()+" "+sand.meatO()+" "+"$%.2f\n",sand.getprice());
    }
}
