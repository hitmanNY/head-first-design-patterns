package ch3.decorator;

public abstract class Beverage {
    public enum Size {
        TALL,
    	VENTI,
    	GRANDE
    }
    
	String description = "Unknown beverage.";
    Size size;
    
	public String getDescription(){
		return description;
	}
    
    public abstract double cost();
}
