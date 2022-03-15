package LAB_09_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField loan_textField;
	private JTextField year_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loan Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 55, 119, 31);
		contentPane.add(lblNewLabel);
		
		loan_textField = new JTextField();
		//loan_textField.setText("1500000");
		loan_textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		loan_textField.setBounds(127, 55, 154, 31);
		contentPane.add(loan_textField);
		loan_textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Number of Years");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(291, 61, 172, 18);
		contentPane.add(lblNewLabel_1);
		
		year_textField = new JTextField();
		//year_textField.setText("5"); //test
		year_textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		year_textField.setBounds(438, 56, 43, 30);
		contentPane.add(year_textField);
		year_textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Show Table");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(491, 58, 139, 25);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 238, 560, -159);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 119, 597, 139);
		contentPane.add(scrollPane_1);
		
		//Manage , Calculate , Output in TextArea
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 19));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//When press button
				String topRow = "Interest Rate    Monthly Payment    Total Payment\n";
				
				double loan_input = Double.parseDouble(loan_textField.getText());
				int year_input = Integer.parseInt(year_textField.getText());
				for(double i = 5; i <= 8; i += 0.25)
				{
//					String s = Integer.toString(i)+"\n";
//					textArea.append(s);
					 double monthlyPayment = payPerMonth(loan_input, year_input, i);
					 String output = String.format("%.2f %20.2f %20.2f\n", i, monthlyPayment, monthlyPayment * 12 * year_input);
					 topRow+=output;
				}
				textArea.setText(topRow);
			}
		});
	}
	
	 public double payPerMonth(double loan, int years, double interestRate) {
	        double r = interestRate / 1200;
	        int n = years * 12;
	        return (loan * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
	    }

	 
}
