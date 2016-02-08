package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtMatilda;
	private JTextField textField_1;
	private JTextField txtLoremgmailcom;
	private JTextField txtIpsumvgen;
	private JTextField textField_4;

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
		setBounds(100, 100, 508, 520);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 116, 460);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u00C5ke"},
				{"Jakob"},
				{"Erik"},
				{"Matilda"},
				{"Lorem"},
				{"Ipsum"},
				{"Lucas"},
				{"Madde"},
				{"Anita"},
				{"Clas"},
				{"Oskar"},
				{"Josefine"},
				{null},
			},
			new String[] {
				"Medlemmar"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.setToolTipText("");
		scrollPane.setViewportView(table);
		
		txtMatilda = new JTextField();
		txtMatilda.setText("Matilda Andersson");
		txtMatilda.setBounds(128, 62, 116, 22);
		contentPane.add(txtMatilda);
		txtMatilda.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0727149966");
		textField_1.setBounds(128, 203, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtLoremgmailcom = new JTextField();
		txtLoremgmailcom.setText("Lorem@gmail.com");
		txtLoremgmailcom.setBounds(128, 108, 116, 22);
		contentPane.add(txtLoremgmailcom);
		txtLoremgmailcom.setColumns(10);
		
		txtIpsumvgen = new JTextField();
		txtIpsumvgen.setText("IpsumV\u00E4gen 12");
		txtIpsumvgen.setBounds(128, 155, 116, 22);
		contentPane.add(txtIpsumvgen);
		txtIpsumvgen.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("931125-1212");
		textField_4.setBounds(128, 249, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Jonatan\\Desktop\\SidePic_Personal-Training-Girl.jpg"));
		label.setBounds(303, 13, 187, 390);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("Namn");
		lblName.setBounds(128, 47, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(128, 92, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(128, 139, 56, 16);
		contentPane.add(lblAdress);
		
		JLabel lblPhoneNbr = new JLabel("Phone nbr");
		lblPhoneNbr.setBounds(128, 188, 93, 16);
		contentPane.add(lblPhoneNbr);
		
		JLabel lblPersonnummer = new JLabel("Personnummer");
		lblPersonnummer.setBounds(128, 234, 116, 16);
		contentPane.add(lblPersonnummer);
	}
}
