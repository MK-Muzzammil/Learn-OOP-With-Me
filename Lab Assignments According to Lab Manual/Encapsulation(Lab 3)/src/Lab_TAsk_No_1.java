class Marks{
    private int marks1;
    private int marks2;
    private int marks3;
    public Marks(){
        marks1=0;
        marks2=0;
        marks3=0;

    }
    public Marks(int Marks1,int Marks2,int Marks3){
        marks1=Marks1;
        marks2=Marks2;
        marks3=Marks3;
    }

    private void setMarks1(int Marks1){
        marks1=Marks1;
    }
    public int getMarks1(){
        return marks1;
    }
    private void setMarks2(int Marks2){
        marks2=Marks2;
    }
    public int getMarks2(){
        return marks2;
    }
    private void setMarks3(int Marks3){
        marks3=Marks3;
    }
    public int getMarks3(){
        return marks3;
    }
    //When we make set and get private in this case solution
    public void setVal(int Marks1,int Marks2,int Marks3){
        setMarks1(Marks1);
        setMarks2(Marks2);
        setMarks3(Marks3);
    }
    public void Display(){
        System.out.println( getMarks1());
        System.out.println( getMarks2());
        System.out.println( getMarks3());
    }
}



public class Lab_TAsk_No_1 {
    public static void main(String[] args) {
        //when we make public our functions
//        Marks m1=new Marks();
//        m1.setMarks1(1);
//        m1.setMarks2(2);
//        m1.setMarks3(3);
//        System.out.println(m1.getMarks1());
//        System.out.println(m1.getMarks2());
//        System.out.println(m1.getMarks3());
//
        //when we make acces modifier of funtions private
        Marks m2=new Marks();
        //We cannot call private functions in main so we make a new func for it
        m2.setVal(12,13,14);
        m2.Display();
    }
}
