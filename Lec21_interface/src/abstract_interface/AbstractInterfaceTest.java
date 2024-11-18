package abstract_interface;

public class AbstractInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBB cbb1 = new CBB();
		cbb1.displayDetails();
		cbb1.play();
		Player cbb2 = new CBB();
		Student cbb3 = new CBB(); //can you call the play method?
		//cbb3.play();//play method is from the Play interface
		
		Person cbb4 = new CBB();
		cbb2.play(); //can you call displayDetails?
		//cbb2.displayDetails(); //this is not possible
		
		Person persons [] = new Person [4]; //even if you use this you're limited with the common methods
		persons[0] = new Student();
		persons[1] = new CBB(); 
		
		for(Person person: persons)
		{
			person.displayDetails();
			//person.play(); //method doesn't exist in the Person class!!!!
		}

	}

}
