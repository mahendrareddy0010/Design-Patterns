package behavioural.observerPattern;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        WeatherStation weatherStation = new WeatherStation();
        @SuppressWarnings("unused")
        TemparatureDisplay temparatureDisplay = new TemparatureDisplay(weatherStation);
        @SuppressWarnings("unused")
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherStation);
        @SuppressWarnings("unused")
        PressureDisplay pressureDisplay = new PressureDisplay(weatherStation);

        weatherStation.setMeasurements(random.nextDouble(30, 50), random.nextDouble(100, 150), random.nextDouble(500, 600));
        Thread.sleep(1000);
        weatherStation.setMeasurements(random.nextDouble(30, 50), random.nextDouble(100, 150), random.nextDouble(500, 600));
        Thread.sleep(1000);
        weatherStation.setMeasurements(random.nextDouble(30, 50), random.nextDouble(100, 150), random.nextDouble(500, 600));        
    }
}
