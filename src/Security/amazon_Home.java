package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class amazon_Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					amazon_Home frame = new amazon_Home();
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
	public amazon_Home() {
		setTitle("Amazon ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmboService = new JComboBox();
		cmboService.setModel(new DefaultComboBoxModel(new String[] {"Choose...", "Listing", "Shipping", "Returns"}));
		cmboService.setBounds(147, 53, 80, 20);
		contentPane.add(cmboService);
		
		JLabel lblChooseYourOption = new JLabel("Choose your option:");
		lblChooseYourOption.setBounds(10, 56, 118, 14);
		contentPane.add(lblChooseYourOption);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(231, 95, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch ((String) cmboService.getSelectedItem()){
				case "Listing":
					amazon_Listing list = new amazon_Listing();
					list.setVisible(true);
					dispose();
					
					
					break;
				case "Shipping":
				
					
					break;
				case "Returns":
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "Please choose an option.", "Seletion Error", JOptionPane.ERROR_MESSAGE);
					cmboService.requestFocus();
					break;
				}
			}
		});
		btnContinue.setBounds(138, 96, 89, 23);
		contentPane.add(btnContinue);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				platform plat = new platform();
				plat.setVisible(true);
				dispose();
				}
		});
		btnBack.setBounds(41, 95, 89, 23);
		contentPane.add(btnBack);
	}
}
