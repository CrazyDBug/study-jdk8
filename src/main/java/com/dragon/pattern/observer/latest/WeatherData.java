package com.dragon.pattern.observer.latest;

import java.util.Observable;

/**
 * @date: 2024/3/19 07:42
 * @author: ybl
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public void WeatherData() {
    }
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
