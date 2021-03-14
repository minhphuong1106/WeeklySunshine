package com.example.weeklysunshine;

import java.util.ArrayList;
import java.util.List;

public class WeatherBusiness {
    public List<WeatherModel> GetData(){
        List<WeatherModel> result = InitDummyData();
        return result;
    }

    private List<WeatherModel> InitDummyData(){
        WeatherModel sun = new WeatherModel(ProjectConstants.AreaName, "Sunday Mar 21",
                ProjectConstants.WeatherStyles.Clear,21, 11, ProjectConstants.DisplayStyles.Today);
        WeatherModel mon = new WeatherModel(ProjectConstants.AreaName, "Tomorrow",
                ProjectConstants.WeatherStyles.Clouds, 22, 12, ProjectConstants.DisplayStyles.AnotherDay);
        WeatherModel tue = new WeatherModel(ProjectConstants.AreaName, "Tuesday",
                ProjectConstants.WeatherStyles.Fog, 23, 13, ProjectConstants.DisplayStyles.AnotherDay);
        WeatherModel wed = new WeatherModel(ProjectConstants.AreaName, "Wednesday",
                ProjectConstants.WeatherStyles.LightClouds, 24, 14, ProjectConstants.DisplayStyles.AnotherDay);
        WeatherModel thu = new WeatherModel(ProjectConstants.AreaName, "Thursday",
                ProjectConstants.WeatherStyles.LightRain, 25, 15, ProjectConstants.DisplayStyles.AnotherDay);
        WeatherModel fri = new WeatherModel(ProjectConstants.AreaName, "Friday",
                ProjectConstants.WeatherStyles.Rain, 26, 16, ProjectConstants.DisplayStyles.AnotherDay);
        WeatherModel sat = new WeatherModel(ProjectConstants.AreaName, "Saturday",
                ProjectConstants.WeatherStyles.Snow, 27, 17, ProjectConstants.DisplayStyles.AnotherDay);

        List<WeatherModel> result = new ArrayList<>();
        result.add(sun);
        result.add(mon);
        result.add(tue);
        result.add(wed);
        result.add(thu);
        result.add(fri);
        result.add(sat);

        for(int i=0; i < result.size(); i++){
            WeatherModel item = result.get(i);
            item.setHumidity("Humidity: 72%");
            item.setPressure("Pressure: 1038 hpA");
            item.setWind("Wind: 3 km/h NE");
        }

        return result;
    }
}
