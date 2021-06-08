import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DriverNotificationScreen extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel title;
     
    
    private JButton MDN;//ExpensesFormNotification
    private JButton NRN;//DeniedDateOfMeetingNotification
    private JButton NotificationManagment;//NotificationManagement
    private JLabel res;
    final JFrame d = new JFrame();
    // constructor, to initialize the components
    // with default values.
    public DriverNotificationScreen()
    {
        setTitle("Notifications!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Notifications");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(430, 50);
        c.add(title);
        
        
        
        MDN = new JButton("MeetingDateNotification");
        MDN.setFont(new Font("Arial", Font.PLAIN, 15));
        MDN.setSize(400, 100);
        MDN.setLocation(300, 100);
        MDN.addActionListener(this);
        c.add(MDN);
        
        
        NRN = new JButton("NewRotaNotification");
        NRN.setFont(new Font("Arial", Font.PLAIN, 15));
        NRN.setSize(400, 100);
        NRN.setLocation(300, 200);
        NRN.addActionListener(this);
        c.add(NRN);
         
        
        NotificationManagment = new JButton("NotificationManagment");
        NotificationManagment.setFont(new Font("Arial", Font.PLAIN, 15));
        NotificationManagment.setSize(200, 50);
        NotificationManagment.setLocation(750, 600);
        NotificationManagment.addActionListener(this);
        c.add(NotificationManagment);
        
        
                
        
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 550);
        c.add(res);
  
       
  
         
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == MDN) {
            res.setText("ViewingMeetingDateNotification...");
            MeetingDateNotification d = new MeetingDateNotification();
            
        }
        else if (e.getSource() == NRN) {
            res.setText("ViewingNewRotaNotification...");
            NewRotaNotification m = new NewRotaNotification();
        }
        else if(e.getSource() == NotificationManagment) {
            res.setText("NotificationManagment");
            NotificationManagment b = new NotificationManagment();
        }
        
    }
            

        
    }

  class NotificationsDriver {
  
    public static void main(String[] args) throws Exception
    {
        DriverNotificationScreen q = new DriverNotificationScreen();
    }
}
