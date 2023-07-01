class A{
    public void show(String a){
        System.out.println("String maethod ");
    }
//    public void show(int b){
//        System.out.println("int method ");
//    }
    public void show(float b){
        System.out.println("FLoat method");
    }
}
//class B for discuss StringBUffer and String case
class B{
    public void show(String c){
        System.out.println("String method ");
    }
    public void show(StringBuffer b){
            System.out.println("String Buffer method");
    }

}
//for discussing the Parent Object Class if no method then method of OBject class is displayed

class C{
    public void show(Object obj){
        System.out.println("Object method ");
    }
    public void show(String s){
        System.out.println("String method");
    }
}

//class D is for VarArgs case discussed
class D{
    public void show(int...a){
        System.out.println("Object method ");
    }
    public void show(int b){
        System.out.println("String method");
    }
}


public class automaticPromotion {
    public static void main(String[] args) {
        A a=new A();

        a.show(1);
        /**as we see no data member method have char type but in java it will
        //do automatic Promotion means char will goes to int and it will execute
        //show(int) method
        //Automatic promotion table is in Screenshot Conversions possible are
        //byte to short  (ii) short to int  (iii) char to int (iv) int to float,double,long  (v)float to double
        //(v) float to double (vi)long to double
         //but these all cant be reversed meand float will not goes to int it wil five error

        //but this is not so much efficient for more arguments of a method
        */

        //======================Discussing class B for String Buffer and String ================

//        B b=new B();
//        b.show("Abc");  //will call show(string)
//        b.show(new StringBuffer("HEllo")); //called show(stringBuffer)

        /** for this case me must have to decalre String and String Buffer Seperately bcz acc to java both are diff strings
        for first show (String) is called bcz simpe string is passed
         for second   show(StringBuffer) is called bcz StringBUffer is passed
        */

        //=======================CLass C for Object Parent class==============
        C c=new C();

        c.show("abc");//1

        c.show(2);//2
        c.show(1);//3
        /** for first show meth as String is available in class C so it will give preference to
         * show(String) that is the child class but if not available then it will prefer the parent class
         * show(object);
         */

        //=============================Class D DIscuseed===========================

        D d=new D();
        d.show();
        d.show(1);
        d.show(1,2,3,4);
        /** first show method will call show(varags) meth  2nd one show(int) method
         //third show meth will call  show(varAgs) meth bcz ore than one arguments
         */
    }
}
