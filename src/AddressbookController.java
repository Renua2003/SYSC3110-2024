
import javax.swing.*;import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressbookController implements ActionListener {
   private AddressBook model;



   public AddressbookController(AddressBook model){
       this.model = model;

    }
    @Override
    public void actionPerformed(ActionEvent e) {


        String command = e.getActionCommand();
        if (command.equals("Action_1")) {
            model.seeBuddys();

        } else if (command.equals("Action_2")) {
            String name = JOptionPane.showInputDialog(null, "Enter Buddy's Name:");
            String address = JOptionPane.showInputDialog(null, "Enter Buddy's Address:");
            String number = JOptionPane.showInputDialog(null, "Enter Buddy's Phone Number:");
            if (name != null && address != null && number != null) {
                BuddyInfo newBuddy = new BuddyInfo(name, address, number);
                model.addBuddy(newBuddy);
            }


        } else if (command.equals("Action_3")) {
            // Prompt user to remove a buddy by name
            String name = JOptionPane.showInputDialog(null, "Enter Buddy's Name to Remove:");
            if (name != null) {
                BuddyInfo buddyToRemove = null;
                for (BuddyInfo buddy : model.getBuddies()) {
                    if (buddy.name().equals(name)) {
                        buddyToRemove = buddy;
                        break;
                    }
                }
                if (buddyToRemove != null) {
                    model.removeBuddy(buddyToRemove);
                } else {
                    JOptionPane.showMessageDialog(null, "Buddy not found.");
                }
            }
        }

    }}

