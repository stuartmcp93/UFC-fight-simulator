public class FightMockClass implements FightInterface {
    private Fighter fighter1;
    private Fighter fighter2;
    public FightMockClass(Fighter fighter1, Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    @Override
    public int getFighter1SigStrikes() {
        //No random numbers fixed values instead
        return 200;
    }
    @Override
    public int getFighter2SigStrikes() {
        //No random numbers fixed values instead
        return 300;
    }
    @Override
    public Fighter fightSimulator() {
        int sigStrikes1 = getFighter1SigStrikes();
        int sigStrikes2 = getFighter2SigStrikes();

        if(sigStrikes1 > sigStrikes2){
            fighter1.winner();
            fighter2.losses();
            return fighter1;
        } else if(sigStrikes2 > sigStrikes1){
            fighter1.losses();
            fighter2.winner();
            return fighter2;
        } else {
            fighter1.draws();
            fighter2.draws();
        }

           return null;
    }
}
