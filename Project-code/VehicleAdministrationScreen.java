import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class VehicleAdministrationScreen extends JFrame implements ActionListener {
    // Components of the Form
    private Container p;
    private JLabel title;
     
    
    private JButton AP;//AutoPear
    private JButton VC;//VehicleCondition
    private JButton ManualPear;//AcceptedDateOfMeetingNotification
    private JButton VAN;//VehicleAssistanceNotification
    private JLabel res;
    final JFrame d = new JFrame();
    // constructor, to initialize the components
    // with default values.
    public VehicleAdministrationScreen()
    {
        setTitle("VehicleAdministration!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        p = getContentPane();
        p.setLayout(null);
  
        title = new JLabel("VehicleAdministration");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(330, 50);
        p.add(title);
        
        
        
        AP = new JButton("AutoPear");
        AP.setFont(new Font("Arial", Font.PLAIN, 15));
        AP.setSize(200, 100);
        AP.setLocation(300, 200);
        AP.addActionListener(this);
        p.add(AP);
        
        
        VC = new JButton("VehcileCondition");
        VC.setFont(new Font("Arial", Font.PLAIN, 15));
        VC.setSize(200, 100);
        VC.setLocation(500, 200);
        VC.addActionListener(this);
        p.add(VC);
        
        ManualPear = new JButton("ManualPear");
        ManualPear.setFont(new Font("Arial", Font.PLAIN, 15));
        ManualPear.setSize(200, 50);
        ManualPear.setLocation(750, 600);
        ManualPear.addActionListener(this);
        p.add(ManualPear);
        
        
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 550);
        p.add(res);
  
       
  
         
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == AP) {
            ProperPearing n = new ProperPearing();
        }
        else if (e.getSource() == VC) {
            
        }
        else if(e.getSource() == ManualPear){
            //ManualPearing g = new ManualPearing();
        
        }
        
        
    }
            

        
    }

  class VehicleAdministration {
  
    public static void main(String[] args) throws Exception
    {
        VehicleAdministrationScreen k = new VehicleAdministrationScreen();
    }
}
