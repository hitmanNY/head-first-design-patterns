package ch1.ducksimulator;

public class MiniDuckSimulator {
    
	public static void main(String args[]){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
        
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.display();
        
        Duck deadDuck = new DeadDuck();
        deadDuck.performQuack();
        deadDuck.performFly();
        deadDuck.display();
        deadDuck.setFlyBehavior(new FlyWithRockets());
        deadDuck.performFly();
	}
}
