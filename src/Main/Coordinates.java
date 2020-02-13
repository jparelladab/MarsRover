package Main;

public class Coordinates {
    private int x;
    private int y;
    private char cardinal;

    public Coordinates(int x, int y, char cardinal){
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    @Override
    public String toString() {
        return x + " "+ y + " "+ cardinal;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public char getCardinal() {
        return cardinal;
    }
    public void setCardinal(char cardinal) {
        this.cardinal = cardinal;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
}
