public class Fight implements FightInterface {
    private String eventName;
    Fighter fighter1;
    Fighter fighter2;

    public Fight(String eventName, Fighter fighter1, Fighter fighter2 ){
        this.eventName = eventName;
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    @Override
    public int getFighter1SigStrikes() {
        int min = 150;
        int max = 500;
        int sigStrikes1 = (int) (Math.random() * (max - min + 1) + min);
        return sigStrikes1;
    }
    @Override
    public int getFighter2SigStrikes() {
        int min = 150;
        int max = 500;
        int sigStrikes2 = (int) (Math.random() * (max - min + 1) + min);
        return sigStrikes2;
    }
    @Override
    public Fighter fightSimulator() {
        int sigStrikes1 = getFighter1SigStrikes();
        int sigStrikes2 = getFighter2SigStrikes();
        if(sigStrikes1 > sigStrikes2){
            fighter1.winner();
            fighter2.losses();
            System.out.println(fighter1.getName() + " wins!!!");
            return fighter1;
        } else if(sigStrikes2 > sigStrikes1){
            fighter1.losses();
            fighter2.winner();
            System.out.println(fighter2.getName() + " wins!!!");
            return fighter2;
        } else {
            fighter1.draws();
            fighter2.draws();
            System.out.println("It's a draw!!!");
        }
        return null;
    }
}