
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card extends Payment
{
    // instance variables - replace the example below with your own
    private int fee;
    private String availableClass;
    private Member registeredMember;
    private String cardNumber;
    private String sortCode;

    /**
     * Constructor for objects of class Payment
     */
    public Card()
    {
        this.fee = -1;

    }

    public Card(Member registeredMember, String availableClass, int fee, String cardNumber, String sortCode) {
        this.registeredMember = registeredMember;
        this.availableClass = availableClass;
        this.fee = fee;
        this.cardNumber = cardNumber;
        this.sortCode = sortCode;
    }

    public void makePayment(int newFee) {
        this.fee = newFee;
    }

    public int getPayment() {
        return this.fee;
    }
    
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public String getCardNumber() {
        return this.cardNumber;
    }
    
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
    
    public String getSortCode() {
        return this.sortCode;
    }

    public void setMember(Member registeredMember) {
        this.registeredMember = registeredMember;
    }

    public String getMember() {
        return registeredMember.getName();
    }

    public void setRegisteredClass(String registeredClass) {
        this.availableClass = registeredClass;
    }

    public String getRegisteredClass() {
        return availableClass;
    }
}
