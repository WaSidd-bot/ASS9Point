public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double GetX() {
        return x;
    }

    public double GetY() {
        return y;
    }

    public double add(Point p) {
        return new Point(this.p + p.GetX(), this.p + p.GetY());
    }

}   

