package Main;

public class MarsRover {
    private int x;
    private int y;
    private char cardinal;
    private Plateau plateau;

    //constructor
    public MarsRover(int x, int y, char cardinal, Plateau plateau) {
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
        this.plateau = plateau;
    }

    //getters and setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getCardinal() {
        return cardinal;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCardinal(char cardinal) {
        this.cardinal = cardinal;
    }

    public void move(char C) {
        if (C == 'L') {
            if (getCardinal() == 'N') {
                setCardinal('W');
            } else if (getCardinal() == 'E') {
                setCardinal('N');
            } else if (getCardinal() == 'S') {
                setCardinal('E');
            } else if (getCardinal() == 'W') {
                setCardinal('S');
            }
        } else if (C == 'R') {
            if (getCardinal() == 'N') {
                setCardinal('E');
            }
            if (getCardinal() == 'E') {
                setCardinal('S');
            }
            if (getCardinal() == 'S') {
                setCardinal('W');
            }
            if (getCardinal() == 'W') {
                setCardinal('N');
            }
        } else if (C == 'M') {
            if (getCardinal() == 'N') {
                if (getY() < plateau.getY()) {
                    setY(getY() + 1);
                } else {
                    System.out.println("This Rover cannot move forward");
                }
            } else if (getCardinal() == 'E') {
                if (getX() < plateau.getX()) {
                    setX(getX() + 1);
                } else {
                    System.out.println("This Rover cannot move forward");
                }
            } else if (getCardinal() == 'S') {
                if (getY() > 0) {
                    setY(getY() - 1);
                } else {
                    System.out.println("This Rover cannot move forward");
                }
            } else if (getCardinal() == 'W') {
                if (getX() > 0) {
                    setX(getX() - 1);
                } else {
                    System.out.println("This Rover cannot move forward");
                }
            } else {
                System.out.println("Enter a valid order (L/R/M) ");
            }
        }
    }
}
