package com.example.lab2.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab2.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Blank_Degrees#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Blank_Degrees extends Fragment {

    private TextView service;
    private TextView textdegrees;

    private TextView testtext;

    private WorkRequest uploadWorkRequest;

    String numcel, numkel, numfahr = null;

    public double locgic_degree(Spinner datatemp_1, Spinner datatemp_2, double datatemp_3, double kelvin, double fahrenheit, double celsius){
        Context context = getActivity();
        double res;
        switch(datatemp_1.getSelectedItem().toString()) {
            case "celsius":
                switch (datatemp_2.getSelectedItem().toString()) {
                    case "celsius":
                        Serviceforlogic.Service(celsius, celsius, datatemp_3, context);
                        break;
                    case "kelvin":
                        res = datatemp_3+(kelvin-celsius);
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                    case "fahrenheit":
                        res = (datatemp_3*1.8)+(fahrenheit-1.8);
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                }
                break;
            case "kelvin":
                switch (datatemp_2.getSelectedItem().toString()) {
                    case "celsius":
                        res = datatemp_3 = datatemp_3 + (kelvin-1);
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                    case "kelvin":
                        Serviceforlogic.Service(celsius, celsius, datatemp_3, context);
                        break;
                    case "fahrenheit":
                        res = (datatemp_3-(kelvin-celsius))*1.8+(fahrenheit-1.8);
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                }
                break;
            case "fahrenheit":
                switch (datatemp_2.getSelectedItem().toString()) {
                    case "celsius":
                        res = (datatemp_3-(fahrenheit-1.8))*1.8;
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                    case "kelvin":
                        res = (datatemp_3-(fahrenheit-1.8))*0.555+(kelvin-celsius);
                        Serviceforlogic.Service(celsius, celsius, res, context);
                        break;
                    case "fahrenheit":
                        Serviceforlogic.Service(celsius, celsius, datatemp_3, context);
                        break;
                }
                break;
        }
        return datatemp_3;
    }

    private void parseXML(Context context) {
        XmlPullParserFactory parserFactory;
        try {
            parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();
            InputStream is = context.getAssets().open("datadegrees.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(is, null);

            processParsing(parser);

        } catch (XmlPullParserException e) {

        } catch (IOException e) {

        }
    }

    private void processParsing(XmlPullParser parser) throws IOException, XmlPullParserException {
        ArrayList<Degrees> degrees_s = new ArrayList<Degrees>();
        int eventType = parser.getEventType();
        Degrees currentDegrees = null;

        while(eventType != XmlPullParser.END_DOCUMENT){
            String eltName = null;

            switch(eventType){
                case XmlPullParser.START_TAG:
                    eltName = parser.getName();
                    //switch no work
                    if ("degrees".equals(eltName)) {
                        currentDegrees = new Degrees();
                        degrees_s.add(currentDegrees);
                    } else if (currentDegrees != null){
                        if ("celsius".equals(eltName)) {
                            currentDegrees.celsius = parser.nextText();
                        } else if ("kelvin".equals(eltName)) {
                            currentDegrees.kelvin = parser.nextText();
                        } else if ("fahrenheit".equals(eltName)) {
                            currentDegrees.fahrenheit = parser.nextText();
                        }
                    }
                    break;
            }
            eventType = parser.next();
        }
        printDegrees(degrees_s);
    }

    private void printDegrees(ArrayList<Degrees> degrees_s) {
        StringBuilder builder = new StringBuilder();

        for (Degrees degrees : degrees_s) {
            numcel = degrees.celsius;
            numkel = degrees.kelvin;
            numfahr = degrees.kelvin;

            builder.append("Сelsius: ").append(degrees.celsius).append("\n").
                    append("Kelvin: ").append(degrees.kelvin).append("\n").
                    append("Fahrenheit: ").append(degrees.kelvin).append("\n")
            ;
        }

        textdegrees.setText(builder.toString());
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Blank_Degrees() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * //@param param1 Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment Blank_Degrees.
     */
    // TODO: Rename and change types and number of parameters
    public static Blank_Degrees newInstance() {
        Blank_Degrees fragment = new Blank_Degrees();
        /*
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
         */
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_temperature, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Context context = getActivity();

        testtext = view.findViewById(R.id.textView6);
        textdegrees = view.findViewById(R.id.activity_temperature);
        parseXML(context);

        Spinner temperaturesp5, temperaturesp6;
        EditText temperatureed3;
        Button temperatureb3;

        final double celsius = Double.parseDouble(numcel);
        final double kelvin = Double.parseDouble(numkel);
        final double fahrenheit = Double.parseDouble(numfahr);

        temperatureed3 = view.findViewById(R.id.editTextTextPersonName2);
        temperaturesp5 = view.findViewById(R.id.spinner3);
        temperaturesp6 = view.findViewById(R.id.spinner4);
        temperatureb3 = view.findViewById(R.id.button6);

        String[] from = {"celsius", "kelvin", "fahrenheit"};
        ArrayAdapter temperaturead3 = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        temperaturesp5.setAdapter(temperaturead3);

        ArrayAdapter temperaturead4 = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        temperaturesp6.setAdapter(temperaturead4);


        temperatureb3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Double temperaturetot2 = null;
                                Double temperatureamount2 = Double.parseDouble(temperatureed3.getText().toString());

                                Spinner datatempone = temperaturesp5;
                                Spinner datatemptwo = temperaturesp6;
                                Double datatemptree = temperatureamount2;
                                String resulted;

                                locgic_degree(datatempone, datatemptwo, datatemptree, kelvin, fahrenheit, celsius);
                                Toast.makeText(context.getApplicationContext(), "Thread work", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                }).start();
            }
        });
    }
}