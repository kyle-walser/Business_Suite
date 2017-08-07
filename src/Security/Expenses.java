package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Expenses extends JFrame {

	private JPanel contentPane;
	private JTextField txtDate;
	private JTextField txtShipSupp;
	private JTextField txtItemCost;
	private JTextField txtOther;
	private JTextField txtTotalAmt;
	private JTextField txtTax;
	private JTextField txtGrandTot;
	tools Tools = new tools();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expenses frame = new Expenses();
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
	public Expenses() {
		setTitle("Business Suite - Expenses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File ");
		menuBar.add(mnFile);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMerchant = new JLabel("Vendor:");
		lblMerchant.setBounds(3, 30, 58, 14);
		contentPane.add(lblMerchant);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(71, 27, 128, 20);
		contentPane.add(comboBox);
		
		txtDate = new JTextField();
		txtDate.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
				
			}
		});
		txtDate.setBounds(338, 27, 86, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		JLabel lblDateOfReceip = new JLabel("Date of Receipt:");
		lblDateOfReceip.setBounds(230, 30, 98, 14);
		contentPane.add(lblDateOfReceip);
		
		JLabel lblTypes = new JLabel("Types:");
		lblTypes.setBounds(3, 74, 46, 14);
		contentPane.add(lblTypes);
		
		JCheckBox chckbxShippingSupplies = new JCheckBox("Shipping Supplies");
		chckbxShippingSupplies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxShippingSupplies.isSelected() == true){
					txtShipSupp.setVisible(true);
				}
				else{
					txtShipSupp.setVisible(false);
					txtShipSupp.setText("");
				}
			}
		});
		chckbxShippingSupplies.setBounds(71, 70, 128, 23);
		contentPane.add(chckbxShippingSupplies);
		
		JCheckBox chckbxItemCost = new JCheckBox("Item Cost");
		chckbxItemCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxItemCost.isSelected() == true){
					txtItemCost.setVisible(true);
					
				}else{
					txtItemCost.setVisible(false);
					txtItemCost.setText("");
				}
			}
		});
		chckbxItemCost.setBounds(71, 96, 97, 23);
		contentPane.add(chckbxItemCost);
		
		txtShipSupp = new JTextField();
		txtShipSupp.setBounds(230, 71, 86, 20);
		txtShipSupp.setVisible(false);
		contentPane.add(txtShipSupp);
		
		txtShipSupp.setColumns(10);
		
		txtItemCost = new JTextField();
		txtItemCost.setBounds(230, 97, 86, 20);
		txtItemCost.setVisible(false);
		contentPane.add(txtItemCost);
		txtItemCost.setColumns(10);
		
		JCheckBox chckbxOther = new JCheckBox("Other");
		chckbxOther.setBounds(71, 122, 97, 23);
		contentPane.add(chckbxOther);
		
		txtOther = new JTextField();
		txtOther.setVisible(false);
		txtOther.setBounds(230, 123, 86, 20);
		contentPane.add(txtOther);
		txtOther.setColumns(10);
		
		JLabel lblRecID = new JLabel("");
		lblRecID.setBounds(366, 0, 58, 14);
		contentPane.add(lblRecID);
		
		JLabel lblReceiptId = new JLabel("Receipt ID:");
		lblReceiptId.setBounds(287, 2, 58, 14);
		contentPane.add(lblReceiptId);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(186, 154, 46, 14);
		contentPane.add(lblTotal);
		
		txtTotalAmt = new JTextField();
		txtTotalAmt.setEditable(false);
		txtTotalAmt.setBounds(230, 151, 86, 20);
		contentPane.add(txtTotalAmt);
		txtTotalAmt.setColumns(10);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setVisible(false);
		lblTax.setBounds(186, 179, 46, 14);
		contentPane.add(lblTax);
		
		txtTax = new JTextField();
		txtTax.setEditable(false);
		txtTax.setVisible(false);
		txtTax.setBounds(230, 176, 86, 20);
		contentPane.add(txtTax);
		txtTax.setColumns(10);
		
		txtGrandTot = new JTextField();
		txtGrandTot.setEditable(false);
		txtGrandTot.setBounds(230, 209, 86, 20);
		contentPane.add(txtGrandTot);
		txtGrandTot.setColumns(10);
		
		JLabel lblGrandTotal = new JLabel("Grand Total:");
		lblGrandTotal.setBounds(154, 212, 78, 14);
		contentPane.add(lblGrandTotal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(338, 234, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(239, 234, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(143, 234, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(44, 234, 89, 23);
		contentPane.add(btnBack);
		
		JCheckBox chckbxTaxes = new JCheckBox("Taxes?");
		chckbxTaxes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxTaxes.isSelected() == true){
					
				
					lblTax.setVisible(true);
					txtTax.setVisible(true);
				}else{
					lblTax.setVisible(false);
					txtTax.setVisible(false);
					txtTax.setText("");
					
				}
			}
		});
		chckbxTaxes.setBounds(71, 175, 97, 23);
		contentPane.add(chckbxTaxes);
	}
}
