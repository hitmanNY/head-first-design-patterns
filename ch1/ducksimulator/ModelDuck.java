package ch1.ducksimulator;

public class ModelDuck extends Duck {

    public ModelDuck(){
    	flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
	@Override
	public void display() {
		System.out.println("Im a model citizen.. i model DUCK.");
	}
}
