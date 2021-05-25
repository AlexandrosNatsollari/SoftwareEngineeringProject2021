import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeliveryCompletion 
        extends JFrame
        implements ActionListener{
                    // Components of the Form
    private Container c;
    private JLabel title;
    
    
    private JLabel Completion_Time;
    private JTextField tCompletion_Time;
    
    
   
    
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
    
    
    // constructor, to initialize the components
    // with default values.
    public DeliveryCompletion()
    {
        setTitle("Delivery Completion Info!");
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
          
        
        Completion_Time = new JLabel("Delay Time");
        Completion_Time.setFont(new Font("Arial", Font.PLAIN, 20));
        Completion_Time.setSize(100, 20);
        Completion_Time.setLocation(120, 200);
        c.add(Completion_Time);
  
        
        tCompletion_Time = new JTextField();
        tCompletion_Time.setFont(new Font("Arial", Font.PLAIN, 15));
        tCompletion_Time.setSize(180, 20);
        tCompletion_Time.setLocation(300, 200);
        c.add(tCompletion_Time);

  
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
                    = "Completion Time: " 
                      + tCompletion_Time.getText();
                      
                
                      
                
  
                
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Form Submitted Successfully..");
            
        }
  
        else if (e.getSource() == reset) {
            String def = "";
                     
            tCompletion_Time.setText(def);
            res.setText(def);
            tout.setText(def);    
            resadd.setText(def);
        }
    }
        

        
    }

   class Completion {  
    public static void main(String[] args) throws Exception
    {
        DeliveryCompletion f = new DeliveryCompletion();
    }
}