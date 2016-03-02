package se.mah.ke.k3lara;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DigitalClockGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private ClockLogic logic;
	private int hour;
	private int minute;
	private JLabel lblNewLabel_1;
	private boolean alarmy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGui frame = new DigitalClockGui();
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
	public DigitalClockGui() {
		
		
		logic = new ClockLogic(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tekton Pro Cond", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(0, 0, 200, 73);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(0, 98, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 133, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(128, 101, 56, 16);
		contentPane.add(lblHour);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(128, 136, 56, 16);
		contentPane.add(lblMin);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hour = Integer.parseInt(textField.getText());
				minute = Integer.parseInt(textField_1.getText());
				if(hour<13 &&minute<61){
				logic.setAlarm(hour, minute);
				lblNewLabel_1.setText(hour + ":" + minute);
				}else{
				 JOptionPane.showMessageDialog(null, "Felinslag");
				}
			}
		});
		btnSetAlarm.setBounds(0, 183, 97, 25);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.clearAlarm();
				textField.setText("");
				textField_1.setText("");
				lblNewLabel_1.setText("");
			}
		});
		btnClearAlarm.setBounds(176, 119, 97, 25);
		contentPane.add(btnClearAlarm);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(79, 374, 226, 16);
		contentPane.add(lblNewLabel_1);
	
	}
	public void setTimeOnLabel(String text){
		lblNewLabel.setText(text);
	}
	public void activateAlarm(boolean alarm){
		alarmy = alarm;
		if(alarmy){
			JOptionPane.showMessageDialog(null, "WopWop");
		}
	}}
