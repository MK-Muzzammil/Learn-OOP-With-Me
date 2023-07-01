class CourseResult{
    public String studentName;
    public String studentCourse;
    public String grade;

    public void display(){
        System.out.println("Student name: "+studentName+" Student Course: "+studentCourse+" Grade: "+grade);
    }
}






public class Non_Graded_Task_1 {
    public static void main(String [] args){
        CourseResult student1=new CourseResult();
        student1.studentName="Muzzammil";
        student1.studentCourse="OOP";
        student1.grade="A";

        CourseResult student2=new CourseResult();
        student2.studentName="Ali";
        student2.studentCourse="OOP";
        student2.grade="B";

        student1.display();
        System.out.println("====================================================");
        student2.display();
    }
}
