import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
 
public class WelcomeScreen{
  public WelcomeScreen(){
       final JFrame f = new JFrame();
       TitledBorder border = new TitledBorder("Welcome Screen");
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitlePosition(TitledBorder.TOP);
   
                 // Create OK button
                JButton btn1 = new JButton("Login!");
                // Add event handler for OK button
                btn1.addActionListener(
                 new ActionListener()
                 {
                    public void actionPerformed(ActionEvent e) {
                                            if(e.getSource()==btn1)
                            {
                                f.setVisible(false);
                                Login c = new Login();
                                
                               
                            }
                        }
                }
                 );
                
            
                JButton btn2 = new JButton("Sign Up!");
                btn2.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                         if(e.getSource()==btn2)
                            {
                                f.setVisible(false);
                                Sign_Up f = new Sign_Up();
                                
                            }
                    }
                 }
                 );
               
    JPanel p = new JPanel();
     p.setBorder(border);
    f.add(p);
 
    f.setVisible(true);     
     
     
     
    p.setLayout(null);
    btn1.setBounds(300, 300, 180, 70);
    btn2.setBounds(520, 300, 180, 70);
        
    p.add(btn1);
    p.add(btn2);
    
    f.add(p);
   
    f.setDefaultCloseOperation(3);
    f.setSize(1000, 1000);
    f.setVisible(true);
  }
  }
