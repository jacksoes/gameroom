package gameroom;

public class NonElectronicGameroom extends Gameroom {

    public NonElectronicGameroom() {
        super(8, 0, 1, 0);

    }

    public void does() {
        System.out.println(
            "The non-electronic gameroom will focus on providing non-electronic games such as pool, boardgames and others.");
    }

}
