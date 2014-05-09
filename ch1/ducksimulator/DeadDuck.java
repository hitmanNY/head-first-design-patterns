package ch1.ducksimulator;

public class DeadDuck extends Duck {
    
	public DeadDuck(){
		flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Im a dead duck...");
	}
}
