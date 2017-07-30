package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class platform extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					platform frame = new platform();
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
	public platform() {
		setTitle("Business Suite - Platform");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Choose the platform your wish to proceed with.");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl1.setBounds(10, 23, 414, 36);
		contentPane.add(lbl1);
		
		JComboBox platform_Combo = new JComboBox();
		platform_Combo.setModel(new DefaultComboBoxModel(new String[] {"Choose....", "Amazon", "Ebay"}));
		platform_Combo.setBounds(239, 72, 83, 20);
		contentPane.add(platform_Combo);
		
		JButton Exit_btn = new JButton("Exit");
		Exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit_btn.setBounds(325, 127, 99, 23);
		contentPane.add(Exit_btn);
		
		JLabel lblPlatform = new JLabel("Platform:");
		lblPlatform.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlatform.setBounds(139, 70, 90, 20);
		contentPane.add(lblPlatform);
		
		JButton cont_btn = new JButton("Continue");
		cont_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch((String) platform_Combo.getSelectedItem()){
					case "Choose....":
						JOptionPane.showMessageDialog(null, "Please choose a Platform", "Platform", JOptionPane.PLAIN_MESSAGE);
						break;
					case "Amazon":
						amazon_Home Amazon = new amazon_Home();
						Amazon.setVisible(true);
						dispose();
						break;
					case "Ebay":
						eBay_Home ebay = new eBay_Home();
						ebay.setVisible(true);
						dispose();
						break;
			
							
						
				}
			}
		});
		cont_btn.setBounds(223, 127, 99, 23);
		contentPane.add(cont_btn);
	}

}
