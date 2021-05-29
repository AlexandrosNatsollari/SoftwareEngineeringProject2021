import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 


public class ExpensesFormNotificationReview
         extends JFrame
        implements ActionListener {
             private JLabel res;
             private Container c;
             private JButton AcceptButton;
             private JButton DenieButton;
            
             
             
             public ExpensesFormNotificationReview(){
                    JPanel panel = new JPanel();
                    JButton AcceptButton = new JButton("AcceptExpeneses!");
                    // Add button to JPanel
                    panel.add(AcceptButton);
                    this.getContentPane().add(panel);
                    JButton DenieButton = new JButton("DenieExpeneses!");
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
                        
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                        // add the Jpanel to the main window
                        frame.add(panel); 
 
                        frame.pack();
                        //DDOFMN = new JButton("DeniedDateOfMeetingNotification");
                        //DDOFMN.setFont(new Font("Arial", Font.PLAIN, 15));
                        //DDOFMN.setSize(400, 100);
                        //DDOFMN.setLocation(300, 200);
                        //DDOFMN.addActionListener(this);
                        //frame.add(DDOFMN);
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
                       
            
                    }
                    else if (e.getSource() == DenieButton) {
                       //send notification to driver that ExpensesForm is Denied
                       
            
                    }
                 
                }
            }
        
class ExpensesForm {
  
    public static void main(String[] args) throws Exception
    {
        ExpensesFormNotificationReview d = new ExpensesFormNotificationReview();
    }
}
