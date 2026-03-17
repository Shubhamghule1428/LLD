package Aggregation.Code_Example.Team_and_Player;

public class Player {
    private String playerId;
    private String name;
    private String position;
    private int jerseyNumber;
    private int goals;
    
    // Player exists independently
    public Player(String playerId, String name, String position, int jerseyNumber) {
        this.playerId = playerId;
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.goals = 0;
    }
    
    public void play() {
        System.out.println(name + " is playing as " + position);
    }
    
    public void train() {
        System.out.println(name + " is training");
    }
    
    public void scoreGoal() {
        goals++;
        System.out.println(name + " scored! Total goals: " + goals);
    }
    
    public String getPlayerId() { return playerId; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getJerseyNumber() { return jerseyNumber; }
    public int getGoals() { return goals; }
    
    @Override
    public String toString() {
        return name + " (#" + jerseyNumber + ", " + position + ")";
    }
}
