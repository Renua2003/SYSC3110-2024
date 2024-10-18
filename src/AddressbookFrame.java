import javax.swing.*;
import java.awt.*;
import javax.swing.DefaultListModel;

public class AddressbookFrame extends JFrame implements AddresbookView {
    private JList<BuddyInfo> buddyInfoJList;
    private DefaultListModel<BuddyInfo> listModel;
    AddressBook model;

    public AddressbookFrame(AddressBook model){
        super("Address book ");
        this.model =  model;
        this.model.addAddressBookView(this);

        listModel = new DefaultListModel<>();
        buddyInfoJList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(buddyInfoJList);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(400, 300);

        // Create the menu bar
        JMenuBar Menue = new JMenuBar() ;
        JMenu Addressbook = new JMenu("Addressbook");
        JMenuItem displayBudyy = new JMenuItem("display Buddy");
        JMenuItem AddBuddy = new JMenuItem("Add Buddy");
        JMenuItem removebuddy = new JMenuItem(" remove Buddy");


        AddressbookController controller = new AddressbookController(model);

        displayBudyy.addActionListener(controller);
        AddBuddy.addActionListener(controller);
        removebuddy.addActionListener(controller);


        displayBudyy.setActionCommand("Action_1");
        AddBuddy.setActionCommand("Action_2");
        removebuddy.setActionCommand("Action_3");

        Addressbook.add(displayBudyy);
        Addressbook.add(AddBuddy);
        Addressbook.add(removebuddy);
        Menue.add(Addressbook);//adds to menue

        this.add(Menue,BorderLayout.NORTH);
        this.add(listScrollPane, BorderLayout.CENTER);



        this.setVisible(true);








    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddressBook addressBook = new AddressBook();
            new AddressbookFrame(addressBook);
        });
    }

    @Override
    public void handleviewupdate() {
        // Update the list model whenever the view is notified
        listModel.clear();
        for (BuddyInfo buddy : model.getBuddies()) {
            listModel.addElement(buddy);
        }


    }
}
