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
import javax.swing.JOptionPane;

public class PaymentGUI extends JFrame {

	private JTextField txtAmount;
	private JTextField textField;
        private float totalCost;
        JLabel lblEnterCreditNumber;
        private SalesTransaction sale;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentGUI window = new PaymentGUI(0.0f, new SalesTransaction());
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
     * @param totalCost
	 */
	public PaymentGUI(float totalCost, SalesTransaction sale) {
		initialize();
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.totalCost = totalCost;
                txtAmount.setText(" "+totalCost+" ");
                this.sale = sale;
                txtAmount.setText(String.format("%.2f", totalCost));
                txtAmount.setText(String.format("%.2f", totalCost));
	}

	public PaymentGUI(float totalCost) {
		initialize();
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                this.totalCost = totalCost;
                txtAmount.setText(" "+totalCost+" ");
                txtAmount.setText(String.format("%.2f", totalCost));
                txtAmount.setText(String.format("%.2f", totalCost));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setBounds(100, 100, 539, 417);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(261, 57, 190, 37);
		this.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCash.setBounds(24, 17, 152, 50);
		this.getContentPane().add(rdbtnCash);
		
		JRadioButton rdbtnCredit = new JRadioButton("Credit");
		rdbtnCredit.setSelected(true);
		rdbtnCredit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnCredit.setBounds(24, 84, 169, 37);
		this.getContentPane().add(rdbtnCredit);
		
		ButtonGroup myGroup = new ButtonGroup();
		myGroup.add(rdbtnCredit);
		myGroup.add(rdbtnCash);
		
		
		textField = new JTextField();
		textField.setBounds(261, 188, 190, 37);
		this.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterprice = new JLabel("Amount to Pay:");
		lblEnterprice.setBounds(261, 29, 190, 28);
		this.getContentPane().add(lblEnterprice);
		
		JLabel lblEnterCreditNumber = new JLabel("Enter Credit Number or Amount In Cash");
		lblEnterCreditNumber.setBounds(261, 159, 190, 28);
		this.getContentPane().add(lblEnterCreditNumber);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
			try {
				Pay pay = new Pay(sale, txtAmount.getText());
				pay.complete();
				JOptionPane.showMessageDialog(null, "Amount $"+txtAmount.getText()+" has been paid");
				txtAmount.setText("");
				textField.setText("");
			}
			catch(Exception ex){
				
			}
			}
		});
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPay.setBounds(53, 207, 123, 37);
		this.getContentPane().add(btnPay);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new ActionFrame().setVisible(true);
		                
		            }
		        });
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setBounds(53, 280, 123, 37);
		this.getContentPane().add(btnBack);
	}
}
