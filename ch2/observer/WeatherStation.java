package ch2.observer;

public class WeatherStation {
    
	public static void main(String args[]){
		WeatherData weatherData = new WeatherData();
        
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        
	}

}
