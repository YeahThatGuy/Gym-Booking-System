import java.util.*;
import java.text.*;
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DateTime
{
    private Date date;
    private SimpleDateFormat sdf;

    /**
     * Constructor for objects of class Date
     */
    public DateTime()
    {
        this.date = new Date();
    }

    public DateTime(String inputDateTime) {
        try {
            sdf = new SimpleDateFormat("EEEE/H");
            this.date = sdf.parse(inputDateTime);
        }
        catch (Exception e) {
            System.out.println("Wrong format should be \"Day of week/Time\"; example: \"Tuesday/10\"");
        }

    }

    public void setDateTime(String inputDateTime) {
        try {
            sdf = new SimpleDateFormat("EEEE/H");
            this.date = sdf.parse(inputDateTime);
        }
        catch (Exception e) {
            System.out.println("Wrong format should be \"Day of week/Time\"; example: \"Tuesday/10\"");
        }
    }

    public Date getDateTime() {
        return date;
    }
    
    /*
    public String toString() {
        return "The slot is " + sdf.format(date);
    }
    */
   
    public String toString() {
        return sdf.format(date);
    }
}
