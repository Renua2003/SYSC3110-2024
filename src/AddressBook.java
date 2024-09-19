import java.util.ArrayList;
public class AddressBook {

    private ArrayList<BuddyInfo> BuddyInformation;

    public AddressBook(){
        this.BuddyInformation = new ArrayList<>();

    }

    public void addBuddy(BuddyInfo info){
        BuddyInformation.add(info);
    }

    public void removeBuddy(BuddyInfo info){
        BuddyInformation.remove(info);
    }

    public void friendsprint(int i){
       System.out.println(" what i want to see " +  BuddyInformation.get(i));

    }

    public static void main(String[] args) {
        System.out.println("address book");
    }
}
