public class Circle {
    private double radius; // Private instance variable to store radius
    final double PI = 3.14159; // Declare PI as a final constant

    // Constructor to initialize the radius
    public Circle(double r) {
        radius = r;
    }

    // Method to calculate the area of the circle
    public double findArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.8);
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.findArea());
    }
}
