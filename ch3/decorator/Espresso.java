package ch3.decorator;

public class Espresso extends Beverage {
    public Espresso(Size size){
        this.size = size;
    	this.description = size.toString() + " Espresso Beverage";
    }

	@Override
	public double cost() {
        
        double cost = 0;
        
        switch(size){
        case GRANDE:
        	cost = 1.99;
            break;
        case TALL:
        	cost = .99;
            break;
        case VENTI:
        	cost = 2.99;
            break;
        }
        return cost;
	}
}
