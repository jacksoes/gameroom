package gameroom;

public class ElectronicGameroom extends Gameroom {

    public ElectronicGameroom() {
        super(2, 20, 2, 5);
    }

    public void does() {
        System.out.println(
                "The electronic gameroom will be focused on videogames and providing equipment for the esports team.");
    }

}
