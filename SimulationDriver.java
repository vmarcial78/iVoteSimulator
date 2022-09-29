import java.util.ArrayList;
import java.util.List;
import java.util.*;
 

public class SimulationDriver
{
    public static void main(String[] args)
    {   System.out.print("Welcome to iVote Simulator\n ");
        System.out.println("Multiple Choice- Select Multiple Answers: ");
        multipleChoice();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\nSingle Choice - Only Select One Answer:  ");
        singleChoice();
        System.out.println("-----------------------------------------------------------------------------");
    }
    
   
    private static void multipleChoice() 
    {
        String question = "What is capitalism ?";
        int type = 1;
        String [] choices = new String[4];
        choices[0] = "An evil mechanism created by the devil";
        choices[1] = "a society where an extremely small group of people live in unimaginable luxury ";
        choices[2] = "an economic system in which private individuals or businesses own capital goods";
        choices[3] = "A language created by Marie Antionette ";
        String[] correctAnswer = {"a society where an extremely small group of people live in unimaginable luxury","an economic system in which private individuals or businesses own capital goods"};
        Question q1 = new Question(question, correctAnswer, choices);
        VotingSimulator voting = new VotingSimulator(q1, type);
        generateStudents(voting, choices);//generate students for mult choice
        q1.printQuestion();
        voting.printParticipants();
        System.out.println("Correct Answer: Choice 2,3");
    }
    private static void singleChoice()
    {
        String question = "What is the meaning of life";
        int type =0;
        String[] choices = new String[4];
        choices[0] = "there is not meaning to life Life is meaningless";
        choices[1] = "whatever you want it to be ";
        choices[2] = "The temporary nature of human life that gives life its shape and purpose";
        choices[3] = "FAME SUCCESS AND MONEY!!!!";
        String[] correctAnswer = {"whatever you want it to be"};
        Question q2 = new Question(question, correctAnswer, choices);
        VotingSimulator voting = new VotingSimulator(q2, type);
        generateStudents(voting, choices);
        q2.printQuestion();
        voting.printParticipants();
        System.out.println("CorrectAnswer: Choice 2.");
       
    }
 //generating students for each answer 
    private static void generateStudents(VotingSimulator voting, String[] answers)
    {
        Random randStudent = new Random();
        int randNum = randStudent.nextInt(100) + 1;
        
       
        for(int studentNum = 0; studentNum < randNum; studentNum++)
        {
            String[] ans = generateAnswers(answers);
            voting.addStudent(ans);
           
        }
    }
 
 
   //Generates a array of answers for each student using a random number to do it.
    private static String[] generateAnswers(String[] answers)
    {
        Random randStudent= new Random();
        int randNum = randStudent.nextInt(answers.length) + 1;
       
        List<String> studentChoices = new ArrayList<String>();
        for(int studentNum= 0; studentNum < randNum; studentNum++)
        {  
                studentChoices.add(answers[studentNum]);
           
        }
        return studentChoices.toArray(new String[0]);  
       
       // return studentChoices ;  
    }
}
 
