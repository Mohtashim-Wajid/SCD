package Q1;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AddEmployee {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee window = new AddEmployee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		List <String,Integer, String, String, String> employees = new ArrayList<>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 572, 40);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Add user info: ");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter name ");
		lblNewLabel_1.setBounds(190, 109, 118, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Age: ");
		lblNewLabel_2.setBounds(190, 149, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CNIC: ");
		lblNewLabel_3.setBounds(190, 174, 46, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date of Birth: ");
		lblNewLabel_4.setBounds(190, 208, 95, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Employee Address: ");
		lblNewLabel_5.setBounds(190, 239, 95, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(310, 119, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(310, 146, 136, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(310, 175, 136, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(310, 205, 136, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(310, 236, 136, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Current Employees");
		btnNewButton.setBounds(423, 62, 143, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Employee");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().isEmpty() && textField_1.getText().isEmpty() && textField_2.getText().isEmpty() && textField_3.getText().isEmpty() && textField_4.getText().isEmpty())) {
					String name = textField.getText();
					int age = Integer.parseInt(textField_1.getText());
					String CNIC = textField_2.getText();
					String dob = textField_3.getText();
					String address = textField_4.getText();
					employees.add(name,age,CNIC,dob,address);
					
				}
			}
		});
		btnNewButton_1.setBounds(216, 295, 155, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
