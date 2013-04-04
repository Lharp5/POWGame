import javax.swing.JFrame;


public class Launcher extends JFrame{
	private static Launcher controller;
	private LauncherView view;
	
	public Launcher(String t) {
		super(t);
		view = new LauncherView();
		getContentPane().setPreferredSize(view.getPreferredSize());
		pack();		
		
		add(view);
		setSize(1280, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	
	public static void main(String[] args) {
		controller = new Launcher("POWA!");
		controller.setVisible(true);
		
	}

}
