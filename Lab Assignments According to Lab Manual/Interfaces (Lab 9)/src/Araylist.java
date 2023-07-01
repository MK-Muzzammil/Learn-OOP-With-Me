import java.util.ArrayList;
import java.util.Scanner;


public class Araylist {
    public Scanner input=new Scanner(System.in);
    public void addArrayList(ArrayList<Integer> obj){
        int i=1;
        while(i!=0){
            System.out.println("Enter the number ");
            int num=input.nextInt();
            obj.add(num);

            System.out.println("Enter 1 to continue and 0 to stop");
            i= input.nextInt();

        }




    }

    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList();

    }

}
