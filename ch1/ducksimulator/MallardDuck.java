package ch1.ducksimulator;

public class MallardDuck extends Duck {
    public MallardDuck() {
    	quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
    	System.out.println("Im a real mallard duck");
    }
}
