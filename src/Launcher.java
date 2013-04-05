import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Launcher extends JFrame{
	private static Launcher controller;
	private FighterPool model;
	private LauncherView view;
	
	public Launcher(String t) {
		super(t);
		model = new FighterPool();
		view = new LauncherView(model);	//creates the view, that stuff will be displyed on
		getContentPane().setPreferredSize(view.getPreferredSize());	//makes the window fit around the view
		pack();		
		
		add(view);
		setSize(1280, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		view.getStart().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				handleStart();}});
		
		for (int i = 0; i < model.getFighters.length; i++) {
				view.getP1Array()[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						handleP1selection(e); }});
				view.getP2Array()[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					handleP2selection(e);}});
		}
		
	}
	
	public static void main(String[] args) {
		controller = new Launcher("POWA!");
		controller.setVisible(true);
		
	}
	
	private void handleStart() {
		System.out.println("Start");
	}
	
	private void handleP1selection(ActionEvent e) {
		for (int i = 0; i < 4; i++) {
			JButton button = view.getP1Array()[i];
			if (button.equals(e.getSource()))
				System.out.println("P1 button " + i);
		}
		
	}
	
	private void handleP2selection(ActionEvent e) {
		for (int i = 0; i < 4; i++) {
			JButton button = view.getP2Array()[i];
			if (button.equals(e.getSource()))
				System.out.println("P2 button " + i);
		}
	}

}
