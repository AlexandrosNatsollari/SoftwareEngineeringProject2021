import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 


public class VehicleAssistanceNotification extends JFrame implements ActionListener {
             // Components of the Form
             private Container w;
             private JLabel title;
             private JLabel res;
             
             private JButton Delete;//Delete Notification
             private JButton Order;//Order Notifications
             private JButton Pin;//Pin Notification
            
             JList list;

             DefaultListModel model;

             int counter = 15;

             public VehicleAssistanceNotification() {
                 setLayout(new BorderLayout());
                 setBounds(300, 300, 400, 200);
                 model = new DefaultListModel();
                 list = new JList(model);
                 JScrollPane pane = new JScrollPane(list);
                 JButton Call = new JButton("CallNumber");
                 
                 
                 model.addElement("Vehicle Assistance Number: 2301231 " );
                 model.addElement("Vehicle Assistance Number: 4535353 " );
                 model.addElement("First Aid Number:          2301231 " );

                 Call.addActionListener(new ActionListener() 
                 {
                   public void actionPerformed(ActionEvent e) {
                     int selectedIndex = list.getSelectedIndex();
                     if (selectedIndex != -1) {
                      int[] indices = list.getSelectedIndices();
                      list.getSelectionModel().clearSelection();
                      model.add(0, "NumberCalled");
                      for (int index : indices) {
                          list.getSelectionModel().addSelectionInterval(index + 1, index + 1);
                      }
                     
                   }
                  }
                 });
                 

                 add(pane, BorderLayout.NORTH);
                 add(Call, BorderLayout.WEST);
                 setVisible(true); 
             }
             public void actionPerformed(ActionEvent e)
             {
                
                
             }
        }
            
class VehicleAssistance {
  
    public static void main(String[] args) throws Exception
    {
        VehicleAssistanceNotification h = new VehicleAssistanceNotification();
    }
}
