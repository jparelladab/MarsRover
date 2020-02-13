package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test for MarsRover methods
class MarsRoverTest {
    MarsRover testRover = new MarsRover(new Coordinates(1,2,'N'), new Plateau(5,5));

    @Test
    void rotateLeft() {
        testRover.rotateLeft();
        assertEquals('W', testRover.getCoordinates().getCardinal(),"Check rotateLeft is correct");
        testRover.rotateLeft();
        assertEquals('S', testRover.getCoordinates().getCardinal(),"Check rotateLeft is correct");
        testRover.rotateLeft();
        assertEquals('E', testRover.getCoordinates().getCardinal(),"Check rotateLeft is correct");
        testRover.rotateLeft();
        assertEquals('N', testRover.getCoordinates().getCardinal(),"Check rotateLeft is correct");
    }

    @Test
    void rotateRight() {
        testRover.rotateRight();
        assertEquals('E', testRover.getCoordinates().getCardinal(),"Check rotateRight is correct");
        testRover.rotateRight();
        assertEquals('S', testRover.getCoordinates().getCardinal(),"Check rotateRight is correct");
        testRover.rotateRight();
        assertEquals('W', testRover.getCoordinates().getCardinal(),"Check rotateRight is correct");
        testRover.rotateRight();
        assertEquals('N', testRover.getCoordinates().getCardinal(),"Check rotateRight is correct");
    }

    @Test
    void ahead() {
        testRover.ahead();
        assertEquals(new Coordinates(1,3,'N').toString(), testRover.getCoordinates().toString(),"Check method ahead is correct");
        testRover.ahead();
        assertEquals(new Coordinates(1,4,'N').toString(), testRover.getCoordinates().toString(),"Check method ahead is correct");
        testRover.ahead();
        assertEquals(new Coordinates(1,5,'N').toString(), testRover.getCoordinates().toString(),"Check method ahead is correct");
    }

    @Test
    void move() {
        assertEquals(new Coordinates(1,5,'N').toString(),testRover.move(new char[] {'M', 'M', 'M'}).toString(), "Check move method");
        assertEquals(new Coordinates(1,4,'S').toString(),testRover.move(new char[] {'L', 'L', 'M'}).toString(), "Check move method");
        assertEquals(new Coordinates(1,1,'S').toString(),testRover.move(new char[] {'M', 'M', 'M'}).toString(), "Check move method");

    }
}