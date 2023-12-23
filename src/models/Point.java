package models;
public class Point {
    private double x;
    private double y;

    // Method to calculate the distance from current point to the dest. point d=√((x 2  – x 1)² + (y 2  – y 1)²)
    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
    }

    // Constructor initializes the x and y instance variables with these values.
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to provide a string representation of the Point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
