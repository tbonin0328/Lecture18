
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event2Frame extends JFrame
{
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;
	private JLabel successLabel;
	
	public Event2Frame()
	{
		super("Clicking");
		setSize(APP_WIDTH, APP_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 1));
		
		JButton button = new JButton("Welcome");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				successLabel.setVisible(true);
				successLabel.setText("La, la, la!");
			}
			
		});
		add(button);
		
		successLabel = new JLabel("Hi!");
		successLabel.setVisible(false);
		add(successLabel);
	}
	
	public static void main (String[] args)
	{
		Event2Frame myFrame = new Event2Frame();
		myFrame.setVisible(true);
	}
}
