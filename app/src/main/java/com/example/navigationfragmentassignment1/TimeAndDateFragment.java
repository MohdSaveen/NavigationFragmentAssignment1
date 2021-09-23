package com.example.navigationfragmentassignment1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TimeAndDateFragment extends Fragment {

    private EditText mEtStartDate;
    private EditText mEtEndDate;
    private EditText mEtStartTime;
    private EditText mEtEndTime;
    private Button mBtnNext2;
    private String title;
    private String desc;
    private NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title=getArguments().getString("title");
            desc=getArguments().getString("description");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_and_date, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        initViews(view);
    }

    private void initViews(View view) {
        mEtStartDate = view.findViewById(R.id.etEventStartDate);
        mEtEndDate = view.findViewById(R.id.etEventEndDate);
        mEtStartTime = view.findViewById(R.id.etEventStartTime);
        mEtEndTime = view.findViewById(R.id.etEventEndTime);
        mBtnNext2 = view.findViewById(R.id.btnNext2);

        mBtnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Date = (mEtStartDate.getText().toString());
                String endDate =(mEtEndDate.getText().toString());
                String startTime = (mEtStartTime.getText().toString());
                String endTime =(mEtEndTime.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("StartDate", Date);
                bundle.putString("EndDate", endDate);
                bundle.putString("StartTime", startTime);
                bundle.putString("EndTime", endTime);
                bundle.putString("title", title);
                bundle.putString("description", desc);
                navController.navigate(R.id.action_timeAndDateFragment_to_priceDetailsFragment, bundle);
            }
        });
    }


}