import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 


public class NewRotaNotification extends JFrame implements ActionListener {
             private JLabel res;
             private Container c;
             private JButton AcceptButton;
             private JButton DenieButton;
             private String FormContdition;
             
             public void notify(String newRotaContdition) {
                        this.FormContdition = newRotaContdition;
                     }
             
             public NewRotaNotification(){
                    JPanel panel = new JPanel();
                    JButton AcceptButton = new JButton("AcceptRota!");
                    // Add button to JPanel
                    panel.add(AcceptButton);
                    this.getContentPane().add(panel);
                    JButton DenieButton = new JButton("DenyRota!");
                    // Add button to JPanel
                    panel.add(DenieButton);
                    this.getContentPane().add(panel);
                    setVisible(true);
                    
                    
                    try
                    {
                        BufferedImage image = ImageIO.read(new File("newrota.jpg"));
                        JLabel label = new JLabel(new ImageIcon(image));
                        panel.add(label);
 
                        // main window
                        JFrame.setDefaultLookAndFeelDecorated(true);
                        JFrame frame = new JFrame("NewRota");
                        
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
                       //send notification to Admin that Rota is Accepted
                       
                       notify("RotaAccepted!");
                       
            
                    }
                    else if (e.getSource() == DenieButton) {
                       //send notification to Admin that Rota is Denied
                       notify("RotaDenied!");
            
                    }
                 
                }
             
             
            }
        
class NewRota {
  
    public static void main(String[] args) throws Exception
    {
        NewRotaNotification m = new NewRotaNotification();
    }
}
