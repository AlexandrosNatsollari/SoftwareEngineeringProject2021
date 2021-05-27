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


public class ManageDrivers {
  public static void main(String... args) {
   final JFrame f = new JFrame();
   TitledBorder border = new TitledBorder("DriverMainScreen");
    border.setTitleJustification(TitledBorder.CENTER);
    border.setTitlePosition(TitledBorder.TOP);
   
        // Create OK button
        JButton btn1 = new JButton("List of Drivers");
   
        // Add event handler for OK button
        btn1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "  First Name | Last Name \n    Tony              Evans \n    Penelope          Reed \n    Sofia              Murray \n    Blake              Brown \n    John              Dainton "
                                );
                    }
                });
        // Create Cancel button
        JButton btn2 = new JButton("Driver Data");
        btn2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "First Name | Last Name | Gender | Age | Email | Phone \n Tony  Evans  Male  49  t.evans@randatmail.com  246-2089-48 \n Penelope  Reed  Female  44  p.reed@randatmail.com  358-6775-50 \n Sofia	Murray  Female  49  s.murray@randatmail.com  975-7697-40 \n Blake  Brown  Male  49  b.brown@randatmail.com  165-0618-10 \n John  Dainton  Male  48  d.johnston@randatmail.com  893-3927-53"
                                );
                                
                 
                    }

                });
                
                
                JButton btn3 = new JButton("Driver Program");
        btn3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Friday, May 28, 2021 -- Tony Evans \n Tuesday, June 1, 2021 -- Sofia Murray \n Thursday, June 3, 2021 -- Penelope Reed \n Friday, June 4, 2021 -- Blake Brown \n Sunday, June 6, 2021 -- John Dainton"
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
    
    
    p.add(btn1);
    p.add(btn2);
    p.add(btn3);
   

    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(1000, 1000);
    f.setVisible(true);
  }
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
}