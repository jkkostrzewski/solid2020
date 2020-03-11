package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {
    String currentConditions;
    ComunicationDevice device;

    public WeatherTracker(ComunicationDevice device) {
        this.device = device;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        device.generateWeatherAlert(weatherDescription);
    }
}