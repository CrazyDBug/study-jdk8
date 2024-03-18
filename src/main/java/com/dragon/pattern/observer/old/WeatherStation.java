package com.dragon.pattern.observer.old;

/**
 * @date: 2024/3/19 07:30
 * @author: ybl
 * 策略模式：当有改动便进行推送他
 */
public class WeatherStation {
    public static void main(String[] args) {
        // 推模式
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
    }
}
