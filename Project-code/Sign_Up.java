//vasikh klassh sign up

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
	private JLabel Username;
	private JTextField tUsername;
	private JLabel mno;
	private JTextField tmno;
	private JLabel PassportId;
	private JTextField tPassportId;
	private JLabel Password;
	private JTextField tPassword;
	private JLabel ConfirmPassword;
	private JTextField tConfirmPassword;
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

	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };

	// constructor, to initialize the components
	// with default values.
	public Sign_Up()
	{
		setTitle("Sign Up!");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
                
		// Sign up location and size
		title = new JLabel("Sign Up!");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
                
		// FirstName&LastName location and size
		name = new JLabel("First&LastName");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(190, 20);
		name.setLocation(40, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);
		
		// Username location and size
		Username = new JLabel("Username");
		Username.setFont(new Font("Arial", Font.PLAIN, 20));
		Username.setSize(190, 20);
		Username.setLocation(40, 150);
		c.add(Username);

		tUsername = new JTextField();
		tUsername.setFont(new Font("Arial", Font.PLAIN, 15));
		tUsername.setSize(190, 20);
		tUsername.setLocation(200, 150);
		c.add(tUsername);
                
		// Mobile location and size
		mno = new JLabel("Mobile");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(40, 200);
		c.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(190, 20);
		tmno.setLocation(200, 200);
		c.add(tmno);
		
		// PassportId location and size
		PassportId = new JLabel("PassportId");
		PassportId.setFont(new Font("Arial", Font.PLAIN, 20));
		PassportId.setSize(100, 20);
		PassportId.setLocation(40, 250);
		c.add(PassportId);

		tPassportId = new JTextField();
		tPassportId.setFont(new Font("Arial", Font.PLAIN, 15));
		tPassportId.setSize(190, 20);
		tPassportId.setLocation(200, 250);
		c.add(tPassportId);
		
		// Password location and size
		Password = new JLabel("Password");
		Password.setFont(new Font("Arial", Font.PLAIN, 20));
		Password.setSize(100, 20);
		Password.setLocation(40, 300);
		c.add(Password);

		tPassword = new JTextField();
		tPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tPassword.setSize(190, 20);
		tPassword.setLocation(200, 300);
		c.add(tPassword);
		
		// ConfirmPassword location and size
		ConfirmPassword = new JLabel("ConfirmPassword");
		ConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 20));
		ConfirmPassword.setSize(190, 20);
		ConfirmPassword.setLocation(40, 350);
		c.add(ConfirmPassword);

		tConfirmPassword = new JTextField();
		tConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));
		tConfirmPassword.setSize(190, 20);
		tConfirmPassword.setLocation(200, 350);
		c.add(tConfirmPassword);
                
		// Gender location and size
		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 400);
		c.add(gender);
                
		//Gender options
		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 400);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 400);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);
                
		// Date of Birth location and size
		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 450);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 450);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 450);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 450);
		c.add(year);
                
		// Address location and size
		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 500);
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 50);
		tadd.setLocation(200, 500);
		tadd.setLineWrap(true);
		c.add(tadd);
                
		// Accept Terms And Conditions location and size
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(650, 450);
		c.add(term);
                
		// Submit location and size
		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(650, 500);
		sub.addActionListener(this);
		c.add(sub);
                
		//Reset location and size
		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(770, 500);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 200);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);
                
		// Result box location and size
		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(500, 300);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Name : "
					+ tname.getText() + "\n"
					+ "Username : "
					+ tUsername.getText() + "\n"
					+ "Mobile : "
					+ tmno.getText() + "\n"
					+ "PassportId : "
					+ tPassportId.getText() + "\n"
					+ "Password : "
					+ tPassword.getText() + "\n"
					+ "ConfirmPassword : "
					+ tConfirmPassword.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Sign Up Completed!");
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
			tUsername.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			tPassportId.setText(def);
			tPassword.setText(def);
			tConfirmPassword.setText(def);
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

// Driver Code
class Registration {

	public static void main(String[] args) throws Exception
	{
		Sign_Up f = new Sign_Up();
	}
}

