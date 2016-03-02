package se.mah.ke.k3lara;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private String humanName;
	JTextArea textArea;
	
	Human human2;
	Dog dog2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 471);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddHuman = new JButton("Add human");
		btnAddHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Add a human");
				}else{
					
				humanName = textField.getText();
				human2 = new Human(humanName);
				}
			}
		});
		btnAddHuman.setBounds(32, 55, 97, 25);
		contentPane.add(btnAddHuman);
		
		JButton btnAddDog = new JButton("Add dog");
		btnAddDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Add a human");
				}else{
				Dog dog2 = new Dog(textField_1.getText());
				human2.buyDog(dog2);
				}
			}
		});
		btnAddDog.setBounds(32, 135, 97, 25);
		contentPane.add(btnAddDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("")|| human2 == null){
					JOptionPane.showMessageDialog(null, "Add a human");
				}else{
					textArea.setText(human2.infoPrint(human2.getName()));	
				}
			}
		});
		btnPrintInfo.setBounds(167, 211, 97, 25);
		contentPane.add(btnPrintInfo);
		
		textField = new JTextField();
		textField.setBounds(204, 56, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(204, 136, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBounds(107, 273, 283, 101);
		contentPane.add(textArea);
	}
}
