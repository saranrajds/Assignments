package dtoclasswithattributes;

import java.util.ArrayList;
import java.util.List;

class Player{
	
	private String name;
	private int jerseyNo;
	
	Player(String name, int jerseyNo) {
		this.name = name;
		this.jerseyNo = jerseyNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
}

class Team {
	private String name;
    private List<Player> players;
    
    Team(String teamName) {
    	
    	this.name = teamName;
    	this.players = new ArrayList<Player>();
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Player players) {
		this.players.add(players);
	}

	public void displayTeamInfo() {
		
		System.out.println("Team: " + getName());
        System.out.println("Players:");
        for (Player player : players) {
            System.out.println("\t-> " + player.getName() + ", Jersey Number: " + player.getJerseyNo());
        }
	}
}

public class TeamWithPlayer {

	public static void main(String[] args) {
		
		Player saran = new Player("Saran", 3);
		Player sujith = new Player("Sujith", 5);
		Player kavin = new Player("Kavin", 7);
		
		Team mumbaiIndiance = new Team("Mumbai Indian");
		mumbaiIndiance.setPlayers(saran);
		mumbaiIndiance.setPlayers(sujith);
		mumbaiIndiance.setPlayers(kavin);
		mumbaiIndiance.displayTeamInfo();
	}
}
