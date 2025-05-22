import java.util.Observable;
import java.util.Observer;

public class DisplayDevice implements Observer {

    private String deviceName;
    private String lastNotification;

    public DisplayDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getLastNotification() {
        return this.lastNotification;
    }

    public void register(WeatherStation station) {
        station.addObserver(this);
    }

    @Override
    public void update(Observable station, Object arg) {
        this.lastNotification = this.deviceName + ", new weather data from " + station.toString();
    }
}
