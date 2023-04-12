package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_API {

	Connection conn = null;
	Statement input = null;
	ResultSet results = null;
	
	sequencer s;
	
	InputGrid in;
	
	public SQL_API(sequencer seq, InputGrid input) {

		s = seq;
		in = input;

		System.out.println("loading");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC not Registered");
			return;
		}
		System.out.println("JDBC Registered");

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music", "root", "");
		} catch (SQLException e) {
			System.out.println("database not connected");
		}
		if (conn != null) {
			System.out.println("Successful connection");
		}

	}
	
	public void savePeice(int[][] s, int index, String name, int BPM) {
		try {
			input = conn.createStatement();
			
			String sql = "TRUNCATE T" + index;
			input.execute(sql);
			
			for (int i = 0; i < 48; i++) {
				for (int j = 0; j < 25; j++) {
					if (s[i][j] != 0) {
						sql = "INSERT INTO T" + index + " VALUES (" + i + ", " + j + ", " + s[i][j] + ")";
						input.execute(sql);
					}
				}
			}
			
			
			sql = "UPDATE masterTable \r\n"
					+ "SET musicBPM = " + BPM + ", \r\n"
					+ "musicName = \"" + name + "\"\r\n"
					+ "WHERE musicIndex = " + index;
			input.execute(sql);
			
		} catch(SQLException e) {
			System.out.println("not updated");
			e.printStackTrace();
		}
	}
	
	public String[] loadPiece(int index) {
		try {
			input = conn.createStatement();
			
			String sql = "SELECT * FROM T" + index;
			results = input.executeQuery(sql);
			
			int[][] temp = new int[48][25];
			
			for (int i = 0; i < 48; i++) {
				for (int j = 0; j < 25; j++) {  
					temp[i][j] = 0;
				}
			}
			
			while(results.next()) {
			temp[results.getInt(1)][results.getInt(2)] = results.getInt(3);
			}
			
			s.setNotes(temp);
			in.updateGrid(temp);
			
			sql = "SELECT * FROM masterTable WHERE musicIndex = " + index;
			results = input.executeQuery(sql);
			
			results.next();
			
			String[] temp2 = {Integer.toString(results.getInt(2)), results.getString(3)};
			
			return temp2;
					
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("not updated");
			return null;
		}
	}
	
	public ResultSet getMasterList() {
		
		try {
			input = conn.createStatement();
			
			String sql = "SELECT * FROM masterTable";
			results = input.executeQuery(sql);
			return results;
			
			
		} catch(SQLException e) {
			System.out.println("not updated");
			return results;
		}
	}
	
}
