package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class Window extends JFrame{
	
	private sequencer s = new sequencer();
	
	private InputGrid input = new InputGrid(s);
	
	private SQL_API sql = new SQL_API(s, input);
	
	private JPanel mainPanel = new JPanel();
	private JButton start = new JButton("Start"); 
	private JButton stop = new JButton("stop");
	
	private JButton load = new JButton("load");
	
	private JTextField title = new JTextField();
	
	private JLabel indextitle = new JLabel("index:");
	private JTextField index = new JTextField();
	
	private JButton save = new JButton("save");
	
	private JButton openMenu = new JButton("open database");
	
	private JButton clearall = new JButton("clear all");
	
	//generate random button
	
	private JLabel bpmtitle = new JLabel("bpm: ");
	private JTextField BPM = new JTextField();
	
	private JLabel instrumentstitle = new JLabel("choose instrument to input: ");
	
	private ButtonGroup instruments = new ButtonGroup();
	
	private JRadioButton instrument1 = new JRadioButton("instrument 1");
	private JRadioButton instrument2 = new JRadioButton("instrument 2");
	private JRadioButton instrument3 = new JRadioButton("instrument 3");
	
	public static Instrument piano = new Instrument(Color.cyan, 1, "piano");
	public static Instrument synth = new Instrument(Color.yellow, 3, "synth");
	public static Instrument guitar = new Instrument(Color.red, 2, "guitar");
	
	private static Instrument currentlySelected = piano;
	
	
	private DataViewWindow query = new DataViewWindow();
	
	public Window() {
		super("Digital Workspace Project");
	
		updateDataWindow();
		
	this.setContentPane(mainPanel);
	mainPanel.setBackground(Color.gray);
	mainPanel.setLayout(null);
	mainPanel.setVisible(true);
	
	mainPanel.add(start); 
	start.setVisible(true);
	start.setSize(100, 30);
	start.setLocation(100, 100);
	start.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int bpm = Integer.parseInt(BPM.getText());
				s.runSequencer(bpm);

			} catch (Exception ex) {
				s.runSequencer(120);

			}
		}
	});
	
	mainPanel.add(stop); 
	stop.setVisible(true);
	stop.setSize(100, 30);
	stop.setLocation(200, 100);
	stop.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			s.stopSequencer();
		}
	});
	mainPanel.add(bpmtitle);
	bpmtitle.setLocation(300, 70);
	bpmtitle.setSize(100, 30);
	
	mainPanel.add(BPM);
	BPM.setLocation(300, 100);
	BPM.setSize(100, 30);
	BPM.setToolTipText("enter BPM here");
	
	BPM.setText("120");
	
	mainPanel.add(clearall);
	clearall.setSize(100, 30);
	clearall.setLocation(500, 100);
	clearall.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			input.clearAll();
			s.clearAll();
		}
	});
	
	mainPanel.add(input);
	input.setSize(1400,  500);
	input.setLocation(120, 200);
	
	mainPanel.add(load);
	load.setSize(120, 30);
	load.setLocation(1350, 100);
	load.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] s = sql.loadPiece(Integer.parseInt(index.getText()));
			BPM.setText(s[0]);
			title.setText(s[1]);
		}
	});
	
	mainPanel.add(save);
	save.setSize(120, 30);
	save.setLocation(1350, 130);
	save.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			sql.savePeice(s.getNotes(), Integer.parseInt(index.getText()), title.getText(), Integer.parseInt(BPM.getText()));
			updateDataWindow();
		}
	});
	
	mainPanel.add(openMenu);
	openMenu.setSize(120, 30);
	openMenu.setLocation(1150, 100);
	openMenu.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			query.setSize(600, 800);
			query.setLocation(1800, 50);
			query.setResizable(false);
			query.setVisible(true);
			query.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	});
	
	mainPanel.add(indextitle);
	indextitle.setSize(50, 30);
	indextitle.setLocation(1500, 30);
	
	mainPanel.add(index);
	index.setSize(50, 30);
	index.setLocation(1500, 60);
	index.setText("1");

	mainPanel.add(title);
	title.setSize(100, 30);
	title.setLocation(1350, 60);
	title.setText("enter title");
	
	mainPanel.add(instrumentstitle);
	instrumentstitle.setSize(250, 30);
	instrumentstitle.setLocation(800, 70);
	
	instruments.add(instrument1);
	instruments.add(instrument2);
	instruments.add(instrument3);
	
	instrument1.setSelected(true);
		
	mainPanel.add(instrument1);
	instrument1.setLocation(800, 100);
	instrument1.setVisible(true);
	instrument1.setSize(100, 30);
	instrument1.setBackground(piano.getColor());
	instrument1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			currentlySelected = piano; 
		}
	});
	
	
	mainPanel.add(instrument2);
	instrument2.setLocation(900, 100);
	instrument2.setVisible(true);
	instrument2.setSize(100, 30);
	instrument2.setBackground(guitar.getColor());
	instrument2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			currentlySelected = guitar; 
		}
	});
	
	mainPanel.add(instrument3);
	instrument3.setLocation(1000, 100);
	instrument3.setVisible(true);
	instrument3.setSize(100, 30);
	instrument3.setBackground(synth.getColor());
	instrument3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			currentlySelected = synth; 
		}
	});
	}
	
	public static Instrument getCurrentSelection() {
		return currentlySelected;
	}
	
	private void updateDataWindow() {
		try {
			ResultSet res = sql.getMasterList();
			int i = 1;
			while (res.next()) {
				query.updateLabel(i, "Index: " + res.getInt(1) + "     name: " + res.getString(3) + "     BPM: " + res.getInt(2));
				i++;
			}
		} catch (SQLException e) {

		}
		
	}
}
