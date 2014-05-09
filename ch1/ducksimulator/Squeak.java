package ch1.ducksimulator;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
        System.out.println("Sqeak.");
	}
}
