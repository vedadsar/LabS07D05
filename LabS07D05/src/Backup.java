import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Backup extends JFrame  {
	
	
	
	private JLabel studentName;
	private JButton nextNameButton;
	private JPanel mainPanel;
	private Students students;
	

	public Backup (Students students){
		super("Prozivka");
		
		this.students = students;		
				
	    mainPanel = new JPanel();								//Kreiramo novi JPanel
		mainPanel.setLayout(new BorderLayout());						// Postavljamo layout naseg panela.
		nextNameButton = new JButton("Next name");
		studentName = new JLabel(students.getRandomStudent());// Ime studenta iz klase Students dodajemo u JLabel			
		mainPanel.add(studentName, BorderLayout.CENTER);			// Na panel dodajemo studentName i centriramo u border layout
		mainPanel.add(nextNameButton, BorderLayout.PAGE_END);
		studentName.setHorizontalAlignment(SwingConstants.CENTER);	// Koristimo da "Text" labela poravnamo po horizontalnoj liniji.
		
		NextStudentListener nsl = new NextStudentListener();  // Nas action listener, proslijedjujemo JLabel i studente.
		nextNameButton.addActionListener(nsl);								
		
		setContentPane(mainPanel); // NAS prozor iz naseg (JFRAMEA)
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Iner klasa koja implementira actionlistener. Pomocu nje izvrsavamo akciju preform.
	 * @author vedadzornic
	 *
	 */
	public class NextStudentListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			studentName.setText(students.getRandomStudent());		//Mjenjamo vrijednost labela sa random imenom iz Students.
		}

	}

}
