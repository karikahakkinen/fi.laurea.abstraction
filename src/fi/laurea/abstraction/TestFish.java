package fi.laurea.abstraction;

class TestFish {
	public static void main(String[] args) {
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}