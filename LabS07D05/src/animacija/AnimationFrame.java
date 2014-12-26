package animacija;

import javax.swing.JFrame;

public class AnimationFrame extends JFrame {
private AnimationPanel animationPanel;
	public AnimationFrame(){
		super("Animation");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		animationPanel = new AnimationPanel();
		setContentPane(animationPanel);
	}
}
