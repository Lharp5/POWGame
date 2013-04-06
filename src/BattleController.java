import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class BattleController extends JFrame implements ActionListener{
	private BattleUI battleUI;
	private Battle battle;
	private Timer time;
	
	public BattleController(String string, Fighter p1, Fighter p2) {
		super(string);
		battle = new Battle(p1, p2);
		battleUI = new BattleUI(p1, p2, battle);
		
		getContentPane().setPreferredSize(battleUI.getPreferredSize());
		pack();		
		add(battleUI);
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		time = new Timer(16, this);
		time.start();
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				pressedKey(e);
			}});
	}
	
	private void pressedKey(KeyEvent e) {
		battleUI.update();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		battleUI.dbDraw();
	}

}
