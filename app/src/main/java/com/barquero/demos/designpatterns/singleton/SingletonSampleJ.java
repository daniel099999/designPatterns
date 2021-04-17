package com.barquero.demos.designpatterns.singleton;

public class SingletonSampleJ {
    private static SingletonSampleJ uniqueInstance = null;

    private SingletonSampleJ() {

    }

    public static SingletonSampleJ getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSampleJ();
        }

        return uniqueInstance;
    }

}
