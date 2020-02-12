package Main;

public class MarsRover {
    private Coordinates coordinates;
    private Plateau plateau;

    //constructor
    public MarsRover(Coordinates coordinates1, Plateau plateau) {
        this.coordinates = coordinates1;
        this.plateau = plateau;
    }

    //getters and setters
    public Coordinates getCoordinates() {
        return coordinates;
    }
    public Plateau getPlateau() {
        return plateau;
    }
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public void rotateLeft() {
        System.out.println("Rotating left...");
        if (this.getCoordinates().getCardinal() == 'N') {
            this.getCoordinates().setCardinal('W');
        } else if (this.getCoordinates().getCardinal() == 'E') {
            this.getCoordinates().setCardinal('N');
        } else if (this.getCoordinates().getCardinal() == 'S') {
            this.getCoordinates().setCardinal('E');
        } else if (this.getCoordinates().getCardinal() == 'W') {
            this.getCoordinates().setCardinal('S');
        }
    }
    public void rotateRight() {
        System.out.println("Rotating right...");
        if (getCoordinates().getCardinal() == 'N') {
            getCoordinates().setCardinal('E');
        }
        if (getCoordinates().getCardinal() == 'E') {
            getCoordinates().setCardinal('S');
        }
        if (getCoordinates().getCardinal() == 'S') {
            getCoordinates().setCardinal('W');
        }
        if (getCoordinates().getCardinal() == 'W') {
            getCoordinates().setCardinal('N');
        }
    }
    public void ahead() {
        System.out.println("Current cardinal " + this.getCoordinates().getCardinal());
        if (getCoordinates().getCardinal() == 'N') {
            if (getCoordinates().getY() < plateau.getY()) {
                getCoordinates().setY(getCoordinates().getY() + 1);
            } else {
                System.out.println("This Rover cannot move forward");
            }
        } else if (getCoordinates().getCardinal() == 'E') {
            if (getCoordinates().getX() < plateau.getX()) {
                getCoordinates().setX(getCoordinates().getX() + 1);
            } else {
                System.out.println("This Rover cannot move forward");
            }
        } else if (getCoordinates().getCardinal() == 'S') {
            if (getCoordinates().getY() > 0) {
                getCoordinates().setY(getCoordinates().getY() - 1);
            } else {
                System.out.println("This Rover cannot move forward");
            }
        } else if (getCoordinates().getCardinal() == 'W') {
            if (getCoordinates().getX() > 0) {
                getCoordinates().setX(getCoordinates().getX() - 1);
            } else {
                System.out.println("This Rover cannot move forward");
            }
        } else {
            System.out.println("Enter a valid order (L/R/M) ");
        }
    }

    public void move(char[] C) {
        for (char c : C) {
            System.out.println(c);
            if (c == 'L') {
                this.rotateLeft();
            } else if (c == 'R') {
                this.rotateRight();
            } else if (c == 'M') {
                this.ahead();
                System.out.println("New position " + this.getCoordinates().getX() +" "+ this.getCoordinates().getY()+" "+this.getCoordinates().getCardinal());
            }
        }
    }
}
