class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // No-argument constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours, minutes, and seconds as arguments
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Method to set a valid time
    public void setTime(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time!");
        }
    }

    // Display function to display all data members
    public void display() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }

    // Example usage
    
}
public class Graded_task_5{
    public static void main(String[] args) {
        Time time1 = new Time();  // Create a Time object with default time (0:0:0)
        time1.display();

        Time time2 = new Time(12, 30, 45);  // Create a Time object with time (12:30:45)
        time2.display();

        Time time3 = new Time(25, 70, 90);  // Attempt to set an invalid time (25:70:90)
        time3.display();  // Invalid time, so default values will be displayed
    }
}
