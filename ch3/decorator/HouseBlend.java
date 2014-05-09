package ch3.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size){
    	description = size.toString() + " House blend Beverage";
        this.size = size;
    }
    
	@Override
	public double cost() {
        double cost = 0;
        switch(size){
        case TALL:
            cost = 1.00;
        	break;
        case GRANDE:
            cost = 1.50;
        	break;
        case VENTI:
            cost = 1.75;
        	break;
        }
        	
        return cost;
	}
}
