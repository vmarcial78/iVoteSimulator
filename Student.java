import java.util.ArrayList;

public class Student 
{
	private ArrayList<String> answers = new ArrayList<String>();
    private String  id;
	public void setAnswers(String answer)
	{
		this.answers.add(answer);
	}
	public ArrayList<String> getAnswers()
	{
		return answers;
	}
	public Student(String id, String[] choices)
	{
		this.id = id;
        for (int i = 0; i < choices.length; i++)
        this.answers.add(choices[i]);
		
	}
	
}