import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Team Dragon POS");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 64));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 13, 675, 144);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblEnterpassword = new JLabel("Enter Password:");
		lblEnterpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterpassword.setBounds(104, 296, 146, 55);
		frame.getContentPane().add(lblEnterpassword);
		
		JLabel lblEnterUserName = new JLabel("Enter User Name:");
		lblEnterUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterUserName.setBounds(104, 170, 159, 40);
		frame.getContentPane().add(lblEnterUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(104, 210, 481, 40);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(104, 346, 481, 40);
		frame.getContentPane().add(pwdPassword);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=txtUserName.getText();
				@SuppressWarnings("deprecation")
				String password=pwdPassword.getText();//should change to .getPassword() for safe use. 
				if(userName.equals("testUser") && password.equals("testPassword")){
					JOptionPane.showMessageDialog(null, "You have logged in");
				}

			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(279, 434, 135, 55);
		frame.getContentPane().add(btnLogin);
	}
}
