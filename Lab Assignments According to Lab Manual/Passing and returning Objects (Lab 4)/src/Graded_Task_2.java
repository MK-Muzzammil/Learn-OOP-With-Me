class Book{
    private String author;
    private String[] chapterNames=new String[10];

    public Book(){
        author="";
    }
    public Book(String author,String[] chNames){
        this.author=author;
        this.chapterNames=chNames;
    }
    public boolean compareAuthors(Book obj){
        if(this.author .equalsIgnoreCase(obj.author)){
            return true;
        }
        else{
            return false;
        }
    }
    public String compareChapterNames(Book obj){
        int len1=this.chapterNames.length;
        int len2=obj.chapterNames.length;
        System.out.println("Length of book 1 "+len1);
        System.out.println("Lengt of book 2 is "+len2);

        if(len2>len1){
            return obj.author;
        }
        else{
            return this.author;
        }

    }

}


public class Graded_Task_2 {
    public static void main(String[] args) {
        Book Obj1=new Book();
        Book Obj2=new Book();

        boolean Ans=Obj1.compareAuthors(Obj2);
        String  name=Obj1.compareChapterNames(Obj2);
        System.out.println(Ans);
        System.out.println(name);

        System.out.println("======================================================");

        String [] arr1={"Hello ","Hey","Dummy","PF","Hey1","Hey2","OOP","Science"};
        String [] arr2={"Hello ","Hey","Dummy","PF","Hey1","Hey2","OOP","Science","Math","EE"};
        Book obj1=new Book("Muzzammil",arr1);
        Book obj2=new Book("Hussain",arr2);

        boolean ans=obj1.compareAuthors(obj2);
        if(ans){
            System.out.println("yes Authors are same ");
        }
        else {
            System.out.println("No Authors are not same");
        }
        String authorName=obj1.compareChapterNames(obj2);
        System.out.println("The author of largest Chapter names book is "+authorName);

    }
}
