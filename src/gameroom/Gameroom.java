package gameroom;

import gameroom.entities.*;

public class Gameroom {
    private Table[] tables;
    private Student[] students;
    private Computer[][] computers;

    public Gameroom(int tableCount , int studentCount, int computerRows, int computerCols) {
        this.tables = new Table[tableCount];
        this.students = new Student[studentCount];
        this.computers = new Computer[computerRows][computerCols];
    }

    public void contains() {
        System.out.println(String.format("this room will contain %d computers, %d tables and have a capacity of %d students" ,this.computers.length * this.computers[0].length, tables.length, students.length));
    }

    public Gameroom getGameroom(String gameroomType) {

        if (gameroomType == "large")
            return new LargeGameroom();
        else if (gameroomType == "electronic")
            return new ElectronicGameroom();
        else if (gameroomType == "non-electronic")
            return new NonElectronicGameroom();
        return new Gameroom(2, 20, 2, 5);

    }

}
