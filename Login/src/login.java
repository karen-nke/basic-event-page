import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class login extends JFrame{
    //Set label as user name and password
    JLabel username = new JLabel("   Username:");
    JLabel password = new JLabel("   Password:");

    //Set the text field column
    JTextField us = new JTextField(30);
    JPasswordField ps = new JPasswordField(30);

    //Set new button
    JButton cancel = new JButton("Cancel");
    JButton login = new JButton("Login");
    JButton register = new JButton("Click here to Sign Up");
    JButton forgotPass = new JButton ("Forgot Password");

    public login (){
        //Set title of the frame
        super ("Happiness XV Login Page");

        //Set new font
        Font font1 = new Font("Times New Roman", Font.BOLD,17);

        //Set font into username and password
        username.setFont(font1);
        password.setFont(font1);

        //Set size of the frame
        setSize(650,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set location to center
        setLocationRelativeTo(null);

        //Set layout gaps and columns
        JPanel all = new JPanel(new BorderLayout(5,5));
        JPanel detail = new JPanel(new GridLayout(4,3,5,1));
        JPanel button = new JPanel(new GridLayout(1,2,5,10));

        //Add JLabel and JTextField to "detail" JPanel
        detail.add(username);
        detail.add(us);
        detail.add(password);
        detail.add(ps);

        //Add JButton to "button" JPanel
        button.add(cancel);
        button.add(login);
        button.add(register);
        button.add(forgotPass);
        register.setHorizontalAlignment(JButton.CENTER);

        //Add "detail" and "button" JPanel into "all" JPanel
        all.add(detail, BorderLayout.CENTER);
        all.add(button, BorderLayout.SOUTH);
        add(all);

        //Set to visible
        all.setVisible(true);

        // Assigned Register Button
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Register rg = new Register();
                rg.setVisible(true);
                rg.pack();
                rg.setLocationRelativeTo(null);
            }
        });


        //Assign login button
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String TUsername = us.getText();
                String TPassword = ps.getText();
                if (TUsername.contains("JnChin") && TPassword.contains("5678")){
                    JOptionPane.showMessageDialog(null, "Hi " + TUsername + ", You have login successfully.","Login Success!", JOptionPane.DEFAULT_OPTION);
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sorry "  + TUsername + "! Please enter a valid username and password. Or please Sign Up as a new member!","Login Error!", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        //Assign cancel button
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLocationRelativeTo (null);
                JOptionPane.showConfirmDialog(cancel,"Are you sure to exit? ", "Exit", JOptionPane.YES_NO_OPTION);
                System.exit(0);
            }
        });

        //Assign forgot password button
        forgotPass.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Message msg = new Message ();
                msg.setVisible(true);
                msg.pack();
                msg.setLocationRelativeTo(null);
            }
        });



    }
}
