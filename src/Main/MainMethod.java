package Main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class MainMethod {

    public static void main(String[] args) {
        System.out.println("Welcome on board of a MarsRover new mission.");
        Input missionInput = new Input();
        Plateau missionPlateau = missionInput.plateauSize;
        MarsRover roverOne = new MarsRover("O.N.E", missionInput.roverOneCoordinates, missionPlateau);
        MarsRover roverTwo = new MarsRover("T.W.O", missionInput.roverTwoCoordinates, missionPlateau);
        roverOne.move(missionInput.roverOneMovements);
        roverTwo.move(missionInput.roverTwoMovements);
    }
}
