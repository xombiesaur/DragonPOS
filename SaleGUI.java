import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;


public class SaleGUI {

	private JFrame frame;
	private JTextField txtItemId;
	private JTextField txtQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleGUI window = new SaleGUI();
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
	public SaleGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea receiptText = new JTextArea();
		receiptText.setEditable(false);
		//receiptText.setText("initial");
		receiptText.setBounds(350, 54, 300, 408);
		frame.getContentPane().add(receiptText);
		
		txtItemId = new JTextField();
		txtItemId.setBounds(12, 69, 137, 40);
		frame.getContentPane().add(txtItemId);
		txtItemId.setColumns(10);
		
		JLabel lblEnterItemId = new JLabel("Enter Item ID");
		lblEnterItemId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterItemId.setBounds(12, 13, 118, 43);
		frame.getContentPane().add(lblEnterItemId);
		
		JLabel lblEnterQuantity = new JLabel("Enter Quantity");
		lblEnterQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnterQuantity.setBounds(180, 13, 118, 43);
		frame.getContentPane().add(lblEnterQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(180, 69, 137, 40);
		frame.getContentPane().add(txtQuantity);
		txtQuantity.setColumns(10);
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblReceipt.setBounds(350, 13, 274, 28);
		frame.getContentPane().add(lblReceipt);
		
		JButton btnAddItem = new JButton("add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String itemID= txtItemId.getText();
				String quantity= txtQuantity.getText();	
				
				receiptText.setText(receiptText.getText()+itemID+" "+"x"+quantity+"\n");
				
			}
		});
		btnAddItem.setBounds(33, 178, 126, 59);
		frame.getContentPane().add(btnAddItem);
		
		JButton btnRemoveItem = new JButton("remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//need code to remove items from list, and also remove them from the receipt
			}
		});
		btnRemoveItem.setBounds(33, 289, 126, 59);
		frame.getContentPane().add(btnRemoveItem);
		
		JButton btnCheckOut = new JButton("check out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//need code to calculate total + Tax and initiate payment methods
				receiptText.setText("");//clears the receipt window, kinda just a placeholder for now
			}
		});
		btnCheckOut.setBounds(33, 403, 126, 59);
		frame.getContentPane().add(btnCheckOut);
		
		
	}
}
