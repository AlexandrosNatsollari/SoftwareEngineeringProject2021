import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DeliveryDelay
         extends JFrame
        implements ActionListener {
            // Components of the Form
    private Container c;
    private JLabel title;
    
    private JLabel DeliveryID;
    private JTextField tDeliveryID;
    
    private JLabel Delay_Reason;
    private JTextArea tDelay_Reason;  
    
    private JLabel Delay_Time;
    private JTextField tDelay_Time;
    
    
   
    
    private JButton sub;
    private JButton reset;
    private JButton close;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
    
    
    // constructor, to initialize the components
    // with default values.
    public DeliveryDelay()
    {
        setTitle("Delivery Delay Info!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Delivery Delay Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        
        DeliveryID = new JLabel("Delivery ID");
        DeliveryID.setFont(new Font("Arial", Font.PLAIN, 20));
        DeliveryID.setSize(100, 20);
        DeliveryID.setLocation(120, 100);
        c.add(DeliveryID);
  
        tDeliveryID = new JTextField();
        tDeliveryID.setFont(new Font("Arial", Font.PLAIN, 15));
        tDeliveryID.setSize(180, 20);
        tDeliveryID.setLocation(300, 100);
        c.add(tDeliveryID);
  
        Delay_Reason = new JLabel("Delay Reason");
        Delay_Reason.setFont(new Font("Arial", Font.PLAIN, 20));
        Delay_Reason.setSize(200, 20);
        Delay_Reason.setLocation(100, 140);
        c.add(Delay_Reason);
         
        tDelay_Reason = new JTextArea();
        tDelay_Reason.setFont(new Font("Arial", Font.PLAIN, 15));
        tDelay_Reason.setSize(180, 80);
        tDelay_Reason.setLocation(300, 140);
        tDelay_Reason.setLineWrap(true);
        c.add(tDelay_Reason);
        
        Delay_Time = new JLabel("Delay Time");
        Delay_Time.setFont(new Font("Arial", Font.PLAIN, 20));
        Delay_Time.setSize(100, 20);
        Delay_Time.setLocation(120, 240);
        c.add(Delay_Time);
  
        
        tDelay_Time = new JTextField();
        tDelay_Time.setFont(new Font("Arial", Font.PLAIN, 15));
        tDelay_Time.setSize(180, 20);
        tDelay_Time.setLocation(300, 240);
        c.add(tDelay_Time);

  
        ///////////////////////////////////////////////////////////////////
        
        
  
        
  
        
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 300);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(340, 300);
        reset.addActionListener(this);
        c.add(reset);
        
        close = new JButton("Close");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(100, 20);
        close.setLocation(250, 340);
        close.addActionListener(this);
        c.add(close);
  
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 200);
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
                    = "Delivery ID: "
                      + tDeliveryID.getText() + "\n"
                      + "Delay Reason: "
                      + tDelay_Reason.getText() + "\n"
                      + "Appreciated Delay Time: " 
                      + tDelay_Time.getText();
                
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Form Submitted Successfully..");
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tDeliveryID.setText(def);
            tDelay_Reason.setText(def);            
            tDelay_Time.setText(def);
            res.setText(def);
            tout.setText(def);    
            resadd.setText(def);
        }
        else if (e.getSource() == close){
            setVisible(false);
        }
    }        
    }

  class Delay {
  
    public static void main(String[] args) throws Exception
    {
        DeliveryDelay f = new DeliveryDelay();
    }
}
