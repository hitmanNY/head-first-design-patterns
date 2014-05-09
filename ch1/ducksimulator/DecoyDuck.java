package ch1.ducksimulator;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
    	flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
	@Override
	public void display() {
        System.out.println("Im a decoy duck.");
	}
}
