import java.util.*;

public class Member
{
    
    private String name;
    
    /**
     * Constructor for objects of class Member
     */
    public Member(String name)
    {
        this.name = name;
    }

    public Member() {
        name ="ToBeSet";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "Customer: " + this.name;
    }
}
