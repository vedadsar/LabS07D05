import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainFrame extends JFrame {
		
	
	private JLabel studentName;
	private JButton nextNameButton;
	private JPanel mainPanel;
	private Students students;
	private JButton exitButton;
	

	public MainFrame (Students s){
		super("Prozivka");
		
		this.students = s;		
				
	    mainPanel = new JPanel();								//Kreiramo novi JPanel
		mainPanel.setLayout(new BorderLayout());						// Postavljamo layout naseg panela.
		
		nextNameButton = new JButton("Next name");
		exitButton = new JButton("Izlaz");
		studentName = new JLabel(students.getRandomStudent());// Ime studenta iz klase Students dodajemo u JLabel			
		
		mainPanel.add(studentName, BorderLayout.NORTH);			// Na panel dodajemo studentName i centriramo u border layout
		mainPanel.add(nextNameButton, BorderLayout.CENTER);
		mainPanel.add(exitButton, BorderLayout.SOUTH);
		studentName.setHorizontalAlignment(SwingConstants.CENTER);	// Koristimo da "Text" labela poravnamo po horizontalnoj liniji.
		
		//NextStudentListener nsl = new NextStudentListener();  // Nas action listener, proslijedjujemo JLabel i studente.
		
		nextNameButton.addActionListener(new ActionListener() {
			// Aninimna klasa, koristimo je samo za ovo dugme.
			@Override
			public void actionPerformed(ActionEvent e) {
				studentName.setText(students.getRandomStudent());				
			}
		} );								
		
		/**
		 * Kreiramo aninimnu klasu na exitButton.
		 */
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setContentPane(mainPanel); // NAS prozor iz naseg (JFRAMEA)
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	


}
