import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class UfcAppTest {


    @Test
    public void testFighterStats(){
        Fighter dustinP = new Fighter("Dustin Porier", 24, 4, 2);
        //Fail - method getWins() returns null
        //Assert.assertEquals(24, dustinP.getWins());
        //PASS - Testing that the new fighter has wins assigned
        Assert.assertEquals(24, dustinP.getWins());
        //check other stats after fighter object created
        Assert.assertEquals("Dustin Porier", dustinP.getName());
        Assert.assertEquals(4, dustinP.getLosses());
        Assert.assertEquals(2, dustinP.getDraws());

    }

    @Test
    public void testWinLoseDraw(){
        Fighter dustinP = new Fighter("Dustin Porier", 24, 4, 2);
        //Fail - fighter wins should increase after a win
        //Assert.assertEquals(25, dustinP.getWins());
        //Add method to increase wins
        dustinP.winner();
        Assert.assertEquals(25, dustinP.getWins());
        //Add methods to update all stats
        dustinP.losses();
        Assert.assertEquals(5, dustinP.getLosses());
        dustinP.draws();
        Assert.assertEquals(3, dustinP.getDraws());

    }

    @Test
    public void fightMockTest(){
        Fighter dustinP = new Fighter("Dustin Porier", 24, 4, 2);
        Fighter conorM = new Fighter("Conor McGregor", 22, 2, 0);
        FightMockClass mock = new FightMockClass(dustinP, conorM);
        mock.fightSimulator();
        //Mock class set that fighter 2 will win the fight
        //So conorM's number of wins should increase by 1
        Assert.assertEquals(23, conorM.getWins());

    }

    @Test
    public void testFightSimulatorWithRandNums() {
        Fighter dustinP = new Fighter("Dustin Porier", 24, 4, 2);
        Fighter conorM = new Fighter("Conor McGregor", 22, 2, 0);
        Fight UFC258 = new Fight("UFC 258", dustinP, conorM);
        Fighter winner = UFC258.fightSimulator();

        if(winner.getName() == "Dustin Porier"){
            Assert.assertEquals(25, dustinP.getWins());
        } else if(winner.getName() == "Conor McGregor") {
            Assert.assertEquals(23, conorM.getWins());
        } else {
            throw new NoSuchElementException("No winner");
        }

    }





}
