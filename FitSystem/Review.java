import java.util.*;

/**
 * Write a description of class Review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    // instance variables - replace the example below with your own
    private int score;
    private Member registeredMember;
    private FitnessClass registeredClass;
    private String classReview;

    /**
     * Constructor for objects of class Review
     */
    public Review() {
        this.classReview = "No reviews yet";
    }

    public Review(Member registeredMember, FitnessClass registeredClass, int score, String classReview)
    {
        this.registeredMember = registeredMember;
        this.registeredClass = registeredClass;
        if ((score > 0) && (score <= 5)) {
            this.score = score;
        }
        else {
            System.out.println("Enter a score between 1 to 5");
        }
        this.classReview = classReview;
    }

    public void setMember(Member registeredMember) {
        this.registeredMember = registeredMember;
    }

    public String getMember() {
        return registeredMember.getName();
    }

    public void setRegisteredClass(FitnessClass registeredClass) {
        this.registeredClass = registeredClass;
    }

    public String getRegisteredClass() {
        return registeredClass.getClassName();
    }

    public void setScore(int score)
    {
        if ((score > 0) && (score <= 5)) {
            this.score = score;
        }
        else {
            System.out.println("Enter a score between 1 to 5");
        }

    }

    public int getScore() {
        return score;
    }

    public void setClassReview(String classReview) {
        this.classReview = classReview;
    }

    public String getClassReview() {
        return classReview;
    }

    public String toString() {
        return "Review by "+ registeredMember.getName() +  " for " +
        registeredClass.getClassName() + ": " +
        this.classReview + " | Score - " + this.score;
    }
}
