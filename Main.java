// java 102
package learning;


import java.util.ArrayList;

import learning.Point; 

public class Main {
    Point point = new Point(4, 3);
    ArrayList<String> arr = new ArrayList<>(); {
    arr.add("Hello");
    arr.add("World");
    System.out.println(arr);
    arr.set(0, "Goodbye");
    System.out.println(arr);
    }
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }
    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    public interface Shape {
        double area();
        public double perimeter();
        String toString();
        /** 
        * @return Whether point p is inside of the shape.
        */
        public boolean isInside(Point p);
        /** 
        * @return Whether point p part of/on the border of the shape.
        */
        public boolean isOn(Point p);
    
        /** 
        * @param x How much to translate the shape by in the + x direction.
        * @param y How much to translate the shape by in the + y direction.
        * @return The shape that results from the translation.
        */
        public Shape translate(double x, double y);
	/** 
	* @return The shape that results from scaling by k.
	*/
	public Shape scale(double k);
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
	Shape[] scaled = new Shape[shapes.length];
	for (int i = 0; i < shapes.length; i++) {
		scaled[i] = shapes[i].scale(k);
	}
	return scaled;
}
    public class A {
	    protected final double field1;
	    protected final double field2;

	    public A(double field1, double field2) {
		    System.out.println("the constructor of A has been called");
	    	this.field1 = field1;
	    	this.field2 = field2;
	    }

	    public void method1() {
	    	System.out.println("method 1 of A has been called");
	    }
	
	    public void method2() {
	    	System.out.println("method 2 of A has been called");
	    }
    }
    public class B extends A {
        public final String bField;
        
        public B(double field1and2, String bField) {
            super(field1and2, field1and2);
            this.bField = bField;
            System.out.println("the constructor of B has been called");
        }
    
        @Override 
        public void method2() {
            System.out.println("method 2 of B has been called");
        }
    
        public double field() {
            return super.field1;
        }
    }
    public class LibraryItem {
        public final String title;
        public final String itemId;
        
        protected boolean isCheckedOut = false;
    
        public LibraryItem(String title, String itemId) {
            this.title = title;
            this.itemId = itemId;
        }
    
        public boolean available() {
            return !isCheckedOut;
        }
    
        public void checkOut() {
            isCheckedOut = true;
        }
    
        public void returnItem() {
            isCheckedOut = false;
        }
    }
    public class Book extends LibraryItem {
        public final String author;
        public final int pageCount;
    
        public Book(String title, String itemId, String author, int pageCount) {
            super(title, itemId);
            this.author = author;
            this.pageCount = pageCount;
        }
    
        @Override
        public String toString() {
            return "Book: " + title + " by " + author + ", " + 
                    pageCount + " pages";
        }
    }
    public class DVD extends LibraryItem {
        public final double runtime;
    
        public DVD(String title, String itemId, double runtime) {
            super(title, itemId);
            this.runtime = runtime;
        }
    
        @Override
        public String toString() {
            return "DVD: " + title + ", Runtime: " + runtime + " minutes";
        }
    }
    public static void returnAll(LibraryItem[] items) { // returnall review
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItems = new ArrayList<>(); //availableitems review

        for (LibraryItem item : items) {
            if (item.available()) {
                availableItems.add(item);
            }
        }

        return availableItems; 
    }
    public Main() {
        Point xTranslation = point.translateX(3); // should be (7, 3)
        Point yTranslation = point.translateY(-7); // should be (4, -4)
        Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)
        System.out.println("x: " + point.x + "y: " + point.y);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        System.out.println("point: " + point);
        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);
        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));
    }
    public static void main(String[] args) {
        new Main();
	}
}