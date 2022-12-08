package com.example.lab2.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab2.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }


    public void onClick_lenght () {
        Blank_Length fragment = Blank_Length.newInstance();
        fragment.setTargetFragment(this, 0);
        getFragmentManager().beginTransaction()
        .addToBackStack(null)
        .replace(R.id.container, fragment)
        .commit();
    }

    public void onClick_weight () {
        Blank_Weight fragment = Blank_Weight.newInstance();
        fragment.setTargetFragment(this, 0);
        getFragmentManager().beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container, fragment)
                .commit();
    }

    public void onClick_degrees () {
        Blank_Degrees fragment = Blank_Degrees.newInstance();
        fragment.setTargetFragment(this, 0);
        getFragmentManager().beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container, fragment)
                .commit();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        view.findViewById(R.id.message);
        view.findViewById(R.id.button2).setOnClickListener(v -> {
            onClick_lenght();
        });
        view.findViewById(R.id.button3).setOnClickListener(v -> {
            onClick_weight();
        });
        view.findViewById(R.id.button4).setOnClickListener(v -> {
            onClick_degrees();
        });
    }

}