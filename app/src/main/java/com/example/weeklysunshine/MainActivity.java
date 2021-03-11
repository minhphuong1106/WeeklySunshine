package com.example.weeklysunshine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<WeatherModel> model;
    private WeatherAdapter adapter;
    private WeatherBusiness business;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        setupView();
    }

    private void initData(){
        business = new WeatherBusiness();
        model = business.InitDummyData();
        adapter = new WeatherAdapter(model, new IOnItemClick() {
            @Override
            public void onClick(int index) {
                openDetailsView(index);
            }
        });

    }

    private void setupView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void openDetailsView(int index){
        WeatherModel weatherModel = model.get(index);
        Intent intent = new Intent(this, WeatherDetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(MyConstants.Keys.ModelDetailsKey, weatherModel);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}