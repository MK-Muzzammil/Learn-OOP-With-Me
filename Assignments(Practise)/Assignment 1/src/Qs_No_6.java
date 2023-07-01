class Student{
    private String name;
    private double GPA;
    private String [] subjects=new String[5];
    private String email;

    Student(){

    }
    Student(String Name,double gpa,String[] Subjects,String Email){
        name=Name;
        GPA=gpa;
        subjects=Subjects;
        email=Email;
    }

    public void Display(){
        System.out.println("Name is : "+name);
        System.out.println("GPA  is : "+GPA);
        System.out.println("Email is: "+email);
        for(int i=0;i<subjects.length;i++){
            System.out.printf("Subject %d is %s%n",i+1,subjects[i]);
        }
    }

    public void setVal(String Name,double gpa,String[] Subjects,String Email){
        name=Name;
        GPA=gpa;
        subjects=Subjects;
        email=Email;
    }
    public boolean searchSubject(String sub){
        for(int i=0;i< subjects.length;i++){
            if(subjects[i].equalsIgnoreCase(sub)){
                return true;
            }
        }
        return false;
    }
    public boolean checkProbStatus(){
        if(GPA<=2.00){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean validateEmail(String Email){
        if(email.equalsIgnoreCase(Email)){
            return true;
        }
        else{
            return false;
        }
    }
}

public class Qs_No_6 {
    public static void main(String[] args) {
        String [] sub={"Math","English","Urdu","Physics","Chemistry"};
        Student s1=new Student("Muzzammil",3.60,sub,"muzzammil759@gmail.com");
        s1.Display();
        System.out.println(s1.searchSubject("Urdu"));
        System.out.println(s1.validateEmail("muzzammil759@gmail.com"));
        System.out.println(s1.checkProbStatus());
    }
}
