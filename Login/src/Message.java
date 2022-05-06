import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Message extends JFrame {

    //Set new text field
    JTextField TEmail = new JTextField (4);

    //Set new label
    JLabel email = new JLabel ("   Email: ");

    //Set new button
    JButton Submit = new JButton ("Submit");
    JButton Cancel = new JButton ("Cancel");

    public Message(){
        //Set new title
        super("Forgot Password");

        //Set size
        setSize(50, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set location to center
        setLocationRelativeTo(null);

        //Set new JPanel and size
        JPanel pane = new JPanel(new GridLayout (0, 2, 5, 5));

        //Add text field, label and button to JPanel
        pane.add(email);
        pane.add(TEmail);
        pane.add(Submit);
        pane.add(Cancel);
        add(pane);

        //Assign cancel button
        Cancel.addMouseListener(new MouseAdapter () {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });

        //Assign submit button
        Submit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(pane,"You had successfully submitted your email. We have sent an Email for you. Please check your inbox.");
                dispose();
            }
        });

        //Set to visible
        setVisible (true);
    }
}
