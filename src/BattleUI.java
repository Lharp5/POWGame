import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BattleUI extends JFrame{
	private JPanel gamePanel;
	
	public BattleUI(String title) {
		super(title);
		gamePanel = new JPanel();
		gamePanel.setPreferredSize(new Dimension(1280, 720));
		

		getContentPane().setPreferredSize(gamePanel.getPreferredSize());
		pack();		
		add(gamePanel);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void draw() {
		
	}
	
	private void update() {
		
	}

}
