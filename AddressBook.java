import java.util.*;
public class AddressBook {
    private LinkedList<BuddyInfo> collect;

    public AddressBook() {
        collect = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        collect.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        collect.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        LinkedList<BuddyInfo> collection = new LinkedList();
        BuddyInfo bud = new BuddyInfo();
        bud.setName("John");
        bud.setNumber(61312312);
        bud.setAddress("123 Fake Street");
        collection.add(bud);
        collection.remove(bud);
    }
}