import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class BattleController extends JFrame implements ActionListener{
	private BattleUI battleUI;
	private Battle battle;
	private Timer time;
	private Fighter player1, player2;
	
	public BattleController(String string, Fighter p1, Fighter p2) {
		super(string);
		player1 = p1;
		player2 = p2;
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
			public void keyReleased(KeyEvent e) {
				releasedKey(e);
			}
			public void keyPressed(KeyEvent e) {
				pressedKey(e);
			}});
	}
	
	private void pressedKey(KeyEvent e) {
		@SuppressWarnings("static-access")
		String key = e.getKeyText(e.getKeyCode());
		
		//p1Controls
		if (key.equals("A")) {
			player1.setMoving(true);
			if (player1.getxDir() == 1) {
				player1.setDirB();
				player1.xStop();
			}
			
			
		}
		if (key.equals("W")) {
			if(!player1.inAir()) {
				player1.startJump();
				player1.setYSpeed(20);
			}
		}
		if (key.equals("D")) {
			player1.setMoving(true);
			if (player1.getxDir() == -1) {
				player1.setDirF();
				player1.xStop();
			}
		}
		if (key.equals("S")) {
			//P1 duck/block
		}
		
		//p2Controls
		if (key.equals("Left")) {
			player2.setMoving(true);
			if (player2.getxDir() == 1) {
				player2.setDirB();
				player2.xStop();
			}
			
			
		}
		if (key.equals("Up")) {
			if(!player2.inAir()) {
				player2.startJump();
				player2.setYSpeed(20);
			}
		}
		if (key.equals("Right")) {
			player2.setMoving(true);
			if (player2.getxDir() == -1) {
				player2.setDirF();
				player2.xStop();
			}
		}
		
		battleUI.update();
	}
	
	private void releasedKey(KeyEvent e) {
		@SuppressWarnings("static-access")
		String key = e.getKeyText(e.getKeyCode());
		if (key.equals("A")) {
			player1.setMoving(false);
		}
		if (key.equals("D")) {
			player1.setMoving(false);
		}
		if (key.equals("Left")) {
			player2.setMoving(false);
		}
		if (key.equals("Right")) {
			player2.setMoving(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		battleUI.dbDraw();
	}

}
