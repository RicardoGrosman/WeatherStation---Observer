import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayDeviceTest {

    @Test
    void shouldNotifyOneDisplayDevice() {
        WeatherStation station = new WeatherStation("Downtown", 25.0, 60.0, "WS001");
        DisplayDevice device = new DisplayDevice("Display 1");
        device.register(station);
        station.updateWeatherData(26.5, 58.0);
        assertEquals("Display 1, new weather data from WeatherStation{location='Downtown', temperature=26.5, humidity=58.0, stationId='WS001'}", device.getLastNotification());
    }

    @Test
    void shouldNotifyMultipleDisplayDevices() {
        WeatherStation station = new WeatherStation("Downtown", 25.0, 60.0, "WS001");
        DisplayDevice device1 = new DisplayDevice("Display 1");
        DisplayDevice device2 = new DisplayDevice("Display 2");
        device1.register(station);
        device2.register(station);
        station.updateWeatherData(26.5, 58.0);
        assertEquals("Display 1, new weather data from WeatherStation{location='Downtown', temperature=26.5, humidity=58.0, stationId='WS001'}", device1.getLastNotification());
        assertEquals("Display 2, new weather data from WeatherStation{location='Downtown', temperature=26.5, humidity=58.0, stationId='WS001'}", device2.getLastNotification());
    }

    @Test
    void shouldNotNotifyUnregisteredDevice() {
        WeatherStation station = new WeatherStation("Downtown", 25.0, 60.0, "WS001");
        DisplayDevice device = new DisplayDevice("Display 1");
        station.updateWeatherData(26.5, 58.0);
        assertEquals(null, device.getLastNotification());
    }

    @Test
    void shouldNotifyDeviceForSpecificStation() {
        WeatherStation stationA = new WeatherStation("Downtown", 25.0, 60.0, "WS001");
        WeatherStation stationB = new WeatherStation("Suburb", 24.0, 65.0, "WS002");
        DisplayDevice device1 = new DisplayDevice("Display 1");
        DisplayDevice device2 = new DisplayDevice("Display 2");
        device1.register(stationA);
        device2.register(stationB);
        stationA.updateWeatherData(26.5, 58.0);
        assertEquals("Display 1, new weather data from WeatherStation{location='Downtown', temperature=26.5, humidity=58.0, stationId='WS001'}", device1.getLastNotification());
        assertEquals(null, device2.getLastNotification());
    }
}