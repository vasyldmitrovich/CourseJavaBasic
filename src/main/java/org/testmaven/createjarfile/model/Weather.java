package org.testmaven.createjarfile.model;

public class Weather {
    private int temperature;
    private int humidity;
    private boolean sunny;

    public Weather(){

    }

    public Weather(int temperature, int humidity, boolean sunny) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.sunny = sunny;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public boolean isSunny() {
        return sunny;
    }

    public void setSunny(boolean sunny) {
        this.sunny = sunny;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", sunny=" + sunny +
                '}';
    }
}
