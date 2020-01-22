package org.testmaven.createjarfile.utils;

import org.testmaven.createjarfile.model.Date;
import org.testmaven.createjarfile.model.Weather;

public class CreateWeather {



    public static Weather [] returnWeather(){
        Weather [] weathers = {
                 new Weather(33,15,true),
        new Weather(30,17,true),
        new Weather(25,30,true),
        new Weather(27,70,false),
        new Weather(14,100,false)
        };
        return weathers;
    }
        //TODO щоб брало цей метод а в контролеррі вже брало з другого методу
        // і тут вставляло вхідні параметри погоди
    public static Date[] returnDate(){
        Weather [] weathers = CreateWeather.returnWeather();

        Date[] dates = {
                new Date(1,1,2020,weathers[0]),new Date(2,1,2020,weathers[1]),
                new Date(3,1,2020,weathers[2]),new Date(4,1,2020,weathers[3]),
                new Date(5,1,2020,weathers[4])
        };
        return dates;
    }

}
