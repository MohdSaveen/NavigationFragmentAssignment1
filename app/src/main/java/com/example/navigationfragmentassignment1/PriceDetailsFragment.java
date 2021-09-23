package com.example.navigationfragmentassignment1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.lang.annotation.Native;

public class PriceDetailsFragment extends Fragment {


    private EditText mEtCurrency;
    private EditText mEtPrice;
    private Button mBtnPreview;
    private String startDate;
    private String EndDate;
    private String startTime;
    private String EndTime;
    private String EventTitle;
    private String EventDescription;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            startDate = getArguments().getString("StartDate");
            EndDate = getArguments().getString("EndDate");
            startTime = getArguments().getString("StartTime");
            EndTime = getArguments().getString("EndTime");
            EventTitle = getArguments().getString("title");
            EventDescription = getArguments().getString("description");


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mEtCurrency = view.findViewById(R.id.etCurrency);
        mEtPrice = view.findViewById(R.id.etPrice);
        mBtnPreview = view.findViewById(R.id.previewButton);

        mBtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int price = Integer.parseInt(mEtPrice.getText().toString());
                ModelClass modelClass = new ModelClass(startDate, EndDate, startTime, EndTime, EventTitle, EventDescription, price);
                Intent intent = new Intent(getContext(), PreviewActivity.class);
                intent.putExtra("modelClass",modelClass);
                startActivity(intent);

            }
        });
    }
}