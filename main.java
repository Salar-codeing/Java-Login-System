/*
 * things that I need to import
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 260);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/*
		 * make the panel
		 */
		JPanel panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		/*
		 * make the username label
		 */
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(6, 37, 85, 16);
		panel.add(lblNewLabel);
		
		/*
		 * make the password label 
		 */
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(6, 91, 71, 16);
		panel.add(lblNewLabel_1);
		
		/*
		 * Username input field
		 */
		textField = new JTextField();
		textField.setBounds(93, 32, 189, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		/*
		 * Password input field
		 */
		passwordField = new JPasswordField();
		passwordField.setBounds(93, 86, 189, 26);
		panel.add(passwordField);
		
		/*
		 * This label will be displayed if the 
		 * user inputs a wrong username or password
		 */
		JLabel lblNewLabel_2 = new JLabel("Invalid username or password");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(6, 141, 189, 16);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		/*
		 * This is the login button that will
		 */
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//put the text in a variable
				String username = textField.getText().trim().toLowerCase();
				String password = passwordField.getText().trim().toLowerCase();
				
				//check the username and password
				if (username.equals("admin") && password.equals("1234")) {
					//if the info was correct
					lblNewLabel_2.setVisible(true);
					lblNewLabel_2.setText("   Welcome "+username);
					lblNewLabel_2.setForeground(Color.black);
				}else {
					//if the info was not correct
					lblNewLabel_2.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(6, 169, 117, 29);
		panel.add(btnNewButton);
		
		/*
		 * This is the quit button which will quit
		 * the app once it is pressed
		 */
		JButton btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(165, 169, 117, 29);
		panel.add(btnNewButton_1);
		
		
	}
}
