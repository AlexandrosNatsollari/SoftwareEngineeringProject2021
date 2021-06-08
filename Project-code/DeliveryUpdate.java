import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
 
public class DeliveryUpdate{
  public DeliveryUpdate(){
       final JFrame f = new JFrame();
       TitledBorder border = new TitledBorder("Delivery Update Screen");
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitlePosition(TitledBorder.TOP);
   
                 // Create OK button
                JButton btn1 = new JButton("Delivery Delay");
                // Add event handler for OK button
                btn1.addActionListener(
                 new ActionListener()
                 {
                    public void actionPerformed(ActionEvent e) {
                                            if(e.getSource()==btn1)
                            {
                                
                                DeliveryDelay c = new DeliveryDelay();
                                
                               
                            }
                        }
                }
                 );
                
            
                JButton btn2 = new JButton("Delivery Completion");
                btn2.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                         if(e.getSource()==btn2)
                            {
                                
                                DeliveryCompletion f = new DeliveryCompletion();
                                
                               
                            }
                    }
                 }
                 );
                
                 JButton btn3 = new JButton("Back");
                btn3.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                         if(e.getSource()==btn3)
                            {
                             f.setVisible(false);
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
    btn3.setBounds(410, 410, 180, 70);
    
    p.add(btn1);
    p.add(btn2);
    p.add(btn3);

    f.add(p);
   
    f.setDefaultCloseOperation(3);
    f.setSize(1000, 1000);
    f.setVisible(true);
  }
  }
