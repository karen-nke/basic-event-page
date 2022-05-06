import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventOrganizerSignUpForm extends JFrame {

	public static void main(String[] args) {
 		new EventOrganizerSignUpForm();
	 }
	 
	 public EventOrganizerSignUpForm() {
		 
		 super("Sign Up Form For Organization");
		 JLabel title = new JLabel("Sign Up Form For Organization");
		 title.setHorizontalAlignment(JLabel.CENTER);
	        
	        //Set GridLayout with 0 row, 1 column, 5 horizontal gap and 5 vertical gap
	        JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));
	        
	        //Add text field to the frame
	        JTextField Organization_Owner = new JTextField(15);
	   	    JTextField Organization_Name = new JTextField(15);
	     	JTextField Identity_card_Owner = new JTextField(15);
	     	JTextField Email_Address = new JTextField(15);
	   	    JTextField Contact_Number = new JTextField(15);
	   	    JTextField Address = new JTextField(15);
	   	    JTextField Country = new JTextField(15);
	   	    JTextField State = new JTextField(15);
	   	 
	   	    //Add combo box to the frame
	     	JComboBox<?> Gender = new JComboBox<Object>(new String[]{"Male", "Female"});
	   	    JComboBox<?> Type_of_Organization = new JComboBox<Object>(new String[]{"Environment", "Health", 
	   	    		"Community", "Animal", "Others"});

	   	    //Add button to the frame
	        JButton cancel = new JButton("Cancel");
	   	    JButton register = new JButton("Register");
	        
	   	    //Setting the label of the frame 
	        JLabel Organization_Owner_label = new JLabel("Name of Organization Owner**: ");
	        JLabel Organization_Name_label = new JLabel("Name of Organization**: ");
	        JLabel Identity_card_Owner_label = new JLabel("Identity Card of Owner**: ");
	        JLabel Gender_label = new JLabel("Gender**: ");
	        JLabel Email_Address_label = new JLabel("Email Address**: ");
	        JLabel Contact_Number_label = new JLabel("Contact No.**: ");
	        JLabel Address_label = new JLabel("Address**: ");
	        JLabel Country_label = new JLabel("Country**: ");
	        JLabel State_label = new JLabel("State**: ");
	        JLabel Type_of_Organization_label = new JLabel("Type of Volunteering Organization**: ");
	        
	        //Setting font to the frame
	        Font font = new Font ("Times New Roman", Font.BOLD, 20);
	        Font font1 = new Font ("Comic Sans MS", Font.PLAIN, 15);
	        
	        //Setting different font to different label, combo box, and button   
	        title.setFont(font);
	        cancel.setFont(font);
	        register.setFont(font);
	        Organization_Owner_label.setFont(font1);
	        Organization_Name_label.setFont(font1);
	        Identity_card_Owner_label.setFont(font1);
	        Email_Address_label.setFont(font1);
	        Contact_Number_label.setFont(font1);
	        Address_label.setFont(font1);
	        Country_label.setFont(font1);
	        State_label.setFont(font1);
	        Gender.setFont(font1);
	        Gender_label.setFont(font1);
	        Type_of_Organization.setFont(font1);
	        Type_of_Organization_label.setFont(font1);
	        
	        //Creating the panel to the frame
	        panel.add(title);
	        panel.add(Organization_Owner_label);
	        panel.add(Organization_Owner);
	        panel.add(Organization_Name_label);
	        panel.add(Organization_Name);
	        panel.add(Identity_card_Owner_label);
	        panel.add(Identity_card_Owner);
	        panel.add(Gender_label);
	        panel.add(Gender);
	        panel.add(Email_Address_label);
	        panel.add(Email_Address);
	        panel.add(Contact_Number_label);
	        panel.add(Contact_Number);
	        panel.add(Address_label);
	        panel.add(Address);
	        panel.add(Country_label);
	        panel.add(Country);
	        panel.add(State_label);
	        panel.add(State);
	        panel.add(Type_of_Organization_label);
	        panel.add(Type_of_Organization);
	        panel.add(register);
	        panel.add(cancel);
	        
	        //Adding the panel to the frame
	        add(panel);
	        
	        //Setting the panel to be seen 
	        setVisible(true);
	        setSize(400, 650);
		    setLocationRelativeTo(null);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	    	 
	        //Setting the button to a listener and popping up the dialog box
	    	register.addMouseListener(new MouseAdapter() {
	    	@Override
	        public void mouseClicked(MouseEvent e) {
	        super.mouseClicked(e);
	    	JOptionPane.showMessageDialog(null,"You had successfully registered as an organizer. "
	    			+ "\nPlease check your confirmation email and started to upload the event for volunteer.");
        	dispose();
	       
	    	}
	        });
	    	
	        cancel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	        super.mouseClicked(e);
	        dispose();
	   
	        }
	        });
	        
 }}
