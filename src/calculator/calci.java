package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setBounds(20, 10, 328, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbackSpase = new JButton("\uF0E7");
		btnbackSpase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpase = null;
				if(textField.getText().length()>0);
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpase = str.toString();
					textField.setText(backSpase);
					
				}
			}
		});
		btnbackSpase.setBackground(new Color(192, 192, 192));
		btnbackSpase.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnbackSpase.setBounds(20, 104, 70, 66);
		frame.getContentPane().add(btnbackSpase);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(20, 184, 70, 66);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(new Color(192, 192, 192));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(20, 259, 70, 66);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(20, 335, 70, 66);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(new Color(192, 192, 192));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(20, 413, 70, 66);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBackground(new Color(192, 192, 192));
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(104, 413, 70, 66);
		frame.getContentPane().add(btnDot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(new Color(192, 192, 192));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(100, 335, 70, 66);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(100, 259, 70, 66);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(192, 192, 192));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(100, 184, 70, 66);
		frame.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBackground(new Color(192, 192, 192));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(100, 104, 70, 66);
		frame.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setBackground(new Color(192, 192, 192));
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(192, 104, 70, 66);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(new Color(192, 192, 192));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(192, 184, 70, 66);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(192, 260, 70, 66);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(new Color(192, 192, 192));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(192, 335, 70, 66);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") 
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") 
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") 
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") 
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%") 
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				 
				
				
				
			}
		});
		btnEqual.setBackground(new Color(192, 192, 192));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(192, 413, 70, 66);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPersent = new JButton("%");
		btnPersent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPersent.setBackground(new Color(192, 192, 192));
		btnPersent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPersent.setBounds(278, 413, 70, 66);
		frame.getContentPane().add(btnPersent);
		
		JButton btDivide = new JButton("/");
		btDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btDivide.setBackground(new Color(192, 192, 192));
		btDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btDivide.setBounds(278, 335, 70, 66);
		frame.getContentPane().add(btDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setBackground(new Color(192, 192, 192));
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(278, 259, 70, 66);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setBackground(new Color(192, 192, 192));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(278, 184, 70, 66);
		frame.getContentPane().add(btnSub);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setBackground(new Color(192, 192, 192));
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(278, 104, 70, 66);
		frame.getContentPane().add(btnPlus);
	}
}
