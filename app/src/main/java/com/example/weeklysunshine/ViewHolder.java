package com.example.weeklysunshine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    View view;
    ViewHolder(View view) {
        super(view);
        this.view = view;
    }

    View getView() {
        return view;
    }
}
