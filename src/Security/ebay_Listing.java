package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

public class ebay_Listing extends JFrame {

	private JPanel contentPane;
	private JTextField txtItemName;
	private JTextField txtItem_Cost;
	private JTextField txtWeight;
	private JTextField txtCategory;
	private JTextField txtAskingPrice;
	private JTextField txtBoughtDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ebay_Listing frame = new ebay_Listing();
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
	public ebay_Listing() {
		setTitle("Business Suite - Ebay Listing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseEnterListing = new JLabel("Please enter listing details below");
		lblPleaseEnterListing.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPleaseEnterListing.setBounds(29, 11, 325, 31);
		contentPane.add(lblPleaseEnterListing);
		
		txtItemName = new JTextField();
		txtItemName.setBounds(111, 53, 222, 20);
		contentPane.add(txtItemName);
		txtItemName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(29, 56, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Condition");
		lblNewLabel_1.setBounds(29, 86, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cmboCond = new JComboBox();
		cmboCond.setModel(new DefaultComboBoxModel(new String[] {"Choose...", "New", "Used", "Parts"}));
		cmboCond.setBounds(111, 83, 141, 20);
		contentPane.add(cmboCond);
		
		JComboBox cmboMethod = new JComboBox();
		cmboMethod.setModel(new DefaultComboBoxModel(new String[] {"Choose....", "Retail Arbitrage", "Online Arbitrage", "Thrifting", "Book Sale", "Non-retail", "Other"}));
		cmboMethod.setBounds(111, 213, 86, 20);
		contentPane.add(cmboMethod);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(239, 318, 94, 31);
		contentPane.add(btnExit);
		
		
		
		JButton btnSaveItem = new JButton("Save Item");
		btnSaveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean complete = true;
				FileWriter fw = null;
				try {
					fw = new FileWriter("C:\\Users\\kyle.walser\\workspace\\Business_Suite\\EbayItems.txt",true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null,"File does not exsist", "File Not Found", JOptionPane.ERROR_MESSAGE);
				}
				PrintWriter ebayOutFile = new PrintWriter(fw);
				if(txtItemName.getText().length() != 0){
					if (cmboCond.getSelectedItem() != "Choose..."){
						if(txtItem_Cost.getText().length() != 0){
							if(txtWeight.getText().length() != 0){
								if (cmboMethod.getSelectedItem() !=  "Choose...."){
									if(txtAskingPrice.getText().length() != 0){
										if(txtBoughtDate.getText().length() != 0){
											if (txtBoughtDate.getText().length() == 10){
												
												try {
													Double.parseDouble(txtAskingPrice.getText());
													
											    } catch (NumberFormatException e1) {
											        JOptionPane.showMessageDialog(null, "bad number");
											        txtAskingPrice.requestFocus();
											        complete = false;
											    }
												
												if (complete == true){
													ebayOutFile.println(getNextItemID() + "," + txtItemName.getText() + "," + cmboCond.getSelectedItem() + "," + txtItem_Cost.getText() + "," + txtWeight.getText()
												    		+ "," + txtAskingPrice.getText() + "," + txtBoughtDate.getText());
													ebayOutFile.close();
												}
												
											}else{
												JOptionPane.showMessageDialog(null, "Please enter date in format 'xx/xx/xxxx'", "Date Format Error" , JOptionPane.ERROR_MESSAGE);
												txtBoughtDate.requestFocus();
											}
										}else{
											JOptionPane.showMessageDialog(null, "Item bought date can't be blank", "Bought Date Blank Error" , JOptionPane.ERROR_MESSAGE);
											txtBoughtDate.requestFocus();
										}
									}else{
										JOptionPane.showMessageDialog(null, "Item asking price can't be blank", "Asking Price Blank Error" , JOptionPane.ERROR_MESSAGE);
										txtAskingPrice.requestFocus();
									}
								}else{
									JOptionPane.showMessageDialog(null, "Please select a sourcing method", "Method Blank Error" , JOptionPane.ERROR_MESSAGE);
									cmboMethod.requestFocus();
								}
							}else{
								JOptionPane.showMessageDialog(null, "Item weight can't be blank", "Weight Blank Error" , JOptionPane.ERROR_MESSAGE);
								txtWeight.requestFocus();
							}
						}else{
							JOptionPane.showMessageDialog(null, "Item cost can't be blank", "Cost Blank Error" , JOptionPane.ERROR_MESSAGE);
							txtItem_Cost.requestFocus();
						}
					}else{
						JOptionPane.showMessageDialog(null, "Please choose a condition", "Condition Blank Error" , JOptionPane.PLAIN_MESSAGE);
						cmboCond.requestFocus();
					}
				}else{
					JOptionPane.showMessageDialog(null, "Item name can't be blank", "Name Blank Error" , JOptionPane.ERROR_MESSAGE);	
					txtItemName.requestFocus();
				}
			    
			}

			
		});
		btnSaveItem.setBounds(135, 318, 94, 31);
		contentPane.add(btnSaveItem);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eBay_Home ebay = new eBay_Home();
				ebay.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(29, 318, 94, 31);
		contentPane.add(btnBack);
		
		JLabel lblPrice = new JLabel("Item cost");
		lblPrice.setBounds(29, 117, 72, 14);
		contentPane.add(lblPrice);
		
		txtItem_Cost = new JTextField();
		txtItem_Cost.setBounds(111, 114, 86, 20);
		contentPane.add(txtItem_Cost);
		txtItem_Cost.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Weight");
		lblNewLabel_2.setBounds(29, 148, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(111, 145, 86, 20);
		contentPane.add(txtWeight);
		txtWeight.setColumns(10);
		
		txtCategory = new JTextField();
		txtCategory.setBounds(111, 176, 86, 20);
		contentPane.add(txtCategory);
		txtCategory.setColumns(10);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(29, 179, 72, 14);
		contentPane.add(lblCategory);
		
		JLabel lblNewLabel_3 = new JLabel("Method");
		lblNewLabel_3.setBounds(29, 216, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblAsking = new JLabel("Asking");
		lblAsking.setBounds(29, 247, 46, 14);
		contentPane.add(lblAsking);
		
		txtAskingPrice = new JTextField();
		txtAskingPrice.setBounds(111, 244, 86, 20);
		contentPane.add(txtAskingPrice);
		txtAskingPrice.setColumns(10);
		
		JLabel lblDateBought = new JLabel("Date Bought");
		lblDateBought.setBounds(29, 277, 72, 14);
		contentPane.add(lblDateBought);
		
		txtBoughtDate = new JTextField();
		txtBoughtDate.setBounds(111, 274, 86, 20);
		contentPane.add(txtBoughtDate);
		txtBoughtDate.setColumns(10);
		
		
	}
	public String checkDate(String in){
		
		int mon = Integer.parseInt(in.substring(0, 2));

		int day = Integer.parseInt(in.substring(3, 5));
		
		int year = Integer.parseInt(in.substring(6, 10));

		return getMonth(mon) + "/" + getDay(mon, day) + "/" + getYear(year);
	}
	public String getDay(int m, int d){
		int[] mList = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean testD = false;
		while (testD == false){
			if (d <= mList[m - 1] && d > 0){
				testD = true;
			}else{
				d = Integer.parseInt(JOptionPane.showInputDialog(null, Integer.toString(d) + " is not in range of a normal Month \n Please choose another day"));
			}
		}
		if (d < 10){
			return  "0" + Integer.toString(d);
		}else{
			return Integer.toString(d);
		}
	}
	
	public String getMonth(int m){
		boolean testM = false;
		while (testM == false){
			if (m <= 12 && m > 0)
			{
				testM = true;
			}else{
				m = Integer.parseInt(JOptionPane.showInputDialog(null, Integer.toString(m) + " is not in range of a normal Year \n Please choose another month"));
			}
		}
		
		if (m < 10){
			return  "0" + Integer.toString(m);
		}else{
			return Integer.toString(m);
		}
	}
    
	public String getYear(int y){
		
		boolean testY = false;
		Calendar.getInstance().get(Calendar.YEAR);
	    
		while (testY == false){
			if (y <= Calendar.getInstance().get(Calendar.YEAR) ){
				testY = true;
			}else{
				y = Integer.parseInt(JOptionPane.showInputDialog(null, Integer.toString(y) + " is not in range of a normal Year \n Please choose another year"));
			}
		}
		return Integer.toString(y);
	}
	private String getNextItemID() {
		
		return null;
	}
}
