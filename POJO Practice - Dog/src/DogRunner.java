import java.util.ArrayList;

public class DogRunner
	{
	static ArrayList <Dog> kennel = new ArrayList <Dog>();
	public static void main(String[] args)
		{
		kennel.add(new Dog(7, "Fred"));
		kennel.add(new Dog(3, "Sprinkles"));
		
		System.out.println(kennel);
		// a toString is required for this
		System.out.println(kennel.get(0).getName());
		System.out.println(kennel.get(1).getName());

		kennel.get(0).setName("Q");
		kennel.get(1).setAge(4);
		
		System.out.println(kennel);
		}

	}
