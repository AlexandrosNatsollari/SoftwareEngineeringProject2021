import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Expenses_Form
    extends JFrame
    implements ActionListener {
  
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel license_plate;
    private JTextField tlicense_plate;    
    private JLabel Fuel;
    private JLabel Fuel_type;
    private JComboBox tFuel_type;
    private JLabel Liter_Price;
    private JTextField tLiter_Price; 
    private JLabel Liters;
    private JTextField tLiters; 
    private JLabel Tolls;
    private JLabel Tolls_Number;
    private JComboBox tTolls_Number;
    
    
    
    
   
    
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    
    private String types[]
        = { "-", "Diesel", "Gasoline", "Natural Gas", "Liquid Gas"};
        
    private String numbers[]
        = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
  
    
    // constructor, to initialize the components
    // with default values.
    public Expenses_Form()
    {
        setTitle("Driver Expenses Form!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        title = new JLabel("Expenses Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
  
        license_plate = new JLabel("License Plate");
        license_plate.setFont(new Font("Arial", Font.PLAIN, 20));
        license_plate.setSize(200, 20);
        license_plate.setLocation(100, 100);
        c.add(license_plate);
  
        tlicense_plate = new JTextField();
        tlicense_plate.setFont(new Font("Arial", Font.PLAIN, 15));
        tlicense_plate.setSize(120, 20);
        tlicense_plate.setLocation(230, 100);
        c.add(tlicense_plate);
        
        Fuel = new JLabel("Fuel");
        Fuel.setFont(new Font("Arial", Font.PLAIN, 20));
        Fuel.setSize(100, 20);
        Fuel.setLocation(100, 130);
        c.add(Fuel);
        
        Fuel_type = new JLabel("Fuel Type");
        Fuel_type.setFont(new Font("Arial", Font.PLAIN, 20));
        Fuel_type.setSize(100, 20);
        Fuel_type.setLocation(120, 155);
        c.add(Fuel_type);
  
        tFuel_type = new JComboBox(types);
    tFuel_type.setFont(new Font("Arial", Font.PLAIN, 15));
    tFuel_type.setSize(120, 20);
    tFuel_type.setLocation(230, 155);
    c.add(tFuel_type);
    
    Liter_Price = new JLabel("LiterPrice");
        Liter_Price.setFont(new Font("Arial", Font.PLAIN, 20));
        Liter_Price.setSize(100, 20);
        Liter_Price.setLocation(120, 180);
        c.add(Liter_Price);
        
        tLiter_Price = new JTextField();
        tLiter_Price.setFont(new Font("Arial", Font.PLAIN, 15));
        tLiter_Price.setSize(120, 20);
        tLiter_Price.setLocation(230, 180);
        c.add(tLiter_Price);
        
        Liters = new JLabel("Liters");
        Liters.setFont(new Font("Arial", Font.PLAIN, 20));
        Liters.setSize(100, 20);
        Liters.setLocation(120, 205);
        c.add(Liters);
        
        tLiters = new JTextField();
        tLiters.setFont(new Font("Arial", Font.PLAIN, 15));
        tLiters.setSize(120, 20);
        tLiters.setLocation(230, 205);
        c.add(tLiters);
  
        Tolls = new JLabel("Tolls");
        Tolls.setFont(new Font("Arial", Font.PLAIN, 20));
        Tolls.setSize(100, 20);
        Tolls.setLocation(100, 240);
        c.add(Tolls);
  
        tTolls_Number = new JComboBox(numbers);
    tTolls_Number.setFont(new Font("Arial", Font.PLAIN, 15));
    tTolls_Number.setSize(120, 20);
    tTolls_Number.setLocation(230, 265);
    c.add(tTolls_Number);
  
        ///////////////////////////////////////////////////////////////////
        
        
  
        
  
        
  
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
            
                String data1;
                String data
                    = "License Plate : "
                      + tlicense_plate.getText() + "\n"
                      + "Fuel  "+ "\n"
                      + "\t" +"Fuel Type: "
                      + (String)tFuel_type.getSelectedItem() + "\n"
                      + "\t" + "Liter Price: "
                      + tLiter_Price.getText() + "\n"
                      + "\t" + "Liters: "
                      + tLiters.getText() + "\n"
                      + "Tolls  "
                      + tTolls_Number.getSelectedItem() + "\n";
                      
                
                      
                
  
                
                tout.setText(data);
                tout.setEditable(false);
                res.setText("Form Submitted Successfully..");
            
        }
  
        else if (e.getSource() == reset) {
            String def = "";
            tlicense_plate.setText(def);
            tFuel_type.setSelectedIndex(0);
            tLiter_Price.setText(def);
            tLiters.setText(def);
            tTolls_Number.setSelectedIndex(0);
            res.setText(def);
            tout.setText(def);         
            
            resadd.setText(def);
        }
    }
}

class Form {
  
    public static void main(String[] args) throws Exception
    {
        Expenses_Form f = new Expenses_Form();
    }
}