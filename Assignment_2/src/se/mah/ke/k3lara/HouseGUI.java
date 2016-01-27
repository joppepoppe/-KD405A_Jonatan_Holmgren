package se.mah.ke.k3lara;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.util.Random;


public class HouseGUI extends JFrame {
 private House[] myHouses;
 
 private ArrayList<House> houseArmy = new ArrayList<House>();
 
	private JPanel contentPane;
	private JTextField txtThemagicbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setForeground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(134, 51, 174, 164);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 51, 255));
		scrollPane.setViewportView(textArea);
		
		txtThemagicbox = new JTextField();
		txtThemagicbox.setBackground(new Color(0, 255, 51));
		txtThemagicbox.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 18));
		txtThemagicbox.setHorizontalAlignment(SwingConstants.CENTER);
		txtThemagicbox.setText("TheMagicBox");
		txtThemagicbox.setBounds(103, 13, 243, 34);
		contentPane.add(txtThemagicbox);
		txtThemagicbox.setColumns(10);
	
	
	House myHouse1 = new House(1890,45);
	House myHouse2 = new House(1891,46);
	House myHouse3 = new House(1892,47);
	textArea.append("assignment1.2" + "\n");
	textArea.append(myHouse1.getYearBuilt() + "\t" + myHouse1.getSize() +"\n");
	textArea.append(myHouse2.getYearBuilt() + "\t" + myHouse2.getSize() +"\n");
	textArea.append(myHouse3.getYearBuilt() + "\t" + myHouse3.getSize() +"\n");
	
    
    
    myHouses = new House[10];
    myHouses[0] =new House(1800,1001);
    myHouses[1] =new House(1801,1002);
    myHouses[2] =new House(1802,1003);
    myHouses[3] =new House(1803,1004);
    myHouses[4] =new House(1804,1005);
    myHouses[5] =new House(1805,1006);
    myHouses[6] =new House(1806,1007);
    myHouses[7] =new House(1807,1008);
    myHouses[8] =new House(1808,1009);
    myHouses[9] =new House(1809,1010);
 
	
    textArea.append("assignment1.3" + "\n");
    for( int k=0; k<myHouses.length; k++ ){
    	if (myHouses[k]!= null){
    	textArea.append(Integer.toString(myHouses[k].getYearBuilt())+ "\t" + myHouses[k].getSize()+ "\n");
    	}
    	}
    
    
    Random r = new Random();
    int Low = 10;
    int High = 1000;
    int Low1 = 1800;
    int High1 = 2015;
    
    for( int z=0; z<100; z++ ) {
    	houseArmy.add(new House(r.nextInt(High-Low)+Low,r.nextInt(High1-Low1)+Low1));
    }
    
    textArea.append("assignment1.4" + "\n");
    for(int p=0; p<houseArmy.size(); p++) {
    	System.out.println(houseArmy.get(p).getSize() + "\t" + houseArmy.get(p).getYearBuilt());
		textArea.append(houseArmy.get(p).getSize() + "\t");
		textArea.append(Integer.toString(houseArmy.get(p).getYearBuilt()));
		textArea.append("\n");
	}
    
    
   
    
	    
	}}

