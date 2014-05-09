package ch3.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size){
    	description = size.toString() + " Dark Roast Beverage";
        this.size = size;
    }

	@Override
	public double cost() {
        
        double cost = 0;
        
        switch(size){
        case TALL:
        	cost = .50;
            break;
        case GRANDE:
        	cost = 1.50;
            break;
        case VENTI:
        	cost = 2.50;
            break;
        }
        return cost;
	}

}
