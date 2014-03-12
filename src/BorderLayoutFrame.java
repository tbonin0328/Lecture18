import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutFrame extends JFrame

{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;

	public BorderLayoutFrame()
	{
		super();
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JLabel northLabel = new JLabel("North");
		add(northLabel, BorderLayout.NORTH);
		
		JLabel eastLabel = new JLabel("East");
		add(eastLabel, BorderLayout.EAST);
		
		JLabel southLabel = new JLabel("South");
		add(southLabel, BorderLayout.SOUTH);
		
		JLabel westLabel = new JLabel("West");
		add(westLabel, BorderLayout.WEST);
		
	}
	
	public static void main (String[] args)
	{
		BorderLayoutFrame myFrame = new BorderLayoutFrame();
		myFrame.setVisible(true);
	}
}
