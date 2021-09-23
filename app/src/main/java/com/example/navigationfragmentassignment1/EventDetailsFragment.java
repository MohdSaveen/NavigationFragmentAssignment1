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


public class EventDetailsFragment extends Fragment {

    private EditText mEtTitle;
    private EditText mEtDescription;
    private Button mBtnNext;
    private NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        initViews(view);
    }

    private void initViews(View view) {
        mEtTitle=view.findViewById(R.id.etEventTitle);
        mEtDescription=view.findViewById(R.id.etEventDescription);
        mBtnNext=view.findViewById(R.id.btnNext);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=mEtTitle.getText().toString();
                String description=mEtDescription.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("title",title);
                bundle.putString("description",description);
                navController.navigate(R.id.action_eventDetailsFragment_to_timeAndDateFragment,bundle);

            }
        });

    }
}