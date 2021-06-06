import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class MakeAppointment 
        extends JFrame
        implements ActionListener{
                    // Components of the Form
    private Container c;
    private JLabel title;
    
    private JLabel DriverName;
    private JTextField tDriverName;    
    private JLabel Message;
    private JTextField tMessage;
    
    
   
    
    private JButton sub;
    private JButton sub2;
    private JButton sub3;
    private JButton reset;
    private JButton close;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
    
    
    // constructor, to initialize the components
    // with default values.
    public MakeAppointment()
    {
        setTitle("Delivery Completion Info!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Contact Driver");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
          
        
        DriverName = new JLabel("Driver Name");
        DriverName.setFont(new Font("Arial", Font.PLAIN, 20));
        DriverName.setSize(180, 20);
        DriverName.setLocation(120, 100);
        c.add(DriverName);
  
        
        tDriverName = new JTextField();
        tDriverName.setFont(new Font("Arial", Font.PLAIN, 15));
        tDriverName.setSize(180, 20);
        tDriverName.setLocation(300, 100);
        c.add(tDriverName);

        Message = new JLabel("Send Message");
        Message.setFont(new Font("Arial", Font.PLAIN, 20));
        Message.setSize(150, 20);
        Message.setLocation(550, 300);
        c.add(Message);
  
        
        tMessage = new JTextField();
        tMessage.setFont(new Font("Arial", Font.PLAIN, 15));
        tMessage.setSize(200, 150);
        tMessage.setLocation(700, 300);
        c.add(tMessage);
        ///////////////////////////////////////////////////////////////////
        
        
  
        
  
        
  
        sub = new JButton("Send");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(600, 400);
        sub.addActionListener(this);
        c.add(sub);
        
        sub2 = new JButton("Contact Through Call");
        sub2.setFont(new Font("Arial", Font.PLAIN, 15));
        sub2.setSize(200, 100);
        sub2.setLocation(70, 250);
        sub2.addActionListener(this);
        c.add(sub2);
        
        
        
        
        sub3 = new JButton("IRL_Appointment");
        sub3.setFont(new Font("Arial", Font.PLAIN, 15));
        sub3.setSize(200, 100);
        sub3.setLocation(70, 370);
        sub3.addActionListener(this);
        c.add(sub3);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(800, 550);
        reset.addActionListener(this);
        c.add(reset);
        
        close = new JButton("Close");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(100, 20);
        close.setLocation(800, 600);
        close.addActionListener(this);
        c.add(close);
  
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 180);
        tout.setLocation(550, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 550);
        c.add(res);
  
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
  
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            
                String data1;
                String data
                    = "Driver Name: "+
                       tDriverName.getText() + "\n"+
                      "Message Sent: " 
                      + tMessage.getText();                 
                               
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Driver Has Been Notified Successfully..");
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tDriverName.setText(def);        
            tMessage.setText(def);
            res.setText(def);
            tout.setText(def);    
            resadd.setText(def);
        }
        
        else if (e.getSource() == close){
            setVisible(false);
        }
        if (e.getSource() == sub2) {
        tout.setText("Calling" + "\n" + tDriverName.getText() + "...");
                tout.setEditable(false);
        }
        
        if (e.getSource() == sub3) {
         String data1;
                String data
                    = 
                       tDriverName.getText() + "\n"+
                      " Has been notified for a face to face meeting." ;
                                     
                               
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Driver Has Been Notified Successfully..");
        }
    }
  }

   class Completion {  
    public static void main(String[] args) throws Exception
    {
        MakeAppointment s = new MakeAppointment();
    }
}