package Main;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class MainMethod {


    public static void main(String[] args) {
        File file = new File("/Users/joanparellada/code/IdeaProjects/MarsRover/src/InputFile.txt");
        try {
            Scanner input = new Scanner(file);
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
