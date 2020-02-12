package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    MarsRover testRover = new MarsRover(new Coordinates(1,2,'N'), new Plateau(5,5));

    @Test
    void rotateLeft() {
        testRover.rotateLeft();
        assertEquals('W', testRover.getCoordinates().getCardinal(),"Check rotateLeft is correct");
    }

    @Test
    void rotateRight() {
        testRover.rotateRight();
        assertEquals('E', testRover.getCoordinates().getCardinal(),"Check rotateRight is correct");
    }

    @Test
    void ahead() {
        testRover.ahead();
        assertEquals(new Coordinates(1,3,'N'), testRover.getCoordinates(),"Check method ahead is correct");
    }

    @Test
    void move() {

    }
}