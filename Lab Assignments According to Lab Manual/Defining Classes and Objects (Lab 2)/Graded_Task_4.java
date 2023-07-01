class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    // No-argument constructor
    public Marks() {
        this.mark1 = 0;
        this.mark2 = 0;
        this.mark3 = 0;
    }

    // Constructor with three marks as arguments
    public Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate and return the sum of marks
    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }

    // Example usage
    
}



public class Graded_Task_4 {
    public static void main(String[] args) {
        Marks marks1 = new Marks();  // Create a Marks object with default marks (0, 0, 0)
        System.out.println("Sum of marks: " + marks1.calculateSum());

        Marks marks2 = new Marks(80, 90, 75);  // Create a Marks object with marks (80, 90, 75)
        System.out.println("Sum of marks: " + marks2.calculateSum());
    }
    
}
