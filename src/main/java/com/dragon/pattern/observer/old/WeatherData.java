package com.dragon.pattern.observer.old;

import java.util.ArrayList;

/**
 * @date: 2024/3/19 07:15
 * @author: ybl
 */
public class WeatherData implements Subject {

    private ArrayList observer;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observer = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observer.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observer.indexOf(o);
        if (i >= 0) {
            observer.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observer.size(); i++) {
            Observer o = (Observer) observer.get(i);
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
