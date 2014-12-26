import javax.swing.JFrame;
import javax.swing.Timer;

public class PlayCircle {

	public static void main(String[] args) {
		JFrame window = new JFrame("Nesto");
		Circle krug = new Circle();
		

		window.setSize(500, 500);
		window.setContentPane(krug);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		krug.requestFocus();
		
	}
}
