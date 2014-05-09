package ch2.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float tempature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
    	observers = new ArrayList<Observer>();
    }
    
	@Override
    public void registerObserver(Observer o ){
    	observers.add(o);
    }
    
	@Override
	public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if ( i > 0){
        	observers.remove(i);
        }
	}

	@Override
	public void notifyObservers() {
		for( Observer obs : observers){
			obs.update(tempature, humidity, pressure);
		}
	}
    
	public void measurementsChange(){
		notifyObservers();
	}
    
	public void setMeasurements(float temp, float humidity, float pressure){
		this.tempature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
	}
}
