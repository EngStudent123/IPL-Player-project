package com.tka.controller;

import java.util.ArrayList;

import com.tka.entity.IPLPlayer;
import com.tka.service.IPLService;

public class IPLController {
public static void main(String[] args) {
	
	System.out.println("***********Welcome to IPL Application***************");
	
	IPLService iplservice = new IPLService();
	
	
	System.out.println(" \n1. Requesting All Players \n");	
	ArrayList<IPLPlayer> allplayer = iplservice.getAllPlayer();	
	for(IPLPlayer player : allplayer) {
		System.out.println(" Player Name >> "+player.getPname()+ " Team Name >> "+player.getTeamname());
	}
	
	
	System.out.println(" \n2. Add Player  \n");
	IPLPlayer player1 = new IPLPlayer(45,"Pat Cummins","SRH",85,18,"All-Rounder",6);
	int rowinsert = iplservice.insertPlayer( player1);
	if(rowinsert > 0) {
		System.out.println("Player Added successfully...!!");
	}
	
	
	System.out.println(" \n3. Update Player details....!!  \n");
	IPLPlayer playerUpdate = new IPLPlayer(45,"Pat Cummins","SRH",110,20,"All-Rounder",6);
	int rowupdate = iplservice.updatePlayerInfo(playerUpdate);
	if(rowupdate > 0) {
		System.out.println("Player update successfully...........!!");
	}
	
	
	System.out.println("\n4. Remove Player from Team \n ");	
	IPLPlayer removeplayer = new IPLPlayer(4,"Tilak Varma","MI",416,0,"Batsman",6);
	  int deleteplayer1 = iplservice.removePlayer(removeplayer);
	  if(deleteplayer1 > 0) {
		  System.out.println("Player Removed Successfully.....!!");
	  }
	
}
}
