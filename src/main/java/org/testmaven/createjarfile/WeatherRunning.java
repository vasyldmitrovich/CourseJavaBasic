package org.testmaven.createjarfile;

import org.testmaven.createjarfile.controller.GeneralWeatherController;
import org.testmaven.createjarfile.model.Date;
import org.testmaven.createjarfile.model.Weather;
import org.testmaven.createjarfile.utils.CreateObject;
import org.testmaven.createjarfile.utils.CreateWeather;

import java.util.Scanner;

public class WeatherRunning {
    public static void main(String[]args){
        /*In this class we will be show weather any day what you want,
         but only that day what we have ;-) */
        GeneralWeatherController generalWeatherController = new GeneralWeatherController();
        generalWeatherController.showQuestionMessage();
        int inputNumber = inputNumber();
        generalWeatherController.searchDay(inputNumber);




    }

    public static int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}
