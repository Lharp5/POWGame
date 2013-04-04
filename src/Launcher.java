import javax.swing.JFrame;


public class Launcher extends JFrame{
	private static Launcher controller;
	private LauncherView view;
	
	public Launcher(String t) {
		super(t);
		view = new LauncherView();	//creates the view, that stuff will be displyed on
		getContentPane().setPreferredSize(view.getPreferredSize());	//makes the window fit around the view
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
	
	//need another window that will contain the actual game, will hide this one until game is over

}
