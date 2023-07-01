import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private String IdOfStudent;
    private String gradelevel;
    private int gradelevel1;
    private int totalBalance;

    private int costOfCourse=600;
    private static int uniqueID=1000;
    private String courses="";


    public Student(){
        //by different Approach 2 of grade level
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first Name : ");
        this.firstName=input.nextLine();

        System.out.println("Enter Last  Name : ");
        this.lastName=input.nextLine();

        System.out.println("1- for Frehser(1st Sem)\n2-for Junior(1st year)\n3-for Senior( in 2nd year)\n-Please enter from the following choices\n");
        int choice= input.nextInt();
        if(choice==1){
            this.gradelevel1=1;
        } else if (choice==2) {
            this.gradelevel1=2;
        } else if (choice==3) {
            this.gradelevel1=3;
        }

        this.IdOfStudent=generateId1();
    }
    public Student(String firstName,String lastName){
        //By Approach 1
        this.firstName=firstName;
        this.lastName=lastName;
        this.gradelevel=generateGradeLevel();
        uniqueID++;
        this.IdOfStudent=generateId();

    }

    // For Approach 1
    private String generateId(){
        String ID=gradelevel+""+uniqueID;
        return ID;
    }
    //For Approach 2
    private String generateId1(){
        String ID=gradelevel1+""+uniqueID;
        return ID;
    }
    //For Approach 1
    private String generateGradeLevel(){
        Scanner input=new Scanner(System.in);
        System.out.println("1- for Frehser(1st Sem)\n2-for Junior(1st year)\n3-for Senior( in 2nd year)\n-Please enter from the following choices\n");
        int choice= input.nextInt();
        if(choice==1){
            return "Fre";
        } else if (choice==2) {
            return "Jun";
        } else if (choice==3) {
            return "Sen";
        }
        else{
            System.out.println("U have enteerd Wrong choice");
        }
        return null;
    }
    public void enrollCourses(){
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Enter Course to enroll and Enter(Q to Quit)");
            String course=input.nextLine();

            if(!course.equals("Q")){
                courses=courses+" \n"+course;
                this.totalBalance+=costOfCourse;
            }
            else{
                break;
            }
        }while(1!=0);

        System.out.println("Courses Enrolled in "+this.courses);
        System.out.println("Tuition Balance     :$"+this.totalBalance);
    }
    public void PayTutionFee(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter how much fee u want to pay");
        int balance= input.nextInt();

        this.totalBalance=this.totalBalance-balance;

        System.out.println("Remaining Balance : $"+this.totalBalance);
    }
    public String toString(){
        return String.format("First Name : %s Last name : %s ID :%s%nEnrolled Courses :%s%nBalance :%d%n",this.firstName,this.lastName,this.IdOfStudent,this.courses,this.totalBalance);
    }



}