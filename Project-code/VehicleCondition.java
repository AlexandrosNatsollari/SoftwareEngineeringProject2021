import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

 


public class VehicleCondition extends JFrame implements ActionListener {
            // Components of the Form
             private Container w;
             private JLabel title;
             private JLabel res;
             
             JList list;
             DefaultListModel model;
             
            
             
             //edw tha zhtame dedomena apo thn vash kai tha lamvanoume apotelesmata molis ftiaxtei to backend
             public void RequestVehicleCondition(String newVehicleCondition) {
                        
                     }
             public void ReceiveVehicleCondition() {
                 String[] VehicleConditionInfo={"Vehicle1-Scania: {Damage:Left wind shield},{DamageClassification:Minor Damage},{LastService:20/10/20019}"} ;
                }
                
                
            public VehicleCondition() {           
                 JFrame s= new JFrame();  
                 final JLabel label = new JLabel();          
                 label.setSize(2000,75);  
                 JButton w=new JButton("Book");  
                 w.setBounds(200,150,80,30);
                 w.setLocation(600, 550);
                 //VehicleCondition
                 final DefaultListModel<String> l1 = new DefaultListModel<>();  
                   l1.addElement("Vehicle1-Scania: {Damage:Left wind shield},{DamageClassification:Minor Damage},{LastService:20/10/20019}");  
                   l1.addElement("Vehicle2-MAN: {Damage:TreilerCargo},{DamageClassification:Medium Damage},{LastService:12/10/20019}");  
                   l1.addElement("Vehicle3-Mercedes: {Damage:Engine},{DamageClassification:Serius Damage},{LastService:12/08/20019}");  
                   l1.addElement("Vehicle4-Mercedes: {Damage:Wheel},{DamageClassification:Serius Damage},{LastService:07/11/2018}");  
                   final JList<String> list1 = new JList<>(l1);  
                   list1.setBounds(300,300, 700,200); 
                   list1.setLocation(50, 75);
                 
                 
                   //ServiceGarages
                   DefaultListModel<String> l2 = new DefaultListModel<>();  
                   l2.addElement("AutoCar:PhoneNumber=2322323");  
                   l2.addElement("ServiceFast:PhoneNumber=42334343");  
                   l2.addElement("RepairForU::PhoneNumber=34545454");  
                   final JList<String> list2 = new JList<>(l2);  
                   list2.setBounds(100,200, 300,75); 
                   list2.setLocation(50, 400);
                   
                   s.add(list1); s.add(list2); s.add(w); s.add(label);  
                   s.setSize(1500,1500);  
                   s.setLayout(null);  
                   s.setVisible(true);  
                   w.addActionListener(new ActionListener() 
                   {  
                       public void actionPerformed(ActionEvent e) {   
                          String data = "";  
                          if (list1.getSelectedIndex() != -1) {                       
                             data = "Vehicle Selected: " + list1.getSelectedValue();   
                               
                          }
                          if(list2.getSelectedIndex() != -1){  
                             data += ", AffiliateServiceGarages-> ";  

                             for(Object frame2 :list2.getSelectedValues()){  
                                data += frame2 + " ";  
                                
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
            
class VehicleCond {
  
    public static void main(String[] args) throws Exception
    {
        VehicleCondition r = new VehicleCondition();
    }
}