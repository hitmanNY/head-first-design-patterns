package ch3.decorator;

public class Decaf extends Beverage {
    
	public Decaf(Size size){
		description = size.toString() + " Decaf Beverage";
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
            cost = 2.00;
        	break;
        }

        return cost;
	}

}
