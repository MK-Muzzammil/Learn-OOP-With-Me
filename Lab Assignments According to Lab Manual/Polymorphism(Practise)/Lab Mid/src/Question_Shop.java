import java.util.ArrayList;
import java.util.Arrays;

class Person{
    protected String name;
    protected String Address;


    public Person(){

    }
    public Person(String name,String address){
        this.name=name;
        this.Address=Address;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
class QuestionPool {
    private ArrayList<Questions> questions;

    public QuestionPool(ArrayList<Questions> questions) {
        this.questions = questions;
    }

    public ArrayList<Questions> getQuestions(int count) {
        if (count > questions.size()) {
            count = questions.size();
        }
        return new ArrayList<>(questions.subList(0, count));
    }
}
class Questions{
    private String question;
    private String answer;
    public Questions(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

}


class Invagilator extends Person{
    public Invagilator(){

    }
    public Invagilator(String name,String address){
        super(name,address);
    }
    public void setQuestionPaper(QuestionPool pool,ExamPaper paper){
        ArrayList<Questions> questions=pool.getQuestions(10);
        paper.setQuestions(questions);
    }

}
class ExamPaper{
    private ArrayList<Questions>  questions;

    public ExamPaper(){
        this.questions=new ArrayList<>();
    }
    public void setQuestions(ArrayList<Questions> questions){
        this.questions=questions;
    }
    public ArrayList<Questions> getQuestions(){
        return questions;
    }

}



class Student extends Person{
    private ArrayList<String> answers;

    public Student(){

    }
    public Student(String name,String Address,int scoreINExam){
        super(name,Address);
        answers=new ArrayList<>();
    }
    public void setAnswers(int index,String answer){
        answers.add(index,answer);
    }
    public ArrayList<Questions> getScoreInExam(){
        return answers;
    }

}



class Result {
    public static boolean validateAnswers(ArrayList<Questions> questions,  ArrayList<Questions> answers) {
        if (questions.size() != answers.size()) {
            return false;
        } else {
            int score = 0;
            for (int i = 0; i < answers.size(); i++) {
                if (questions.get(i).equals(answers.get(i))) {
                    score++;
                }
            }
            double scorePer = score / answers.size() * 100;
            if (scorePer > 50) {
                return true;
            } else {
                return false;
            }
        }
    }
}
public class Question_Shop {
    public static void main(String[] args) {
        ArrayList<Questions> allQuestions = new ArrayList<>(Arrays.asList(
                new Questions("What is the capital of France?", "Paris"),
                new Questions("What is the highest mountain in the world?", "Mount Everest"),
                new Questions("Who discovered penicillin?", "Alexander Fleming"),
                new Questions("What is the largest planet in our solar system?", "Jupiter"),
                new Questions("What is the smallest country in the world?", "Vatican City"),
                new Questions("What is the chemical symbol for gold?", "Au"),
                new Questions("Who wrote the Harry Potter series?", "J.K. Rowling"),
                new Questions("What is the smallest bone in the human body?", "Stapes"),
                new Questions("What is the currency of Japan?", "Yen"),
                new Questions("What is the highest waterfall in the world?", "Angel Falls"),
                new Questions("Who painted the Mona Lisa?", "Leonardo da Vinci"),
                new Questions("What is the largest ocean in the world?", "Pacific Ocean"),
                new Questions("Who wrote the novel '1984'?", "George Orwell"),
                new Questions("What is the largest mammal in the world?", "Blue Whale"),
                new Questions("What is the capital of India?", "New Delhi"),
                new Questions("Who directed the movie 'The Shawshank Redemption'?", "Frank Darabont"),
                new Questions("What is the name of the first man to walk on the moon?", "Neil Armstrong"),
                new Questions("What is the smallest planet in our solar system?", "Mercury"),
                new Questions("What is the chemical symbol for oxygen?", "O"),
                new Questions("Who is the author of 'To Kill a Mockingbird'?", "Harper Lee")
        ));
        QuestionPool pool = new QuestionPool(allQuestions);

        // create an exam paper
        ExamPaper paper = new ExamPaper();

        // create an invigilator and set the questions for the exam paper
        Invagilator invigilator = new Invagilator("John Doe", "123 Main Street");
        invigilator.setQuestionPaper(pool, paper);

        // create a student and assign the exam paper to them
        Student student = new Student("Jane Smith", "456 Elm Street", 0);
        student.setAnswers(0, "Paris");
        student.setAnswers(1, "Mount Everest");
        student.setAnswers(2, "Alexander Fleming");
        student.setAnswers(3, "Jupiter");
        student.setAnswers(4, "Vatican City");
        student.setAnswers(5, "Au");
        student.setAnswers(6, "J.K. Rowling");
        student.setAnswers(7, "Stapes");
        student.setAnswers(8, "Yen");
        student.setAnswers(9, "Angel Falls");

        // validate the student's answers and print out the results
        boolean passed = Result.validateAnswers(paper.getQuestions(), student.getScoreInExam());
        System.out.println("Student name: " + student.name);
        System.out.println("Score: " + (passed ? "Pass" : "Fail"));


    }
}

