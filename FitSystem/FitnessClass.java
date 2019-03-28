import java.util.*;
/**
 * Write a description of class FitnessClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FitnessClass
{
    private String className;
    private int availablePlaces;
    private int takenPlaces;
    private int fee;
    private DateTime dateAndSlot;
    private Member newMember;
    private ArrayList<Member> memberArr = new ArrayList<Member>();
    private Payment newPayment;
    private int totalPayment;
    private ArrayList<Payment> paymentArr = new ArrayList<Payment>();
    private Review rating;
    private ArrayList<Review> reviewArr = new ArrayList<Review>();
    private double averageRating;

    public FitnessClass(String name, String dateTime, int places, int fee) {
        this.className = name;
        this.dateAndSlot = new DateTime(dateTime);
        this.availablePlaces = places;
        this.takenPlaces = 0;
        this.fee = fee;
        this.totalPayment = 0;
        this.averageRating = -1;
    }

    public FitnessClass(){
        this.className = "ToBeSet";
        this.availablePlaces = -1;
        this.takenPlaces = 0;
        this.averageRating = -1;
        this.fee = -1;
        this.totalPayment = 0;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return this.fee;
    }

    public void addRating(Review rating) {
        this.rating = rating;
        reviewArr.add(rating);
    }

    public double getAverageRating() {
        double sum = 0;
        for (Review i: reviewArr) {
            sum += i.getScore();
        }
        return sum / reviewArr.size();
    }

    public void printAllReviews() {
        for (Review i: reviewArr) {
            System.out.println(i.toString());
        }
    }
    //register Cash
    public void registerNewMemberCash(Member newMember) {
        this.newMember = newMember;
        memberArr.add(newMember);
        availablePlaces--;
        takenPlaces++;
        newPayment = new Cash(newMember, this.className, this.fee);
        paymentArr.add(newPayment);
    }

    //register Card
    public void registerNewMemberCard(Member newMember, String cardNumber, String sortCode) {
        this.newMember = newMember;
        memberArr.add(newMember);
        availablePlaces--;
        takenPlaces++;
        newPayment = new Card(newMember, this.className, this.fee, cardNumber, sortCode);
        paymentArr.add(newPayment);
    }
    
    public void removeMember(Member oldMember){
        String tempMember = oldMember.getName();
        memberArr.remove(oldMember);
        availablePlaces++;
        if (memberArr.isEmpty()) {
            takenPlaces = 0;
        } else {
            takenPlaces--;
        }
        
        for (int i = 0; i < paymentArr.size(); i++) {
            if (paymentArr.get(i).getMember().equals(tempMember)) {
                paymentArr.remove(i);
            }
        }
    }

    public String getMembersListText() {
        return memberArr.toString();
    }
    
    public ArrayList<Member> getMembersListObject() {
        return memberArr;
    }
    
    public ArrayList<Payment> getMemberAndClassList() {
        return paymentArr;
    }

    public int getTotalPaymentForClass() {
        totalPayment = 0;
        for (Payment i: paymentArr) {
            totalPayment = totalPayment + this.fee;
        }
        return totalPayment;
    }

    public String getClassName()
    {
        return this.className;
    }

    public void setClassName(String name)
    {
        this.className = name;
    }

    public int getAvailablePlaces() {
        return this.availablePlaces;
    }

    public int getTakenPlaces() {
        return this.takenPlaces;
    }

    public void setAvailablePlaces(int places) {
        this.availablePlaces = places;
    }
    
    public void setDateTime(String dateAndSlot) {
        this.dateAndSlot = new DateTime(dateAndSlot);
    }    
        
    public String getDateTime() {
        if (dateAndSlot == null) {
            System.out.println("The date hasn't been set yet.");
        } 
        return this.dateAndSlot.toString();
    }

    public String toString()
    {
        return "\n" + this.className + " (" + this.dateAndSlot.toString() + ", " + this.availablePlaces +" places)";
    }
}
