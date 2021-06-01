import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class ChangePhoneNumber 
        extends JFrame
        implements ActionListener{
                    // Components of the Form
    private Container c;
    private JLabel title;
    
    private JLabel PhoneNumber;
    private JTextField tPhoneNumber;    
    private JLabel OldNumber;
    
    
    
   
    
    private JButton sub;
    private JButton reset;
    private JButton close;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
    
    
    // constructor, to initialize the components
    // with default values.
    public ChangePhoneNumber()
    {
        setTitle("Update Phone Number!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Update Phone Number");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(350, 30);
        title.setLocation(300, 30);
        c.add(title);
          
        
        PhoneNumber = new JLabel("Phone Number");
        PhoneNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        PhoneNumber.setSize(150, 20);
        PhoneNumber.setLocation(120, 100);
        c.add(PhoneNumber);
  
        
        tPhoneNumber = new JTextField();
        tPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        tPhoneNumber.setSize(250, 20);
        tPhoneNumber.setLocation(280, 100);
        c.add(tPhoneNumber);

        OldNumber = new JLabel("*Old Phone Number will be deleted after Submit.*");
        OldNumber.setFont(new Font("Arial", Font.PLAIN, 10));
        OldNumber.setSize(300, 20);
        OldNumber.setLocation(280, 120);
        c.add(OldNumber);
  
        
    
        ///////////////////////////////////////////////////////////////////
        
        
  
        
  
        
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 200);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(340, 200);
        reset.addActionListener(this);
        c.add(reset);
        
        close = new JButton("Close");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(100, 20);
        close.setLocation(250, 300);
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
                    = "Phone Number: "+
                       tPhoneNumber.getText();                 
                               
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Phone Number Updated Successfully..");
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tPhoneNumber.setText(def);        
            res.setText(def);
            tout.setText(def);    
            resadd.setText(def);
        }
        
        else if (e.getSource() == close){
            setVisible(false);
        }
    }
  }

   class PhoneNumber {  
    public static void main(String[] args) throws Exception
    {
        ChangePhoneNumber f = new ChangePhoneNumber();
    }
}