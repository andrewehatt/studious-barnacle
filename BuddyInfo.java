import java.util.*;
public class BuddyInfo {

    private String name;
    private int number;
    private String address;
    //private BuddyInfo theBuddy;

    //public BuddyInfo() {
    //    theBuddy = new BuddyInfo();
    //}

    public String getName() {
        return this.name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int num) {
        this.number = num;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String addy) {
        this.address = addy;
    }

    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo();
        myBuddy.setName("Bort");
        myBuddy.setNumber(613123);
        System.out.print("Hello ");
        System.out.print(myBuddy.getName());
        System.out.print("!");

        BuddyInfo buddy2 = new BuddyInfo();
        buddy2.setName("Charles");
        buddy2.setNumber(613234);
        buddy2.setAddress("742 Evergreen Terrace");



    }
}



