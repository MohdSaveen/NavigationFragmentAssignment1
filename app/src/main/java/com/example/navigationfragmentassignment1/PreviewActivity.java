package com.example.navigationfragmentassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

    private TextView mtvStartDate;
    private TextView mTvEndDate;
    private TextView mtvStartTime;
    private TextView mTvEndTime;
    private TextView mTvEventTitle;
    private TextView mTvEventDescription;
    private TextView mTvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        ModelClass modelclass = (ModelClass) getIntent().getSerializableExtra("modelClass");
        mTvEventTitle.setText(modelclass.getEventTitle());
        mTvPrice.setText(modelclass.getPrice()+" ");
        mTvEventDescription.setText(modelclass.getEventDescription());
        mtvStartTime.setText(modelclass.getStartTime());
        mTvEndTime.setText(modelclass.getEndTime());
        mtvStartDate.setText(modelclass.getStartDate());
        mTvEndDate.setText(modelclass.getEndDate());
    }

    private void initViews() {
        mTvEventTitle = findViewById(R.id.tvEventTitle);
        mTvEventDescription = findViewById(R.id.tvDescription);
        mTvPrice = findViewById(R.id.tvPrice);
        mtvStartDate = findViewById(R.id.tvStartDate);
        mTvEndDate = findViewById(R.id.tvEndDate);
        mtvStartTime = findViewById(R.id.tvStartTime);
        mTvEndTime = findViewById(R.id.tvEndTime);
    }
}