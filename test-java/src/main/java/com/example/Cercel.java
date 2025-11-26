public class Cercel {
    private Point center;
    private double reyon;

    public Cercel(Point p, double R) {
        this.center = p;
        this.reyon = R;
    }

    public boolean PointBelongCercel(Point p) {
        if (p == null || center == null) {
            return false;  
        }
        int d=center.DistanceSquared(p);
        return d <=(int) (reyon*reyon);
    }

    public Point getCenter() {
        return center;
    }

    public double getReyon() {
        return reyon;
    }
}