package BEHAVIORALDESIGNPATTERNS.ObserverPattern.Example;

public class App {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver obsever = new WeatherObserver(station);
        station.setHumidity(100);
        station.setPressure(200);
        station.setTemperature(300);
    }
}
