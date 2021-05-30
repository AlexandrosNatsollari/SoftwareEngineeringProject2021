import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class ProperPearing extends JFrame implements ActionListener {
             private JLabel res;
             private Container c;
             private JButton AcceptButton;
             private JButton DenieButton;
             private String[] VehiclesInfo; 
             private String[] DriverInfo;
             private String[] OrdersInfo;
             private String[] CarOrderPear;
             private String[] ProperPear;
             final JFrame f = new JFrame();
             
             
             //edw tha zhtame dedomena apo thn vash kai tha lamvanoume apotelesmata molis ftiaxtei to backend
             public void RequestVehiclesInfo(String newVehiclesInfo) {
                        
                     }
             public void ReceiveVehicleInfo() {
                 String[] VehiclesInfo={"Scania:Capable of 12 tons of cargo","MAN:Capable of 20 tons of cargo","Mercedes:Capable of 18 tons of cargo"} ;
                }
             
    
             public void RequestDriverInfo(String newDriverInfo) {
                 
                     }
             public void ReceiveDriverInfo() {
                 String[] DriverInfo={"DriverPanos:Can drive Scania","DriverAlex:Can drive MAN","DriverKwstas:Can drive Mercedes"}; 
                }
             
    
             public void RequestOrdersInfo(String newOrdersInfo) {
                        
                     }
             public void ReceiveOrdersInfo() {
                 String[] OrdersInfo={"Order12:12 tons","Order13:18 tons","Order11:18 tons"};
                }
                     
                     
            
             //diadoxikes sygriseis gia na vroume to kalutero zeugari
             public ProperPearing(){
                    for (int i = 0; i < OrdersInfo.length; i++) {
                        String NumberOfTonsOnly1 = OrdersInfo[i].replaceAll("[^0-9]", "");
                        for(int k = 0; k < VehiclesInfo.length; k++){
                            String NumberOfTonsOnly2 = VehiclesInfo[k].replaceAll("[^0-9]", "");
                            
                            if(Integer.valueOf(NumberOfTonsOnly1).equals(Integer.valueOf(NumberOfTonsOnly2))){
                                CarOrderPear[i] = OrdersInfo[i]+VehiclesInfo[k];
                            }
                        }
                    }
                    
                    for(int j = 0; j < CarOrderPear.length; j++){
                        ProperPear[j] = CarOrderPear[j]+DriverInfo[j];
                    }
                    
                }    
                
             public void actionPerformed(ActionEvent e){
                 for(int r = 0; r < ProperPear.length; r++){
                    //System.out.printf("ProperPearing: %s", ProperPear[r]);
                 
                }
             
             
            }
        }
        
class ProperPear {
  
    public static void main(String[] args) throws Exception
    {
        ProperPearing n = new ProperPearing();
    }
}
