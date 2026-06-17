package com.tka.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;
import com.tka.entity.IPLPlayer;

public class IPLDao {

	private String path = "com.mysql.cj.jdbc.Driver";
	
	private Connection con = null;
	private PreparedStatement pstmt =null;
	
	private String url = "jdbc:mysql://localhost:3306/Ipl_database";
	private String username ="root";
	private String passward = "Panchal@4567";
	
	String query = null;
	
	private ArrayList<IPLPlayer> player_db = null;
	
	public ArrayList<IPLPlayer> getAllPlayer(){
		
	player_db = new ArrayList<IPLPlayer>();
		
		
		try {
			Class.forName(path);			
			
		con = DriverManager.getConnection(url,username,passward);
		query ="Select * from Ipl_player";
		pstmt = con.prepareStatement(query);
		ResultSet rs =pstmt.executeQuery();
		
		while(rs.next()) {
			int pid = rs.getInt(1);
			String pname = rs.getString(2);
			String tname = rs.getString(3);
			int runs = rs.getInt(4);
			int wickets = rs.getInt(5);
			String category = rs.getString(6);
			int catches = rs.getInt(7);

			IPLPlayer iplplayer = new IPLPlayer(pid,pname,tname,runs,wickets,category,catches);
			player_db.add(iplplayer);
		}
		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return player_db;
					
	}

	public int insertPlayer(IPLPlayer player) {
		int rowaffect =0;
	
		try {
			Class.forName(path);			
			
		con = DriverManager.getConnection(url,username,passward);
		query = "insert into Ipl_player values (?,?,?,?,?,?,?)";
		
		pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, player.getPid());
		pstmt.setString(2,player.getPname());
		pstmt.setString(3,player.getTeamname());
		pstmt.setInt(4, player.getRuns());
		pstmt.setInt(5, player.getWickets());
		pstmt.setString(6,player.getCategory());
		pstmt.setInt(7,player.getCatches());
		
		 rowaffect = pstmt.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return rowaffect;
			
}

	public int updatePlayerInfo(IPLPlayer playerUpdate) {
		int rowaffect =0;
		
		try {
			Class.forName(path);			
			
		con = DriverManager.getConnection(url,username,passward);
		//query = "update Ipl_player set pid = ? ,pname =? , tname =? , runs =?,wickets =?,category=? , catches=? ";
		query = "UPDATE Ipl_player SET pname=?, tname=?, runs=?, wickets=?, category=?, catches=? WHERE pid=?";
		
		pstmt = con.prepareStatement(query);
		
		//pstmt.setInt(1, playerUpdate.getPid());
		pstmt.setString(1,playerUpdate.getPname());
		pstmt.setString(2,playerUpdate.getTeamname());
		pstmt.setInt(3, playerUpdate.getRuns());
		pstmt.setInt(4, playerUpdate.getWickets());
		pstmt.setString(5,playerUpdate.getCategory());
		pstmt.setInt(6,playerUpdate.getCatches());
		pstmt.setInt(7, playerUpdate.getPid());
		
		 rowaffect = pstmt.executeUpdate();
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return rowaffect;
		
		
	}

	public int removePlayer(IPLPlayer removeplayer) {
        int rowaffect =0;
		
		try {
			Class.forName(path);			
			
		con = DriverManager.getConnection(url,username,passward);
		
		query = "DELETE FROM Ipl_player WHERE pid = ?;";
		
		
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1, removeplayer.getPid());
		
		 rowaffect = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return rowaffect;
			
	}
	

	
	
	
	
}