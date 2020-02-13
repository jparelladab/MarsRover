package Main;

public class Plateau {
    private int x;
    private int y;
    public Plateau(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(this.toString());
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Plateau's dimensions: " +
                "{x=" + x +
                ", y=" + y +
                '}';
    }
}
