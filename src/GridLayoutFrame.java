
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class GridLayoutFrame extends JFrame
{

	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;

	public GridLayoutFrame()
	{
		super("Gridding");
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,2));		
		
		JLabel firstLabel = new JLabel("First");
		add(firstLabel);
		
		JLabel secondLabel = new JLabel("Second");
		add(secondLabel);
		
		JLabel thirdLabel = new JLabel("Third");
		add(thirdLabel);
		
		JLabel fourthLabel = new JLabel("Fourth");
		add(fourthLabel);
		
		JLabel fifthLabel = new JLabel("Fifth");
		add(fifthLabel);
	}
	
	public static void main (String[] args)
	{
		GridLayoutFrame myFrame = new GridLayoutFrame();
		myFrame.setVisible(true);
	}
}
