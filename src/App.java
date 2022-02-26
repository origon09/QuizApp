import java.util.Scanner;

public class App {
    /**
     * This application is a quiz game
     * author: joshua permaul
     * @param args
     */

    public static void main(String[] args) {

        //questions in string format
        String q1 = "Which one of these is a coding language?"
                + "\n(a)Java\n(b)Turtle\n(c)Kraken\n(d)Minute";

        String q2 = "Which of these is a variable?"
                + "\n(a)Hash\n(b)Length\n(c)Boolean\n(d)Public";

        String q3 = "What language uses spacing and colons for code."
                + "\n(a)C++\n(b)Java\n(c)HTML\n(d)Python";

        String q4 = "Which of these is a type of loop?"
                + "\n(a)if\n(b)hash\n(c)for\n(d)merge";


        //array of questions
        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "c"),
                new Question(q3, "d"),
                new Question(q4,"c")
        };

        //calls takeTest Method to start quiz
        takeTest(questions);

    }

    /**
     * takeTest method, takes in an array of questions as a parameter
     * holds a scanner for user input and a for loop to iterate through the array of questions
     * @param questions
     */
    public static void takeTest(Question [] questions){
        int userScore = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = sc.nextLine();
            if(answer.equals(questions[i].answer)){
                userScore ++;
            }
        }
        //finishing output. Lets user know there score.
        System.out.println("You are done with the test!");
        System.out.println("You got " + userScore + "/" + questions.length);
    }

}
