import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BattleUI extends JPanel{
	private Battle battle;
	private Fighter player1, player2;
	private Graphics2D g, dbg;
	private Image dbImage;
	
	public BattleUI(Fighter p1, Fighter p2, Battle b) {
		battle = b;
		player1 = p1;
		player2 = p2;
		setPreferredSize(new Dimension(1280, 720));
		setDoubleBuffered(true);
		setVisible(true);
		
		//setting initial positions
		player1.setX(50);
		player1.setY(600);
		
		player2.setX(1230);
		player2.setY(600);
	}
	
	public void dbDraw() {
		g = (Graphics2D) this.getGraphics();
		dbImage = createImage(1290, 730);	//creates an off screen image
		dbg = (Graphics2D) dbImage.getGraphics();	//gets graphics for the off scrren image
		draw(dbg);		//draws to offscreen image
		g.drawImage(dbImage, 0, 0, this);	//moves image onto the screen.
	}
	
	private void draw(Graphics2D g2) {
		update();
		g2.setColor(Color.DARK_GRAY);
		//testing for flicker
		g2.fillRect(0, 0, 1290, 730);
		g2.setColor(Color.RED);
		g2.fillOval((int)player1.getX(), (int)player1.getY(), 50, 50); //p1
		g2.setColor(Color.BLUE);
		g2.fillOval((int)player2.getX(), (int)player2.getY(), 50, 50); //p2
	}
	
	
	public void update() {
		//will add vertical acceleration here
		
	}

}
