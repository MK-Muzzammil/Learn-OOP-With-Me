class Student{
    private String name;
    private int[] resultArray=new int[5];

    Student(String Name,int[] Marks){
        name=Name;
        resultArray=Marks;
    }
    public double average(){
        int count=0;
        int sum=0;
        for(int i=0;i<resultArray.length;i++){
            sum=sum+resultArray[i];
            count++;
        }
        System.out.println(count);
        double average=(double) sum/count;
        return average;
    }
}








public class Lab_Task_NO_3 {
    public static void main(String[] args) {
        int [] marks={1,2,3,4,5};
        Student s1=new Student("Muzzammil",marks);
        double avgstd1=s1.average();
        System.out.printf("The average of std1  is  %.2f%n ",avgstd1);

        int[] marks2={2,3,45,6,7};
        Student s2=new Student("Shahwaiz",marks);
        double avgstd2=s2.average();
        System.out.printf("The average of std2  is  %.2f%n ",avgstd2);

        if(avgstd1>avgstd2){
            System.out.println("Student 1 has greater average");
        }
        else{
            System.out.println("Student 2 has greater average");
        }
        Student std3=new Student("Muzzammil",marks2);
        double avgstd3 =std3.average();
        System.out.printf("The average of std3  is  %.2f%n ",avgstd3);

    }
}
