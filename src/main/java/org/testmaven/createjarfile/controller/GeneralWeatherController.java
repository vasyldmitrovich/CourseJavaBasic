package org.testmaven.createjarfile.controller;

import org.testmaven.createjarfile.model.Date;
import org.testmaven.createjarfile.model.Weather;
import org.testmaven.createjarfile.utils.CreateWeather;
import org.testmaven.createjarfile.view.WeatherShow;

public class GeneralWeatherController {

    public void showQuestionMessage(){
        WeatherShow weatherShow = new WeatherShow();
        weatherShow.giveProposition();
    }

    public void searchDay(int inputDay){
        Date [] date = CreateWeather.returnDate();
        for (Date d:date
             ) {
            if (d.getDay() == inputDay){
                WeatherShow weatherShow = new WeatherShow();
                weatherShow.showWeatherOnDay(d);
            }

        }
    }

}
