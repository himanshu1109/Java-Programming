
interface BasicAnimal{
	void eat();
	void sleep();
}
class Monkey{
	public void jump() {
		System.out.println("Jumping ....");
	}
	public void bite() {
		System.out.println("Biting ....");
	}
}
class Human extends Monkey implements BasicAnimal{
	public void sleep() {
		System.out.println("Sleeping ....");
	}
	public void eat() {
		System.out.println("Eating ....");
	}
}

public class monkeyClass {

	public static void main(String[] args) {
		BasicAnimal B1 = new Human();
		B1.eat();
		Monkey M1 = new Human();
		M1.bite();
		Human H1 = new Human();
		H1.jump();
		H1.sleep();
	}

}
