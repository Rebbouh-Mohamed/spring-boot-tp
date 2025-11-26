public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) x = 0;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0) y = 0;
        this.y = y;
    }

    public int DistanceSquared(Point p){
        int dx=this.getX()-p.getX();
        int dy=this.getY()-p.getY();
        return  dx * dx + dy * dy;
    }
}