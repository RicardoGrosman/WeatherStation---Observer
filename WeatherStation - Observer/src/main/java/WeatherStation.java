import java.util.Observable;

public class WeatherStation extends Observable {

    private String location;
    private double temperature;
    private double humidity;
    private String stationId;

    public WeatherStation(String location, double temperature, double humidity, String stationId) {
        this.location = location;
        this.temperature = temperature;
        this.humidity = humidity;
        this.stationId = stationId;
    }

    public void updateWeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "location='" + location + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", stationId='" + stationId + '\'' +
                '}';
    }
}