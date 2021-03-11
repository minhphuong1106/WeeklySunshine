package com.example.weeklysunshine;

import java.io.Serializable;

public class WeatherModel implements Serializable {
    private String areaName;
    private String dayName;
    private String weatherStatus;
    private String imgPath;
    private int maxDegree;
    private int minDegree;
    private String humidity;
    private String pressure;
    private String wind;
    private int artThumb;
    private int icThumb;
    private int displayStyle;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public void setMaxDegree(int maxDegree) {
        this.maxDegree = maxDegree;
    }

    public int getMinDegree() {
        return minDegree;
    }

    public void setMinDegree(int minDegree) {
        this.minDegree = minDegree;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public int getArtThumb() {
        return artThumb;
    }

    public int getIcThumb() {
        return icThumb;
    }

    public void setThumbs() {
        switch (weatherStatus) {
            case MyConstants.WeatherStyles.Clear:
                artThumb = R.drawable.art_clear;
                icThumb = R.drawable.ic_clear;
                break;
            case MyConstants.WeatherStyles.Clouds:
                artThumb = R.drawable.art_clouds;
                icThumb = R.drawable.ic_cloudy;
                break;
            case MyConstants.WeatherStyles.Fog:
                artThumb = R.drawable.art_fog;
                icThumb = R.drawable.ic_fog;
                break;
            case MyConstants.WeatherStyles.LightClouds:
                artThumb = R.drawable.art_light_clouds;
                icThumb = R.drawable.ic_light_clouds;
                break;
            case MyConstants.WeatherStyles.LightRain:
                artThumb = R.drawable.art_light_rain;
                icThumb = R.drawable.ic_light_rain;
                break;
            case MyConstants.WeatherStyles.Rain:
                artThumb = R.drawable.art_rain;
                icThumb = R.drawable.ic_rain;
                break;
            case MyConstants.WeatherStyles.Snow:
                artThumb = R.drawable.art_snow;
                icThumb = R.drawable.ic_snow;
                break;
            case MyConstants.WeatherStyles.Storm:
                artThumb = R.drawable.art_storm;
                icThumb = R.drawable.ic_storm;
                break;
            default:
                artThumb = 0;
                icThumb = 0;
        }
    }

    public int getDisplayStyle() {
        return displayStyle;
    }

    public void setDisplayStyle(int displayStyle) {
        this.displayStyle = displayStyle;
    }

    public WeatherModel(String areaName
            , String dayName
            , String weatherStatus
            , int maxDegree
            , int minDegree
            , int displayStyle) {
        this.areaName = areaName;
        this.dayName = dayName;
        this.weatherStatus = weatherStatus;
        this.maxDegree = maxDegree;
        this.minDegree = minDegree;
        this.displayStyle = displayStyle;
        setThumbs();
    }
}
