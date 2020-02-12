package Main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class MainMethod {

    public static void main(String[] args) {
        Input missionInput = new Input();
        Plateau missionPlateau = missionInput.plateauSize;
        MarsRover roverOne = new MarsRover(missionInput.roverOneCoordinates, missionPlateau);
        MarsRover roverTwo = new MarsRover(missionInput.roverTwoCoordinates, missionPlateau);
        roverOne.move(missionInput.roverOneMovements);
       // System.out.println("Rover TWO");
        roverTwo.move(missionInput.roverTwoMovements);
    }
}
