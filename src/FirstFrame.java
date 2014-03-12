import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame extends JFrame
{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;

	public FirstFrame(Color backColor, String title)
	{
		super(title);
		
		setSize(APP_WIDTH, APP_HEIGHT);
		
		//default operation is to set to hide on close, so set it to exit on close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//get the content pane and color it
		getContentPane().setBackground(backColor);
		
		JLabel hiLabel = new JLabel("Hi there");
		add(hiLabel);
		
		JLabel byeLabel = new JLabel("Bye");
		add(byeLabel);
		
		JLabel sesameLabel = new JLabel("Can you tell me how to get, how to get to Sesame Street?");
		add(sesameLabel);
	}
	
	public static void main(String[] args)
	{
		/*
		 * Make it so that when you create your frame you pass a color to the constructor 
		 * and it will set the background color and make title a parameter.
		 */
		FirstFrame myFrame = new FirstFrame(Color.RED, "Hello, Dolly!");
		myFrame.setVisible(true);
	}
}
