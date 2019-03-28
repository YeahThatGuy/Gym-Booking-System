
/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Payment
{
    private int fee;
    private String availableClass;
    private Member registeredMember;

    /**
     * Constructor for objects of class Payment
     */
    public Payment()
    {
        this.fee = -1;
        
    }

    public Payment(Member registeredMember, String availableClass, int fee) {
        this.registeredMember = registeredMember;
        this.availableClass = availableClass;
        this.fee = fee;
    }

    public abstract void makePayment(int newFee);
    
    public abstract int getPayment();

    public abstract void setMember(Member registeredMember);

    public abstract String getMember();

    public abstract void setRegisteredClass(String registeredClass);

    public abstract String getRegisteredClass();

}
