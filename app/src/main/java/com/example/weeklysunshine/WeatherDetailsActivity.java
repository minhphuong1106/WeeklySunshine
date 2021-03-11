package com.example.weeklysunshine;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherDetailsActivity extends AppCompatActivity {
    private WeatherModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_details);
        getModel();
        setDataToView();
    }

    private void getModel(){
        Intent intent = getIntent();
        model = (WeatherModel) intent.getExtras().getSerializable(MyConstants.Keys.ModelDetailsKey);
    }

    private void setDataToView() {
        TextView tvDayName = findViewById(R.id.tvDayName);
        tvDayName.setText(model.getDayName());

        TextView tvMaxDegree = findViewById(R.id.tvMaxDegree);
        tvMaxDegree.setText(Integer.toString(model.getMaxDegree()));

        TextView tvMinDegree = findViewById(R.id.tvMinDegree);
        tvMinDegree.setText(Integer.toString(model.getMinDegree()));

        TextView tvWeatherStatus = findViewById(R.id.tvWeatherStatus);
        tvMinDegree.setText(model.getWeatherStatus());

        ImageView ivThumb = findViewById(R.id.ivThumb);
        ivThumb.setImageResource(model.getArtThumb());

        TextView tvArea =  findViewById(R.id.tvArea);
        tvArea.setText(model.getAreaName());

        TextView tvHumidity =  findViewById(R.id.tvHumidity);
        tvHumidity.setText(model.getHumidity());

        TextView tvPressure =  findViewById(R.id.tvPressure);
        tvPressure.setText(model.getPressure());

        TextView tvWind =  findViewById(R.id.tvWind);
        tvWind.setText(model.getWind());
    }
}