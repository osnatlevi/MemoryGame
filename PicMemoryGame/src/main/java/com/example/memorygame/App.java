package com.example.memorygame;
import com.example.commonapp.App_Parent;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        statsClass = MainActivity.class;

    }
}
