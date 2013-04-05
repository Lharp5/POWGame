import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BattleUI extends JPanel{
	private Battle battle;
	private Fighter player1, player2;
	
	public BattleUI(Fighter p1, Fighter p2, Battle b) {
		battle = b;
		player1 = p1;
		player2 = p2;
		setPreferredSize(new Dimension(1280, 720));
		setVisible(true);
	}
	
	public void draw() {
		Graphics g = this.getGraphics();
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 1290, 730);
		
	}
	
	public void update() {
		
	}

}
