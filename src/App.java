import gameroom.*;
import gameroom.LargeGameroom;

public class App {
    public static void main(String[] args) throws Exception {
        Gameroom gameroomFactory = new Gameroom(2, 20, 2, 5);

        LargeGameroom gameroom1 = (LargeGameroom) gameroomFactory.getGameroom("large");
        gameroom1.does();
        gameroom1.contains();
        System.out.println();

        ElectronicGameroom gameroom2 = (ElectronicGameroom) gameroomFactory.getGameroom("electronic");
        gameroom2.does();
        gameroom2.contains();
        System.out.println();

        NonElectronicGameroom gameroom3 = (NonElectronicGameroom) gameroomFactory.getGameroom("non-electronic");
        gameroom3.does();
        gameroom3.contains();
        System.out.println();
        


        
    }
}