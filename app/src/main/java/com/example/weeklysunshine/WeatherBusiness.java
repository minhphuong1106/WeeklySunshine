package com.example.weeklysunshine;

import java.util.ArrayList;
import java.util.List;

public class WeatherBusiness {
    public List<WeatherModel> InitDummyData(){
        WeatherModel sun = new WeatherModel(MyConstants.AreaName, "Sunday Mar 21",
                MyConstants.WeatherStyles.Clear,
                21,
                11, MyConstants.DisplayStyles.Today);
        WeatherModel mon = new WeatherModel(MyConstants.AreaName, "Tomorrow",
                MyConstants.WeatherStyles.Clouds, 22, 12, MyConstants.DisplayStyles.AnotherDay);
        WeatherModel tue = new WeatherModel(MyConstants.AreaName, "Tuesday",
                MyConstants.WeatherStyles.Fog, 23, 13, MyConstants.DisplayStyles.AnotherDay);
        WeatherModel wed = new WeatherModel(MyConstants.AreaName, "Wednesday",
                MyConstants.WeatherStyles.LightClouds, 24, 14, MyConstants.DisplayStyles.AnotherDay);
        WeatherModel thu = new WeatherModel(MyConstants.AreaName, "Thursday",
                MyConstants.WeatherStyles.LightRain, 25, 15, MyConstants.DisplayStyles.AnotherDay);
        WeatherModel fri = new WeatherModel(MyConstants.AreaName, "Friday",
                MyConstants.WeatherStyles.Rain, 26, 16, MyConstants.DisplayStyles.AnotherDay);
        WeatherModel sat = new WeatherModel(MyConstants.AreaName, "Saturday",
                MyConstants.WeatherStyles.Snow, 27, 17, MyConstants.DisplayStyles.AnotherDay);

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
