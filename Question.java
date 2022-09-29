import java.util.ArrayList;
import java.util.List;

//this.correctanswers = array of correct answer
//this.questionAsked = questions that were asked 
//this.choices is array of choices

public class Question 
{
	private String questionAsked;
	private List<String> correctAnswers = new ArrayList<String>();
	private ArrayList<String> choices = new ArrayList<String>();
	
	public void setChoices(ArrayList<String> choice)
         
	{    
         this.choices = choice ;
        
	}

	public ArrayList<String> getChoices()

	{
		 return this.choices;

	}

	public void setQuestionAsked(String question)
	{
		 this.questionAsked = question;

	}

	public String getQuestionAsked()
	{
		return this.questionAsked;

	}

	public String[] getCorrectAnswers()
	{
		return this.correctAnswers.toArray(new String[0]);

	}
	public void setCorrectAnswers(ArrayList<String> answer)
	{     
          this.correctAnswers = answer;

		
	}
    public Question(String asked, String[] answer, String[] choice)
	{ // note to self: you can also use collections method to add array to array list 
        //  Collections.addAll(this.correctAnswers, answer); like so 
		this.questionAsked = asked;
        for (int i = 0; i < answer.length; i++)
        this.correctAnswers.add(answer[i]);
	  
        for (int i =0; i < choice.length;i++)
         this.choices.add(choice[i]);
	 
      
	}
	public void printQuestion()
	{
		int count = 1;
		System.out.println("Question: " + this.questionAsked);
		System.out.println("Choices Avaliable: ");
        //print out choices 
		for(int studentNum = 0; studentNum < this.choices.size(); studentNum ++)
		{
			System.out.println(count++ + ". " + this.choices.get(studentNum));
		}
       
        {
            
          
        }
       
	}
}