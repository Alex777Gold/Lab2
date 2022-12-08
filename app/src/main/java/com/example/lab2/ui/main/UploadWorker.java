package com.example.lab2.ui.main;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.example.lab2.R;

public class UploadWorker extends Worker {

    public static final String Worker = "Worker";

    public UploadWorker(@NonNull Context context,
                        @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        ContextCompat.getMainExecutor(getApplicationContext()).execute(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Work Manager Started!", Toast.LENGTH_SHORT).show();

                double kelvin = 0;
                double fahrenheit = 0;
                double celsius = 0;

                Spinner temperaturesp5, temperaturesp6;
                EditText temperatureed3;
                Button temperatureb3;
/*
                temperatureed3 = findViewById(R.id.editTextTextPersonName2);
                temperaturesp5 = view.findViewById(R.id.spinner3);
                temperaturesp6 = view.findViewById(R.id.spinner4);
                temperatureb3 = view.findViewById(R.id.button6);

                Double temperaturetot2 = null;
                Double temperatureamount2 = Double.parseDouble(temperatureed3.getText().toString());

                Spinner datatempone = temperaturesp5;
                Spinner datatemptwo = temperaturesp6;
                //Double datatemptree = temperatureamount2;
                String resulted;

                resulted = String.valueOf(Blank_Degrees.locgic_degree(datatempone, datatemptwo, datatemptree, kelvin, fahrenheit, celsius));
                Toast.makeText(getApplicationContext(), resulted, Toast.LENGTH_LONG).show();
*/
            }
        });

        return null;
    }
}
