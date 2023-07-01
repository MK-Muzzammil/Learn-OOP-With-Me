import java.util.Scanner;
class University{
    public Scanner sc=new Scanner (System.in);
    private int count=0;
    private String uniName;
    private String location;
    private String rectorName;
    private String departments[]=new String[20];

    University(){
        uniName="";
        location="";
        rectorName="";
        }
        University(String UniName,String RectorName ){
            uniName=UniName;
            rectorName=RectorName;
            location="";
        }
        University(String UniName,String Location,String RectorName,String[] Departments){
            uniName=UniName;
            location=Location;
            rectorName=RectorName;
            for(int i=0;i<Departments.length;i++){
                departments[i]=Departments[i];
            }
           System.out.println(departments.length);
        }
        public void AddADepartment(int size,String dep) {
            if(size==0){
                count=0;
                departments[count]=dep;
                count++;
            }
            else{
                count=size;
                departments[count]=dep;
                count++;
            }

    }

        public void Display(){
                System.out.println("The University name is     : "+uniName);
                System.out.println("The University Location is : "+location);
                System.out.println("The UniversityRectorName is:" +rectorName);
                System.out.println("==========Departments===============");
                if(count==0){
                    System.out.println("No department added");
                }
                else{
                    for(int i=0;i<count;i++){
                        System.out.print(departments[i]+"\n");

                    }
                }
            }
        public boolean checkIfLocatedInCapital(String loc){
            if(loc==null){
                System.out.println("NO capital added");
            }
            else if(location.equalsIgnoreCase(loc)){
                return true;
            }
            else{
                return false;
            }
            return false;
        }
        public  boolean searchDepartment() {
            System.out.println("Please enter the department to search ");
            String dep=sc.next();
            for (int i = 0; i < count; i++) {
                if (departments[i].equalsIgnoreCase(dep)) {
                    return true;
                }
            }
            return false;
        }
}

public class Qs_No_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] dep={"CS","SE","BioSciences","Arts","English","Physics","BBA","Management Sciences"};
        int size=dep.length;
        University u1=new University("Comsats","Islamabad","JunaidZaidi",dep);
        System.out.println("Please enter the department ");
        String Dep=input.next();
        u1.AddADepartment(size,Dep);
        System.out.println(u1.searchDepartment());
        System.out.println(u1.checkIfLocatedInCapital("Islamabad"));
        u1.Display();

      //==============For Second Constuctor=====================
        University u2=new University("Comsats","JuanidZaidi");
        int size1=0;
        System.out.println("Please enter the department u want to add");
        String Dep1=input.next();
        u2.AddADepartment(size1,Dep1);
        System.out.println(u2.searchDepartment());
        System.out.println(u2.checkIfLocatedInCapital("Islamabad"));
        u2.Display();

        //==================For Third Constructor =====================

        University u3=new University();
        int size3=0;
        System.out.println("Please enter the department u want to add ");
        String Dep2=input.next();
        u3.AddADepartment(size3,"Physics");
        System.out.println( u3.searchDepartment());
        System.out.println( u3.checkIfLocatedInCapital("Islamabad"));
        u3.Display();
    }
}
