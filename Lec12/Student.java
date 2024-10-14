
public class Student {

	private String name;
	private int[] scores;
	
	public Student()
	{
		name = "Jane Doe";
		scores = new int[3];
	}
	
	public Student(String theName, int [] theScores)
	{
		name = theName;
		scores = new int[3]; //when you do this, you are going to allocate a different space. So score will be holding
		//another address.
		scores = theScores;
	}
	
	
	public void displayScores()
	{
		for(int i=0; i<scores.length; i++)
		{
			System.out.println("for " + name + ":" + scores[i]);
		}
	}
	
	public void displayScoresEnhanced()
	{
		for(int score:scores)//score will take values of scores array one by one.
		{
			System.out.println("for " + name + ":" + score);
		}//you can't modify scores with this approach by using score dummy variable
	}
	
	public void updateScores(int [] array)
	{
		for(int i=0; i<array.length; i++)
		{
			array[i] = array[i] + 10;
		}
		
	}
	
	public void updateScore(int x)
	{
		x = 10;
	}
	
	public String toString() //hidden hero working in the backend when we call println.
	{
		return (name + " " + scores[0] + " " + scores[1] + " " + scores[2]);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student = new Student();
	int [] theScores = new int[3];
	int myScore = 3;
	theScores[0] = 3;
	theScores[1] =4;
	Student student2 = new Student("John Doe", theScores);
	student.displayScores();
	student2.displayScores();
	student2.displayScoresEnhanced();
	
	student2.updateScores(theScores);
	System.out.println("After the update call");
	for(int score:theScores)
	{
		System.out.println(score);
	}
	
	student2.updateScore(myScore);
	System.out.println(myScore);
	System.out.println(student2);

	}

}
