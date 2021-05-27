import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class DriverMainScreenButtons {
  public static void main(String... args) {
   final JFrame f = new JFrame();
   TitledBorder border = new TitledBorder("DriverMainScreen");
    border.setTitleJustification(TitledBorder.CENTER);
    border.setTitlePosition(TitledBorder.TOP);
   
        // Create OK button
        JButton btn1 = new JButton("Show Map");
   
        // Add event handler for OK button
        btn1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Map"
                                );
                    }
                });
        // Create Cancel button
        JButton btn2 = new JButton("Travel Expenses");
        btn2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Form"
                                );
                    }
                });
                
                
                JButton btn3 = new JButton("Update Order");
        btn3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Update"
                                );
                    }
                });
                
                
                      JButton btn4 = new JButton("Notifications");
        btn4.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Showed Notification"
                                );
                    }
                });
                
                                JButton btn5 = new JButton("Emergency");
        btn5.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Emergency"
                                );
                    }
                });


    JPanel p = new JPanel();
     p.setBorder(border);
    f.add(p);
 
    f.setVisible(true);     
     
     
     
    p.setLayout(null);
    btn1.setBounds(30, 20, 180, 70);
    btn2.setBounds(30, 100, 180, 70);
    btn3.setBounds(30, 180, 180, 70);
    btn4.setBounds(30, 260, 180, 70);
    btn5.setBounds(30, 350, 180, 70);
    
    p.add(btn1);
    p.add(btn2);
    p.add(btn3);
    p.add(btn4);
    p.add(btn5);


    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(1000, 1000);
    f.setVisible(true);
  }
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
}