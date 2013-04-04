import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LauncherView extends JPanel {
	//GridbagLayout generalLayout, p1Layout, p2Layout;
	private JPanel playerOnePanel, playerTwoPanel;
	private JButton[] p1Character, p2Charater;
	private JButton startGame;

	public LauncherView() {
		// general layout stuff
		GridBagLayout generalLayout = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(5, 5, 5, 5); // default spacing
		setLayout(generalLayout);

		// Panels
		//player one
		playerOnePanel = new JPanel();
		playerOnePanel.setBorder(BorderFactory.createTitledBorder("Player One"));
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		generalLayout.setConstraints(playerOnePanel, constraints);
		add(playerOnePanel);
		
		//player two
		playerTwoPanel = new JPanel();
		playerTwoPanel.setBorder(BorderFactory.createTitledBorder("Player Two"));
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1;
		constraints.weighty = 1;
		generalLayout.setConstraints(playerTwoPanel, constraints);
		add(playerTwoPanel);

		// buttons
		startGame = new JButton("START!");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 0;
		constraints.weighty = 0;
		generalLayout.setConstraints(startGame, constraints);
		add(startGame);
	}

}
