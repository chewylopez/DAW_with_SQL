package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.Timer;

public class sequencer {
	
	private static int[][] notes = new int[48][25];
	
	private double BPM = 120;
	private double delay = 1000/(BPM/60);
	
	private int beat = 0;
	
	private Sound s = new Sound();
	
	ActionListener task = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			for(int i = 0; i < 25; i++) {
				
				if(notes[beat][i] == 0) {
					s.playSound(0, i);
				}
				if(notes[beat][i] == 1) {
					s.playSound(1, i);
				}
				else if(notes[beat][i] == 2) {
					s.playSound(2, i);
				}
				else if(notes[beat][i] == 3) {
					s.playSound(3, i);
				}
				
			}
			
			System.out.println(beat);
			if(beat < 47) {
			beat++;
			}
			else {
			stopSequencer();
			}
		}
	};
	
	Timer timer;
	
	public sequencer() {
		for (int i = 0; i < 48; i++) {
			for (int j = 0; j < 25; j++) {  
				notes[i][j] = 0;
			}
		}
	}

	public void setvalue(int x, int y, int value) {
		notes[x][y] = value;
	}
	public void clearAll() {
		for (int i = 0; i < 48; i++) {
			for (int j = 0; j < 25; j++) {  
				notes[i][j] = 0;
			}
		}
	}

	public void runSequencer(int input) {
		BPM = input;
		delay = 1000/(BPM/60.0);
		if (timer != null) {
			if (timer.isRunning()) {
				timer.stop();
			}
		}
		timer = new Timer((int)delay, task);
		beat = 0;
		
		timer.start();

	}
	
	public void stopSequencer() {
		timer.stop();
		beat = 0;
	}
	
	public void setNotes(int[][] n) {
		notes = n;
	}
	public int[][] getNotes() {
		return notes;
	}
	
	//method to classify pieces by key
	
}
