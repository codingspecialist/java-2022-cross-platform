package ex10;

class Animal {
	int num1 = 10;
}

class Dog extends Animal{
	int num2 = 20;
}

public class Extends02 {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // Dog, ->Animal
		System.out.println(d1.num1);
	}

}
