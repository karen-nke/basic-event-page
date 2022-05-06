import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register extends JFrame {
    //Add new text field and column
    JTextField firstname = new JTextField(15);
    JTextField lastname = new JTextField(15);
    JTextField user = new JTextField(15);
    JPasswordField pss = new JPasswordField(15);
    JTextField IC = new JTextField(15);
    JTextField email = new JTextField(15);
    JTextField contact = new JTextField(15);
    JTextField address = new JTextField(15);
    JTextField postcode = new JTextField(15);
    JTextField country = new JTextField(15);
    JTextField state = new JTextField(15);

    //Add new Label and assign text
    JLabel first_label = new JLabel("    First Name: ");
    JLabel IC_label = new JLabel("    IC: ");
    JLabel last_label = new JLabel("    Last Name: ");
    JLabel user_label = new JLabel("    Username:");
    JLabel pss_label = new JLabel("    Password: ");
    JLabel email_label = new JLabel("    Email: ");
    JLabel contact_label = new JLabel("    Contact No.: ");
    JLabel add_label = new JLabel("    Address: ");
    JLabel pc_label = new JLabel("    Postcode: ");
    JLabel c_label = new JLabel("    Country: ");
    JLabel s_label = new JLabel("    States: ");

    //Add Button and assign text
    JButton cancel = new JButton("Cancel");
    JButton register = new JButton("Register");

    public Register(){

        //Add new title
        super("Registration");

        //Set size
        setSize(500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set location to center
        setLocationRelativeTo(null);

        //Set new Panel and columns
        JPanel pane = new JPanel(new GridLayout(0, 2, 5, 5));

        //Add text field, label and button into JPanel
        pane.add(first_label);
        pane.add(firstname);
        pane.add(last_label);
        pane.add(lastname);
        pane.add(user_label);
        pane.add(user);
        pane.add(pss_label);
        pane.add(pss);
        pane.add(IC_label);
        pane.add(IC);
        pane.add(email_label);
        pane.add(email);
        pane.add(contact_label);
        pane.add(contact);
        pane.add(add_label);
        pane.add(address);
        pane.add(pc_label);
        pane.add(postcode);
        pane.add(c_label);
        pane.add(country);
        pane.add(s_label);
        pane.add(state);


        pane.add(cancel);
        pane.add(register);
        add(pane);

        //Assign cancel button
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });


        //Assign register button
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(pane,"You had successfully registered a new account. You are able to login now.");
                dispose();
            }
        });

        setVisible(true);
    }
}
