package learning;

import learning.Main.Shape;

public class RightTriangle implements Shape { //RightTriangle review
    private final Point corner;
    private final double base;  
    private final double height; 

    public RightTriangle(Point corner, double base, double height) {
        this.corner = corner;
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "RightTriangle [corner=" + corner + ", base=" + base + ", height=" + height + "]";
    }


    public static boolean similar(RightTriangle t1, RightTriangle t2) {

        double ratioBase = t1.base / t2.base;
        double ratioHeight = t1.height / t2.height;

        return Math.abs(ratioBase - ratioHeight) < 1e-9;  
    }

    @Override
    public boolean isInside(Point p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isInside'");
    }

    @Override
    public boolean isOn(Point p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isOn'");
    }

    @Override
    public Shape translate(double x, double y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'translate'");
    }

    @Override
    public Shape scale(double k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scale'");
    }
}
