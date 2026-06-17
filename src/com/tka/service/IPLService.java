package com.tka.service;

import java.util.ArrayList;

import com.tka.dao.IPLDao;
import com.tka.entity.IPLPlayer;

public class IPLService {

	private IPLDao ipldao = null;
	private ArrayList<IPLPlayer> allplayer = null;
	
	
	public ArrayList<IPLPlayer> getAllPlayer(){
		ipldao = new IPLDao();
	ArrayList<IPLPlayer> allplayer = ipldao.getAllPlayer();	
	return allplayer;
	}


	public int insertPlayer(IPLPlayer player) {
		ipldao = new IPLDao();	
		int rowaffect = ipldao.insertPlayer( player);
		return rowaffect;
	}


	public int updatePlayerInfo(IPLPlayer playerUpdate) {	
		ipldao = new IPLDao();
		int rowaffect = ipldao.updatePlayerInfo(playerUpdate);
		return rowaffect;
	}


	public int removePlayer(IPLPlayer removeplayer) {
		ipldao = new IPLDao();
		int rowaffect = ipldao.removePlayer(removeplayer);
		return rowaffect;
		
	}
}
