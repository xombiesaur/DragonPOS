import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaleReturnGUI {

	private JFrame frame;
	private JTextField txtReturnid;
	private JTextField txtRecieptId;
	private JTextField txtQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleReturnGUI window = new SaleReturnGUI();
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
	public SaleReturnGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 653, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea ReceiptArea = new JTextArea();
		ReceiptArea.setEditable(false);
		ReceiptArea.setBounds(324, 39, 299, 454);
		frame.getContentPane().add(ReceiptArea);
		
		JLabel lblReceiptlabel = new JLabel("Receipt");
		lblReceiptlabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReceiptlabel.setBounds(324, 13, 108, 33);
		frame.getContentPane().add(lblReceiptlabel);
		
		JLabel lblReturnLabel = new JLabel("Enter Item To Return");
		lblReturnLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReturnLabel.setBounds(12, 33, 179, 33);
		frame.getContentPane().add(lblReturnLabel);
		
		JLabel lblEnterReceiptLabel = new JLabel("Enter Receipt Number");
		lblEnterReceiptLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterReceiptLabel.setBounds(12, 121, 162, 27);
		frame.getContentPane().add(lblEnterReceiptLabel);
		
		txtReturnid = new JTextField();
		txtReturnid.setBounds(12, 61, 162, 40);
		frame.getContentPane().add(txtReturnid);
		txtReturnid.setColumns(10);
		
		txtRecieptId = new JTextField();
		txtRecieptId.setBounds(12, 158, 162, 40);
		frame.getContentPane().add(txtRecieptId);
		txtRecieptId.setColumns(10);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(203, 61, 99, 40);
		frame.getContentPane().add(txtQuantity);
		txtQuantity.setColumns(10);
		
		JLabel lblEnterQuantity = new JLabel("Enter Quantity");
		lblEnterQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterQuantity.setBounds(203, 39, 99, 19);
		frame.getContentPane().add(lblEnterQuantity);
		
		JButton btnReturn = new JButton("Return Item");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReturn.setBounds(64, 284, 143, 46);
		frame.getContentPane().add(btnReturn);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckOut.setBounds(64, 447, 143, 46);
		frame.getContentPane().add(btnCheckOut);
	}
}
