import java.util.Arrays;
class Book{
    private String author;
    private String[] chapternames=new String[5];

    public Book(){
        author="";
    }

    public Book(String author,String[] chapterNames){
        this.author=author;
        this.chapternames=chapterNames;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String[] getChapternames() {
        return chapternames;
    }

    public void setChapternames(String[] chapternames) {
        this.chapternames = chapternames;
    }



    public boolean compareAuthor(Book obj1,Book obj2){
        if(obj1.author.equalsIgnoreCase(obj2.author)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean compareChapters(Book obj1,Book obj2) {
        boolean b1 = true;
        for (int i = 0; i < obj1.chapternames.length; i++) {
            if (!obj1.chapternames[i].equalsIgnoreCase(obj2.chapternames[i])) {
                return false;
            }

        }
        return b1;
    }
    public Book compareChapterLength(Book obj1,Book obj2){
        int length1=obj1.chapternames.length;
        int lentgh2=obj2.chapternames.length;

        if(length1>lentgh2){
            return obj1;
        }
        else if(length1==lentgh2){
            return null;
        }
        else{
            return obj2;
        }
    }
}










public class Question_No_1 {
    public static void main(String[] args) {
        String [] chapters={"ICT","PF","Hello"};
        String [] chapters1={"ICT","PF","Hello","Physics"};
        Book book1=new Book("Muzamil",chapters);
        Book book2=new Book("Tayyab",chapters1);

        Book ans=new Book();
        System.out.println( ans.compareAuthor(book1,book2));
        System.out.println( ans.compareChapters(book1,book2));
        Book answer=ans.compareChapterLength(book1,book2);
        if(answer==null){
            System.out.println("Both have same chapter length");
        }
        else{
            System.out.println("Author name  "+answer.getAuthor());
            System.out.println("Chapters of Books "+ Arrays.toString(answer.getChapternames()));
        }

    }
}
