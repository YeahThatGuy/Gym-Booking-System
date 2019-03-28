
/**
 * Write a description of class Cash here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cash extends Payment
{
    // instance variables - replace the example below with your own
    private int fee;
    private String availableClass;
    private Member registeredMember;

    /**
     * Constructor for objects of class Payment
     */
    public Cash()
    {
        this.fee = -1;

    }

    public Cash(Member registeredMember, String availableClass, int fee) {
        this.registeredMember = registeredMember;
        this.availableClass = availableClass;
        this.fee = fee;
    }

    public void makePayment(int newFee) {
        this.fee = newFee;
    }

    public int getPayment() {
        return this.fee;
    }

    public void setMember(Member registeredMember) {
        this.registeredMember = registeredMember;
    }

    public String getMember() {
        return this.registeredMember.getName();
    }

    public void setRegisteredClass(String registeredClass) {
        this.availableClass = registeredClass;
    }

    public String getRegisteredClass() {
        return availableClass;
    }
}
