package ch1.ducksimulator;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
        System.out.println("Quack");
	}
}
