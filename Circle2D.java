/*
 * Name: Circle2D
 * Purpose: Represents a circle in a 2D plane it has methods that calculate the area, perimeter, if there is a point within the cirlce
 *          if there is an overlapping circle, and if a circle is contained within another circle.
 * Programmer: Alex Kurcan
 * Date: 10/24/2025
 */


public class Circle2D {

    // Data fields
    private double x;
    private double y;
    private double radius;

    // No-arg constructor
    public Circle2D() {
        x = 0.0;
        y = 0.0;
        radius = 1.0;
    }

    // Constructor with parameters
    public Circle2D(double newX, double newY, double newRadius) {
        x = newX;
        y = newY;
        radius = newRadius;
    }

    // Get methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Area method
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    // Perimeter method
    public double getPerimeter() {
        return 2 * 3.14159 * radius;
    }

    // Point containment method
    public boolean contains(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= radius;
    }

    // Circle containment method
    public boolean contains(Circle2D c) {
        double dx = c.getX() - x;
        double dy = c.getY() - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance + c.getRadius() <= radius;
    }

    // Overlap method
    public boolean overlaps(Circle2D c) {
        double dx = c.getX() - x;
        double dy = c.getY() - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < (radius + c.getRadius());
    }

    // Tester method
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(0, 0, 5);
        Circle2D c2 = new Circle2D(2, 2, 2);

        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Contains the point (1,1): " + c1.contains(1, 1));
        System.out.println("Contains a second Circle? " + c1.contains(c2));
        System.out.println("Overlaps with a second Circle? " + c1.overlaps(c2));
    }
}
