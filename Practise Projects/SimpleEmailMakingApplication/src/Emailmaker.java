import java.util.Scanner;
import java.util.Random;
public class Emailmaker {
    private String firstName;
    private String lastName;
    private String Department;
    private String ComapnySuffix="Apple.com"; //setting default nae
    private String password;
    private int passwordLength=8;  //set default pas length 8
    private int MailboxCapacity;
    private String Email;




    public Emailmaker(){

    }
    public Emailmaker(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        this.Department=setDepartment();
        this.Email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.Department+"."+this.ComapnySuffix;

        this.password=generateRandomPassword(passwordLength);
        System.out.println("Password = "+this.password);
    }
    private String setDepartment(){
        Scanner input=new Scanner(System.in);
        System.out.println("Department Codes :\n1-for sales \n2-for development \n3-for accounting \n4-for none");
        int depChoice= input.nextInt();
            if(depChoice==1){
                return "sales";
            } else if (depChoice==2) {
                return "dev";
            } else if (depChoice==3) {
                return "accounting";
            } else if (depChoice==4) {
                return "";
            }
            else{
                System.out.println("Invalid input");
                return "";
            }
    }
    private String generateRandomPassword(int passwordLength){
        Random rand=new Random();
        String randStr="abcdefghijkllmnopqrstuvwxyz12345678@#$%^&*";
        char[] randPass=new char[passwordLength];
        for(int i=0;i<passwordLength;i++){
            int randIndex=rand.nextInt(0,randStr.length());

            randPass[i]=randStr.charAt(randIndex);
        }

        return new String(randPass);
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setMailboxCapacity(int capacity){
        this.MailboxCapacity=capacity;
    }
    public int getMailboxCapacity(){
        return MailboxCapacity;
    }
    public void setAlternateEmail(String email){
        this.Email=email;
    }
    public String getAlternateEmail(){
        return this.Email;
    }
    public void setName(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getName(){
        return String.format("%s  %s%n",this.firstName,this.lastName);
    }
    public String ShowInfo(){
        return String.format("Name = %s  %s  Email = %s  MailBoxCap=%d Password = %s%n",this.firstName,this.lastName,this.Email,this.MailboxCapacity,this.password);
    }

}
