import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.FLOOR_5);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 100; i = i + 10){
		px.setPixel(10+i, 10+i/2, Color.BLUE);
		px.setPixel(10+i, 11+i/2, Color.RED);
		px.setPixel(10+i, 12+i/2, Color.CYAN);
		px.setPixel(10+i, 13+i/2, Color.ORANGE);
		px.setPixel(10+i, 14+i/2, Color.GREEN);
		px.setPixel(10+i, 15+i/2, Color.MAGENTA);
		px.setPixel(10+i, 16+i/2, Color.BLUE);
		px.setPixel(10+i, 17+i/2, Color.RED);
		
		
		
		
		
		
		
		
		}
		
	}

}
