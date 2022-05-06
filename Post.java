import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Post extends JFrame {
	
	JButton cancel = new JButton("Cancel");
    JButton post = new JButton("Post");

    public Post (){

        super ("Post an activity");
        
        //Set Layout
        JPanel text = new JPanel(new BorderLayout(5,5));
        JPanel buttons = new JPanel(new GridLayout(1,2,5,5));
        
        //allow user input
        JTextArea input = new JTextArea();
        input.setPreferredSize(new Dimension(200,200));
        
        //buttons
        buttons.add(cancel);
        buttons.add(post);

        //Adding components into frame
        text.add(input, BorderLayout.CENTER);
        text.add(buttons, BorderLayout.SOUTH);
        
        //settings for frame
        add(text);
        text.setVisible(true);
        text.setSize(450,500);
        
        
        //Assign buttons
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                dispose();
            }
        });

        post.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                JOptionPane.showMessageDialog(null, "Your post has been send for review. Thanks for posting!");
                dispose();
            }
        });

       


    }


}