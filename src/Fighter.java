public class Fighter {

    private String name;
    private int wins;
    private int losses;
    private int draws;

    public Fighter(String name, int wins, int losses, int draws){
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }
    public String getName(){
        return name;
    }

    public int getWins(){
        return this.wins;
    }
    public int getLosses(){
        return this.losses;
    }
    public int getDraws(){
        return this.draws;
    }
    public void winner(){
        wins++;
    }
    public void losses(){
        this.losses++;
    }
    public void draws(){
        this.draws++;
    }
    public void printRecord(){
        System.out.print(name + ": Wins: " + wins + " Losses: " + losses + " Draws: " + draws + "\n");
    }
}
