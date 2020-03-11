package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements ComunicationDevice {
    public void generateWeatherAlert(String weatherConditions) {
        if (weatherConditions == "rainy") {
            System.out.println("It is " + weatherConditions);
        }
    }
}
