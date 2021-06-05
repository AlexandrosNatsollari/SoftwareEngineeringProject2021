import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

 


public class MeetingDateNotification extends JFrame implements ActionListener {
            
            static void notifyAdmin(String MeetingResponse){
                //once the connection to database is done with this method we will noify admin
           
            }
            static void UpdateMeeting(String MeetingStatus){
                //once the connection to database is done with this method we will update meeting status
           
            }
            // Components of the Form
            private Container c;
            private JLabel title;
     
    
            private JButton Accept;//AcceptDateButton
            private JButton Deny;//DenyDateButton
            private JLabel res;
            // constructor, to initialize the components
            // with default values.
            public MeetingDateNotification()
            {
                setTitle("MeetingNotification");
                setBounds(500, 200, 1000, 700);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setResizable(false);
  
                c = getContentPane();
                c.setLayout(null);
        
        
        
                Accept = new JButton("Accept");
                Accept.setFont(new Font("Arial", Font.PLAIN, 15));
                Accept.setSize(100, 50);
                Accept.setLocation(650, 600);
                Accept.addActionListener(this);
                c.add(Accept);
        
        
                Deny = new JButton("Deny");
                Deny.setFont(new Font("Arial", Font.PLAIN, 15));
                Deny.setSize(100, 50);
                Deny.setLocation(750, 600);
                Deny.addActionListener(this);
                c.add(Deny);
         
                 
        
                res = new JLabel("");
                res.setFont(new Font("Arial", Font.PLAIN, 20));
                res.setSize(600, 25);
                res.setLocation(250, 100);
                c.add(res);
  
                res.setText("Admin would like an Meeting at Date:17/03/2021,Hour:17:30:00");
  
         
                setVisible(true);
            }
  
   
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == Accept) {
                    res.setText("Meeting Status Updated,Admin Notified");
                    notifyAdmin("Meeting Accepted");
                    UpdateMeeting("Meeting will concur");
            
                }
                else if (e.getSource() == Deny) {
                    res.setText("Admin Notified");
                    notifyAdmin("Meeting Denied");
                }
                
        
            }
            

        
    }
       
            
class MeetingNotification {
  
    public static void main(String[] args) throws Exception
    {
        MeetingDateNotification d = new MeetingDateNotification();
    }
}