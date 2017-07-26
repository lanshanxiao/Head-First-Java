import java.util.*;


public class TestGenericsl{
	public static void main(String[] args){
		new TestGenericsl().go();
	}
	
	public void go(){
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
		animals.add(new Cat());
		
		takeAnimals(animals);
	}
	
	public void takeAnimals(ArrayList<Animal> animals){
		for(Animal a: animals){
			a.eat();
		}
	}
}

abstract class Animal{
	void eat(){
		System.out.println("animal eating");
	}
}

class Dog extends Animal{
	
	@Override
	void eat(){
		System.out.println("dog eating");
	}
	
	void bark(){}
}

class Cat extends Animal{
	void meow(){}
}