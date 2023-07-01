class Book{
    private String author;
    private String[] chapternames=new String[5];

    Book(){

    }
    Book(String Author,String[] ChapterNames){
        author=Author;
        chapternames=ChapterNames;
    }
    public void Display(){
        System.out.println("The Name of author is  "+author);
        for(int i=0;i<chapternames.length;i++){
            System.out.printf("Chapter %d :%s%n",i+1,chapternames[i]);
        }
    }
    public void setVal(String Author,String[] ChapterNames ){
        author=Author;
        chapternames=ChapterNames;
    }
    public boolean checkIfAuthorNameStartsWithA (){
        if(author.startsWith("A") || author.startsWith("a")){
            return true;
        }
        else{
            return false;

        }
    }
    public boolean searchChapter(String chapter){
        for(int i=0;i<chapternames.length;i++){
            if(chapternames[i].equalsIgnoreCase(chapter)){
                return true;
            }
        }
        return false;
    }
}
public class Qs_NO_5 {
    public static void main(String[] args) {
        String[] arr={"Rich dad","poor Dad","Hardwork","Love","Humanity"};
        Book b1=new Book("Arnald",arr);
        b1.Display();
        System.out.println(b1.checkIfAuthorNameStartsWithA());
        System.out.println(b1.searchChapter("Love"));
    }
}
