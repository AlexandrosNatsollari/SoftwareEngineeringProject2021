import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 


public class ExpensesFormNotificationReview extends JFrame implements ActionListener {
             private JLabel res;
             private Container c;
             private JButton AcceptButton;
             private JButton DenieButton;
             private String FormContdition;
             
             public void setUpdateFormContdition(String newFormContdition) {
                        this.FormContdition = newFormContdition;
                     }
             
             public ExpensesFormNotificationReview(){
                    JPanel panel = new JPanel();
                    JButton AcceptButton = new JButton("AcceptExpeneses!");
                    // Add button to JPanel
                    panel.add(AcceptButton);
                    this.getContentPane().add(panel);
                    JButton DenieButton = new JButton("DenyExpeneses!");
                    // Add button to JPanel
                    panel.add(DenieButton);
                    this.getContentPane().add(panel);
                    setVisible(true);
                    
                    
                    try
                    {
                        BufferedImage image = ImageIO.read(new File("ExpensesForm.png"));
                        JLabel label = new JLabel(new ImageIcon(image));
                        panel.add(label);
 
                        // main window
                        JFrame.setDefaultLookAndFeelDecorated(true);
                        JFrame frame = new JFrame("ExpensesForm");
                        
                        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                        // add the Jpanel to the main window
                        frame.add(panel); 
 
                        frame.pack();
                        
                        frame.setVisible(true);
                    }
                    catch (java.io.IOException ioe)
                    {
                        ioe.printStackTrace();
                    }
                    
                }    
                
             public void actionPerformed(ActionEvent e){
                    if (e.getSource() == AcceptButton) {
                       //send notification to driver that ExpensesForm is Accepted
                       
                       setUpdateFormContdition("ExpensesFormAccepted!");
                       
            
                    }
                    else if (e.getSource() == DenieButton) {
                       //send notification to driver that ExpensesForm is Denied
                       setUpdateFormContdition("ExpensesFormDenied!");
            
                    }
                 
                }
             
             
            }
        
class ExpensesForm {
  
    public static void main(String[] args) throws Exception
    {
        ExpensesFormNotificationReview d = new ExpensesFormNotificationReview();
    }
}
