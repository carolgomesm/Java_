
public class Program {

	public static Person person; //reference to the person class
	
	public static void main(String[] args) {
		System.out.println("Program starter");
		
		person = new Person(27);
		
		person.setName("Carol");
		
		System.out.println(person.getName());
		
		person.runs();
		
		

	}

}
