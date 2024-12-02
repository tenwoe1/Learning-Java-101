package learning;

public class Point {
    public final double x;
    public final double y;
    public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
    public static Point centerOfMass(Point[] points) { //Practice Problem 1
      if (points == null || points.length == 0) { //Checks arrays for null
          return null;
      }
  
      double sumX = 0; //Variable to store x cords
      double sumY = 0; //Variable to store y cords
  
      for (Point p : points) {
          sumX += p.x; //Adds all x cords
          sumY += p.y; //Adds all y cords
      }
  
      double centerX = sumX / points.length; //Gets averages for x cords
      double centerY = sumY / points.length; //Gets averages for y cords
  
      return new Point((int) centerX, (int) centerY); //new point
  }
    public double angle() { // Practice Problem 2
      double angleRadians = Math.atan2(this.y, this.x);
      double angleDegrees = Math.toDegrees(angleRadians); // Radians to Degrees
      return angleDegrees;
  }
  public Point rotate90() { // Rotate 90 degrees.
    return new Point(-this.y, this.x);
  }
  public Point rotate(double theta) { // Challenge
    // Convert theta from degrees to radians
    double radians = Math.toRadians(theta);

    // Apply the 2D rotation matrix
    int newX = (int) Math.round(this.x * Math.cos(radians) - this.y * Math.sin(radians));
    int newY = (int) Math.round(this.x * Math.sin(radians) + this.y * Math.cos(radians));
    return new Point(newX, newY);
}
  public Point translateX(double t) {
		return new Point(x + t, y);
	}
  public Point translateY(double t){
    return new Point(x, y + t);
  }
  @Override
  public String toString() {
        return "(" + x + ", " + y + ")";
  }
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

}
