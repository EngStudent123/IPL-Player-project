package com.tka.entity;

public class IPLPlayer {
	    private int pid;
	    private String pname;
	    private String teamname;
	    private int runs;
	    private int wickets;
	    private  String category;
	    private int catches;
	    
	    
		@Override
		public String toString() {
			return "IPLPlayer [pid=" + pid + ", pname=" + pname + ", teamname=" + teamname + ", runs=" + runs
					+ ", wickets=" + wickets + ", category=" + category + ", catches=" + catches + "]";
		}


		public IPLPlayer(int pid, String pname, String teamname, int runs, int wickets, String category, int catches) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.teamname = teamname;
			this.runs = runs;
			this.wickets = wickets;
			this.category = category;
			this.catches = catches;
		}


		public IPLPlayer() {
			super();
		}


		public int getPid() {
			return pid;
		}


		public void setPid(int pid) {
			this.pid = pid;
		}


		public String getPname() {
			return pname;
		}


		public void setPname(String pname) {
			this.pname = pname;
		}


		public String getTeamname() {
			return teamname;
		}


		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}


		public int getRuns() {
			return runs;
		}


		public void setRuns(int runs) {
			this.runs = runs;
		}


		public int getWickets() {
			return wickets;
		}


		public void setWickets(int wickets) {
			this.wickets = wickets;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public int getCatches() {
			return catches;
		}


		public void setCatches(int catches) {
			this.catches = catches;
		}
	    
	    
}
