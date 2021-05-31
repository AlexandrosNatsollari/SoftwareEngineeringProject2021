import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DriversMap
    extends JFrame
    implements ActionListener {
  
    private Container c;
    
    private JButton ShowPaths;
    private JButton SearchPaths;
    private JButton close;
    private JTextArea Map;
    private JTextArea tSearch;
    private JButton Search;
        
    // constructor, to initialize the components
    // with default values.
    public DriversMap()
    {
        setTitle("Drivers Map!");
        setBounds(500, 200, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
  
        ShowPaths = new JButton("Show Paths");
        ShowPaths.setFont(new Font("Arial", Font.PLAIN, 15));
        ShowPaths.setSize(150, 30);
        ShowPaths.setLocation(10, 20);
        ShowPaths.addActionListener(this);
        c.add(ShowPaths);
  
        SearchPaths = new JButton("Search Paths");
        SearchPaths.setFont(new Font("Arial", Font.PLAIN, 15));
        SearchPaths.setSize(150, 30);
        SearchPaths.setLocation(10, 60);
        SearchPaths.addActionListener(this);
        c.add(SearchPaths);
        
        close = new JButton("Close");
        close.setFont(new Font("Arial", Font.PLAIN, 15));
        close.setSize(150, 30);
        close.setLocation(10, 100);
        close.addActionListener(this);
        c.add(close);
  
        Map = new JTextArea();
        Map.setFont(new Font("Arial", Font.PLAIN, 15));
        Map.setSize(800, 500);
        Map.setLocation(180, 20);
        Map.setLineWrap(true);
        Map.setEditable(false);
        c.add(Map);
  
         
        tSearch = new JTextArea();
        tSearch.setFont(new Font("Arial", Font.PLAIN, 15));
        tSearch.setSize(150, 75);
        tSearch.setLocation(10, 140);
        tSearch.setLineWrap(true);
        tSearch.setVisible(false);
        c.add(tSearch);
        
        Search = new JButton("Search");
        Search.setFont(new Font("Arial", Font.PLAIN, 15));
        Search.setSize(150, 30);
        Search.setLocation(10, 225);
        Search.addActionListener(this);
        Search.setVisible(false);
        c.add(Search);
  
        setVisible(true);
    }
  
   
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == ShowPaths) {         
                String def = "";
                tSearch.setVisible(false);
                tSearch.setText(def);
                Search.setVisible(false);
        }
  
        else if (e.getSource() == SearchPaths) {
            tSearch.setVisible(true);
            Search.setVisible(true);
        }
        else if (e.getSource() == close){
            setVisible(false);
        }
    }
}

class Map {
  
    public static void main(String[] args) throws Exception
    {
        DriversMap f = new DriversMap();
    }
}