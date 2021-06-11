import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

 


public class ManualPearing extends JFrame implements ActionListener {
            // Components of the Form
             private Container w;
             private JLabel title;
             private JLabel res;
             
            
             JList list;
             JList list2;

             DefaultListModel model;
             DefaultListModel model2;

            

            public ManualPearing() {           
                 JFrame f= new JFrame();  
                 final JLabel label = new JLabel();          
                 label.setSize(1000,75);  
                 JButton b=new JButton("Pear");  
                 b.setBounds(200,150,80,30);
                 b.setLocation(600, 550);
                 //orders
                 final DefaultListModel<String> l1 = new DefaultListModel<>();  
                   l1.addElement("Order1-20 Tons");  
                   l1.addElement("Order2-17.3 Tons");  
                   l1.addElement("Order3-3 Tons");  
                   l1.addElement("Order4-19 Tons");  
                   final JList<String> list1 = new JList<>(l1);  
                   list1.setBounds(100,100, 300,75); 
                   list1.setLocation(50, 75);
                 
                 //Vehicles
                   DefaultListModel<String> l2 = new DefaultListModel<>();  
                   l2.addElement("Vehicle1-Scania 20 Tons Capable");  
                   l2.addElement("Vehicle2-Scania 10 Tons Capable");  
                   l2.addElement("Vehicle3-MAN 15 Tons Capable");  
                   l2.addElement("Vehicle4-Mercedes 5 Tons Capable");  
                   final JList<String> list2 = new JList<>(l2);  
                   list2.setBounds(100,200, 300,75); 
                   list2.setLocation(50, 200);
                   
                 //Drivers
                   DefaultListModel<String> l3 = new DefaultListModel<>();  
                   l3.addElement("Driver1-Can Drive Vehciles Up To 20 Tons ");  
                   l3.addElement("Driver2-Can Drive Vehciles Up To 20 Tons");  
                   l3.addElement("Driver3-Can Drive Vehciles Up To 15 Tons");  
                   l3.addElement("Driver4-Can Drive Vehciles Up To 10 Tons");  
                   final JList<String> list3 = new JList<>(l3);  
                   list3.setBounds(100,200, 300,75); 
                   list3.setLocation(50, 300);
                   
                   f.add(list1); f.add(list2); f.add(list3); f.add(b); f.add(label);  
                   f.setSize(1500,1500);  
                   f.setLayout(null);  
                   f.setVisible(true);  
                   b.addActionListener(new ActionListener() 
                   {  
                       public void actionPerformed(ActionEvent e) {   
                          String data = "";  
                          if (list1.getSelectedIndex() != -1) {                       
                             data = "Order Selected: " + list1.getSelectedValue();   
                             label.setText(data);  
                          }
                          
                          if(list2.getSelectedIndex() != -1){  
                             data += ", Vehicle Selected: ";  

                             for(Object frame2 :list2.getSelectedValues()){  
                                data += frame2 + " ";  
                                
                             }  
                          }
                          
                          if (list3.getSelectedIndex() != -1) {                       
                             for(Object frame3 :list3.getSelectedValues()){  
                                data += ",Driver Selected: " + frame3 + " ";  
                                
                             }   
                          }
                          label.setText(data);  
                       }  
                    });    
             }
             public void actionPerformed(ActionEvent e)
             {
                
                
             }
        }
            
class ManageNotification {
  
    public static void main(String[] args) throws Exception
    {
        ManualPearing s = new ManualPearing();
    }
}
