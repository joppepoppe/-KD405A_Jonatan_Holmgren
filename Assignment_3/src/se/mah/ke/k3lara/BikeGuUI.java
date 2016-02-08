package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class BikeGuUI extends JFrame {

	private JPanel contentPane;
	public static JTextField textColor;
	public static JTextField textSize;
	public static JTextField textPrice;
	public static JTextArea textArea;
	private JButton GetAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGuUI frame = new BikeGuUI();
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
	public BikeGuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(73, 58, 248, 356);
		contentPane.add(textArea);
		
		textColor = new JTextField();
		textColor.setBounds(407, 55, 146, 26);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setColumns(10);
		textSize.setBounds(568, 55, 146, 26);
		contentPane.add(textSize);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(723, 55, 146, 26);
		contentPane.add(textPrice);
		
		JButton btnCreateBike = new JButton("Create Bike");
		btnCreateBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BikeStore.addBike(textColor.getText(), Integer.parseInt(textSize.getText()),Integer.parseInt(textPrice.getText()));
				
				textColor.setText("");
				textSize.setText("");
				textPrice.setText("");	
				
				
				
				
			}
		});
		btnCreateBike.setBounds(489, 237, 115, 29);
		contentPane.add(btnCreateBike);
		
		GetAll = new JButton("Get all bikes");
		GetAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(BikeStore.getAllBikes());
			}
		});
		GetAll.setBounds(457, 294, 178, 29);
		contentPane.add(GetAll);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(166, 29, 56, 16);
		contentPane.add(lblOutput);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(449, 29, 56, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(610, 29, 56, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(764, 29, 56, 16);
		contentPane.add(lblPrice);
	}
}
