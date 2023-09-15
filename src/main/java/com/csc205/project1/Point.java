package com.csc205.project1;

/**
 * Made with ChatGPT
 * Input: In Java, design a class called Point that represents a location in the Cartesian plane.
 * Include the following methods: setX(double x), setY(double y), setPoint(double x, double y), shiftX(double n),
 * shiftY(double n), distance(Point p2), rotate(double angle)
 */



public class Point {
    private double x;
    private double y;

    // Constructors
    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift methods
    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    // Calculate distance between two points
    public double distance(Point p2) {
        double deltaX = p2.x - this.x;
        double deltaY = p2.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Rotate the point by a given angle (in radians)
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }


}
