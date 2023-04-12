package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
	
	//piano file
	private File C2Piano;
	
	AudioInputStream stream1a;
    AudioFormat format1a;
    DataLine.Info info1a;
    Clip clip1a;
    
	private File CS2Piano;
	
	AudioInputStream stream2a;
    AudioFormat format2a;
    DataLine.Info info2a;
    Clip clip2a;
    
	private File D2Piano;
	
	AudioInputStream stream3a;
    AudioFormat format3a;
    DataLine.Info info3a;
    Clip clip3a;
	
	private File DS2Piano;
	
	AudioInputStream stream4a;
    AudioFormat format4a;
    DataLine.Info info4a;
    Clip clip4a;
    
	private File E2Piano;
	
	AudioInputStream stream5a;
    AudioFormat format5a;
    DataLine.Info info5a;
    Clip clip5a;
    
	private File F2Piano;
	
	AudioInputStream stream6a;
    AudioFormat format6a;
    DataLine.Info info6a;
    Clip clip6a;
    
	private File FS2Piano;
	
	AudioInputStream stream7a;
    AudioFormat format7a;
    DataLine.Info info7a;
    Clip clip7a;
    
	private File G2Piano;
	
	AudioInputStream stream8a;
    AudioFormat format8a;
    DataLine.Info info8a;
    Clip clip8a;
    
	private File GS2Piano;
	
	AudioInputStream stream9a;
    AudioFormat format9a;
    DataLine.Info info9a;
    Clip clip9a;
    
	private File A2Piano;
	
	AudioInputStream stream10a;
    AudioFormat format10a;
    DataLine.Info info10a;
    Clip clip10a;
    
	private File AS2Piano;
	
	AudioInputStream stream11a;
    AudioFormat format11a;
    DataLine.Info info11a;
    Clip clip11a;
    
	private File B2Piano;
	
	AudioInputStream stream12a;
    AudioFormat format12a;
    DataLine.Info info12a;
    Clip clip12a;
    
	private File C3Piano;
	
	AudioInputStream stream13a;
    AudioFormat format13a;
    DataLine.Info info13a;
    Clip clip13a;
    
	private File CS3Piano;
	
	AudioInputStream stream14a;
    AudioFormat format14a;
    DataLine.Info info14a;
    Clip clip14a;
    
	private File D3Piano;
	
	AudioInputStream stream15a;
    AudioFormat format15a;
    DataLine.Info info15a;
    Clip clip15a;
    
	private File DS3Piano;
	
	AudioInputStream stream16a;
    AudioFormat format16a;
    DataLine.Info info16a;
    Clip clip16a;
    
	private File E3Piano;
	
	AudioInputStream stream17a;
    AudioFormat format17a;
    DataLine.Info info17a;
    Clip clip17a;
    
	private File F3Piano;
	
	AudioInputStream stream18a;
    AudioFormat format18a;
    DataLine.Info info18a;
    Clip clip18a;
    
	private File FS3Piano;
	
	AudioInputStream stream19a;
    AudioFormat format19a;
    DataLine.Info info19a;
    Clip clip19a;
    
	private File G3Piano;
	
	AudioInputStream stream20a;
    AudioFormat format20a;
    DataLine.Info info20a;
    Clip clip20a;
    
	private File GS3Piano;
	
	AudioInputStream stream21a;
    AudioFormat format21a;
    DataLine.Info info21a;
    Clip clip21a;
	
	private File A3Piano;
	
	AudioInputStream stream22a;
    AudioFormat format22a;
    DataLine.Info info22a;
    Clip clip22a;
    
	private File AS3Piano;
	
	AudioInputStream stream23a;
    AudioFormat format23a;
    DataLine.Info info23a;
    Clip clip23a;
    
	private File B3Piano;
	
	AudioInputStream stream24a;
    AudioFormat format24a;
    DataLine.Info info24a;
    Clip clip24a;
    
	private File C4Piano;
	
	AudioInputStream stream25a;
    AudioFormat format25a;
    DataLine.Info info25a;
    Clip clip25a;
    
    
	//guitar files
    
    
    private File C2Guitar;
	
	AudioInputStream stream1b;
    AudioFormat format1b;
    DataLine.Info info1b;
    Clip clip1b;
    
	private File CS2Guitar;
	
	AudioInputStream stream2b;
    AudioFormat format2b;
    DataLine.Info info2b;
    Clip clip2b;
    
	private File D2Guitar;
	
	AudioInputStream stream3b;
    AudioFormat format3b;
    DataLine.Info info3b;
    Clip clip3b;
	
	private File DS2Guitar;
	
	AudioInputStream stream4b;
    AudioFormat format4b;
    DataLine.Info info4b;
    Clip clip4b;
    
	private File E2Guitar;
	
	AudioInputStream stream5b;
    AudioFormat format5b;
    DataLine.Info info5b;
    Clip clip5b;
    
	private File F2Guitar;
	
	AudioInputStream stream6b;
    AudioFormat format6b;
    DataLine.Info info6b;
    Clip clip6b;
    
	private File FS2Guitar;
	
	AudioInputStream stream7b;
    AudioFormat format7b;
    DataLine.Info info7b;
    Clip clip7b;
    
	private File G2Guitar;
	
	AudioInputStream stream8b;
    AudioFormat format8b;
    DataLine.Info info8b;
    Clip clip8b;
    
	private File GS2Guitar;
	
	AudioInputStream stream9b;
    AudioFormat format9b;
    DataLine.Info info9b;
    Clip clip9b;
    
	private File A2Guitar;
	
	AudioInputStream stream10b;
    AudioFormat format10b;
    DataLine.Info info10b;
    Clip clip10b;
    
	private File AS2Guitar;
	
	AudioInputStream stream11b;
    AudioFormat format11b;
    DataLine.Info info11b;
    Clip clip11b;
    
	private File B2Guitar;
	
	AudioInputStream stream12b;
    AudioFormat format12b;
    DataLine.Info info12b;
    Clip clip12b;
    
	private File C3Guitar;
	
	AudioInputStream stream13b;
    AudioFormat format13b;
    DataLine.Info info13b;
    Clip clip13b;
    
	private File CS3Guitar;
	
	AudioInputStream stream14b;
    AudioFormat format14b;
    DataLine.Info info14b;
    Clip clip14b;
    
	private File D3Guitar;
	
	AudioInputStream stream15b;
    AudioFormat format15b;
    DataLine.Info info15b;
    Clip clip15b;
    
	private File DS3Guitar;
	
	AudioInputStream stream16b;
    AudioFormat format16b;
    DataLine.Info info16b;
    Clip clip16b;
    
	private File E3Guitar;
	
	AudioInputStream stream17b;
    AudioFormat format17b;
    DataLine.Info info17b;
    Clip clip17b;
    
	private File F3Guitar;
	
	AudioInputStream stream18b;
    AudioFormat format18b;
    DataLine.Info info18b;
    Clip clip18b;
    
	private File FS3Guitar;
	
	AudioInputStream stream19b;
    AudioFormat format19b;
    DataLine.Info info19b;
    Clip clip19b;
    
	private File G3Guitar;
	
	AudioInputStream stream20b;
    AudioFormat format20b;
    DataLine.Info info20b;
    Clip clip20b;
    
	private File GS3Guitar;
	
	AudioInputStream stream21b;
    AudioFormat format21b;
    DataLine.Info info21b;
    Clip clip21b;
	
	private File A3Guitar;
	
	AudioInputStream stream22b;
    AudioFormat format22b;
    DataLine.Info info22b;
    Clip clip22b;
    
	private File AS3Guitar;
	
	AudioInputStream stream23b;
    AudioFormat format23b;
    DataLine.Info info23b;
    Clip clip23b;
    
	private File B3Guitar;
	
	AudioInputStream stream24b;
    AudioFormat format24b;
    DataLine.Info info24b;
    Clip clip24b;
    
	private File C4Guitar;
	
	AudioInputStream stream25b;
    AudioFormat format25b;
    DataLine.Info info25b;
    Clip clip25b;
    
    
    //Synth Files
    
    
    private File C2Synth;
	
	AudioInputStream stream1c;
    AudioFormat format1c;
    DataLine.Info info1c;
    Clip clip1c;
    
	private File CS2Synth;
	
	AudioInputStream stream2c;
    AudioFormat format2c;
    DataLine.Info info2c;
    Clip clip2c;
    
	private File D2Synth;
	
	AudioInputStream stream3c;
    AudioFormat format3c;
    DataLine.Info info3c;
    Clip clip3c;
	
	private File DS2Synth;
	
	AudioInputStream stream4c;
    AudioFormat format4c;
    DataLine.Info info4c;
    Clip clip4c;
    
	private File E2Synth;
	
	AudioInputStream stream5c;
    AudioFormat format5c;
    DataLine.Info info5c;
    Clip clip5c;
    
	private File F2Synth;
	
	AudioInputStream stream6c;
    AudioFormat format6c;
    DataLine.Info info6c;
    Clip clip6c;
    
	private File FS2Synth;
	
	AudioInputStream stream7c;
    AudioFormat format7c;
    DataLine.Info info7c;
    Clip clip7c;
    
	private File G2Synth;
	
	AudioInputStream stream8c;
    AudioFormat format8c;
    DataLine.Info info8c;
    Clip clip8c;
    
	private File GS2Synth;
	
	AudioInputStream stream9c;
    AudioFormat format9c;
    DataLine.Info info9c;
    Clip clip9c;
    
	private File A2Synth;
	
	AudioInputStream stream10c;
    AudioFormat format10c;
    DataLine.Info info10c;
    Clip clip10c;
    
	private File AS2Synth;
	
	AudioInputStream stream11c;
    AudioFormat format11c;
    DataLine.Info info11c;
    Clip clip11c;
    
	private File B2Synth;
	
	AudioInputStream stream12c;
    AudioFormat format12c;
    DataLine.Info info12c;
    Clip clip12c;
    
	private File C3Synth;
	
	AudioInputStream stream13c;
    AudioFormat format13c;
    DataLine.Info info13c;
    Clip clip13c;
    
	private File CS3Synth;
	
	AudioInputStream stream14c;
    AudioFormat format14c;
    DataLine.Info info14c;
    Clip clip14c;
    
	private File D3Synth;
	
	AudioInputStream stream15c;
    AudioFormat format15c;
    DataLine.Info info15c;
    Clip clip15c;
    
	private File DS3Synth;
	
	AudioInputStream stream16c;
    AudioFormat format16c;
    DataLine.Info info16c;
    Clip clip16c;
    
	private File E3Synth;
	
	AudioInputStream stream17c;
    AudioFormat format17c;
    DataLine.Info info17c;
    Clip clip17c;
    
	private File F3Synth;
	
	AudioInputStream stream18c;
    AudioFormat format18c;
    DataLine.Info info18c;
    Clip clip18c;
    
	private File FS3Synth;
	
	AudioInputStream stream19c;
    AudioFormat format19c;
    DataLine.Info info19c;
    Clip clip19c;
    
	private File G3Synth;
	
	AudioInputStream stream20c;
    AudioFormat format20c;
    DataLine.Info info20c;
    Clip clip20c;
    
	private File GS3Synth;
	
	AudioInputStream stream21c;
    AudioFormat format21c;
    DataLine.Info info21c;
    Clip clip21c;
	
	private File A3Synth;
	
	AudioInputStream stream22c;
    AudioFormat format22c;
    DataLine.Info info22c;
    Clip clip22c;
    
	private File AS3Synth;
	
	AudioInputStream stream23c;
    AudioFormat format23c;
    DataLine.Info info23c;
    Clip clip23c;
    
	private File B3Synth;
	
	AudioInputStream stream24c;
    AudioFormat format24c;
    DataLine.Info info24c;
    Clip clip24c;
    
	private File C4Synth;
	
	AudioInputStream stream25c;
    AudioFormat format25c;
    DataLine.Info info25c;
    Clip clip25c;
	
	
	public Sound() {
		try {
			//piano files
			C2Piano = new File("src\\Main\\Piano\\C2Piano.wav");			
			
			stream1a = AudioSystem.getAudioInputStream(C2Piano);
			format1a = stream1a.getFormat();
			info1a = new DataLine.Info(Clip.class, format1a);
			clip1a = (Clip) AudioSystem.getLine(info1a);
			
			CS2Piano = new File("src\\Main\\Piano\\C#2Piano.wav");
			
			stream2a = AudioSystem.getAudioInputStream(CS2Piano);
			format2a = stream2a.getFormat();
			info2a = new DataLine.Info(Clip.class, format2a);
			clip2a = (Clip) AudioSystem.getLine(info2a);
			
			D2Piano = new File("src\\Main\\Piano\\D2Piano.wav");
			
			stream3a = AudioSystem.getAudioInputStream(D2Piano);
			format3a = stream3a.getFormat();
			info3a = new DataLine.Info(Clip.class, format3a);
			clip3a = (Clip) AudioSystem.getLine(info3a);
			
			DS2Piano = new File("src\\Main\\Piano\\D#2Piano.wav");
			
			stream4a = AudioSystem.getAudioInputStream(DS2Piano);
			format4a = stream4a.getFormat();
			info4a = new DataLine.Info(Clip.class, format4a);
			clip4a = (Clip) AudioSystem.getLine(info4a);
			
			E2Piano = new File("src\\Main\\Piano\\E2Piano.wav");
			
			stream5a = AudioSystem.getAudioInputStream(E2Piano);
			format5a = stream5a.getFormat();
			info5a = new DataLine.Info(Clip.class, format5a);
			clip5a = (Clip) AudioSystem.getLine(info5a);
			
			F2Piano = new File("src\\Main\\Piano\\F2Piano.wav");
			
			stream6a = AudioSystem.getAudioInputStream(F2Piano);
			format6a = stream6a.getFormat();
			info6a = new DataLine.Info(Clip.class, format6a);
			clip6a = (Clip) AudioSystem.getLine(info6a);
			
			FS2Piano = new File("src\\Main\\Piano\\F#2Piano.wav");
			
			stream7a = AudioSystem.getAudioInputStream(FS2Piano);
			format7a = stream7a.getFormat();
			info7a = new DataLine.Info(Clip.class, format7a);
			clip7a = (Clip) AudioSystem.getLine(info7a);
			
			G2Piano = new File("src\\Main\\Piano\\G2Piano.wav");
			
			stream8a = AudioSystem.getAudioInputStream(G2Piano);
			format8a = stream8a.getFormat();
			info8a = new DataLine.Info(Clip.class, format8a);
			clip8a = (Clip) AudioSystem.getLine(info8a);
			
			GS2Piano = new File("src\\Main\\Piano\\G#2Piano.wav");
			
			stream9a = AudioSystem.getAudioInputStream(GS2Piano);
			format9a = stream9a.getFormat();
			info9a = new DataLine.Info(Clip.class, format9a);
			clip9a = (Clip) AudioSystem.getLine(info9a);
			
			A2Piano = new File("src\\Main\\Piano\\A2Piano.wav"); 
			
			stream10a = AudioSystem.getAudioInputStream(A2Piano);
			format10a = stream10a.getFormat();
			info10a = new DataLine.Info(Clip.class, format10a);
			clip10a = (Clip) AudioSystem.getLine(info10a);
			
			AS2Piano = new File("src\\Main\\Piano\\A#2Piano.wav");

			stream11a = AudioSystem.getAudioInputStream(AS2Piano);
			format11a = stream11a.getFormat();
			info11a = new DataLine.Info(Clip.class, format11a);
			clip11a = (Clip) AudioSystem.getLine(info11a);
			
			B2Piano = new File("src\\Main\\Piano\\B2Piano.wav");
			
			stream12a = AudioSystem.getAudioInputStream(B2Piano);
			format12a = stream12a.getFormat();
			info12a = new DataLine.Info(Clip.class, format12a);
			clip12a = (Clip) AudioSystem.getLine(info12a);
			
			C3Piano = new File("src\\Main\\Piano\\C3Piano.wav");
			
			stream13a = AudioSystem.getAudioInputStream(C3Piano);
			format13a = stream13a.getFormat();
			info13a = new DataLine.Info(Clip.class, format13a);
			clip13a = (Clip) AudioSystem.getLine(info13a);
			
			CS3Piano = new File("src\\Main\\Piano\\C#3Piano.wav");
			
			stream14a = AudioSystem.getAudioInputStream(CS3Piano);
			format14a = stream14a.getFormat();
			info14a = new DataLine.Info(Clip.class, format14a);
			clip14a = (Clip) AudioSystem.getLine(info14a);
			
			D3Piano = new File("src\\Main\\Piano\\D3Piano.wav");
			
			stream15a = AudioSystem.getAudioInputStream(D3Piano);
			format15a = stream15a.getFormat();
			info15a = new DataLine.Info(Clip.class, format15a);
			clip15a = (Clip) AudioSystem.getLine(info15a);
			
			DS3Piano = new File("src\\Main\\Piano\\D#3Piano.wav");
			
			stream16a = AudioSystem.getAudioInputStream(DS3Piano);
			format16a = stream16a.getFormat();
			info16a = new DataLine.Info(Clip.class, format16a);
			clip16a = (Clip) AudioSystem.getLine(info16a);
			
			E3Piano = new File("src\\Main\\Piano\\E3Piano.wav");
			
			stream17a = AudioSystem.getAudioInputStream(E3Piano);
			format17a = stream17a.getFormat();
			info17a = new DataLine.Info(Clip.class, format17a);
			clip17a = (Clip) AudioSystem.getLine(info17a);
			
			F3Piano = new File("src\\Main\\Piano\\F3Piano.wav");
			
			stream18a = AudioSystem.getAudioInputStream(F3Piano);
			format18a = stream18a.getFormat();
			info18a = new DataLine.Info(Clip.class, format18a);
			clip18a = (Clip) AudioSystem.getLine(info18a);
			
			FS3Piano = new File("src\\Main\\Piano\\F#3Piano.wav");
			
			stream19a = AudioSystem.getAudioInputStream(FS3Piano);
			format19a = stream19a.getFormat();
			info19a = new DataLine.Info(Clip.class, format19a);
			clip19a = (Clip) AudioSystem.getLine(info19a);
			
			G3Piano = new File("src\\Main\\Piano\\G3Piano.wav");
			
			stream20a = AudioSystem.getAudioInputStream(G3Piano);
			format20a = stream20a.getFormat();
			info20a = new DataLine.Info(Clip.class, format20a);
			clip20a = (Clip) AudioSystem.getLine(info20a);
			
			GS3Piano = new File("src\\Main\\Piano\\G#3Piano.wav");
			
			stream21a = AudioSystem.getAudioInputStream(GS3Piano);
			format21a = stream21a.getFormat();
			info21a = new DataLine.Info(Clip.class, format21a);
			clip21a = (Clip) AudioSystem.getLine(info21a);
			
			A3Piano = new File("src\\Main\\Piano\\A3Piano.wav");
			
			stream22a = AudioSystem.getAudioInputStream(A3Piano);
			format22a = stream22a.getFormat();
			info22a = new DataLine.Info(Clip.class, format22a);
			clip22a = (Clip) AudioSystem.getLine(info2a);
			
			AS3Piano = new File("src\\Main\\Piano\\A#3Piano.wav");
			
			stream23a = AudioSystem.getAudioInputStream(AS3Piano);
			format23a = stream23a.getFormat();
			info23a = new DataLine.Info(Clip.class, format23a);
			clip23a = (Clip) AudioSystem.getLine(info23a);
			
			B3Piano = new File("src\\Main\\Piano\\B3Piano.wav");
			
			stream24a = AudioSystem.getAudioInputStream(B3Piano);
			format24a = stream24a.getFormat();
			info24a = new DataLine.Info(Clip.class, format24a);
			clip24a = (Clip) AudioSystem.getLine(info24a);
			
			C4Piano = new File("src\\Main\\Piano\\C4Piano.wav");
			
			stream25a = AudioSystem.getAudioInputStream(C4Piano);
			format25a = stream25a.getFormat();
			info25a = new DataLine.Info(Clip.class, format25a);
			clip25a = (Clip) AudioSystem.getLine(info25a);
			
			
			//Guitar Files
			
			
			C2Guitar = new File("src\\Main\\Electric_Guitar\\C2Guitar.wav");			
			
			stream1b = AudioSystem.getAudioInputStream(C2Guitar);
			format1b = stream1b.getFormat();
			info1b = new DataLine.Info(Clip.class, format1b);
			clip1b = (Clip) AudioSystem.getLine(info1b);
			
			CS2Guitar = new File("src\\Main\\Electric_Guitar\\C#2Guitar.wav");
			
			stream2b = AudioSystem.getAudioInputStream(CS2Guitar);
			format2b = stream2b.getFormat();
			info2b = new DataLine.Info(Clip.class, format2b);
			clip2b = (Clip) AudioSystem.getLine(info2b);
			
			D2Guitar = new File("src\\Main\\Electric_Guitar\\D2Guitar.wav");
			
			stream3b = AudioSystem.getAudioInputStream(D2Guitar);
			format3b = stream3b.getFormat();
			info3b = new DataLine.Info(Clip.class, format3b);
			clip3b = (Clip) AudioSystem.getLine(info3b);
			
			DS2Guitar = new File("src\\Main\\Electric_Guitar\\D#2Guitar.wav");
			
			stream4b = AudioSystem.getAudioInputStream(DS2Guitar);
			format4b = stream4b.getFormat();
			info4b = new DataLine.Info(Clip.class, format4b);
			clip4b = (Clip) AudioSystem.getLine(info4b);
			
			E2Guitar = new File("src\\Main\\Electric_Guitar\\E2Guitar.wav");
			
			stream5b = AudioSystem.getAudioInputStream(E2Guitar);
			format5b = stream5b.getFormat();
			info5b = new DataLine.Info(Clip.class, format5b);
			clip5b = (Clip) AudioSystem.getLine(info5b);
			
			F2Guitar = new File("src\\Main\\Electric_Guitar\\F2Guitar.wav");
			
			stream6b = AudioSystem.getAudioInputStream(F2Guitar);
			format6b = stream6b.getFormat();
			info6b = new DataLine.Info(Clip.class, format6b);
			clip6b = (Clip) AudioSystem.getLine(info6b);
			
			FS2Guitar = new File("src\\Main\\Electric_Guitar\\F#2Guitar.wav");
			
			stream7b = AudioSystem.getAudioInputStream(FS2Guitar);
			format7b = stream1b.getFormat();
			info7b = new DataLine.Info(Clip.class, format7b);
			clip7b = (Clip) AudioSystem.getLine(info7b);
			
			G2Guitar = new File("src\\Main\\Electric_Guitar\\G2Guitar.wav");
			
			stream8b = AudioSystem.getAudioInputStream(G2Guitar);
			format8b = stream8b.getFormat();
			info8b = new DataLine.Info(Clip.class, format8b);
			clip8b = (Clip) AudioSystem.getLine(info8b);
			
			GS2Guitar = new File("src\\Main\\Electric_Guitar\\G#2Guitar.wav");
			
			stream9b = AudioSystem.getAudioInputStream(GS2Guitar);
			format9b = stream9b.getFormat();
			info9b = new DataLine.Info(Clip.class, format9b);
			clip9b = (Clip) AudioSystem.getLine(info9b);
			
			A2Guitar = new File("src\\Main\\Electric_Guitar\\A2Guitar.wav");
			
			stream10b = AudioSystem.getAudioInputStream(A2Guitar);
			format10b = stream10b.getFormat();
			info10b = new DataLine.Info(Clip.class, format10b);
			clip10b = (Clip) AudioSystem.getLine(info10b);
			
			AS2Guitar = new File("src\\Main\\Electric_Guitar\\A#2Guitar.wav");
			
			stream11b = AudioSystem.getAudioInputStream(AS2Guitar);
			format11b = stream11b.getFormat();
			info11b = new DataLine.Info(Clip.class, format11b);
			clip11b = (Clip) AudioSystem.getLine(info11b);
			
			B2Guitar = new File("src\\Main\\Electric_Guitar\\B2Guitar.wav");
			
			stream12b = AudioSystem.getAudioInputStream(B2Guitar);
			format12b = stream12b.getFormat();
			info12b = new DataLine.Info(Clip.class, format12b);
			clip12b = (Clip) AudioSystem.getLine(info12b);
			
			C3Guitar = new File("src\\Main\\Electric_Guitar\\C3Guitar.wav");			
			
			stream13b = AudioSystem.getAudioInputStream(C3Guitar);
			format13b = stream13b.getFormat();
			info13b = new DataLine.Info(Clip.class, format13b);
			clip13b = (Clip) AudioSystem.getLine(info13b);
			
			CS3Guitar = new File("src\\Main\\Electric_Guitar\\C#3Guitar.wav");
			
			stream14b = AudioSystem.getAudioInputStream(CS3Guitar);
			format14b = stream14b.getFormat();
			info14b = new DataLine.Info(Clip.class, format14b);
			clip14b = (Clip) AudioSystem.getLine(info14b);
			
			D3Guitar = new File("src\\Main\\Electric_Guitar\\D3Guitar.wav");
			
			stream15b = AudioSystem.getAudioInputStream(D3Guitar);
			format15b = stream15b.getFormat();
			info15b = new DataLine.Info(Clip.class, format15b);
			clip15b = (Clip) AudioSystem.getLine(info15b);
			
			DS3Guitar = new File("src\\Main\\Electric_Guitar\\D#3Guitar.wav");
			
			stream16b = AudioSystem.getAudioInputStream(DS3Guitar);
			format16b = stream16b.getFormat();
			info16b = new DataLine.Info(Clip.class, format16b);
			clip16b = (Clip) AudioSystem.getLine(info16b);
			
			E3Guitar = new File("src\\Main\\Electric_Guitar\\E3Guitar.wav");
			
			stream17b = AudioSystem.getAudioInputStream(E3Guitar);
			format17b = stream17b.getFormat();
			info17b = new DataLine.Info(Clip.class, format17b);
			clip17b = (Clip) AudioSystem.getLine(info17b);
			
			F3Guitar = new File("src\\Main\\Electric_Guitar\\F3Guitar.wav");
			
			stream18b = AudioSystem.getAudioInputStream(F3Guitar);
			format18b = stream18b.getFormat();
			info18b = new DataLine.Info(Clip.class, format18b);
			clip18b = (Clip) AudioSystem.getLine(info18b);
			
			FS3Guitar = new File("src\\Main\\Electric_Guitar\\F#3Guitar.wav");
			
			stream19b = AudioSystem.getAudioInputStream(FS3Guitar);
			format19b = stream19b.getFormat();
			info19b = new DataLine.Info(Clip.class, format19b);
			clip19b = (Clip) AudioSystem.getLine(info19b);
			
			G3Guitar = new File("src\\Main\\Electric_Guitar\\G3Guitar.wav");
			
			stream20b = AudioSystem.getAudioInputStream(G3Guitar);
			format20b = stream20b.getFormat();
			info20b = new DataLine.Info(Clip.class, format20b);
			clip20b = (Clip) AudioSystem.getLine(info20b);
			
			GS3Guitar = new File("src\\Main\\Electric_Guitar\\G#3Guitar.wav");
			
			stream21b = AudioSystem.getAudioInputStream(GS3Guitar);
			format21b = stream21b.getFormat();
			info21b = new DataLine.Info(Clip.class, format21b);
			clip21b = (Clip) AudioSystem.getLine(info21b);
			
			A3Guitar = new File("src\\Main\\Electric_Guitar\\A3Guitar.wav");
			
			stream22b = AudioSystem.getAudioInputStream(A3Guitar);
			format22b = stream22b.getFormat();
			info22b = new DataLine.Info(Clip.class, format22b);
			clip22b = (Clip) AudioSystem.getLine(info22b);
			
			AS3Guitar = new File("src\\Main\\Electric_Guitar\\A#3Guitar.wav");
			
			stream23b = AudioSystem.getAudioInputStream(AS3Guitar);
			format23b = stream23b.getFormat();
			info23b = new DataLine.Info(Clip.class, format23b);
			clip23b = (Clip) AudioSystem.getLine(info23b);
			
			B3Guitar = new File("src\\Main\\Electric_Guitar\\B3Guitar.wav");
			
			stream24b = AudioSystem.getAudioInputStream(B3Guitar);
			format24b = stream24b.getFormat();
			info24b = new DataLine.Info(Clip.class, format24b);
			clip24b = (Clip) AudioSystem.getLine(info24b);
			
			C4Guitar = new File("src\\Main\\Electric_Guitar\\C4Guitar.wav");	
			
			stream25b = AudioSystem.getAudioInputStream(C4Guitar);
			format25b = stream25b.getFormat();
			info25b = new DataLine.Info(Clip.class, format25b);
			clip25b = (Clip) AudioSystem.getLine(info25b);
			
			
			//synth files
			
			
			C2Synth = new File("src\\Main\\Square_Synth\\C2Synth.wav");			
			
			stream1c = AudioSystem.getAudioInputStream(C2Synth);
			format1c = stream1c.getFormat();
			info1c = new DataLine.Info(Clip.class, format1c);
			clip1c = (Clip) AudioSystem.getLine(info1c);
			
			CS2Synth = new File("src\\Main\\Square_Synth\\C#2Synth.wav");			
			
			stream2c = AudioSystem.getAudioInputStream(CS2Synth);
			format2c = stream2c.getFormat();
			info2c = new DataLine.Info(Clip.class, format2c);
			clip2c = (Clip) AudioSystem.getLine(info2c);
			
			D2Synth = new File("src\\Main\\Square_Synth\\D2Synth.wav");			
			
			stream3c = AudioSystem.getAudioInputStream(D2Synth);
			format3c = stream3c.getFormat();
			info3c = new DataLine.Info(Clip.class, format3c);
			clip3c = (Clip) AudioSystem.getLine(info3c);
			
			DS2Synth = new File("src\\Main\\Square_Synth\\D#2Synth.wav");			
			
			stream4c = AudioSystem.getAudioInputStream(DS2Synth);
			format4c = stream4c.getFormat();
			info4c = new DataLine.Info(Clip.class, format4c);
			clip4c = (Clip) AudioSystem.getLine(info4c);
			
			E2Synth = new File("src\\Main\\Square_Synth\\E2Synth.wav");			
			
			stream5c = AudioSystem.getAudioInputStream(E2Synth);
			format5c = stream5c.getFormat();
			info5c = new DataLine.Info(Clip.class, format5c);
			clip5c = (Clip) AudioSystem.getLine(info5c);
			
			F2Synth = new File("src\\Main\\Square_Synth\\F2Synth.wav");			
			
			stream6c = AudioSystem.getAudioInputStream(F2Synth);
			format6c = stream6c.getFormat();
			info6c = new DataLine.Info(Clip.class, format6c);
			clip6c = (Clip) AudioSystem.getLine(info6c);
			
			FS2Synth = new File("src\\Main\\Square_Synth\\F#2Synth.wav");			
			
			stream7c = AudioSystem.getAudioInputStream(FS2Synth);
			format7c = stream7c.getFormat();
			info7c = new DataLine.Info(Clip.class, format7c);
			clip7c = (Clip) AudioSystem.getLine(info7c);
			
			G2Synth = new File("src\\Main\\Square_Synth\\G2Synth.wav");			
			
			stream8c = AudioSystem.getAudioInputStream(G2Synth);
			format8c = stream8c.getFormat();
			info8c = new DataLine.Info(Clip.class, format8c);
			clip8c = (Clip) AudioSystem.getLine(info8c);
			
			GS2Synth = new File("src\\Main\\Square_Synth\\G#2Synth.wav");			
			
			stream9c = AudioSystem.getAudioInputStream(GS2Synth);
			format9c = stream9c.getFormat();
			info9c = new DataLine.Info(Clip.class, format9c);
			clip9c = (Clip) AudioSystem.getLine(info9c);
			
			A2Synth = new File("src\\Main\\Square_Synth\\A2Synth.wav");			
			
			stream10c = AudioSystem.getAudioInputStream(A2Synth);
			format10c = stream10c.getFormat();
			info10c = new DataLine.Info(Clip.class, format10c);
			clip10c = (Clip) AudioSystem.getLine(info10c);
			
			AS2Synth = new File("src\\Main\\Square_Synth\\A#2Synth.wav");			
			
			stream11c = AudioSystem.getAudioInputStream(AS2Synth);
			format11c = stream11c.getFormat();
			info11c = new DataLine.Info(Clip.class, format11c);
			clip11c = (Clip) AudioSystem.getLine(info11c);
			
			B2Synth = new File("src\\Main\\Square_Synth\\B2Synth.wav");			
			
			stream12c = AudioSystem.getAudioInputStream(B2Synth);
			format12c = stream12c.getFormat();
			info12c = new DataLine.Info(Clip.class, format12c);
			clip12c = (Clip) AudioSystem.getLine(info12c);
			
			C3Synth = new File("src\\Main\\Square_Synth\\C3Synth.wav");			
			
			stream13c = AudioSystem.getAudioInputStream(C3Synth);
			format13c = stream13c.getFormat();
			info13c = new DataLine.Info(Clip.class, format13c);
			clip13c = (Clip) AudioSystem.getLine(info13c);
			
			CS3Synth = new File("src\\Main\\Square_Synth\\C#3Synth.wav");			
			
			stream14c = AudioSystem.getAudioInputStream(CS3Synth);
			format14c = stream14c.getFormat();
			info14c = new DataLine.Info(Clip.class, format14c);
			clip14c = (Clip) AudioSystem.getLine(info14c);
			
			D3Synth = new File("src\\Main\\Square_Synth\\D3Synth.wav");			
			
			stream15c = AudioSystem.getAudioInputStream(D3Synth);
			format15c = stream15c.getFormat();
			info15c = new DataLine.Info(Clip.class, format15c);
			clip15c = (Clip) AudioSystem.getLine(info15c);
			
			DS3Synth = new File("src\\Main\\Square_Synth\\D#3Synth.wav");			
			
			stream16c = AudioSystem.getAudioInputStream(DS3Synth);
			format16c = stream16c.getFormat();
			info16c = new DataLine.Info(Clip.class, format16c);
			clip16c = (Clip) AudioSystem.getLine(info16c);
			
			E3Synth = new File("src\\Main\\Square_Synth\\E3Synth.wav");			
			
			stream17c = AudioSystem.getAudioInputStream(E3Synth);
			format17c = stream17c.getFormat();
			info17c = new DataLine.Info(Clip.class, format17c);
			clip17c = (Clip) AudioSystem.getLine(info17c);
			
			F3Synth = new File("src\\Main\\Square_Synth\\F3Synth.wav");			
			
			stream18c = AudioSystem.getAudioInputStream(F3Synth);
			format18c = stream18c.getFormat();
			info18c = new DataLine.Info(Clip.class, format18c);
			clip18c = (Clip) AudioSystem.getLine(info18c);
			
			FS3Synth = new File("src\\Main\\Square_Synth\\F#3Synth.wav");			
			
			stream19c = AudioSystem.getAudioInputStream(FS3Synth);
			format19c = stream19c.getFormat();
			info19c = new DataLine.Info(Clip.class, format19c);
			clip19c = (Clip) AudioSystem.getLine(info19c);
			
			G3Synth = new File("src\\Main\\Square_Synth\\G3Synth.wav");			
			
			stream20c = AudioSystem.getAudioInputStream(G3Synth);
			format20c = stream20c.getFormat();
			info20c = new DataLine.Info(Clip.class, format20c);
			clip20c = (Clip) AudioSystem.getLine(info20c);
			
			GS3Synth = new File("src\\Main\\Square_Synth\\G#3Synth.wav");			
			
			stream21c = AudioSystem.getAudioInputStream(GS3Synth);
			format21c = stream21c.getFormat();
			info21c = new DataLine.Info(Clip.class, format21c);
			clip21c = (Clip) AudioSystem.getLine(info21c);
			
			A3Synth = new File("src\\Main\\Square_Synth\\A3Synth.wav");			
			
			stream22c = AudioSystem.getAudioInputStream(A3Synth);
			format22c = stream22c.getFormat();
			info22c = new DataLine.Info(Clip.class, format22c);
			clip22c = (Clip) AudioSystem.getLine(info22c);
			
			AS3Synth = new File("src\\Main\\Square_Synth\\A#3Synth.wav");			
			
			stream23c = AudioSystem.getAudioInputStream(AS3Synth);
			format23c = stream23c.getFormat();
			info23c = new DataLine.Info(Clip.class, format23c);
			clip23c = (Clip) AudioSystem.getLine(info23c);
			
			B3Synth = new File("src\\Main\\Square_Synth\\B3Synth.wav");			
			
			stream24c = AudioSystem.getAudioInputStream(B3Synth);
			format24c = stream24c.getFormat();
			info24c = new DataLine.Info(Clip.class, format24c);
			clip24c = (Clip) AudioSystem.getLine(info24c);
			
			C4Synth = new File("src\\Main\\Square_Synth\\C4Synth.wav");			
			
			stream25c = AudioSystem.getAudioInputStream(C4Synth);
			format25c = stream25c.getFormat();
			info25c = new DataLine.Info(Clip.class, format25c);
			clip25c = (Clip) AudioSystem.getLine(info25c);
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("init no work");
		}
		
		
	}
	
	public void playSound(int value, int pitch) {

		try {
			if (value == 0) {
				if (pitch == 0) {
					if(clip25a.isOpen()) {
						clip25a.stop();
					}
					if(clip25b.isOpen()) {
						clip25b.stop();
					}
					if(clip25c.isOpen()) {
						clip25c.stop();
					}
				} else if (pitch == 1) {
					if(clip24a.isOpen()) {
						clip24a.stop();
					}
					if(clip24b.isOpen()) {
						clip24b.stop();
					}
					if(clip24c.isOpen()) {
						clip24c.stop();
					}
				} else if (pitch == 2) {
					if(clip23a.isOpen()) {
						clip23a.stop();
					}
					if(clip23b.isOpen()) {
						clip23b.stop();
					}
					if(clip23c.isOpen()) {
						clip23c.stop();
					}
				} else if (pitch == 3) {
					if(clip22a.isOpen()) {
						clip22a.stop();
					}
					if(clip22b.isOpen()) {
						clip22b.stop();
					}
					if(clip22c.isOpen()) {
						clip22c.stop();
					}
				} else if (pitch == 4) {
					if(clip21a.isOpen()) {
						clip21a.stop();
					}
					if(clip21b.isOpen()) {
						clip21b.stop();
					}
					if(clip21c.isOpen()) {
						clip21c.stop();
					}
				} else if (pitch == 5) {
					if(clip20a.isOpen()) {
						clip20a.stop();
					}
					if(clip20b.isOpen()) {
						clip20b.stop();
					}
					if(clip20c.isOpen()) {
						clip20c.stop();
					}
				} else if (pitch == 6) {
					if(clip19a.isOpen()) {
						clip19a.stop();
					}
					if(clip19b.isOpen()) {
						clip19b.stop();
					}
					if(clip19c.isOpen()) {
						clip19c.stop();
					}
				} else if (pitch == 7) {
					if(clip18a.isOpen()) {
						clip18a.stop();
					}
					if(clip18b.isOpen()) {
						clip18b.stop();
					}
					if(clip18c.isOpen()) {
						clip18c.stop();
					}
				} else if (pitch == 8) {
					if(clip17a.isOpen()) {
						clip17a.stop();
					}
					if(clip17b.isOpen()) {
						clip17b.stop();
					}
					if(clip17c.isOpen()) {
						clip17c.stop();
					}
				} else if (pitch == 9) {
					if(clip16a.isOpen()) {
						clip16a.stop();
					}
					if(clip16b.isOpen()) {
						clip16b.stop();
					}
					if(clip16c.isOpen()) {
						clip16c.stop();
					}
				} else if (pitch == 10) {
					if(clip15a.isOpen()) {
						clip15a.stop();
					}
					if(clip15b.isOpen()) {
						clip15b.stop();
					}
					if(clip15c.isOpen()) {
						clip15c.stop();
					}
				} else if (pitch == 11) {
					if(clip14a.isOpen()) {
						clip14a.stop();
					}
					if(clip14b.isOpen()) {
						clip14b.stop();
					}
					if(clip14c.isOpen()) {
						clip14c.stop();
					}
				} else if (pitch == 12) {
					if(clip13a.isOpen()) {
						clip13a.stop();
					}
					if(clip13b.isOpen()) {
						clip13b.stop();
					}
					if(clip13c.isOpen()) {
						clip13c.stop();
					}
				} else if (pitch == 13) {
					if(clip12a.isOpen()) {
						clip12a.stop();
					}
					if(clip12b.isOpen()) {
						clip12b.stop();
					}
					if(clip12c.isOpen()) {
						clip12c.stop();
					}
				} else if (pitch == 14) {
					if(clip11a.isOpen()) {
						clip11a.stop();
					}
					if(clip11b.isOpen()) {
						clip11b.stop();
					}
					if(clip11c.isOpen()) {
						clip11c.stop();
					}
				} else if (pitch == 15) {
					if(clip10a.isOpen()) {
						clip10a.stop();
					}
					if(clip10b.isOpen()) {
						clip10b.stop();
					}
					if(clip10c.isOpen()) {
						clip10c.stop();
					}
				} else if (pitch == 16) {
					if(clip9a.isOpen()) {
						clip9a.stop();
					}
					if(clip9b.isOpen()) {
						clip9b.stop();
					}
					if(clip9c.isOpen()) {
						clip9c.stop();
					}
				} else if (pitch == 17) {
					if(clip8a.isOpen()) {
						clip8a.stop();
					}
					if(clip8b.isOpen()) {
						clip8b.stop();
					}
					if(clip8c.isOpen()) {
						clip8c.stop();
					}
				} else if (pitch == 18) {
					if(clip7a.isOpen()) {
						clip7a.stop();
					}
					if(clip7b.isOpen()) {
						clip7b.stop();
					}
					if(clip7c.isOpen()) {
						clip7c.stop();
					}
				} else if (pitch == 19) {
					if(clip6a.isOpen()) {
						clip6a.stop();
					}
					if(clip6b.isOpen()) {
						clip6b.stop();
					}
					if(clip6c.isOpen()) {
						clip6c.stop();
					}
				} else if (pitch == 20) {
					if(clip5a.isOpen()) {
						clip5a.stop();
					}
					if(clip5b.isOpen()) {
						clip5b.stop();
					}
					if(clip5c.isOpen()) {
						clip5c.stop();
					}
				} else if (pitch == 21) {
					if(clip4a.isOpen()) {
						clip4a.stop();
					}
					if(clip4b.isOpen()) {
						clip4b.stop();
					}
					if(clip4c.isOpen()) {
						clip4c.stop();
					}
				} else if (pitch == 22) {
					if(clip3a.isOpen()) {
						clip3a.stop();
					}
					if(clip3b.isOpen()) {
						clip3b.stop();
					}
					if(clip3c.isOpen()) {
						clip3c.stop();
					}
				} else if (pitch == 23) {
					if(clip2a.isOpen()) {
						clip2a.stop();
					}
					if(clip2b.isOpen()) {
						clip2b.stop();
					}
					if(clip2c.isOpen()) {
						clip2c.stop();
					}
				} else if (pitch == 24) {
					if(clip1a.isOpen()) {
						clip1a.stop();
					}
					if(clip1b.isOpen()) {
						clip1b.stop();
					}
					if(clip1c.isOpen()) {
						clip1c.stop();
					}
				}
			}
			else if (value == 1) {
				if (pitch == 0) {
					if(!clip25a.isOpen()) {
						clip25a.open(stream25a);
					}
					clip25a.setFramePosition(0);
					clip25a.start();
				} else if (pitch == 1) {
					if(!clip24a.isOpen()) {
						clip24a.open(stream24a);
					}
					clip24a.setFramePosition(0);
					clip24a.start();
				} else if (pitch == 2) {
					if(!clip23a.isOpen()) {
						clip23a.open(stream23a);
					}
					clip23a.setFramePosition(0);
					clip23a.start();
				} else if (pitch == 3) {
					if(!clip22a.isOpen()) {
						clip22a.open(stream22a);
					}
					clip22a.setFramePosition(0);
					clip22a.start();
				} else if (pitch == 4) {
					if(!clip21a.isOpen()) {
						clip21a.open(stream21a);
					}
					clip21a.setFramePosition(0);
					clip21a.start();
				} else if (pitch == 5) {
					if(!clip20a.isOpen()) {
						clip20a.open(stream20a);
					}
					clip20a.setFramePosition(0);
					clip20a.start();
				} else if (pitch == 6) {
					if(!clip19a.isOpen()) {
						clip19a.open(stream19a);
					}
					clip19a.setFramePosition(0);
					clip19a.start();
				} else if (pitch == 7) {
					if(!clip18a.isOpen()) {
						clip18a.open(stream18a);
					}
					clip18a.setFramePosition(0);
					clip18a.start();
				} else if (pitch == 8) {
					if(!clip17a.isOpen()) {
						clip17a.open(stream17a);
					}
					clip17a.setFramePosition(0);
					clip17a.start();
				} else if (pitch == 9) {
					if(!clip16a.isOpen()) {
						clip16a.open(stream16a);
					}
					clip16a.setFramePosition(0);
					clip16a.start();
				} else if (pitch == 10) {
					if(!clip15a.isOpen()) {
						clip15a.open(stream15a);
					}
					clip15a.setFramePosition(0);
					clip15a.start();
				} else if (pitch == 11) {
					if(!clip14a.isOpen()) {
						clip14a.open(stream14a);
					}
					clip14a.setFramePosition(0);
					clip14a.start();
				} else if (pitch == 12) {
					if(!clip13a.isOpen()) {
						clip13a.open(stream13a);
					}
					clip13a.setFramePosition(0);
					clip13a.start();
				} else if (pitch == 13) {
					if(!clip12a.isOpen()) {
						clip12a.open(stream12a);
					}
					clip12a.setFramePosition(0);
					clip12a.start();
				} else if (pitch == 14) {
					if(!clip11a.isOpen()) {
						clip11a.open(stream11a);
					}
					clip11a.setFramePosition(0);
					clip11a.start();
				} else if (pitch == 15) {
					if(!clip10a.isOpen()) {
						clip10a.open(stream10a);
					}
					clip10a.setFramePosition(0);
					clip10a.start();
				} else if (pitch == 16) {
					if(!clip9a.isOpen()) {
						clip9a.open(stream9a);
					}
					clip9a.setFramePosition(0);
					clip9a.start();
				} else if (pitch == 17) {
					if(!clip8a.isOpen()) {
						clip8a.open(stream8a);
					}
					clip8a.setFramePosition(0);
					clip8a.start();
				} else if (pitch == 18) {
					if(!clip7a.isOpen()) {
						clip7a.open(stream7a);
					}
					clip7a.setFramePosition(0);
					clip7a.start();
				} else if (pitch == 19) {
					if(!clip6a.isOpen()) {
						clip6a.open(stream6a);
					}
					clip6a.setFramePosition(0);
					clip6a.start();
				} else if (pitch == 20) {
					if(!clip5a.isOpen()) {
						clip5a.open(stream5a);
					}
					clip5a.setFramePosition(0);
					clip5a.start();
				} else if (pitch == 21) {
					if(!clip4a.isOpen()) {
						clip4a.open(stream4a);
					}
					clip4a.setFramePosition(0);
					clip4a.start();
				} else if (pitch == 22) {
					if(!clip3a.isOpen()) {
						clip3a.open(stream3a);
					}
					clip3a.setFramePosition(0);
					clip3a.start();
				} else if (pitch == 23) {
					if(!clip2a.isOpen()) {
						clip2a.open(stream2a);
					}
					clip2a.setFramePosition(0);
					clip2a.start();
				} else if (pitch == 24) {
					if(!clip1a.isOpen()) {
						clip1a.open(stream1a);
					}
					clip1a.setFramePosition(0);
					clip1a.start();
				}
			}
			else if (value == 2) {
				if (pitch == 0) {
					if(!clip25b.isOpen()) {
						clip25b.open(stream25b);
					}
					clip25b.setFramePosition(0);
					clip25b.start();
				} else if (pitch == 1) {
					if(!clip24b.isOpen()) {
						clip24b.open(stream24b);
					}
					clip24b.setFramePosition(0);
					clip24b.start();
				} else if (pitch == 2) {
					if(!clip23b.isOpen()) {
						clip23b.open(stream23b);
					}
					clip23b.setFramePosition(0);
					clip23b.start();
				} else if (pitch == 3) {
					if(!clip22b.isOpen()) {
						clip22b.open(stream22b);
					}
					clip22b.setFramePosition(0);
					clip22b.start();
				} else if (pitch == 4) {
					if(!clip21b.isOpen()) {
						clip21b.open(stream21b);
					}
					clip21b.setFramePosition(0);
					clip21b.start();
				} else if (pitch == 5) {
					if(!clip20b.isOpen()) {
						clip20b.open(stream20b);
					}
					clip20b.setFramePosition(0);
					clip20b.start();
				} else if (pitch == 6) {
					if(!clip19b.isOpen()) {
						clip19b.open(stream19b);
					}
					clip19b.setFramePosition(0);
					clip19b.start();
				} else if (pitch == 7) {
					if(!clip18b.isOpen()) {
						clip18b.open(stream18b);
					}
					clip18b.setFramePosition(0);
					clip18b.start();
				} else if (pitch == 8) {
					if(!clip17b.isOpen()) {
						clip17b.open(stream17b);
					}
					clip17b.setFramePosition(0);
					clip17b.start();
				} else if (pitch == 9) {
					if(!clip16b.isOpen()) {
						clip16b.open(stream16b);
					}
					clip16b.setFramePosition(0);
					clip16b.start();
				} else if (pitch == 10) {
					if(!clip15b.isOpen()) {
						clip15b.open(stream15b);
					}
					clip15b.setFramePosition(0);
					clip15b.start();
				} else if (pitch == 11) {
					if(!clip14b.isOpen()) {
						clip14b.open(stream14b);
					}
					clip14b.setFramePosition(0);
					clip14b.start();
				} else if (pitch == 12) {
					if(!clip13b.isOpen()) {
						clip13b.open(stream13b);
					}
					clip13b.setFramePosition(0);
					clip13b.start();
				} else if (pitch == 13) {
					if(!clip12b.isOpen()) {
						clip12b.open(stream12b);
					}
					clip12b.setFramePosition(0);
					clip12b.start();
				} else if (pitch == 14) {
					if(!clip11b.isOpen()) {
						clip11b.open(stream11b);
					}
					clip11b.setFramePosition(0);
					clip11b.start();
				} else if (pitch == 15) {
					if(!clip10b.isOpen()) {
						clip10b.open(stream10b);
					}
					clip10b.setFramePosition(0);
					clip10b.start();
				} else if (pitch == 16) {
					if(!clip9b.isOpen()) {
						clip9b.open(stream9b);
					}
					clip9b.setFramePosition(0);
					clip9b.start();
				} else if (pitch == 17) {
					if(!clip8b.isOpen()) {
						clip8b.open(stream8b);
					}
					clip8b.setFramePosition(0);
					clip8b.start();
				} else if (pitch == 18) {
					if(!clip7b.isOpen()) {
						clip7b.open(stream7b);
					}
					clip7b.setFramePosition(0);
					clip7b.start();
				} else if (pitch == 19) {
					if(!clip6b.isOpen()) {
						clip6b.open(stream6b);
					}
					clip6b.setFramePosition(0);
					clip6b.start();
				} else if (pitch == 20) {
					if(!clip5b.isOpen()) {
						clip5b.open(stream5b);
					}
					clip5b.setFramePosition(0);
					clip5b.start();
				} else if (pitch == 21) {
					if(!clip4b.isOpen()) {
						clip4b.open(stream4b);
					}
					clip4b.setFramePosition(0);
					clip4b.start();
				} else if (pitch == 22) {
					if(!clip3b.isOpen()) {
						clip3b.open(stream3b);
					}
					clip3b.setFramePosition(0);
					clip3b.start();
				} else if (pitch == 23) {
					if(!clip2b.isOpen()) {
						clip2b.open(stream2b);
					}
					clip2b.setFramePosition(0);
					clip2b.start();
				} else if (pitch == 24) {
					if(!clip1b.isOpen()) {
						clip1b.open(stream1b);
					}
					clip1b.setFramePosition(0);
					clip1b.start();
				}
			}
			else if (value == 3) {
				if (pitch == 0) {
					if(!clip25c.isOpen()) {
						clip25c.open(stream25c);
					}
					clip25c.setFramePosition(0);
					clip25c.start();
				} else if (pitch == 1) {
					if(!clip24c.isOpen()) {
						clip24c.open(stream24c);
					}
					clip24c.setFramePosition(0);
					clip24c.start();
				} else if (pitch == 2) {
					if(!clip23c.isOpen()) {
						clip23c.open(stream23c);
					}
					clip23c.setFramePosition(0);
					clip23c.start();
				} else if (pitch == 3) {
					if(!clip22c.isOpen()) {
						clip22c.open(stream22c);
					}
					clip22c.setFramePosition(0);
					clip22c.start();
				} else if (pitch == 4) {
					if(!clip21c.isOpen()) {
						clip21c.open(stream21c);
					}
					clip21c.setFramePosition(0);
					clip21c.start();
				} else if (pitch == 5) {
					if(!clip20c.isOpen()) {
						clip20c.open(stream20c);
					}
					clip20c.setFramePosition(0);
					clip20c.start();
				} else if (pitch == 6) {
					if(!clip19c.isOpen()) {
						clip19c.open(stream19c);
					}
					clip19c.setFramePosition(0);
					clip19c.start();
				} else if (pitch == 7) {
					if(!clip18c.isOpen()) {
						clip18c.open(stream18c);
					}
					clip18c.setFramePosition(0);
					clip18c.start();
				} else if (pitch == 8) {
					if(!clip17c.isOpen()) {
						clip17c.open(stream17c);
					}
					clip17c.setFramePosition(0);
					clip17c.start();
				} else if (pitch == 9) {
					if(!clip16c.isOpen()) {
						clip16c.open(stream16c);
					}
					clip16c.setFramePosition(0);
					clip16c.start();
				} else if (pitch == 10) {
					if(!clip15c.isOpen()) {
						clip15c.open(stream15c);
					}
					clip15c.setFramePosition(0);
					clip15c.start();
				} else if (pitch == 11) {
					if(!clip14c.isOpen()) {
						clip14c.open(stream14c);
					}
					clip14c.setFramePosition(0);
					clip14c.start();
				} else if (pitch == 12) {
					if(!clip13c.isOpen()) {
						clip13c.open(stream13c);
					}
					clip13c.setFramePosition(0);
					clip13c.start();
				} else if (pitch == 13) {
					if(!clip12c.isOpen()) {
						clip12c.open(stream12c);
					}
					clip12c.setFramePosition(0);
					clip12c.start();
				} else if (pitch == 14) {
					if(!clip11c.isOpen()) {
						clip11c.open(stream11c);
					}
					clip11c.setFramePosition(0);
					clip11c.start();
				} else if (pitch == 15) {
					if(!clip10c.isOpen()) {
						clip10c.open(stream10c);
					}
					clip10c.setFramePosition(0);
					clip10c.start();
				} else if (pitch == 16) {
					if(!clip9c.isOpen()) {
						clip9c.open(stream9c);
					}
					clip9c.setFramePosition(0);
					clip9c.start();
				} else if (pitch == 17) {
					if(!clip8c.isOpen()) {
						clip8c.open(stream8c);
					}
					clip8c.setFramePosition(0);
					clip8c.start();
				} else if (pitch == 18) {
					if(!clip7c.isOpen()) {
						clip7c.open(stream7c);
					}
					clip7c.setFramePosition(0);
					clip7c.start();
				} else if (pitch == 19) {
					if(!clip6c.isOpen()) {
						clip6c.open(stream6a);
					}
					clip6c.setFramePosition(0);
					clip6c.start();
				} else if (pitch == 20) {
					if(!clip5c.isOpen()) {
						clip5c.open(stream5c);
					}
					clip5c.setFramePosition(0);
					clip5c.start();
				} else if (pitch == 21) {
					if(!clip4c.isOpen()) {
						clip4c.open(stream4c);
					}
					clip4c.setFramePosition(0);
					clip4c.start();
				} else if (pitch == 22) {
					if(!clip3c.isOpen()) {
						clip3c.open(stream3c);
					}
					clip3c.setFramePosition(0);
					clip3c.start();
				} else if (pitch == 23) {
					if(!clip2c.isOpen()) {
						clip2c.open(stream2c);
					}
					clip2c.setFramePosition(0);
					clip2c.start();
				} else if (pitch == 24) {
					if(!clip1c.isOpen()) {
						clip1c.open(stream1c);
					}
					clip1c.setFramePosition(0);
					clip1c.start();
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("sound no work");
		}
	}

}
