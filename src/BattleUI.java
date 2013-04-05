import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BattleUI extends JFrame{
	private JPanel gamePanel;
	private Battle battle;
	private Fighter player1, player2;
	
	public BattleUI(String title, Fighter p1, Fighter p2) {
		super(title);
		player1 = p1;
		player2 = p2;
		gamePanel = new JPanel();
		gamePanel.setPreferredSize(new Dimension(1280, 720));
		
		battle = new Battle(player1, player2);

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
