package ch1.ducksimulator;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void setFlyBehavior( FlyBehavior fly ){
    	this.flyBehavior = fly;
    }
    public void setQuackBehavior(QuackBehavior quack){
    	this.quackBehavior = quack;
    }
    
    public void performQuack(){
    	quackBehavior.quack();
    }
    public void performFly(){
    	flyBehavior.fly();
    }
    public void swim() {
    	System.out.println("ALl ducks float, even decoys");
    }
}
