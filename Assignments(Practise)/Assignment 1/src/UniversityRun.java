import java.util.Scanner;
//main class start
public class UniversityRun {
    public static void main(String[] args) {
        University u1=new University();
        u1.display();

        University u2=new University("Comsats","Junaid Zaidi");
        u2.display();

        University u3=new University("Comsats","Junaid Zaidi","Islamabad",u2.departments);



    }
}//main class end

//University class start
class University{
    String uniName;
    String Location;
    String rectorName;
    String[] departments=new String[3];

    public University(){
        uniName="";
        Location="";
        rectorName="";

    }
    public University(String str1, String str2){
        uniName=str1;
        rectorName=str2;

    }
    public University(String a,String b,String c,String[] d){
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
