package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eBay_Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eBay_Home frame = new eBay_Home();
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
	public eBay_Home() {
		setTitle("Business Suite - Ebay Platform");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ShippingBtn = new JButton("Shipping");
		ShippingBtn.setBounds(224, 127, 200, 50);
		contentPane.add(ShippingBtn);
		
		JButton listingbtn = new JButton("Listing");
		listingbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ebay_Listing list = new ebay_Listing();
				list.setVisible(true);
				dispose();
			}
		});
		listingbtn.setBounds(10, 127, 200, 50);
		contentPane.add(listingbtn);
		
		JLabel lblNewLabel = new JLabel("Welcome to Ebay Zone. ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(124, 26, 200, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(320, 223, 104, 28);
		contentPane.add(btnExit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				platform plat = new platform();
				plat.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(210, 223, 104, 28);
		contentPane.add(btnBack);
	}

}
