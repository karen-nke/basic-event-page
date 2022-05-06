import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompletedEvent extends JFrame {
	
	JButton ok = new JButton("OK");
	JLabel blank1 = new JLabel("");
    JLabel blank2 = new JLabel("");
    JLabel events = new JLabel("Events");
    JLabel event_name = new JLabel("Beach Cleaning Activity");

    public CompletedEvent (){

        super ("Completed Event");
        
        
        //Set layout
        JPanel filter_label = new JPanel(new GridLayout(4,1,5,5));
        JPanel image = new JPanel(new GridLayout(1,2,5,5));
        JPanel border = new JPanel(new BorderLayout(5,5));
        
        //combo box for year and month
        String[] month = {"JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEPT","OCT","NOV","DEC", };
        JComboBox<?> combomonth = new JComboBox<Object>(month);
        
        String[] year = {"2015","2016","2017","2018","2019","2020"};
        JComboBox<?> comboyear = new JComboBox<Object>(year);
        
        //filter
        filter_label.add(combomonth);
        filter_label.add(comboyear);
        filter_label.add(events);
        filter_label.add(event_name);
        
        //add image
        ImageIcon img1, img2;
        JLabel pic, cert;

        setLayout(new FlowLayout());
        img1 = new ImageIcon("C:\\Users\\120S\\Pictures\\beachcleanning.jpg");
        img2 = new ImageIcon("C:\\Users\\120S\\Pictures\\cert.png");
        
        pic = new JLabel(img1);
        cert = new JLabel(img2);
        
        image.add(pic);
        image.add(cert);
        
        //add components into frame
        border.add(filter_label, BorderLayout.NORTH);
        border.add(image, BorderLayout.CENTER);
        border.add(ok, BorderLayout.SOUTH);
        
        //border
        add(border);
        border.setVisible(true);
        border.setSize(400,450);
        setLocationRelativeTo(null);
        
        
        //Assign buttons
        ok.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent x) {
                super.mouseClicked(x);

                dispose();
            }
        });

    }


}
