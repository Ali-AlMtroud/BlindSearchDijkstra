public class Cell {
    int x;
    int y;

    Cell() {

    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void PrintCell() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }

}