package com.example.administrator.binheweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
