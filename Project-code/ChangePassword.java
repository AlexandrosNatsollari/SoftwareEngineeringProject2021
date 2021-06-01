import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class ChangePassword 
        extends JFrame
        implements ActionListener{
                    // Components of the Form
    private Container c;
    private JLabel title;
    
    private JLabel CurrentPassword;
    private JPasswordField tCurrentPassword;    
    private JLabel NewPassword;
    private JPasswordField tNewPassword;
    private JLabel RepeatNewPassword;
    private JPasswordField tRepeatNewPassword;
    private JLabel ShowPassword;
    private JCheckBox tShowPassword;
    
   
    
    private JButton sub;
    private JButton reset;
    private JButton close;
    private JLabel res;
    
    
    // constructor, to initialize the components
    // with default values.
    public ChangePassword()
    {
        setTitle("Change Password!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Change Password");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(350, 30);
        c.add(title);
          
        
        CurrentPassword = new JLabel("Current Password");
        CurrentPassword.setFont(new Font("Arial", Font.PLAIN, 20));
        CurrentPassword.setSize(200, 20);
        CurrentPassword.setLocation(280, 100);
        c.add(CurrentPassword);
  
        
        tCurrentPassword = new JPasswordField();
        tCurrentPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tCurrentPassword.setSize(180, 20);
        tCurrentPassword.setLocation(500, 100);
        c.add(tCurrentPassword);

        NewPassword = new JLabel("New Password");
        NewPassword.setFont(new Font("Arial", Font.PLAIN, 20));
        NewPassword.setSize(200, 20);
        NewPassword.setLocation(280, 140);
        c.add(NewPassword);
  
        
        tNewPassword = new JPasswordField();
        tNewPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tNewPassword.setSize(180, 20);
        tNewPassword.setLocation(500, 140);
        c.add(tNewPassword);
        
        RepeatNewPassword = new JLabel("Repeat New Password");
        RepeatNewPassword.setFont(new Font("Arial", Font.PLAIN, 20));
        RepeatNewPassword.setSize(250, 20);
        RepeatNewPassword.setLocation(280, 180);
        c.add(RepeatNewPassword);
  
        
        tRepeatNewPassword = new JPasswordField();
        tRepeatNewPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tRepeatNewPassword.setSize(180, 20);
        tRepeatNewPassword.setLocation(500, 180);
        c.add(tRepeatNewPassword);
        
        ShowPassword = new JLabel("Show Password");
        ShowPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        ShowPassword.setSize(250, 20);
        ShowPassword.setLocation(520, 210);
        c.add(ShowPassword);
        
        tShowPassword = new JCheckBox();
        tShowPassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tShowPassword.setSize(20, 20);
        tShowPassword.setLocation(500, 210);
        tShowPassword.addActionListener(this);
        c.add(tShowPassword);
        ///////////////////////////////////////////////////////////////////
        
        
  
        
  
        
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(330, 270);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(530, 270);
        reset.addActionListener(this);
        c.add(reset);
        
        close = new JButton("Close");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(100, 20);
        close.setLocation(430, 300);
        close.addActionListener(this);
        c.add(close);
   
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 550);
        c.add(res);
  
        setVisible(true);
    }
  
   
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            String Cpass = tCurrentPassword.getText();
            String Npass = tNewPassword.getText();
            String Rpass = tRepeatNewPassword.getText();
                if (Cpass.equalsIgnoreCase("test123")) {
                if(Npass.equalsIgnoreCase(Rpass)){
                    res.setText("Password Changed Successfully..");
                }
                else{
                res.setText("Repeat New Password Correctly..");
                }
            } else {
                res.setText("Wrong Password..");
            }
                                
                               
                
                
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tCurrentPassword.setText(def);        
            tNewPassword.setText(def);
            tRepeatNewPassword.setText(def);
            res.setText(def);
            
        }
        
        else if (e.getSource() == close){
            setVisible(false);
        }
        else if (e.getSource() == tShowPassword) {
            if (tShowPassword.isSelected()) {
                tCurrentPassword.setEchoChar((char) 0);
                tNewPassword.setEchoChar((char) 0);
                tRepeatNewPassword.setEchoChar((char) 0);
            } else {
                tCurrentPassword.setEchoChar('*');
                tNewPassword.setEchoChar('*');
                tRepeatNewPassword.setEchoChar('*');
            }


        }
    }
  }

   class Password {  
    public static void main(String[] args) throws Exception
    {
        ChangePassword f = new ChangePassword();
    }
}