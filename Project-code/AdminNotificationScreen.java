import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminNotificationScreen extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel title;
     
    
    private JButton EFN;//ExpensesFormNotification
    private JButton DDOFMN;//DeniedDateOfMeetingNotification
    private JButton ADOFMN;//AcceptedDateOfMeetingNotification
    private JButton VAN;//VehicleAssistanceNotification
    private JButton NotificationManagment;//NotificationManagement
    private JLabel res;
    final JFrame d = new JFrame();
    // constructor, to initialize the components
    // with default values.
    public AdminNotificationScreen()
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
        
        
        
        EFN = new JButton("ExpensesFormNotification");
        EFN.setFont(new Font("Arial", Font.PLAIN, 15));
        EFN.setSize(400, 100);
        EFN.setLocation(300, 100);
        EFN.addActionListener(this);
        c.add(EFN);
        
        
        DDOFMN = new JButton("DeniedDateOfMeetingNotification");
        DDOFMN.setFont(new Font("Arial", Font.PLAIN, 15));
        DDOFMN.setSize(400, 100);
        DDOFMN.setLocation(300, 200);
        DDOFMN.addActionListener(this);
        c.add(DDOFMN);
        
        
        ADOFMN = new JButton("AcceptedDateOfMeetingNotification");
        ADOFMN.setFont(new Font("Arial", Font.PLAIN, 15));
        ADOFMN.setSize(400, 100);
        ADOFMN.setLocation(300, 300);
        ADOFMN.addActionListener(this);
        c.add(ADOFMN);
        
        
        NotificationManagment = new JButton("NotificationManagment");
        NotificationManagment.setFont(new Font("Arial", Font.PLAIN, 15));
        NotificationManagment.setSize(200, 50);
        NotificationManagment.setLocation(750, 600);
        NotificationManagment.addActionListener(this);
        c.add(NotificationManagment);
        
        
        VAN = new JButton("VehicleAssistanceNotification");
        VAN.setBackground(Color.RED);
        VAN.setFont(new Font("Arial", Font.PLAIN, 15));
        VAN.setSize(400, 100);
        VAN.setLocation(300, 400);
        VAN.addActionListener(this);
        c.add(VAN);
        
        
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 550);
        c.add(res);
  
       
  
         
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == EFN) {
            res.setText("ExpensesFormNotificationReview");
            ExpensesFormNotificationReview d = new ExpensesFormNotificationReview();
            
        }
        else if (e.getSource() == DDOFMN) {
            res.setText("DeniedMeetingNotification");
            ContactDriverScreen c = new ContactDriverScreen();
        }
        else if (e.getSource() == ADOFMN) {
            res.setText("AcceptedMeetingNotification");
        }
        else if (e.getSource() == VAN) {
            res.setText("VehicleAssistanceNotification");
            VehicleAssistanceNotification h = new VehicleAssistanceNotification();
        }
        else if(e.getSource() == NotificationManagment) {
            res.setText("NotificationManagment");
            NotificationManagment b = new NotificationManagment();
        }
        
    }
            

        
    }

  class Notifications {
  
    public static void main(String[] args) throws Exception
    {
        AdminNotificationScreen f = new AdminNotificationScreen();
    }
}
