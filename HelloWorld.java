//Import packages
import javax.swing.*;
import java.awt.*;

//Main class
public class HelloWorld{
	//Declare variables
	static JFrame frame1;
	static Container pane;
	static JButton btnConnect, btnDisconnect;
	static JLabel lblServer, lblUsername, lblPassword, lblPort;
	static JTextField txtServer, txtUsername, txtPassword, txtPort;
	static Insets insets;

	public static void main (String args[]){
		System.out.println("Helloi world");
		//Create the frame
		frame1 = new JFrame ("Assignment 6 Application");
		//Set its size to 800x200 pixels
		frame1.setSize (800,200);
		//Prepare panel
		pane = frame1.getContentPane();
		insets = pane.getInsets();
		//Apply the null layout
		pane.setLayout (null);
		btnConnect = new JButton ("Connect");
		btnDisconnect = new JButton ("Disconnect");
		lblServer = new JLabel ("Remote host:");
		lblUsername = new JLabel ("Username:");
		lblPassword = new JLabel ("Password:");
		lblPort = new JLabel ("Port #:");
		txtServer = new JTextField (10);
		txtUsername = new JTextField  (10);
		txtPassword = new JTextField  (10);
		txtPort = new JTextField  (5);
		frame1.setVisible(true);
		
		//pane.add (lblServer); //Add component to panel
		lblServer.setBounds (insets.left + 5, insets.top + 5, lblServer.getPreferredSize().width, lblServer.getPreferredSize().height);
		
		//Add all components to panel
		pane.add (lblServer);
		pane.add (lblUsername);
		pane.add (lblPassword);
		pane.add (lblPort);
		pane.add (txtServer);
		pane.add (txtUsername);
		pane.add (txtPassword);
		pane.add (txtPort);
		pane.add (btnConnect);
		pane.add (btnDisconnect);

		//Place all components
	/*	lblServer.setBounds (insets.left + 5, insets.top + 5, lblServer.getPreferredSize().width, lblServer.getPreferredSize().height);
		txtServer.setBounds (lblServer.getX() + lblServer.getWidth() + 5, insets.top + 5, txtServer.getPreferredSize().width, txtServer.getPreferredSize().height);

		lblUsername.setBounds (txtServer.getX() + txtServer.getWidth() + 5, insets.top + 5, lblUsername.getPreferredSize().width, lblUsername.getPreferredSize().height);
		txtUsername.setBounds (lblUsername.getX() + lblUsername.getWidth() + 5, insets.top + 5, txtUsername.getPreferredSize().width, txtUsername.getPreferredSize().height);

		lblPassword.setBounds (txtUsername.getX() + txtUsername.getWidth() + 5, insets.top + 5, lblPassword.getPreferredSize().width, lblPassword.getPreferredSize().height);
		txtPassword.setBounds (lblPassword.getX() + lblPassword.getWidth() + 5, insets.top + 5, txtPassword.getPreferredSize().width, txtPassword.getPreferredSize().height);

		lblPort.setBounds (txtPassword.getX() + txtPassword.getWidth() + 5, insets.top + 5, lblPort.getPreferredSize().width, lblPort.getPreferredSize().height);
		txtPort.setBounds (lblPort.getX() + lblPort.getWidth() + 5, insets.top + 5, txtPort.getPreferredSize().width, txtPort.getPreferredSize().height);

		btnConnect.setBounds (txtPort.getX() + txtPort.getWidth() + 5, insets.top + 5, btnConnect.getPreferredSize().width, btnConnect.getPreferredSize().height);

		//Place disconnect button (start a new line!)
		btnDisconnect.setBounds (insets.left + 15, lblServer.getY() + lblServer.getHeight() + 5, btnDisconnect.getPreferredSize().width, btnDisconnect.getPreferredSize().height);
	*/
	}
}
