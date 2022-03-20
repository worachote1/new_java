package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
		String x = "-44";
		System.out.print(4+Double.parseDouble(x));
	}

	/**
	 * Create the frame.
	 */
	String operation = "";
	double n1,n2,result;
	
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		textField.setBounds(43, 29, 393, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		//test non-edible
		textField.setEnabled(false);
		//Row 1
		JButton ClearButton = new JButton("CLEAR");
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=0; n2=0;
				textField.setText(null);
			}
		});
		ClearButton.setForeground(Color.BLACK);
		ClearButton.setBackground(Color.RED);
		ClearButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		ClearButton.setBounds(43, 107, 148, 36);
		contentPane.add(ClearButton);
		
		JButton ChangeSignButton = new JButton("+/-");
		ChangeSignButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//change singed of number
				textField.setText(String.valueOf(Double.parseDouble(textField.getText()) * -1));
		}
		});
		ChangeSignButton.setBackground(Color.ORANGE);
		ChangeSignButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		ChangeSignButton.setBounds(201, 107, 116, 36);
		contentPane.add(ChangeSignButton);
		
		JButton DivideButton = new JButton("/");
		DivideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				operation = "/";
				textField.setText(null);
			}
		});
		DivideButton.setBackground(Color.ORANGE);
		DivideButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DivideButton.setBounds(327, 107, 109, 36);
		contentPane.add(DivideButton);
		
		//Row 2
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"9";
				textField.setText(inputNum);
			}
		});
		btn_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_9.setBounds(244, 153, 85, 57);
		contentPane.add(btn_9);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"8";
				textField.setText(inputNum);
			}
		});
		btn_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_8.setBounds(139, 153, 85, 57);
		contentPane.add(btn_8);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"7";
				textField.setText(inputNum);
			}
		});
		btn_7.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_7.setBounds(43, 153, 85, 57);
		contentPane.add(btn_7);
		
		JButton MulButton = new JButton("*");
		MulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				operation = "*"; 
				textField.setText(null);
			}
		});
		MulButton.setBackground(Color.ORANGE);
		MulButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		MulButton.setBounds(351, 153, 85, 57);
		contentPane.add(MulButton);
		
		//Row 3
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"4";
				textField.setText(inputNum);
			}
		});
		btn_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_4.setBounds(43, 220, 85, 57);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"5";
				textField.setText(inputNum);
			}
		});
		btn_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_5.setBounds(139, 220, 85, 57);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"6";
				textField.setText(inputNum);
			}
		});
		btn_6.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_6.setBounds(244, 220, 85, 57);
		contentPane.add(btn_6);
		
		JButton SubButton = new JButton("-");
		SubButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					n1=Double.parseDouble(textField.getText());
					operation = "-";
					textField.setText(null);
			}
		});
		SubButton.setBackground(Color.ORANGE);
		SubButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		SubButton.setBounds(351, 220, 85, 57);
		contentPane.add(SubButton);
		
		//Row 4
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"1";
				textField.setText(inputNum);
			}
		});
		btn_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_1.setBounds(43, 287, 85, 57);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"2";
				textField.setText(inputNum);
			}
		});
		btn_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_2.setBounds(139, 287, 85, 57);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"3";
				textField.setText(inputNum);
			}
		});
		btn_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_3.setBounds(244, 287, 85, 57);
		contentPane.add(btn_3);
		
		JButton AddButton = new JButton("+");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				operation = "+";
				textField.setText(null);
			}
		});
		AddButton.setBackground(Color.ORANGE);
		AddButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		AddButton.setBounds(351, 287, 85, 57);
		contentPane.add(AddButton);
		
		//Row 5
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = textField.getText()+"0";
				textField.setText(inputNum);
			}
		});
		btn_0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		btn_0.setBounds(43, 354, 181, 57);
		contentPane.add(btn_0);
		
		JButton DotButton = new JButton(".");
		DotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText().contains(".")))
				{
					String inputNum = textField.getText()+".";
					textField.setText(inputNum);
				}
			}
		});
		DotButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		DotButton.setBounds(244, 354, 85, 57);
		contentPane.add(DotButton);
		
		JButton ResultButton = new JButton("=");
		ResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(textField.getText());
				switch(operation) {
				  case "+":
					  textField.setText(String.valueOf(n1+n2));
				    break;
				  case "-":
					  textField.setText(String.valueOf(n1-n2));
					    break;				 
				  case "*":
					  textField.setText(String.valueOf(n1*n2));
					    break;					    
				  case "/":
					  textField.setText(String.valueOf(n1/n2));
					    break;					  
				  default:
					  textField.setText(String.valueOf(textField.getText()));
				}
			}
		});
		ResultButton.setBackground(Color.ORANGE);
		ResultButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 28));
		ResultButton.setBounds(351, 354, 85, 57);
		contentPane.add(ResultButton);
	}
}
