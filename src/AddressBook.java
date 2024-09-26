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

    public void doesnothing(){
        System.out.println("Yowa");
    }

    public static void main(String[] args) {
        System.out.println("address book");
        BuddyInfo Renua = new BuddyInfo("Daniel","12 street","445678" );
        BuddyInfo Tola = new BuddyInfo("TOla","14 street","422678" );
        AddressBook friendsaddress = new AddressBook();// new

    }
}
