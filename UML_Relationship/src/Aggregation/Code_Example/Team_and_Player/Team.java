package Aggregation.Code_Example.Team_and_Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private String coach;
    private String homeStadium;
    private List<Player> players; // Aggregation
    private static final int MIN_PLAYERS = 11;
    
    public Team(String teamName, String coach, String homeStadium) {
        this.teamName = teamName;
        this.coach = coach;
        this.homeStadium = homeStadium;
        this.players = new ArrayList<>();
    }
    
    // Add existing player to team
    public boolean addPlayer(Player player) {
        if (players.contains(player)) {
            System.out.println(player.getName() + " is already in " + teamName);
            return false;
        }
        
        players.add(player);
        System.out.println(teamName + " signed " + player.getName());
        return true;
    }
    
    // Remove player from team (player still exists)
    public boolean removePlayer(Player player) {
        if (players.remove(player)) {
            System.out.println(player.getName() + " transferred from " + teamName);
            System.out.println(player.getName() + " is now a free agent");
            return true;
        }
        return false;
    }
    
    public boolean canPlay() {
        return players.size() >= MIN_PLAYERS;
    }
    
    public void displayRoster() {
        System.out.println("\n" + teamName + " Roster:");
        System.out.println("Coach: " + coach);
        System.out.println("Stadium: " + homeStadium);
        System.out.println("Players (" + players.size() + "):");
        for (Player player : players) {
            System.out.println("  - " + player + " - Goals: " + player.getGoals());
        }
    }
    
    public List<Player> getPlayers() { return new ArrayList<>(players); }
    public String getTeamName() { return teamName; }
}