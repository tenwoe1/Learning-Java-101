package learning;

import learning.Main.Shape;

public class Square implements Shape { // Square Review
    public final Point corner;
    public final double sideLength;

    /**
    * @param corner The bottom left corner of the square
    * @param sideLength
    */
    public Square(Point corner, double sideLength) {
        this.corner = corner;
        this.sideLength = sideLength;
    }

    public double area() {
        return sideLength * sideLength; // Area = sideLength^2
    }
    
    public double perimeter() {
        return 4 * sideLength; // Perimeter = 4 * sideLength
    }

    /** 
    * @return Whether point p is inside of the square.
    */
    public boolean isInside(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        return 0 < xDist && xDist < sideLength &&
               0 < yDist && yDist < sideLength;
    }

    /** 
    * @return Whether point p is part of/on the border of the square.
    */
    public boolean isOn(Point p) {
        return (p.x == corner.x || p.x == corner.x + sideLength) &&
               (p.y >= corner.y && p.y <= corner.y + sideLength) ||
               (p.y == corner.y || p.y == corner.y + sideLength) &&
               (p.x >= corner.x && p.x <= corner.x + sideLength);
    }
    
    /** 
    * @param x How much to translate the square by in the + x direction.
    * @param y How much to translate the square by in the + y direction.
    * @return The square that results from the translation.
    */
    public Square translate(double x, double y) {
        Point newCorner = new Point(corner.x + x, corner.y + y);
        return new Square(newCorner, sideLength);
    }

    /** 
    * @return The square that results from scaling the side length and maintaining the bottom left corner.
    */
    public Square scale(double k) {
        return new Square(corner, sideLength * k); // Scale side length by k
    }

    public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = corner; // bottom-left corner
        corners[1] = new Point(corner.x + sideLength, corner.y); // bottom-right corner
        corners[2] = new Point(corner.x, corner.y + sideLength); // top-left corner
        corners[3] = new Point(corner.x + sideLength, corner.y + sideLength); // top-right corner
        return corners;
    }

    @Override
    public String toString() {
        return "(corner: " + corner + "; side length: " + sideLength + ")";
    }
}
