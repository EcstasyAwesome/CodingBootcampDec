package com.kovalevskyi.academy.codingbootcamp.week1.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

  @Test
  void sum() {
    var left = new Point(2, 3);
    var right = new Point(-80, 100);

    var result = left.sum(right);

    assertEquals(-78, result.getX());
    assertEquals(103, result.getY());
  }

  @Test
  void getX() {
    var point = new Point(1, 2);

    assertEquals(1, point.getX());
  }

  @Test
  void getY() {
    var point = new Point(1, 2);

    assertEquals(2, point.getY());
  }

  @Test
  void updateX() {
    var newX = 15;
    var point = new Point(1, 2);
    var newPoint = point.updateX(newX);

    assertEquals(newX, newPoint.getX());
  }

  @Test
  void updateY() {
    var newY = 15;
    var point = new Point(1, 2);
    var newPoint = point.updateY(newY);

    assertEquals(newY, newPoint.getY());
  }

  @Test
  void distanceTo() {
    var x1 = 2;
    var x2 = 3;
    var y1 = -80;
    var y2 = 100;

    var left = new Point(x1, y1);
    var right = new Point(x2, y2);

    var expectedDistance = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    assertEquals(expectedDistance, left.distanceTo(right));
  }

  @Test
  void distanceToWithThatNull() {
    var x1 = 2;
    var y1 = -80;

    var left = new Point(x1, y1);
    var right = (Point) null;

    try {
      left.distanceTo(right);
      fail();
    } catch (NullPointerException e) {
    }
  }

  @Test
  void testEquals() {
    var left = new Point(100, 200);
    var left2 = new Point(100, 200);
    var right = new Point(100, 300);

    assertTrue(left.equals(left2));
    assertFalse(left.equals(right));
    assertFalse(left.equals(null));
    assertFalse(left.equals("1"));
  }

  @Test
  void testHashCode() {
    var pointOne = new Point(100, 200);
    var pointOneDuplicate = new Point(100, 200);
    var pointTwo = new Point(-10, -50);
    assertEquals(pointOne.hashCode(), pointOneDuplicate.hashCode());
    assertNotEquals(pointOne.hashCode(), pointTwo.hashCode());
  }

  @Test
  void testToString() {
    var point = new Point(100, 200);

    assertEquals("Point{X: 100, Y: 200}", point.toString());
  }

  @Test
  void testCompareTo() {
    var pointLeft = new Point(100, 200);
    var pointRight = new Point(-10, -50);
    assertTrue(pointLeft.compareTo(pointRight) > 0);
    assertTrue(pointRight.compareTo(pointLeft) < 0);
    assertTrue(pointLeft.compareTo(pointLeft) == 0);
  }

  @Test
  void testCompareToWithNull() {
    var pointLeft = new Point(100, 200);
    var pointRight = (Point) null;

    try {
      pointLeft.compareTo(pointRight);
      fail();
    } catch (NullPointerException e) {
    }
  }
}
