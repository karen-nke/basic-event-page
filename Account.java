import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Account extends JFrame {

    JButton post = new JButton("Post");
    JButton vol_hrs = new JButton("Volunteering Hours");
    JButton com_ev = new JButton("Completed Event");
    JButton upc_ev = new JButton("Upcoming Event");
    JButton fav_act = new JButton("Favourite Activities");
    JLabel my_profile = new JLabel("My Porfile");
    JLabel name = new JLabel("Elsa");
    JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");

    public Account(){
        super ("Account");
        
        //Set layout
        JPanel profile_label = new JPanel(new GridLayout(1,3,7,7));
        JPanel details = new JPanel(new GridLayout(3,1,0,7));
        JPanel my_info = new JPanel(new GridLayout(2,2,7,7));
        JPanel border = new JPanel(new BorderLayout(5,5));
       
        //Profile label
        profile_label.add(my_profile);
        profile_label.add(blank1);
        profile_label.add(blank2);
        my_profile.setHorizontalAlignment(JLabel.CENTER);
        
        //Image
        ImageIcon img;
        JLabel profile_pic;

        setLayout(new FlowLayout());
        img = new ImageIcon("C:\\Users\\120S\\Pictures\\profile.jpg");
        profile_pic = new JLabel(img);

        //Profile
        details.add(profile_pic);
        details.add(name);
        details.add(post);
        name.setHorizontalAlignment(JLabel.CENTER);
        post.setHorizontalAlignment(JLabel.CENTER);
        
        //My info
        my_info.add(vol_hrs);
        my_info.add(fav_act);
        my_info.add(com_ev);
        my_info.add(upc_ev);
    
        
        //Boarder Layout
        border.add(profile_label,BorderLayout.NORTH);
        border.add(details, BorderLayout.CENTER);
        border.add(my_info, BorderLayout.SOUTH);

        add(border);
        border.setVisible(true);
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        //Assign button function
        post.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);
                
                Post Post = new Post();
                Post.setVisible(true);
                Post.pack();
                Post.setLocationRelativeTo(null);
            }
        });
        
        vol_hrs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                JOptionPane.showMessageDialog(null, "Your volunteering hours is 5 hours. ");
                
            }});
        
        
        com_ev.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                CompletedEvent completed_event = new CompletedEvent();
                completed_event.setVisible(true);
                completed_event.pack();
                completed_event.setLocationRelativeTo(null);
                
            }});
        
        upc_ev.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                JOptionPane.showMessageDialog(null, "You do not have upcoming event currently. Sign up a for new event now! ");
                
            }});
        
        fav_act.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                JOptionPane.showMessageDialog(null, "You do not have favourite activities currently. Explore your favourite activities now! ");
                
            }});
       
     
    }
    }



