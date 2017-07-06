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

public class eBay_Shipping extends JFrame {

	private JPanel contentPane;
	private JTextField txtEbayID;
	private JTextField textField;

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
		
		textField = new JTextField();
		textField.setBounds(69, 65, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		btnSearchItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtEbayID.getText().length() >  0 && txtEbayID.getText().substring(0, 2).toUpperCase() == "EB"){
					
					btnSearchItem.setEnabled(false);
					txtEbayID.setEnabled(false);
					lblNewLabel_1.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "You have entered an Invalid ID. \n Please try again", "Invaild ID Error", JOptionPane.ERROR_MESSAGE);
					txtEbayID.requestFocus();	
				}
				
			}
		});
	}
}
