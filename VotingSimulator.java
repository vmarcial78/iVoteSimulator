import java.util.ArrayList;
import java.util.UUID;

public class VotingSimulator 
{
	private ArrayList<String> studentAnswer = new ArrayList<String>();
	private ArrayList<Student> students = new ArrayList<Student>();
    private int type;
	private int[] count;
	
	public VotingSimulator(Question question, int type)
	{
		this.type = type;
		this.studentAnswer = question.getChoices();
		count = new int[this.studentAnswer.size()];
	}

    //Uses UUID to generate a unique ID
	private String generateuniqueID()
	{
		return UUID.randomUUID().toString();
	}
	//Adds each student with their answers to a list of student 
	public void addStudent(String[] answers)
	{
		if (this.type ==1 && answers.length > 1)
		{
			students.add(new Student(this.generateuniqueID(), answers));
		}
		else if (this.type ==0 && answers.length <= 1)
		{
			students.add(new Student(this.generateuniqueID(), answers));
		}
	}
	
	//counts the number of students have chosen the choices given for the poll
	private int[] countAnswers()
	{
		for(int studentNum = 0; studentNum < this.students.size(); studentNum++)
		{
			for(int i = 0; i < this.studentAnswer.size(); i++)
			{
					for(int j = 0; j < this.students.get(studentNum).getAnswers().size(); j++)
					{
						if (this.students.get(studentNum).getAnswers().get(j).equals(this.studentAnswer.get(i)))
						{
							this.count[i]++;
						}
					}
			}
		}
		return count;
	}
	//Prints out the number of participants and the results
	public void printParticipants()
	{
		this.countAnswers();
		System.out.println("\nNumber of Participants: " + students.size() );
		System.out.println("Results:");
		//for each student generate 
		for(int studentNum = 0; studentNum < this.studentAnswer.size(); studentNum ++)
		{
			System.out.println(this.studentAnswer.get(studentNum) + ": " + this.count[studentNum]);
		}
      
	}

}
