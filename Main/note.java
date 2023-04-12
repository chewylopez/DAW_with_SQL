package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class note extends JButton {
	
	private int xPos;
	private int yPos;
	
	private sequencer s;
	
	private Color defaultColor = Color.white;
	
	private JButton thisButton = this;
	
	private Sound sound = new Sound();
	
	public note (Color c, int x, int y, sequencer seq) {
		xPos = x;
		yPos = y; 
		
		s = seq; 
		
		defaultColor = c;
		
		this.setBackground(DefaultColor());
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(thisButton.getBackground().equals(DefaultColor())) {
					thisButton.setBackground(Window.getCurrentSelection().getColor());
					s.setvalue(xPos, yPos, Window.getCurrentSelection().getValue());
					sound.playSound(Window.getCurrentSelection().getValue(), yPos);
				}
				else {
					thisButton.setBackground(DefaultColor());
					s.setvalue(xPos, yPos, 0);
					sound.playSound(0, yPos);
				}
				
				System.out.println(getXPos() + ", " + getYPos() + ",name:" + Window.getCurrentSelection().getName());
				
			}
		});
	}
	
	public Color DefaultColor() {
		return defaultColor; 
	}
	
	public int getXPos() {
		return xPos;
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public void clear() {
		thisButton.setBackground(defaultColor);
	}
	public void setActive(Instrument i) {
		thisButton.setBackground(i.getColor());
	}
}
