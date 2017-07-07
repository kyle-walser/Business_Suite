package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class eBay_Shipping extends JFrame {

	private JPanel contentPane;
	private JTextField txtEbayID;
	private JTextField txtTitle;
	private JTextField txtSoldAmt;
	private JTextField txtShippedAmt;
	private JTextField txtPaypalAmt;
	private JTextField txtDateSold;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eBay_Shipping frame = new eBay_Shipping();
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
	public eBay_Shipping() {
		setTitle("Business Suite - Item look-up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item ID:");
		lblNewLabel.setBounds(10, 28, 63, 14);
		
		contentPane.add(lblNewLabel);
		
		txtEbayID = new JTextField();
		txtEbayID.setBounds(59, 25, 86, 20);
		
		contentPane.add(txtEbayID);
		txtEbayID.setColumns(10);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Item Name: ");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setBounds(10, 68, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSearchItem = new JButton("Search");
		btnSearchItem.setBounds(175, 24, 89, 23);
		contentPane.add(btnSearchItem);
		
		txtTitle = new JTextField();
		txtTitle.setEnabled(false);
		txtTitle.setEditable(false);
		txtTitle.setVisible(false);
		txtTitle.setBounds(69, 65, 280, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		JComboBox cmboShipService = new JComboBox();
		cmboShipService.setModel(new DefaultComboBoxModel(new String[] {"USPS", "UPS"}));
		cmboShipService.setVisible(false);
		cmboShipService.setBounds(118, 115, 66, 20);
		contentPane.add(cmboShipService);
		
		JLabel lblShippingService = new JLabel("Shipping Service:");
		lblShippingService.setToolTipText("Shipping Service used");
		lblShippingService.setBounds(10, 118, 98, 14);
		lblShippingService.setVisible(false);
		contentPane.add(lblShippingService);
		
		JLabel lblSoldAmount = new JLabel("Sold Amount:");
		lblSoldAmount.setBounds(10, 93, 86, 14);
		contentPane.add(lblSoldAmount);
		
		txtSoldAmt = new JTextField();
		txtSoldAmt.setBounds(98, 90, 86, 20);
		contentPane.add(txtSoldAmt);
		txtSoldAmt.setColumns(10);
		
		JLabel lblShippedPrice = new JLabel("Shipped Price:");
		lblShippedPrice.setBounds(10, 146, 86, 14);
		contentPane.add(lblShippedPrice);
		
		txtShippedAmt = new JTextField();
		txtShippedAmt.setBounds(98, 143, 86, 20);
		contentPane.add(txtShippedAmt);
		txtShippedAmt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Paypal Fee:");
		lblNewLabel_2.setBounds(10, 171, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPaypalAmt = new JTextField();
		txtPaypalAmt.setBounds(98, 168, 86, 20);
		contentPane.add(txtPaypalAmt);
		txtPaypalAmt.setColumns(10);
		
		txtDateSold = new JTextField();
		txtDateSold.setBounds(98, 196, 86, 20);
		contentPane.add(txtDateSold);
		txtDateSold.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date Sold:");
		lblNewLabel_3.setBounds(10, 199, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date Shipped:");
		lblNewLabel_4.setBounds(10, 224, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Shipping Opt.:");
		lblNewLabel_5.setBounds(223, 118, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox cmboShipOpt = new JComboBox();
		cmboShipOpt.setModel(new DefaultComboBoxModel(new String[] {"First-Class", "Priority(W)", "Priority(FRE)", "Priority(FRPE)", "Priority(FRS)", "Priority(FRM)", "Priority(FRL)", "Express"}));
		cmboShipOpt.setBounds(297, 115, 89, 20);
		contentPane.add(cmboShipOpt);
		
		btnSearchItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtEbayID.getText().length() >  0 && txtEbayID.getText().substring(0, 2).toUpperCase().equals("EB") == true){
					
					btnSearchItem.setEnabled(false);
					txtEbayID.setEnabled(false);
					lblNewLabel_1.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "You have entered an Invalid ID. \n Please try again", "Invaild ID Error", JOptionPane.ERROR_MESSAGE);
					txtEbayID.setText("");
					txtEbayID.requestFocus();	
				}
				
			}
		});
	}
}
