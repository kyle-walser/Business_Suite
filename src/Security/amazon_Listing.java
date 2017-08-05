package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class amazon_Listing extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					amazon_Listing frame = new amazon_Listing();
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
	public amazon_Listing() {
		JRadioButton rdbtnMerchant = new JRadioButton("Merchant");
		JRadioButton rdbtnFba = new JRadioButton("FBA");
		
		setTitle("Amazon Listing Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		rdbtnMerchant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnFba.setSelected(false);
				rdbtnMerchant.setEnabled(false);
				rdbtnFba.setEnabled(true);
				
			}
		});
		rdbtnMerchant.setBounds(225, 7, 109, 23);
		contentPane.add(rdbtnMerchant);
		
		
		rdbtnFba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnMerchant.setSelected(false);
				rdbtnFba.setEnabled(false);
				rdbtnMerchant.setEnabled(true);
			}
		});
		rdbtnFba.setBounds(225, 33, 109, 23);
		contentPane.add(rdbtnFba);
		
		JLabel lblNewLabel = new JLabel("Choose fullfillment option:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 16, 209, 14);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 65, 564, 2);
		contentPane.add(separator);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(91, 78, 209, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 81, 46, 14);
		contentPane.add(lblName);
	}
}
