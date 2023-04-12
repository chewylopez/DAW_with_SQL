package Main;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DataViewWindow extends JFrame{
	
	private JPanel mainPanel = new JPanel(new GridLayout(10,1));
	
	private JLabel l1 = new JLabel("");
	private JLabel l2 = new JLabel("");
	private JLabel l3 = new JLabel("");
	private JLabel l4 = new JLabel("");
	private JLabel l5 = new JLabel("");
	private JLabel l6 = new JLabel("");
	private JLabel l7 = new JLabel("");
	private JLabel l8 = new JLabel("");
	private JLabel l9 = new JLabel("");
	private JLabel l10 = new JLabel("");
	
	private JLabel[] labels = {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	
	public DataViewWindow() {
		super("view main table");
		
		this.add(mainPanel);
		mainPanel.add(l1);
		mainPanel.add(l2);
		mainPanel.add(l3);
		mainPanel.add(l4);
		mainPanel.add(l5);
		mainPanel.add(l6);
		mainPanel.add(l7);
		mainPanel.add(l8);
		mainPanel.add(l9);
		mainPanel.add(l10);
		
		for(int i = 0; i < 10; i++) {
			labels[i].setFont(new Font("Sans Serif", Font.PLAIN, 18));
		}
		
	}
	
	public void updateLabel(int index, String text) {
		labels[index - 1].setText(text);
	}

}
