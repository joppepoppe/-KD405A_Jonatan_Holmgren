package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	Calculator myCalculator;
	private JTextField txtSuperCalculator;

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
		setBounds(100, 100, 530, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		

		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 185, 211, 38);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btnNewButton.setBounds(26, 30, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btnNewButton_1.setBounds(135, 30, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		btnNewButton_2.setBounds(244, 30, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnNewButton_3.setBounds(26, 68, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btnNewButton_4.setBounds(135, 68, 97, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btnNewButton_5.setBounds(244, 68, 97, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton_6.setBounds(26, 106, 97, 25);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btnNewButton_7.setBounds(135, 106, 97, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				textArea.append("9");
			}
		});
		btnNewButton_8.setBounds(244, 106, 97, 25);
		contentPane.add(btnNewButton_8);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("-");
				myCalculator.minus();
			}
		});
		button.setBounds(384, 30, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("+");
				myCalculator.plus();
			}
		});
		button_1.setBounds(384, 68, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_2.setBounds(384, 106, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(244, 163, 97, 46);
		contentPane.add(button_3);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("x");
				myCalculator.mult();
			}
		});
		btnX.setBounds(384, 144, 97, 25);
		contentPane.add(btnX);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_4.setBounds(135, 144, 97, 25);
		contentPane.add(button_4);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				myCalculator.clear();
			}
		});
		btnAc.setBounds(384, 184, 97, 25);
		contentPane.add(btnAc);
		
		txtSuperCalculator = new JTextField();
		txtSuperCalculator.setForeground(new Color(255, 255, 255));
		txtSuperCalculator.setBackground(new Color(0, 0, 0));
		txtSuperCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		txtSuperCalculator.setText("Super Calculator 2.0");
		txtSuperCalculator.setBounds(0, 0, 512, 22);
		contentPane.add(txtSuperCalculator);
		txtSuperCalculator.setColumns(10);
		
		
	}
}
