package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//This class fetches the input from the InputFile.txt, creates the Plateau, creates the Coordinates for both rovers and stores the rovers' movements
public class Input {
    Plateau plateauSize;
    Coordinates roverOneCoordinates;
    Coordinates roverTwoCoordinates;
    char[] roverOneMovements;
    char[] roverTwoMovements;
    public Input(){
        File file = new File("src/InputFile.txt");
        try {
            Scanner input = new Scanner(file);
            char[] firstLine = input.nextLine().replaceAll(" ", "").toCharArray();
            this.plateauSize = new Plateau(
                    Character.getNumericValue(firstLine[0]),
                    Character.getNumericValue(firstLine[1]));
            char[] secondLine = input.nextLine().replaceAll(" ", "").toCharArray();
            this.roverOneCoordinates = new Coordinates(
                    Character.getNumericValue(secondLine[0]),
                    Character.getNumericValue(secondLine[1]),
                    secondLine[2]);
            this.roverOneMovements = input.nextLine().replaceAll(" ", "").toCharArray();
            char[] fourthLine = input.nextLine().replaceAll(" ", "").toCharArray();
            this.roverTwoCoordinates = new Coordinates(
                    Character.getNumericValue(fourthLine[0]),
                    Character.getNumericValue(fourthLine[1]),
                    fourthLine[2]);
            this.roverTwoMovements = input.nextLine().replaceAll(" ", "").toCharArray();
            input.close();
            System.out.println("Input correctly fetched from file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
