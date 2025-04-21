import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello operator, please enter two points into the terminal:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Now, please enter another two points:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        scan.close();

        Point p1 = new Point(x1, y1); // two points for reassignment based on methods
        Point p2 = new Point(x2, y2);

        System.out.println("Point 1 coordinates"); // All display coordinates
        p1.displayCoordinate();
        System.out.println("Point 2 coordinates");
        p2.displayCoordinate();

        System.out.println("Point 1 minus Point 2"); // all differences between points
        Point diff12 = p1.difference(p2);
        diff12.displayCoordinate();

        System.out.println("Point 2 minus Point 1");
        Point diff21 = p2.difference(p1);
        diff21.displayCoordinate();

        System.out.println("All points added together"); // sum of points
        Point sum = p2.sum(p1);
        sum.displayCoordinate();

        // Distance calculations
        System.out.println("Distance between the two points");
        System.out.println(p1.distance(p2));

        // Midpoints of the two
        System.out.println("Midpoint of the two points");
        Point mid = p2.midpoint(p1);
        mid.displayCoordinate();

        // Slope of two points
        System.out.println("Slope of the two points");
        System.out.println(p2.slope(p1));

        // Y intercept of two points
        System.out.println("Y intercept of the two points");
        System.out.println(p1.yIntercept(p2));

        // Linear equation
        System.out.println("Linear equation for two points");
        p1.linearEquation(p2);
    }
}
