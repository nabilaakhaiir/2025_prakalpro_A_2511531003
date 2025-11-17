package pekan8_2511531003;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class OperatorAritmatikaGUI_2511531003 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;

	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE); }
	 private void pesanError (String pesan) {
		 JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE); }
	 
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531003 frame = new OperatorAritmatikaGUI_2511531003();
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
	public OperatorAritmatikaGUI_2511531003() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(116, 10, 180, 18);
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 12));
		lblNewLabel_1.setBounds(41, 47, 84, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setFont(new Font("Segoe UI Emoji", Font.BOLD, 12));
		lblNewLabel_2.setBounds(41, 104, 73, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setFont(new Font("Segoe UI Emoji", Font.BOLD, 12));
		lblNewLabel_3.setBounds(41, 145, 73, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setFont(new Font("Segoe UI Emoji", Font.BOLD, 12));
		lblNewLabel_4.setBounds(41, 184, 73, 27);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(150, 45, 96, 18);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(150, 102, 96, 18);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(150, 142, 96, 20);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setBounds(150, 186, 96, 18);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("process");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan input Bilangan 1");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan input bilangan 2");
				} else if (txtBil2.getText().trim().startsWith("0")) {
				  pesanPeringatan ("Bilangan 2 tidak boleh angka 0");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						
						if (c==0) {hasil= a+b;}
						if (c==1) {hasil= a-b;}
						if (c==2) {hasil= a*b;}
						if (c==3) {hasil = a/b;}
						if (c==4) {hasil = a%b;}	
						
						txtHasil.setText (String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan Bilangan 2 harus Angka");
					}
				}
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				
				if (c==0) {hasil= a+b;}
				if (c==1) {hasil= a-b;}
				if (c==2) {hasil= a*b;}
				if (c==3) {hasil = a/b;}
				if (c==4) {hasil = a%b;}
			}
		});
		btnNewButton.setBounds(276, 142, 84, 20);
		contentPane.add(btnNewButton);

	}
}
//nabila khairunnisa_2511531003