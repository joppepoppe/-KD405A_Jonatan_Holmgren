package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 533, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 33, 193, 39);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(42, 103, 193, 220);
		contentPane.add(textArea_1);
		
		JButton btnHej = new JButton("Hej");
		btnHej.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				for(int p = 0; p< Constants.colorArray.length; p++ ){
				
					
					if(textArea.getText().equals(Constants.colorArray[p])) {
									
					    Constants.color1=Constants.colorArray[p];
					    Constants.test1=true;
					    break;
					    
					} else {
						Constants.test1=false;
					}
					
				
				}
				
				if(Constants.test1==true) {
					System.out.println("Du har valt färgen " + Constants.color1);
					textArea_1.append("Du har valt färgen " + Constants.color1 +"\n");
				} else if (Constants.test1==false) {
					System.out.println("Du har valt en icke valid färg");
					textArea_1.append("Du har valt en icke valid färg" + "\n");
				}
				
					
					
					
				
				
					
				
			}
		});
		
		btnHej.setBounds(299, 161, 115, 29);
		contentPane.add(btnHej);
	
	
		ArrayList<Bike> testBike = new ArrayList<Bike>();
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10));
		testBike.add(new Bike("hej",10,20));
		
		
		}
	}
