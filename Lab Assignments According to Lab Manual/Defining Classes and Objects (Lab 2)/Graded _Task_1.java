class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 0.0;
    }

    // Constructor with radius as an argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Example usage
    public static void main(String[] args) {
        Circle circle1 = new Circle();  // Create a circle object with default radius of 0.0
        System.out.println("Circumference: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(5.0);  // Create a circle object with radius of 5.0
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}
