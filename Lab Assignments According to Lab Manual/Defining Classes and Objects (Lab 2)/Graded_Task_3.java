class Distance {
    private int feet;
    private int inches;

    // No-argument constructor
    public Distance() {
        this.feet = 0;
        this.inches = 0;
    }

    // Constructor with feet and inches as arguments
    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Display function to display all data members
    public void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

    // Example usage

}





public class Graded_Task_3 {
        public static void main(String[] args) {
        Distance distance1 = new Distance();  // Create a distance object with default feet and inches
        distance1.display();

        Distance distance2 = new Distance(5, 10);  // Create a distance object with feet = 5 and inches = 10
        distance2.display();
    }    
}
