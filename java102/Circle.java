package learning;

import learning.Main.Shape;

public class Circle implements Shape {
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
    public static Circle fromPoints(Point p1, Point p2, Point p3) { //Circle review

        double mx1 = (p1.x + p2.x) / 2;
        double my1 = (p1.y + p2.y) / 2;
        double mx2 = (p2.x + p3.x) / 2;
        double my2 = (p2.y + p3.y) / 2;

        double m1 = (p2.y - p1.y) / (p2.x - p1.x);
        double m2 = (p3.y - p2.y) / (p3.x - p2.x);

        double perpSlope1 = -1 / m1;
        double perpSlope2 = -1 / m2;

        double centerX = (perpSlope1 * mx1 - perpSlope2 * mx2 + my2 - my1) / (perpSlope1 - perpSlope2);
        double centerY = perpSlope1 * (centerX - mx1) + my1;

        Point center = new Point(centerX, centerY);

        double radius = Point.distance(p1, center);

        return new Circle(center, radius);
    }
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}
}