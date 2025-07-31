package zoo;

import org.animals.Deer;
import org.animals.Elephant;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class Vandalurzoo {

	public static void main(String[] args) {
		{
	        Lion lion = new Lion();
	        Tiger tiger = new Tiger();
	        Deer deer = new Deer();
	        Monkey monkey = new Monkey();
	        Elephant elephant = new Elephant();
	        Giraffe giraffe = new Giraffe();

	        System.out.println("=== Animal Characteristics in Vandalur Zoo ===\n");

	        display("Lion", lion.color, lion.weight, lion.age, lion.isVegetarian(), lion.canClimb(), lion.sound());
	        display("Tiger", tiger.color, tiger.weight, tiger.age, tiger.sVegetarian(), tiger.canClimb(), tiger.sound());
	        display("Deer", deer.color, deer.weight, deer.age, deer.isVegetarian(), deer.canClimb(), deer.sound());
	        display("Monkey", monkey.color, monkey.weight, monkey.age, monkey.isVegetarian(), monkey.canClimb(), monkey.sound());
	        display("Elephant", elephant.color, elephant.weight, elephant.age, elephant.isVegetarian(), elephant.canClimb(), elephant.sound());
	        display("Giraffe", giraffe.color, giraffe.weight, giraffe.age, giraffe.isVegetarian(), giraffe.canClimb(), giraffe.sound());
	    }
	}

	    public static void display(String name, String color, int weight, int age, boolean veg, boolean climb, String sound) {
	        System.out.println("Animal: " + name);
	        System.out.println("Color: " + color);
	        System.out.println("Weight: " + weight + " kg");
	        System.out.println("Age: " + age + " years");
	        System.out.println("Vegetarian: " + (veg ? "Yes" : "No"));
	        System.out.println("Can Climb: " + (climb ? "Yes" : "No"));
	        System.out.println("Sound: " + sound);
	       
	    }
	




	}


