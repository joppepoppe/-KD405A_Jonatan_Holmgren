package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Gui extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnSk;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(47, 176, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		

		textField_1 = new JTextField();
		textField_1.setBounds(179, 36, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(368, 36, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("The Magic Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("im Working");
				new TR휚1().start();
				
			}
		});
		btnNewButton.setBounds(36, 138, 154, 25);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(218, 117, 344, 129);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnSk = new JButton("S\u00D6K");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("im Working");
				new TR휚2().start();
				
			}
		});
		btnSk.setBounds(47, 35, 97, 25);
		contentPane.add(btnSk);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private class TR휚1 extends Thread {
		public void run(){
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(textField.getText()));
			textArea.setText("");
			for (Station s: searchStations){
				if (s.getStationName().contains(textField.getText())) {
				textArea.append(s.getStationName() + " " + s.getLatitude() +" " + s.getLongitude() + " " + s.getStationNbr() + "\n");
				System.out.println(s.getStationName() +" number:" +s.getStationNbr());
			}			
			}
			
		}
		
	}
	private class TR휚2 extends Thread {
		public void run(){
			
			String searchURL = Constants.getURL(textField_1.getText(),textField_2.getText(),1);
			Journeys journeys = Parser.getJourneys(searchURL);
			textArea.setText("");
			for (Journey journey : journeys.getJourneys()) {
				
				textArea.append(journey.getStartStation()+" - ");
				textArea.append(journey.getEndStation().getStationName());
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
				textArea.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
			} 
			
		}
		
	}
}



