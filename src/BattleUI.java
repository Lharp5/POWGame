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
	double o1x, o1y, o2x, o2y;
	int o1yD, o1xD, o2yD, o2xD;
	
	public BattleUI(Fighter p1, Fighter p2, Battle b) {
		battle = b;
		player1 = p1;
		player2 = p2;
		setPreferredSize(new Dimension(1280, 720));
		setDoubleBuffered(true);
		setVisible(true);
		
		o1x = o1y = o2x = o2y = 0;
		o1yD = o1xD = o2yD = o2xD = 1;
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
		g2.fillOval((int)o1x, (int)o1y, 50, 50);
		g2.setColor(Color.BLUE);
		g2.fillOval((int)o2x, (int)o2y, 60, 20);
	}
	
	
	public void update() {
		if (o1x > 1290)
			o1xD = -1;
		if (o1x < 0) 
			o1xD = 1;
		if (o1y > 730)
			o1yD = -1;
		if (o1y < 0) 
			o1yD = 1;
		if (o2x > 1290)
			o2xD = -1;
		if (o2x < 0) 
			o2xD = 1;
		if (o2y > 730)
			o2yD = -1;
		if (o2y < 0) 
			o2yD = 1;
		o1x += 2 * o1xD;
		o1y += 0.5 * o1yD;
		o2x +=0.5 * o2xD;
		o2y += 1 * o2yD;
	}

}
