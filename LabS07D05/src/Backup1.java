import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Backup1 extends JFrame implements ActionListener  {
		
	
	private JLabel studentName;
	private JButton nextNameButton;
	private JPanel mainPanel;
	private Students students;
	private JButton exitButton;
	

	public Backup1 (Students students){
		super("Prozivka");
		
		this.students = students;		
				
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
		
		nextNameButton.addActionListener(this);								
		exitButton.addActionListener(this);
		
		setContentPane(mainPanel); // NAS prozor iz naseg (JFRAMEA)
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		
		public void actionPerformed(ActionEvent e) {
			//JButton source = (JButton) e.getSource(); // Castamo source u JButton da vidimo na koje dugme je kliknuto.
			
			if(e.getSource() == nextNameButton)			 // Poredimo da li je lokacija eventa jednaka nasem buttonu ( MEMORIJSKA LOKACIJA) 
				studentName.setText(students.getRandomStudent());		//Mjenjamo vrijednost labela sa random imenom iz Students.
			else // Ako nije izlazimo
				System.exit(0);
		}


}