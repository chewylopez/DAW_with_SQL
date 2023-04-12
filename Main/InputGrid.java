package Main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class InputGrid extends JPanel {
	
	private note[][] Grid = new note[48][25];
	
	private sequencer s;
	
	//class that handles the midi input grid GUI component
	
	public InputGrid(sequencer seq) {
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new GridLayout(25, 48));
		s = seq;
		
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 0, s);
			Grid[j][0] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 1, s);
			Grid[j][1] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 2, s);
			Grid[j][2] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 3, s);
			Grid[j][3] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 4, s);
			Grid[j][4] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 5, s);
			Grid[j][5] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 6, s);
			Grid[j][6] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 7, s);
			Grid[j][7] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 8, s);
			Grid[j][8] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 9, s);
			Grid[j][9] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 10, s);
			Grid[j][10] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 11, s);
			Grid[j][11] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 12, s);
			Grid[j][12] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 13, s);
			Grid[j][13] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 14, s);
			Grid[j][14] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 15, s);
			Grid[j][15] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 16, s);
			Grid[j][16] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 17, s);
			Grid[j][17] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 18, s);
			Grid[j][18] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 19, s);
			Grid[j][19] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 20, s);
			Grid[j][20] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 21, s);
			Grid[j][21] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 22, s);
			Grid[j][22] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.black, j, 23, s);
			Grid[j][23] = n;
			this.add(n);
			n.setVisible(true);
		}
		for (int j = 0; j < 48; j++) {
			note n = new note(Color.white, j, 24, s);
			Grid[j][24] = n;
			this.add(n);
			n.setVisible(true);
		}
	}
	
	public void clearAll() {
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 48; j++) {
				Grid[j][i].clear();
			}
		}
	}
	
	public void updateGrid(int[][] s) {
		
		clearAll();
		
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 48; j++) {
				if(s[j][i] == 1) {
					Grid[j][i].setActive(Window.piano);
				}
				else if(s[j][i] == 2) {
					Grid[j][i].setActive(Window.guitar);
				}
				else if(s[j][i] == 3) {
					Grid[j][i].setActive(Window.synth);
				}
			}
		}
	}
}
