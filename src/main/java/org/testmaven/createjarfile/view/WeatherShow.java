package org.testmaven.createjarfile.view;

import org.testmaven.createjarfile.model.Date;

public class WeatherShow {

    public void giveProposition(){
        System.out.println("Please input in witch day you want to know weather");
    }

    public void showWeatherOnDay(Date date){
        System.out.println(date);
    }

}
