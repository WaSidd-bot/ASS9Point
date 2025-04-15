public class Point {

    private double x = 0;
    private double y = 0;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

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

    public void displayCoordinate() {
        System.out.println("(" + GetX() + ", " + GetY() + ")");
    }

    public Point difference(Point p) {
        double pointDiffx = this.GetX() - p.GetX();
        double pointDiffy = this.GetY() - p.GetY();

        Point diffPoint = new Point(pointDiffx, pointDiffy);
        return diffPoint;
    }

    public Point sum(Point p) {
        double pointDiffx = this.GetX() + p.GetX();
        double pointDiffy = this.GetY() + p.GetY();

        Point diffPoint = new Point(pointDiffx, pointDiffy);
        return diffPoint;
    }

    public double distance(Point p) {
        double distanceX = Math.pow(this.GetX() - p.GetX(), 2);
        double distanceY = Math.pow(this.GetY() - p.GetY(), 2);

        double distance = distanceX + distanceY;
        return Math.sqrt(distance);
    }

    public Point Midpoint(Point a) {
        double midPointX = (this.GetX() + a.GetX()) / 2;
        double midPointY = (this.GetY() + a.GetY()) / 2;

        Point midPoint = new Point(midPointX, midPointY);
        return midPoint;
    }

    public double slope(Point a) {
        double slopeX = this.GetX() - a.GetX();
        double slopeY = this.GetY() - a.GetY();

        double slope = slopeY / slopeX;
        return slope;
    }

    public double Yintercept(Point a) {
        double slope = this.slope(a);
        return this.GetY() - slope * this.GetX();
    }

    public void linearEquation(Point a) {
        double Yintercept = this.Yintercept(a);

        if (Yintercept > 0) {
            System.out.println("y = " + slope(a) + "x + " + Yintercept);
        } else if (Yintercept == 0) {
            System.out.println("y = " + slope(a) + "x");
        } else {
            System.out.println("y = " + slope(a) + "x " + Yintercept);
        }
    }
}   // make sure capitals are in order with java doc
