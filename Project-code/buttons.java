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

public class buttons {
  public static void main(String... args) {
   final JFrame f = new JFrame();
 
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
 
    p.setLayout(null);
    btnOK.setBounds(10, 90, 100, 100);
    btnCancel.setBounds(40, 10, 100, 60);
    
    p.add(btnOK);
    p.add(btnCancel);

    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(400, 400);
    f.setVisible(true);
  }
}