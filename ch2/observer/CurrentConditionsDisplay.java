package ch2.observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    
	private float tempature;
	private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.tempature = temp;
        this.humidity = humidity;
        display();
	}

	@Override
	public void display() {
        System.out.println("CurrentConditions: " + tempature + "F degrees and " + humidity + "% humidity");
	}

}
