import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Callout {

	public static void main(String[] args) {

		Students students = new Students();
		
		JPanel mainPanel = new JPanel();								//Kreiramo novi JPanel
		mainPanel.setLayout(new BorderLayout());						// Postavljamo layout naseg panela.
		
		JLabel studentName = new JLabel(students.getRandomStudent());// Ime studenta iz klase Students dodajemo u JLabel			
		mainPanel.add(studentName, BorderLayout.CENTER);			// Na panel dodajemo studentName i centriramo u border layout
		studentName.setHorizontalAlignment(SwingConstants.CENTER);	// Koristimo da "Text" labela poravnamo po horizontalnoj liniji.
		
		JFrame mainWindow = new JFrame("Prozivka");
		mainWindow.setSize(400, 300);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setContentPane(mainPanel);
		mainWindow.setVisible(true);
		
		
	}
	
}
