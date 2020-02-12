package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
            this.plateauSize = new Plateau(Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[0]),
                    Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[1]));
            this.roverOneCoordinates = new Coordinates(Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[0]),
                    Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[1]),
                    input.nextLine().replaceAll(" ", "").toCharArray()[2]) ;
            this.roverOneMovements = input.nextLine().replaceAll(" ", "").toCharArray();
            this.roverTwoCoordinates = new Coordinates(Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[0]),
                    Character.getNumericValue(input.nextLine().replaceAll(" ", "").toCharArray()[1]),
                    input.nextLine().replaceAll(" ", "").toCharArray()[2]) ;
            this.roverTwoMovements = input.nextLine().replaceAll(" ", "").toCharArray();
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
