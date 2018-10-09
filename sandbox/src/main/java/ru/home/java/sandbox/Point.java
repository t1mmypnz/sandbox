package ru.home.java.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p){
    double yLength = p.y - this.y;
    double xLength = p.x - this.y;
    return (Math.sqrt(xLength*xLength + yLength*yLength));
  }

}
