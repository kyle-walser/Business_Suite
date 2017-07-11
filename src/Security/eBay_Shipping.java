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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;



public class eBay_Shipping extends JFrame {

	private JPanel contentPane;
	private JTextField txtEbayID;
	private JTextField txtTitle;
	private JTextField txtSoldAmt;
	private JTextField txtShippedAmt;
	private JTextField txtPaypalAmt;
	private JTextField txtDteSld;
	private JTextField txtDteShp;
	

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setMnemonic('f');
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnNewMenu.add(mntmExit);
		
		JMenu mnNavigation = new JMenu("Navigation");
		menuBar.add(mnNavigation);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mnNavigation.add(mntmHome);
		
		JMenuItem mntmAmazon = new JMenuItem("Amazon Listing");
		mnNavigation.add(mntmAmazon);
		
		JMenuItem mntmAmazonShipping = new JMenuItem("Amazon Shipping");
		mnNavigation.add(mntmAmazonShipping);
		
		JMenuItem mntmEbayListing = new JMenuItem("Ebay Listing");
		mnNavigation.add(mntmEbayListing);
		
		JMenuItem mntmReports = new JMenuItem("Reports");
		mnNavigation.add(mntmReports);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmEixt = new JMenuItem("Exit");
		mnExit.add(mntmEixt);
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
		txtTitle.setBounds(115, 65, 268, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		JComboBox cmboShipOpt = new JComboBox();
		cmboShipOpt.setBounds(297, 115, 89, 20);
		cmboShipOpt.setVisible(false);
		contentPane.add(cmboShipOpt);
		
		
		
		JLabel lblShippingService = new JLabel("Shipping Service:");
		lblShippingService.setToolTipText("Shipping Service used");
		lblShippingService.setBounds(10, 118, 98, 14);
		lblShippingService.setVisible(false);
		contentPane.add(lblShippingService);
		
		JLabel lblSoldAmount = new JLabel("Sold Amount:");
		lblSoldAmount.setVisible(false);
		lblSoldAmount.setBounds(10, 93, 86, 14);
		contentPane.add(lblSoldAmount);
		
		txtSoldAmt = new JTextField();
		txtSoldAmt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtSoldAmt.getText().length() > 0){
					txtPaypalAmt.setText(Double.toString((Double.parseDouble(txtSoldAmt.getText())*.1)));
					
				}
			}
		});
		txtSoldAmt.setBounds(115, 90, 86, 20);
		txtSoldAmt.setVisible(false);
		contentPane.add(txtSoldAmt);
		txtSoldAmt.setColumns(10);
		
		JLabel lblShippedPrice = new JLabel("Shipped Price:");
		lblShippedPrice.setBounds(10, 146, 86, 14);
		lblShippedPrice.setVisible(false);
		contentPane.add(lblShippedPrice);
		
		txtShippedAmt = new JTextField();
		txtShippedAmt.setBounds(115, 143, 86, 20);
		txtShippedAmt.setVisible(false);
		contentPane.add(txtShippedAmt);
		txtShippedAmt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Paypal Fee:");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setBounds(10, 171, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		txtPaypalAmt = new JTextField();
		txtPaypalAmt.setBounds(115, 168, 86, 20);
		txtPaypalAmt.setVisible(false);
		txtPaypalAmt.setEditable(false);
		contentPane.add(txtPaypalAmt);
		txtPaypalAmt.setColumns(10);
		
		txtDteSld = new JTextField();
		
		txtDteSld.setBounds(297, 90, 86, 20);
		txtDteSld.setVisible(false);
		contentPane.add(txtDteSld);
		txtDteSld.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date Sold:");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setBounds(211, 93, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date Shipped:");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setBounds(211, 146, 76, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Shipping Opt.:");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setBounds(211, 118, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox cmboShipService = new JComboBox();
		cmboShipService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	String ship = (String) cmboShipService.getSelectedItem();
				
				cmboShipOpt.setEnabled(true);
				if ((String) cmboShipService.getSelectedItem() == "USPS")
				{
					
					cmboShipOpt.setModel(new DefaultComboBoxModel(new String[] {"First-Class", "Priority(W)", "Priority(FRE)", "Priority(FRPE)", "Priority(FRS)", "Priority(FRM)", "Priority(FRL)", "Express"}));
				
				}else if((String) cmboShipService.getSelectedItem() == "UPS"){
					
					cmboShipOpt.setModel(new DefaultComboBoxModel(new String[] {"ground", "Air"}));
				
				}else{
					cmboShipOpt.setModel(new DefaultComboBoxModel(new String[] {""}));
					cmboShipOpt.setEnabled(false);;
					
				}
				
				
						
			}
		});
		cmboShipService.setModel(new DefaultComboBoxModel(new String[] {"Choose", "USPS", "UPS"}));
		cmboShipService.setVisible(false);
		
		cmboShipService.setBounds(115, 115, 86, 20);
		contentPane.add(cmboShipService);
		
		txtDteShp = new JTextField();
		txtDteShp.setBounds(297, 143, 86, 20);
		txtDteShp.setVisible(false);
		contentPane.add(txtDteShp);
		txtDteShp.setColumns(10);
		
		
		
		
		JCheckBox chkSldDte = new JCheckBox("Today?");
		chkSldDte.setVisible(false);
		chkSldDte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkSldDte.isSelected() == true){
					txtDteSld.setText(getDate());
					txtDteSld.setEditable(false);
					
				}else{
					txtDteSld.setText("");
					txtDteSld.setEditable(true);
				}
			}
		});
		chkSldDte.setBounds(389, 89, 97, 23);
		contentPane.add(chkSldDte);
		
		JCheckBox chkDteShp = new JCheckBox("Today ?");
		chkDteShp.setVisible(false);
		chkDteShp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkDteShp.isSelected() == true){
					txtDteShp.setText(getDate());
					txtDteShp.setEditable(false);
					
				}else{
					txtDteShp.setText("");
					txtDteShp.setEditable(true);
				}
			}
		});
		chkDteShp.setBounds(389, 142, 97, 23);
		contentPane.add(chkDteShp);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(70, 228, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPaypalAmt.setVisible(false);
				chkSldDte.setVisible(false);
				btnSearchItem.setEnabled(true);
				txtEbayID.setEnabled(true);
				txtEbayID.setText("");
				txtEbayID.requestFocus();
				lblNewLabel_1.setVisible(false);
				cmboShipService.setVisible(false);
				txtTitle.setVisible(false);
				lblSoldAmount.setVisible(false);
				lblNewLabel_4.setVisible(false);
				txtPaypalAmt.setVisible(false);
				lblShippingService.setVisible(false);
				chkDteShp.setVisible(false);
				txtDteShp.setVisible(false);
				lblNewLabel_3.setVisible(false);
				txtSoldAmt.setVisible(false);
				txtDteSld.setVisible(false);
				lblNewLabel_5.setVisible(false);
				cmboShipOpt.setVisible(false);
				lblShippedPrice.setVisible(false);
				txtShippedAmt.setVisible(false);
				lblNewLabel_2.setVisible(false);
			}
		});
		btnReset.setBounds(186, 228, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(297, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(396, 228, 89, 23);
		contentPane.add(btnExit);
		
		btnSearchItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtEbayID.getText().length() >  0 && txtEbayID.getText().substring(0, 2).toUpperCase().equals("EB") == true){
					txtEbayID.setText(txtEbayID.getText().toUpperCase());
					txtPaypalAmt.setVisible(true);
					chkSldDte.setVisible(true);
					btnSearchItem.setEnabled(false);
					txtEbayID.setEnabled(false);
					lblNewLabel_1.setVisible(true);
					cmboShipService.setVisible(true);
					txtTitle.setVisible(true);
					lblSoldAmount.setVisible(true);
					lblNewLabel_4.setVisible(true);
					txtPaypalAmt.setVisible(true);
					lblShippingService.setVisible(true);
					chkDteShp.setVisible(true);
					txtDteShp.setVisible(true);
					lblNewLabel_3.setVisible(true);
					txtSoldAmt.setVisible(true);
					txtDteSld.setVisible(true);
					lblNewLabel_5.setVisible(true);
					cmboShipOpt.setVisible(true);
					lblShippedPrice.setVisible(true);
					txtShippedAmt.setVisible(true);
					lblNewLabel_2.setVisible(true);
				
					
					
					
				}else{
					JOptionPane.showMessageDialog(null, "You have entered an Invalid ID. \n Please try again", "Invaild ID Error", JOptionPane.ERROR_MESSAGE);
					txtEbayID.setText("");
					txtEbayID.requestFocus();	
				}
				
			}
		});
	}
	private String getDate(){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
