package com.example.weeklysunshine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<WeatherModel> model;
    private IOnItemClick onItemClick;

    public WeatherAdapter(List<WeatherModel> model, IOnItemClick onItemClick){
        this.model = model;
        this.onItemClick = onItemClick;
    }

    @Override
    public int getItemViewType(int position) {
        return this.model.get(position).getDisplayStyle();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int itemLayoutId = (viewType == MyConstants.DisplayStyles.Today)
                ? R.layout.today_item
                : R.layout.another_day_item;
        View view = layoutInflater.inflate(itemLayoutId, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WeatherModel item = model.get(position);
        setDataToView(item, holder, position);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    private void setDataToView(final WeatherModel item, final ViewHolder viewHolder, final int position) {
        View view = viewHolder.getView();

        TextView tvDayName = view.findViewById(R.id.tvDayName);
        tvDayName.setText(item.getDayName());

        TextView tvMaxDegree = view.findViewById(R.id.tvMaxDegree);
        tvMaxDegree.setText(Integer.toString(item.getMaxDegree()));

        TextView tvMinDegree = view.findViewById(R.id.tvMinDegree);
        tvMinDegree.setText(Integer.toString(item.getMinDegree()));

        TextView tvWeatherStatus = view.findViewById(R.id.tvWeatherStatus);
        tvMinDegree.setText(item.getWeatherStatus());

        ImageView ivThumb = view.findViewById(R.id.ivThumb);
        if (item.getDisplayStyle() == MyConstants.DisplayStyles.Today)
        {
            ivThumb.setImageResource(item.getArtThumb());
            TextView tvArea =  view.findViewById(R.id.tvArea);
            tvArea.setText(item.getAreaName());
        }
        else{
            ivThumb.setImageResource(item.getIcThumb());
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(position);
            }
        });
    }
}
