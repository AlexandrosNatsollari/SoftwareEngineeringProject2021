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


public class buttons {
  public static void main(String... args) {
   final JFrame f = new JFrame();
   TitledBorder border = new TitledBorder("Αρχική οθόνη Xρήστη");
    border.setTitleJustification(TitledBorder.CENTER);
    border.setTitlePosition(TitledBorder.TOP);
   
        // Create OK button
        JButton btnOK = new JButton("OK");
   
        // Add event handler for OK button
        btnOK.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "You've clicked OK button"
                                );
                    }
                });
        // Create Cancel button
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(f,
                                "You've clicked Cancel button"
                                );
                    }
                });

    JPanel p = new JPanel();
     p.setBorder(border);
    f.add(p);
 
    f.setVisible(true);     
     
     
     
    p.setLayout(null);
    btnOK.setBounds(30, 80, 90, 50);
    btnCancel.setBounds(30, 20, 90, 50);
    
    p.add(btnOK);
    p.add(btnCancel);

    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(400, 400);
    f.setVisible(true);
  }
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
}