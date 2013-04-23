import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class BattleUI extends JPanel{
	private Battle battle;
	private Fighter player1, player2;
	private Graphics2D g, dbg;
	private Image dbImage;
	private double p1MaxLife, p2MaxLife;
	
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
		
		player1.setMoving(false);
		player2.setMoving(false);
		
		p1MaxLife = player1.getLife();
		p2MaxLife = player2.getLife();
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
		g2.fillOval((int)player1.getX(), (int)player1.getY()-player1.getHeight(), player1.getWidth(), player1.getHeight()); //p1
		g2.setColor(Color.BLUE);
		g2.fillOval((int)player2.getX()-player2.getWidth(), (int)player2.getY()-player2.getHeight(), player2.getWidth(), player2.getHeight()); //p2
		
		//health bars
		g2.setColor(Color.RED);
		double p1HealthBar = 610 * (player1.getLife() / p1MaxLife);
		double p2HealthBar = 610 * (player2.getLife() / p2MaxLife);
		g2.fillRect((int) (640-p1HealthBar), 15, (int) p1HealthBar, 15);
		g2.fillRect(650, 15, (int) p2HealthBar, 15);
		Image p1Health = new ImageIcon("res/p1Health.png").getImage();
		Image p2Health = new ImageIcon("res/p2Health.png").getImage();
		g2.drawImage(p1Health, 25, 10, this);
		g2.drawImage(p2Health, 645, 10, this);
	}
	
	
	public void update() {
		battle.PlayerMove(player1);
		battle.PlayerMove(player2);
	}

}
