import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
class Sign_Up
    extends JFrame
    implements ActionListener {
  
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel LastName;
    private JTextField tLastName;
    private JLabel PasspordId;
    private JTextField tPasspordId;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
  
    
    // constructor, to initialize the components
    // with default values.
    public Sign_Up()
    {
        setTitle("Sign Up!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("SignUp");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        name = new JLabel("Username");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
        
        LastName = new JLabel("First&LastName");
        LastName.setFont(new Font("Arial", Font.PLAIN, 20));
        LastName.setSize(100, 20);
        LastName.setLocation(100, 150);
        c.add(LastName);
  
        tLastName = new JTextField();
        tLastName.setFont(new Font("Arial", Font.PLAIN, 15));
        tLastName.setSize(190, 20);
        tLastName.setLocation(200, 150);
        c.add(tLastName);
  
        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 200);
        c.add(mno);
  
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 200);
        c.add(tmno);
  
        
        PasspordId = new JLabel("PasspordId");
        PasspordId.setFont(new Font("Arial", Font.PLAIN, 20));
        PasspordId.setSize(100, 20);
        PasspordId.setLocation(100, 250);
        c.add(PasspordId);
  
        tPasspordId = new JTextField();
        tPasspordId.setFont(new Font("Arial", Font.PLAIN, 15));
        tPasspordId.setSize(150, 20);
        tPasspordId.setLocation(200, 250);
        c.add(tPasspordId);
  
        
  
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
  
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
  
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
  
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
  
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
  
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
  
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
  
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Username : "
                      + tname.getText() + "\n"
                      + "First&Lastname : "
                      + tLastName.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                      
                String data2
                    = "PasspordId : "
                      + (String)date.getSelectedItem()
                      + tPasspordId.getText() + "\n";
                      
                String data3
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
  
                String data4 = "Address : " + tadd.getText();
                tout.setText(data + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tLastName.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
  

class SignUp {
  
    public static void main(String[] args) throws Exception
    {
        Sign_Up f = new Sign_Up();
    }
}
