import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * Klasa koja implementuje action listener. Kreiramo nas action listener i pravimo konstruktor kojem proslijedjujemo JLabel i Students.
 * Zatim na actionPerformed on uzima nas label, i postavlja novi text tj. izvlaci iz studenta random name.
 * @author vedadzornic
 *
 */
public class NextStudentListener implements ActionListener{
	private JLabel nameLabel;
	private Students students;

	public  NextStudentListener(JLabel nameLabel, Students students) {
		this.nameLabel = nameLabel;
		this.students = students ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nameLabel.setText(students.getRandomStudent());		//Mjenjamo vrijednost labela sa random imenom iz Students.
	}

}
