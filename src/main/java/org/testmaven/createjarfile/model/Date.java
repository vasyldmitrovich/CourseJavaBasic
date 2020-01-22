package org.testmaven.createjarfile.model;

import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;
    Weather weather;

    public Date(){

    }

    public Date(int day, int month, int year, Weather weather) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.weather = weather;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", weather=" + weather +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year &&
                Objects.equals(weather, date.weather);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year, weather);
    }
}
