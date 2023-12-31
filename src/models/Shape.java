package models;
import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> pointsArrayList;

    // Constructor to initialize the Shape with an empty ArrayList of points
    public Shape(){
        pointsArrayList = new ArrayList<Point>();
    }

    // Method to add a Point to pointsArrayList
    public void addPoint(Point point) {
        pointsArrayList.add(point);
    }
    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        int size = pointsArrayList.size();
        for (int i = 0; i < size; i++) {
            Point currentPoint = pointsArrayList.get(i);
            Point nextPoint = pointsArrayList.get((i + 1) % size);
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        return perimeter;
    }

    // Method to find the longest side of shape
    public double getLongestSide() {
        double maxLengthside = 0;
        double side;

        double longestSide = 0;
        for (int i = 0; i < pointsArrayList.size(); i++) {
            Point currentPoint = pointsArrayList.get(i);
            Point nextPoint = pointsArrayList.get((i + 1) % pointsArrayList.size());
            double distance = currentPoint.distanceTo(nextPoint);
            if (distance > longestSide) {
                longestSide = distance;
            }
        }
        return longestSide;
    }

    // Method to calculate the average length of the sides of the shape.
    public double getAverageSide() {
        double perimeter = calculatePerimeter();

        return perimeter  / pointsArrayList.size();
    }
}