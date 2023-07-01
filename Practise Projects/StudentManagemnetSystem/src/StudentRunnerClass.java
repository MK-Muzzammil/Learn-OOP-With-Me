import java.util.Scanner;

public class StudentRunnerClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//Simple Approach
//        Student stu=new Student();
//        stu.enrollCourses();
//        stu.PayTutionFee();
//        System.out.println( stu.toString());

        //Eficient Approach

        System.out.println("Please enetr how many Students u want to enter");
        int num= input.nextInt();
        Student[] objArr=new Student[num];
        for(int i=0;i<num;i++){
            objArr[i]=new Student();
            objArr[i].enrollCourses();
            objArr[i].PayTutionFee();

            System.out.printf("Information of Student :%d%n is %s%n ",i+1,objArr[i].toString());
        }
    }

}
