import java.util.Scanner;
//main class start
public class UniversityRun1 {
    static Scanner input1=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        university u1=new university();
        u1.display();

        university u2=new university("Comsats","Junaid Zaidi");
        u2.display();

        university u3=new university("Comsats","Junaid Zaidi","Islamabad",u2.departments);
        int opt;

        do{
            System.out.println("Press 1 to display");
            System.out.println("Press 2 to add a department");
            System.out.println("Press 3 to check if located in capital");
            System.out.println("Press 4 to search department");
            System.out.println("Press 0 to Exit");
            opt=input1.nextInt();
            switch (opt){
                case 1:
                    u2.display();
                    break;
                case 2:
                    System.out.println("Enter the department name: ");
                    String str1= input1.nextLine();
                    u2.addDepartment(str1);
                    break;
                case 3:
                    System.out.println("Is Campus Located in Campus?");
                    System.out.println(u2.checkIfLocatedInCapital());
                    break;
                case 4:
                    System.out.println("Enter department");
                    String a= input1.nextLine();
                    System.out.println("Department found?");
                    System.out.println(u2.searchDepartment(a));
            }

        }while(opt!=0);


    }
}//main class end

//University class start
class university{
    String uniName;
    String Location;
    String rectorName;
    String[] departments=new String[3];

    public university(){
        uniName="";
        Location="";
        rectorName="";

    }
    public university(String str1, String str2){
        uniName=str1;
        rectorName=str2;

    }
    public university(String a,String b,String c,String[] d){
        uniName=a;
        Location=b;
        rectorName=c;
        departments=d;
    }
    public void addDepartment(String ch){
        int i,count=0;
        for( i=0;i<departments.length;i++){
            if(departments[i]!=null){
                count++;
            }
            else {
                break;
            }
        }
        if(count>=departments.length){
            System.out.println("No space available");
        }
        else{
            departments[count]=ch;
        }
    }
    public boolean checkIfLocatedInCapital(){
        boolean check=false;
        if(Location.equalsIgnoreCase("Islamabad") || Location.equalsIgnoreCase("Lahore") ||Location.equalsIgnoreCase("Karachi") || Location.equalsIgnoreCase("Quetta") || Location.equalsIgnoreCase("Peshawar")){
            check=true;
            return check;
        }
        return check;
    }
    public boolean searchDepartment(String st){
        boolean searchD=false;
        int c=0;
        for(int i=0;i<departments.length;i++){
            if(departments[i]!=null){
                c++;
            }
        }
        for(int j=0;j<=c;j++) {
            if (departments[j]!=null && departments[j].equalsIgnoreCase(st)) {
                searchD = true;
                return searchD;
            }
        }
        return searchD;
    }
    public void display(){
        System.out.println("University Name: "+uniName);
        System.out.println("Rector Name: "+rectorName);
        System.out.println("Location: "+Location);
        for(int i=0;i<departments.length;i++){
            System.out.println(departments[i]);
        }
    }



}//University class end

