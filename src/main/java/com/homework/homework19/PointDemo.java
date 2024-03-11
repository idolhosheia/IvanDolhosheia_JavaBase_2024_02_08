package com.homework.homework19;

public class PointDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(12, 23);
        Point secondPoint = new Point(34, 67);
        double distanceValue1 = firstPoint.distanceTo(secondPoint);
        System.out.println("distance to point: " + distanceValue1);

        double distanceValue2 = Point.distanceBetweenTwoPoints(firstPoint, secondPoint);
        System.out.println("distance between two points: " + distanceValue2);

        Point point1 = new Point(secondPoint);
    }
}