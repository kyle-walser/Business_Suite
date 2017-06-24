package Security;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class log_In extends JFrame {

	private JPanel contentPane;
	private JTextField username_Text;
	private JPasswordField password_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					log_In frame = new log_In();
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
	public log_In() {
		setResizable(false);
		setTitle("Business Suite - LogIn ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(320, 231, 114, 30);
		contentPane.add(btnExit);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try{
					
					
					
					if (username_Text.getText().equals("kyle") == true && password_text.getText().equals("kyle") == true ){
						JOptionPane.showMessageDialog(null,
							    "Access granted",
							    "Access granted",
							    JOptionPane.PLAIN_MESSAGE);
						platform plat = new platform();
						plat.setVisible(true);
						
						dispose();
						
					}else{
						JOptionPane.showMessageDialog(null,
							    "Username and/or Password Invalid\n Please try again." ,
							    "Invalid Info",
							    JOptionPane.ERROR_MESSAGE);
						
						username_Text.setText("");
						password_text.setText("");
						
						
					}
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, e1);
				}	
			}
		});
		btnNewButton.setBounds(199, 231, 109, 30);
		contentPane.add(btnNewButton);
		
		username_Text = new JTextField();
		username_Text.setBounds(215, 70, 86, 20);
		contentPane.add(username_Text);
		username_Text.setColumns(10);
		
		password_text = new JPasswordField();
		password_text.setBounds(215, 101, 86, 20);
		contentPane.add(password_text);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(138, 70, 67, 14);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(138, 104, 67, 14);
		contentPane.add(lblNewLabel);
	}
}
