import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private ArrayList<BuddyInfo> BuddyInformation;
    private List<AddresbookView> views;

    public AddressBook(){
        this.BuddyInformation = new ArrayList<>();
        views = new ArrayList<AddresbookView>();

    }
    public void addAddressBookView(AddresbookView view){
        this.views.add(view);
    }

    public void addBuddy(BuddyInfo info){
        BuddyInformation.add(info);
        handleviewupdate();
    }

    public void removeBuddy(BuddyInfo info){
        BuddyInformation.remove(info);

        handleviewupdate();
    }

    public void friendsprint(int i){
       System.out.println(" what i want to see " +  BuddyInformation.get(i));


    }
    public List<BuddyInfo> getBuddies() {
        return BuddyInformation;
    }

    private void handleviewupdate(){
        for (AddresbookView view : views) {
            view.handleviewupdate();
        }
    }


    public void seeBuddys(){
        for(BuddyInfo buddiesInfo: BuddyInformation){
            System.out.println("my name is " + buddiesInfo.name() + " i live at " + buddiesInfo.Address() + " my phone number is " + buddiesInfo.number());
        }
    }

   /* public static void main(String[] args) {
        System.out.println("address book");
        BuddyInfo Renua = new BuddyInfo("Daniel","12 street","445678" );
        BuddyInfo Tola = new BuddyInfo("TOla","14 street","422678" );
        AddressBook friendsaddress = new AddressBook();// new
        friendsaddress.seeBuddys();

    }*/
}
