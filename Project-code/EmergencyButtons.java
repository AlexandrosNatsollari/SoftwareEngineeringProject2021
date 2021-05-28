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
import java.awt.Button;
import java.awt.Color;


public class EmergencyButtons {
  public  EmergencyButtons() {
   final JFrame f = new JFrame();
   TitledBorder border = new TitledBorder("Emergency Buttons");
    border.setTitleJustification(TitledBorder.CENTER);
    border.setTitlePosition(TitledBorder.TOP);
   
        // Create OK button
        JButton btn1 = new JButton("Call Ambulance");
        btn1.setBackground(Color.RED);
        btn1.setForeground(Color.BLACK);
   
        // Add event handler for OK button
        btn1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Calling Ambulance..."
                                );
                    }
                });
        // Create Cancel button
        JButton btn2 = new JButton("Call Police");
        btn2.setBackground(Color.RED);
        btn2.setForeground(Color.BLACK);
        btn2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Calling Police..."
                                );
                    }
                });
                
                
                JButton btn3 = new JButton("Call Roadside Assistance");
                btn3.setBackground(Color.RED);
                btn3.setForeground(Color.BLACK);
        btn3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "Calling Roadside Assistance..."
                                );
                    }
                });
                
            
                JButton btn4 = new JButton("Back");
                btn4.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) {
                         if(e.getSource()==btn4)
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
    btn1.setBounds(30, 20, 180, 70);
    btn2.setBounds(30, 100, 180, 70);
    btn3.setBounds(30, 180, 180, 70);
    btn4.setBounds(30, 260, 180, 70);
    
    p.add(btn1);
    p.add(btn2);
    p.add(btn3);
    p.add(btn4);


    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(1000, 1000);
    f.setVisible(true);
  }
  
}
