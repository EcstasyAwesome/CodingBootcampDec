package com.kovalevskyi.academy.codingbootcamp.week1.day1;

public class Point implements Comparable<Point> {

  private final int coordinateX;

  private final int coordinateY;

  public Point(final int coordinateX, final int coordinateY) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }

  public Point sum(final Point that) {
    return new Point(that.getX() + coordinateX, that.getY() + coordinateY);
  }

  public int getX() {
    return coordinateX;
  }

  public int getY() {
    return coordinateY;
  }

  public Point updateX(int newX) {
    return new Point(newX, coordinateY);
  }

  public Point updateY(int newY) {
    return new Point(coordinateX, newY);
  }

  public int distanceTo(Point that) {
    final int powOfX = coordinateX - that.getX();
    final int powOfY = coordinateY - that.getY();
    return (int) Math.sqrt(powOfX * powOfX + powOfY * powOfY);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    Point point = (Point) o;
    return point.getX() == coordinateX && point.getY() == coordinateY;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + coordinateX;
    result = 31 * result + coordinateY;
    return result;
  }

  @Override
  public String toString() {
    return String.format("Point{X: %d, Y: %d}", coordinateX, coordinateY);
  }

  @Override
  public int compareTo(Point that) {
    return (coordinateX + coordinateY) - (that.getX() + that.getY());
  }
}
