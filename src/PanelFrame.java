import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelFrame extends JFrame 
{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;
	
	public PanelFrame()
	{
		super("Paneling");
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(1, 3));
		topPanel.setBackground(Color.PINK);
		
		JLabel firstLabel = new JLabel("First");
		topPanel.add(firstLabel);
		
		JLabel secondLabel = new JLabel("Second");
		topPanel.add(secondLabel);
		
		JLabel thirdLabel = new JLabel("Third");
		topPanel.add(thirdLabel);
		
		add(topPanel);
		
		JLabel forthLabel = new JLabel("Forth");
		add(forthLabel);
	}
	
	public static void main (String[] args)
	{
		PanelFrame myFrame = new PanelFrame();
		myFrame.setVisible(true);
	}
	
}
