package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Test for MarsRover methods
class MarsRoverTest {
    MarsRover testRover = new MarsRover("T.E.S.T",new Coordinates(1,2,'N'), new Plateau(5,5));

    //by testing move we can test all other accessory methods like rotateLeft(), rotateRight() or ahead()
    @Test
    void move() {
        assertEquals(new Coordinates(1,5,'N').toString(),testRover.move(new char[] {'M', 'M', 'M'}).toString(), "Check move method");
        assertEquals(new Coordinates(1,5,'E').toString(),testRover.move(new char[] {'L', 'L', 'L'}).toString(), "Check rotateLeft and move");
        assertEquals(new Coordinates(1,5,'W').toString(),testRover.move(new char[] {'R', 'R'}).toString(), "Check move method");
        assertEquals(new Coordinates(1,3,'S').toString(),testRover.move(new char[] {'L', 'M', 'M'}).toString(), "Check move method");
        assertEquals(new Coordinates(-1,-1,'Z').toString(),testRover.move(new char[] {'R', 'R', 'M', 'M', 'M'}).toString(), "Should go out of bounds");
        assertEquals(new Coordinates(-1,-1,'Z').toString(),testRover.move(new char[] {'R', 'R', 'R'}).toString(), "Should stay out of bounds");
    }
}