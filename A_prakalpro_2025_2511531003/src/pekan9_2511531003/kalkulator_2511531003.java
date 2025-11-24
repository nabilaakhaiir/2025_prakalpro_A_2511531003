package pekan9_2511531003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class kalkulator_2511531003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBackspace;
	private JButton btnClear;
	private JButton btn00;
	private JButton btnplus_2511531003;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnSub_2511531003;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMul_2511531003;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDevide_2511531003;
	private JButton btnPercent_2511531003;
	private JButton btnEqual_2511531003;
	private JButton btnPercent_1;
	private JButton btn0;
	
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
					kalkulator_2511531003 frame = new kalkulator_2511531003();
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
	public kalkulator_2511531003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 269, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBackspace = new JButton("\uF0e7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if (textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 18));
		btnBackspace.setBounds(10, 73, 68, 48);
		contentPane.add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(78, 73, 68, 48);
		contentPane.add(btnClear);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(144, 73, 68, 48);
		contentPane.add(btn00);
		
		btnplus_2511531003 = new JButton("+");
		btnplus_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus_2511531003.setBounds(211, 73, 68, 48);
		contentPane.add(btnplus_2511531003);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 118, 68, 48);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(78, 118, 68, 48);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(144, 118, 68, 48);
		contentPane.add(btn9);
		
		btnSub_2511531003 = new JButton("-");
		btnSub_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub_2511531003.setBounds(211, 118, 68, 48);
		contentPane.add(btnSub_2511531003);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 164, 68, 48);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(78, 164, 68, 48);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(144, 164, 68, 48);
		contentPane.add(btn6);
		
		btnMul_2511531003 = new JButton("*");
		btnMul_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul_2511531003.setBounds(211, 164, 68, 48);
		contentPane.add(btnMul_2511531003);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 211, 68, 48);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(78, 211, 68, 48);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(144, 211, 68, 48);
		contentPane.add(btn3);
		
		btnDevide_2511531003 = new JButton("/");
		btnDevide_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDevide_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDevide_2511531003.setBounds(211, 211, 68, 48);
		contentPane.add(btnDevide_2511531003);
		
		btnPercent_2511531003 = new JButton("%");
		btnPercent_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent_2511531003.setBounds(211, 253, 68, 53);
		contentPane.add(btnPercent_2511531003);
		
		btnEqual_2511531003 = new JButton("=");
		btnEqual_2511531003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
						result = first+second;
						answer = String.format("%,2f", result);
						textField.setText(answer);
				}
				else if (operation=="-")
				{
				        result = first-second;
				        answer = String.format("%,2f", result);
				        textField.setText(answer);
			    }
				else if (operation=="*")
				{
				result = first*second;
				answer = String.format("%,2f", result);
				textField.setText(answer);
			}
					else if (operation=="/")
					{
				result = first/second;
				answer = String.format("%,2f", result);
				textField.setText(answer);
			}
					else if (operation=="%")
					{
				result = first%second;
				answer = String.format("%,2f", result);
				textField.setText(answer);
					}
			}
				});
		btnEqual_2511531003.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual_2511531003.setBounds(144, 253, 68, 53);
		contentPane.add(btnEqual_2511531003
				);
		
		btnPercent_1 = new JButton(".");
		btnPercent_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent_1.setBounds(78, 253, 68, 53);
		contentPane.add(btnPercent_1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String number=textField.getText()+btn0.getText();
					textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 253, 68, 53);
		contentPane.add(btn0);
			
	}
}
