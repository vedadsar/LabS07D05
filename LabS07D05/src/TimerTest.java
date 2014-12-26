import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args) {

		Timer t = new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Prosla sekunda");
			}
		});
		t.start();
	}
}
