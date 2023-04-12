package Main;

import javax.swing.JFrame;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("loading");		
		
		JFrame frame = new Window();
		
		frame.setSize(1600, 800);
		frame.setLocation(100, 50);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Sound s = new Sound();
	}

}
