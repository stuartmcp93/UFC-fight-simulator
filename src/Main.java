import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {

        Fighter dustinP = new Fighter("Dustin Porier", 24, 4, 2);
        Fighter conorM = new Fighter("Conor McGregor", 22, 2, 0);
        Fight UFC258 = new Fight("UFC 258", dustinP, conorM);

        UFC258.fightSimulator();


        }


}



