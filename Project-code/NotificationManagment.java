import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
 


public class NotificationManagment
         extends JFrame
        implements ActionListener {
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

             public NotificationManagment() {
                 setLayout(new BorderLayout());
                 setBounds(300, 300, 400, 200);
                 model = new DefaultListModel();
                 list = new JList(model);
                 JScrollPane pane = new JScrollPane(list);
                 JButton pinButton = new JButton("PinNotification");
                 JButton DeleteButton = new JButton("DeleteNotification");
                 JButton OrderByButton = new JButton("OrderBy");
                 for (int i = 0; i < 15; i++)
                   model.addElement("Notification " + i);

                 pinButton.addActionListener(new ActionListener() 
                 {
                   public void actionPerformed(ActionEvent e) {
                     int selectedIndex = list.getSelectedIndex();
                     if (selectedIndex != -1) {
                      int[] indices = list.getSelectedIndices();
                      list.getSelectionModel().clearSelection();
                      model.add(0, "PinnedNotitification");
                      for (int index : indices) {
                          list.getSelectionModel().addSelectionInterval(index + 1, index + 1);
                      }
                     
                   }
                  }
                 });
                 DeleteButton.addActionListener(new ActionListener() 
                 {
                   public void actionPerformed(ActionEvent e) {
                     int selectedIndex = list.getSelectedIndex();
                     if (selectedIndex != -1) {
                       model.remove(selectedIndex);
                     }
                   }
                 });
                 OrderByButton.addActionListener(new ActionListener() 
                 {
                   public void actionPerformed(ActionEvent e) {
                      //sortbyDate etc
                   }
                 });

                 add(pane, BorderLayout.NORTH);
                 add(pinButton, BorderLayout.WEST);
                 add(DeleteButton, BorderLayout.EAST);
                 add(OrderByButton, BorderLayout.CENTER);
                 setVisible(true); 
             }
             public void actionPerformed(ActionEvent e)
             {
                
                
             }
        }
            
class ManageNotification {
  
    public static void main(String[] args) throws Exception
    {
        NotificationManagment b = new NotificationManagment();
    }
}
