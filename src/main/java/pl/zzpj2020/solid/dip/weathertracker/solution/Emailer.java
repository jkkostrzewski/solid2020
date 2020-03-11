package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Emailer implements ComunicationDevice{
    public void generateWeatherAlert(String weatherConditions) {
        if (weatherConditions == "sunny") {
            System.out.println("It is " + weatherConditions);
        }
    }
}
