import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
//This class will be changed later its use is only for compiling errors now

public class ContactDriverScreen extends JFrame implements ActionListener {
            
             private Container x;
             private JLabel title;
             private JButton Contact;
    
             
             private JLabel res;
             final JFrame d = new JFrame();
             public ContactDriverScreen(){
                    setTitle("ContactDriver");
                    setBounds(500, 200, 1000, 700);
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    setResizable(false);
  
                    x = getContentPane();
                    x.setLayout(null);
  
                    title = new JLabel("ContactDriver!");
                    title.setFont(new Font("Arial", Font.PLAIN, 30));
                    title.setSize(300, 30);
                    title.setLocation(430, 50);
                    x.add(title);
        
        
        
                    Contact = new JButton("ContactDriver");
                    Contact.setFont(new Font("Arial", Font.PLAIN, 15));
                    Contact.setSize(400, 100);
                    Contact.setLocation(300, 100);
                    Contact.addActionListener(this);
                    x.add(Contact);
                    
                    setVisible(true);
                    
                }    
                
             public void actionPerformed(ActionEvent e){
                    if (e.getSource() == Contact) {
                       res.setText("ContactDriver");
                       
            
                    }
                 
                }
            }
        
class ContactDriver {
  
    public static void main(String[] args) throws Exception
    {
        ContactDriverScreen c = new ContactDriverScreen();
    }
}

