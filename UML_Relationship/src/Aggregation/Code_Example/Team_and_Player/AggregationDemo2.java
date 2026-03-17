package Aggregation.Code_Example.Team_and_Player;

public class AggregationDemo2 {
    public static void main(String[] args) {
        // Players exist independently
        Player player1 = new Player("PL001", "Cristiano Ronaldo", "Forward", 7);
        Player player2 = new Player("PL002", "Lionel Messi", "Forward", 10);
        Player player3 = new Player("PL003", "Sergio Ramos", "Defender", 4);
        Player player4 = new Player("PL004", "Luka Modric", "Midfielder", 10);
        
        // Create teams
        Team realMadrid = new Team("Real Madrid", "Carlo Ancelotti", "Santiago Bernabéu");
        Team barcelona = new Team("Barcelona", "Xavi Hernandez", "Camp Nou");
        
        // Aggregation - teams add existing players
        realMadrid.addPlayer(player1);
        realMadrid.addPlayer(player3);
        realMadrid.addPlayer(player4);
        
        barcelona.addPlayer(player2);
        
        realMadrid.displayRoster();
        barcelona.displayRoster();
        
        // Player scores (independent of team)
        player1.scoreGoal();
        player1.scoreGoal();
        player2.scoreGoal();
        
        // Transfer player (remove from one team, add to another)
        System.out.println("\n--- Player Transfer ---");
        realMadrid.removePlayer(player1);
        
        // Player still exists and can join new team
        player1.train();
        player1.play();
        
        // Player joins new team
        barcelona.addPlayer(player1);
        
        barcelona.displayRoster();
        
        // Team is destroyed but players still exist
        System.out.println("\n--- Team Disbanded ---");
        realMadrid = null;
        System.out.println("Real Madrid disbanded, but players still exist:");
        player3.train();
        player4.play();
    }
}