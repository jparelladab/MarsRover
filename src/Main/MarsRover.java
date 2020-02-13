package Main;

import java.util.Arrays;

//This class contains the Rovers' attributes and methods, including "move" with its accessory methods rotateRight(), rotateLeft() and ahead()
public class MarsRover {
    private Coordinates coordinates;
    private Plateau plateau;
    private String id;

    //constructor
    public MarsRover(String id, Coordinates coordinates1, Plateau plateau) {
        this.id = id;
        this.coordinates = coordinates1;
        this.plateau = plateau;
        System.out.println(this.toString());
    }

    //getters and setters

    public Plateau getPlateau() {
        return this.plateau;
    }
    public String getId(){ return this.id; }
    public int getX() {return this.coordinates.getX();};
    public int getY() {return this.coordinates.getY();};
    public int getCardinal() {return this.coordinates.getCardinal();};
    public void setX(int x) {this.coordinates.setX(x);};
    public void setY(int y) {this.coordinates.setY(y);};
    public void setCardinal(char c) {this.coordinates.setCardinal(c);};

    @Override
    public String toString() {
        return "Placing rover " + id +
                " at coordinates " + coordinates;
    }

    private void rotateLeft() {
        if (this.getCardinal() == 'N') {
            this.setCardinal('W');
        } else if (this.getCardinal() == 'E') {
            this.setCardinal('N');
        } else if (this.getCardinal() == 'S') {
            this.setCardinal('E');
        } else if (this.getCardinal() == 'W') {
            this.setCardinal('S');
        } else {
            System.out.println("Vehicle out of bounds");
        }
    }
    private void rotateRight() {
        if (this.getCardinal() == 'N') {
            this.setCardinal('E');
        }
        else if (this.getCardinal() == 'E') {
            this.setCardinal('S');
        }
        else if (this.getCardinal() == 'S') {
            this.setCardinal('W');
        }
        else if (this.getCardinal() == 'W') {
            this.setCardinal('N');
        }
        else {
            System.out.println("Vehicle out of bounds");
        }
    }
    private void ahead() {
        if (getCardinal() == 'N') {
            if (this.getY() < plateau.getY()) {
                this.setY(this.getY() + 1);
            } else {
                this.coordinates.setCoordinates(-1, -1, 'Z');
            }
        } else if (this.getCardinal() == 'E') {
            if (this.getX() < plateau.getX()) {
                this.setX(this.getX() + 1);
            } else {
                this.coordinates.setCoordinates(-1, -1, 'Z');
            }
        } else if (this.getCardinal() == 'S') {
            if (this.getY() > 0) {
                this.setY(this.getY() - 1);
            } else {
                this.coordinates.setCoordinates(-1, -1, 'Z');
            }
        } else if (this.getCardinal() == 'W') {
            if (this.getX() > 0) {
                this.setX(this.getX() - 1);
            } else {
                this.coordinates.setCoordinates(-1, -1, 'Z');
            }
        } else {
            System.out.println("Vehicle out of bounds");
        }
    }

    public Coordinates move(char[] C) {
        for (char c : C) {
            //System.out.println(c);
            if (c == 'L') {
                this.rotateLeft();
            } else if (c == 'R') {
                this.rotateRight();
            } else if (c == 'M') {
                this.ahead();
            }
        }
        System.out.println("Final coordinates for rover "+this.id+": "+this.coordinates);
        return this.coordinates;
    }
}
