public class BuddyInfo {


    private String name;
    private String Address;
    private String number;
    public String name() {
        return name;
    }

    public String Address() {
        return Address;
    }

    public String number() {
        return number;
    }
    public BuddyInfo(String name,String Address, String number){
        this.name = name;
        this.Address= Address;
        this.number= number;
    }
    public BuddyInfo(){

        this.name= "Renua";
        this.Address="50 preston street";
        this.number="1234891085";
        //just adding some commentsk
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        BuddyInfo buddyInfo = new BuddyInfo("renua","50 preston street","1234891085");
        System.out.println(buddyInfo.name);
        System.out.println(buddyInfo.Address);
        System.out.println(buddyInfo.number);

        BuddyInfo Renua = new BuddyInfo("Daniel","12 street","445678" );
        BuddyInfo Tola = new BuddyInfo("TOla","14 street","422678" );
        AddressBook friendsaddress = new AddressBook();
        friendsaddress.addBuddy(Renua);
        friendsaddress.addBuddy(Tola);
        friendsaddress.addBuddy(buddyInfo);
        friendsaddress.friendsprint(1);
    }
}
