import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

public class PaymentGUI {

	private JFrame frame;
	private JTextField txtAmount;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentGUI window = new PaymentGUI();
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
	public PaymentGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(261, 57, 190, 37);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCash.setBounds(24, 17, 152, 50);
		frame.getContentPane().add(rdbtnCash);
		
		JRadioButton rdbtnCredit = new JRadioButton("Credit");
		rdbtnCredit.setSelected(true);
		rdbtnCredit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCredit.setBounds(24, 84, 169, 37);
		frame.getContentPane().add(rdbtnCredit);
		
		ButtonGroup myGroup = new ButtonGroup();
		myGroup.add(rdbtnCredit);
		myGroup.add(rdbtnCash);
		
		
		textField = new JTextField();
		textField.setBounds(261, 188, 190, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterprice = new JLabel("Enter Amount to Pay");
		lblEnterprice.setBounds(261, 29, 190, 28);
		frame.getContentPane().add(lblEnterprice);
		
		JLabel lblEnterCreditNumber = new JLabel("Enter Credit Number");
		lblEnterCreditNumber.setBounds(261, 159, 190, 28);
		frame.getContentPane().add(lblEnterCreditNumber);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPay.setBounds(53, 207, 123, 37);
		frame.getContentPane().add(btnPay);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBounds(53, 280, 123, 37);
		frame.getContentPane().add(btnBack);
	}
}
