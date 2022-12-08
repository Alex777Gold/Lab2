package com.example.lab2.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab2.LogicService;
import com.example.lab2.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Blank_Length#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Blank_Length extends Fragment {

    private TextView textlength;
    private TextView res;

    EditText lengthed1;

    String mnum, cnum, knum, inum, fnum, minum, ynum  = null;
    String nmnum, nknum, ninum, nfnum, nminum, nynum = null;

    double length;

    public static double sant (double num, double form, double to){
        return num*form * to;
    }
/*
    double meters = mnum;
    double centimeter = cnum;
    double kilometer = knum;
    double inch = inum;
    double foot = fnum;
    double mile = minum;
    double yard = ynum;

    double nmeters = nmnum;
    double nkilometer = nknum;
    double ninch = ninum;
    double nfoot = nfnum;
    double nmile = nminum;
    double nyard = nynum;

    public static double sant (double num, double form, double to){
        return num*form * to;
    }
*/

    public double locgic_length(Spinner datatemp_1, Spinner datatemp_2, double length, double amount,
                                double centimeter, double meters, double kilometer, double inch, double foot, double mile, double yard,
                                double nmeters, double nkilometer, double ninch, double nfoot, double nmile, double nyard
    ){
        Context context = getActivity();

        Double lengthamounts = Double.parseDouble(lengthed1.getText().toString());

        switch(datatemp_1.getSelectedItem().toString()){
            case "centimeter":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(centimeter, centimeter, lengthamounts, context);
                        break;
                    case "meter":
                        Serviceforlogic.Service(centimeter, meters, lengthamounts, context);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(centimeter, kilometer, lengthamounts, context);
                        break;
                    case "inch":
                        Serviceforlogic.Service(centimeter, inch, lengthamounts, context);
                        break;
                    case "mile":
                        Serviceforlogic.Service(centimeter, mile, lengthamounts, context);
                        break;
                    case "yard":
                        Serviceforlogic.Service(centimeter, yard, lengthamounts, context);
                        break;
                    case "foot":
                        Serviceforlogic.Service(centimeter, foot, lengthamounts, context);
                        break;
                }
                break;
            case "meter":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(nmeters, centimeter, amount, context);
                        //length = sant(nmeters, amount, centimeter);
                        break;
                    case "meter":
                        Serviceforlogic.Service(nmeters, meters, amount, context);
                        //length = sant(nmeters, amount, meters);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(nmeters, kilometer, amount, context);
                        //length = sant(nmeters, amount, kilometer);
                        break;
                    case "inch":
                        Serviceforlogic.Service(nmeters, inch, amount, context);
                        //length = sant(nmeters,amount, inch);
                        break;
                    case "mile":
                        Serviceforlogic.Service(nmeters, mile, amount, context);
                        //length = sant(nmeters, amount, mile);
                        break;
                    case "yard":
                        Serviceforlogic.Service(nmeters, yard, amount, context);
                        //length = sant(nmeters, amount, yard);
                        break;
                    case "foot":
                        Serviceforlogic.Service(nmeters, foot, amount, context);
                        //length = sant(nmeters, amount, foot);
                        break;
                }
                break;
            case "kilometer":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(nkilometer, centimeter, amount, context);
                        //length = sant(nkilometer, amount, centimeter);
                        break;
                    case "meter":
                        Serviceforlogic.Service(nkilometer, meters, amount, context);
                        //length = sant(nkilometer, amount, meters);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(nkilometer, kilometer, amount, context);
                        //length = sant(nkilometer, amount, kilometer);
                        break;
                    case "inch":
                        Serviceforlogic.Service(nkilometer, inch, amount, context);
                        //length = sant(nkilometer, amount, inch);
                        break;
                    case "mile":
                        Serviceforlogic.Service(nkilometer, mile, amount, context);
                        //length = sant(nkilometer, amount, mile);
                        break;
                    case "yard":
                        Serviceforlogic.Service(nkilometer, yard, amount, context);
                        //length = sant(nkilometer, amount, yard);
                        break;
                    case "foot":
                        Serviceforlogic.Service(nkilometer, foot, amount, context);
                        //length = sant(nkilometer, amount, foot);
                        break;
                }
                break;
            case "inch":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(ninch, centimeter, amount, context);
                        //length = sant(ninch, amount, centimeter);
                        break;
                    case "meter":
                        Serviceforlogic.Service(ninch, meters, amount, context);
                        //length = sant(ninch, amount, meters);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(ninch, kilometer, amount, context);
                        //length = sant(ninch, amount, kilometer);
                        break;
                    case "inch":
                        Serviceforlogic.Service(ninch, inch, amount, context);
                        //length = sant(ninch, amount, inch);
                        break;
                    case "mile":
                        Serviceforlogic.Service(ninch, mile, amount, context);
                        //length = sant(ninch, amount, mile);
                        break;
                    case "yard":
                        Serviceforlogic.Service(ninch, yard, amount, context);
                        //length = sant(ninch, amount, yard);
                        break;
                    case "foot":
                        Serviceforlogic.Service(ninch, foot, amount, context);
                        //length = sant(ninch, amount, foot);
                        break;
                }
                break;
            case "mile":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(nmile, centimeter, amount, context);
                        //length = sant(nmile, amount, centimeter);
                        break;
                    case "meter":
                        Serviceforlogic.Service(nmile, meters, amount, context);
                        //length = sant(nmile, amount, meters);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(nmile, kilometer, amount, context);
                        //length = sant(nmile, amount, kilometer);
                        break;
                    case "inch":
                        Serviceforlogic.Service(nmile, inch, amount, context);
                        //length = sant(nmile, amount, inch);
                        break;
                    case "mile":
                        Serviceforlogic.Service(nmile, mile, amount, context);
                        //length = sant(nmile, amount, mile);
                        break;
                    case "yard":
                        Serviceforlogic.Service(nmile, yard, amount, context);
                        //length = sant(nmile, amount, yard);
                        break;
                    case "foot":
                        Serviceforlogic.Service(nmile, foot, amount, context);
                        //length = sant(nmile, amount, foot);
                        break;
                }
                break;
            case "yard":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(nyard, centimeter, amount, context);
                        //length = sant(nyard, amount, centimeter);
                        break;
                    case "meter":
                        Serviceforlogic.Service(nyard, meters, amount, context);
                        //length = sant(nyard, amount, meters);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(nyard, kilometer, amount, context);
                        //length = sant(nyard, amount, kilometer);
                        break;
                    case "inch":
                        Serviceforlogic.Service(nyard, inch, amount, context);
                        //length = sant(nyard, amount, inch);
                        break;
                    case "mile":
                        Serviceforlogic.Service(nyard, mile, amount, context);
                        //length = sant(nyard, amount, mile);
                        break;
                    case "yard":
                        Serviceforlogic.Service(nyard, yard, amount, context);
                        //length = sant(nyard, amount, yard);
                        break;
                    case "foot":
                        Serviceforlogic.Service(nyard, foot, amount, context);
                        //length = sant(nyard, amount, foot);
                        break;
                }
                break;
            case "foot":
                switch (datatemp_2.getSelectedItem().toString()){
                    case "centimeter":
                        Serviceforlogic.Service(nfoot, centimeter, amount, context);
                        break;
                    case "meter":
                        Serviceforlogic.Service(nfoot, meters, amount, context);
                        break;
                    case "kilometer":
                        Serviceforlogic.Service(nfoot, kilometer, amount, context);
                        break;
                    case "inch":
                        Serviceforlogic.Service(nfoot, inch, amount, context);
                        break;
                    case "mile":
                        Serviceforlogic.Service(nfoot, mile, amount, context);
                        break;
                    case "yard":
                        Serviceforlogic.Service(nfoot, yard, amount, context);
                        break;
                    case "foot":
                        Serviceforlogic.Service(nfoot, foot, amount, context);
                        break;
                }
                break;

        }
        return 0;
    }

    private void parseXML(Context context) {
        XmlPullParserFactory parserFactory;
        try {
            parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();
            InputStream is = context.getAssets().open("datalength.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(is, null);

            processParsing(parser);

        } catch (XmlPullParserException e) {

        } catch (IOException e) {

        }
    }

    private void processParsing(XmlPullParser parser) throws IOException, XmlPullParserException {
        ArrayList<Length> lengths = new ArrayList<Length>();
        int eventType = parser.getEventType();
        Length currentLength = null;

        while(eventType != XmlPullParser.END_DOCUMENT){
            String eltName = null;

            switch(eventType){
                case XmlPullParser.START_TAG:
                    eltName = parser.getName();
                    //switch no work
                    if ("length".equals(eltName)) {
                        currentLength = new Length();
                        lengths.add(currentLength);
                    } else if (currentLength != null){
                        if ("meter".equals(eltName)) {
                            currentLength.meter = parser.nextText();
                        } else if ("centimeter".equals(eltName)) {
                            currentLength.centimeter = parser.nextText();
                        } else if ("kilometer".equals(eltName)) {
                            currentLength.kilometer = parser.nextText();
                        } else if ("inch".equals(eltName)) {
                            currentLength.inch = parser.nextText();
                        } else if ("foot".equals(eltName)) {
                            currentLength.foot = parser.nextText();
                        } else if ("mile".equals(eltName)) {
                            currentLength.mile = parser.nextText();
                        } else if ("yard".equals(eltName)) {
                            currentLength.yard = parser.nextText();
                        } else if ("nmeter".equals(eltName)) {
                            currentLength.nmeter = parser.nextText();
                        }else if ("nkilometer".equals(eltName)) {
                            currentLength.nkilometer = parser.nextText();
                        } else if ("ninch".equals(eltName)) {
                            currentLength.ninch = parser.nextText();
                        } else if ("nfoot".equals(eltName)) {
                            currentLength.nfoot = parser.nextText();
                        } else if ("nmile".equals(eltName)) {
                            currentLength.nmile = parser.nextText();
                        } else if ("nyard".equals(eltName)) {
                            currentLength.nyard = parser.nextText();
                        }
                    }
                    break;
            }
            eventType = parser.next();
        }
        printLengths(lengths);
    }

    private void printLengths(ArrayList<Length> lengths) {
        StringBuilder builder = new StringBuilder();

        for (Length length : lengths) {
            /*
            mnum = Double.parseDouble(length.meter);
            cnum = Double.parseDouble(length.centimeter);
            knum = Double.parseDouble(length.kilometer);
            inum = Double.parseDouble(length.inch);
            fnum = Double.parseDouble(length.foot);
            minum = Double.parseDouble(length.mile);
            ynum = Double.parseDouble(length.yard);
            nmnum = Double.parseDouble(length.nmeter);
            nknum = Double.parseDouble(length.nkilometer);
            ninum = Double.parseDouble(length.ninch);
            nfnum = Double.parseDouble(length.nfoot);
            nminum = Double.parseDouble(length.nmile);
            nynum = Double.parseDouble(length.nyard);
             */
            mnum = length.meter;
            cnum = length.centimeter;
            knum = length.kilometer;
            inum = length.inch;
            fnum = length.foot;
            minum = length.mile;
            ynum = length.yard;
            nmnum = length.nmeter;
            nknum = length.nkilometer;
            ninum = length.ninch;
            nfnum = length.nfoot;
            nminum = length.nmile;
            nynum = length.nyard;

            builder.append("Meters: ").append(length.meter).append("\n").
                    append("Centimeter: ").append(length.centimeter).append("\n").
                    append("Kilometer: ").append(length.kilometer).append("\n").
                    append("Inch: ").append(length.inch).append("\n").
                    append("Foot: ").append(length.foot).append("\n").
                    append("Mile: ").append(length.mile).append("\n").
                    append("Yard: ").append(length.yard).append("\n").
                    append("Dop Meters: ").append(length.nmeter).append("\n").
                    append("Dop Kilometer: ").append(length.nkilometer).append("\n").
                    append("Dop Inch: ").append(length.ninch).append("\n").
                    append("Dop Foot: ").append(length.nfoot).append("\n").
                    append("Dop Mile: ").append(length.nmile).append("\n").
                    append("Dop Yard: ").append(length.nyard).append("\n")
            ;
        }

        textlength.setText(builder.toString());
    }

    //Fragment code

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Blank_Length() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param //param1 Parameter 1.
     * @param //param2 Parameter 2.
     * @return A new instance of fragment Blank_Length.
     */
    // TODO: Rename and change types and number of parameters
    public static Blank_Length newInstance() {
        Blank_Length fragment = new Blank_Length();
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
        return inflater.inflate(R.layout.fragment_length, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Context context = getActivity();

        textlength = view.findViewById(R.id.activity_length);

        parseXML(context);

        Spinner lengthsp1, lengthsp2;
        //EditText lengthed1;
        Button lengthb1;

        final double meters = Double.parseDouble(mnum);
        final double centimeter = Double.parseDouble(cnum);
        final double kilometer = Double.parseDouble(knum);
        final double inch = Double.parseDouble(inum);
        final double foot = Double.parseDouble(fnum);
        final double mile = Double.parseDouble(minum);
        final double yard = Double.parseDouble(ynum);

        double nmeters = Double.parseDouble(nmnum);
        double nkilometer = Double.parseDouble(nknum);
        double ninch = Double.parseDouble(ninum);
        double nfoot = Double.parseDouble(nfnum);
        double nmile = Double.parseDouble(nminum);
        double nyard = Double.parseDouble(nynum);

        lengthed1 = view.findViewById(R.id.editTextTextPersonName);
        lengthsp1 = view.findViewById(R.id.spinner);
        lengthsp2 = view.findViewById(R.id.spinner2);
        lengthb1 = view.findViewById(R.id.button);

        String[] from = {"centimeter", "meter", "kilometer", "inch", "mile", "yard", "foot"};

        ArrayAdapter lengthad = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        lengthsp1.setAdapter(lengthad);

        ArrayAdapter lengthad1 = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        lengthsp2.setAdapter(lengthad1);

        res = view.findViewById(R.id.textView4);

        lengthb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Double lengthtots = Double.valueOf(0);
                                    Double lengthamount = Double.parseDouble(lengthed1.getText().toString());

                                    Spinner datalenone = lengthsp1;
                                    Spinner datalentwo = lengthsp2;
                                    Double lengthamounts = lengthamount;
                                    String resulted;

                                    locgic_length(datalenone, datalentwo, lengthtots, lengthamounts,
                                            centimeter, meters, kilometer, inch, foot, mile, yard,
                                            nmeters, nkilometer, ninch, nfoot, nmile, nyard);
                                    Toast.makeText(context.getApplicationContext(), "Thread work", Toast.LENGTH_LONG).show();
                                }
                            });
                        }
                    }).start();
            }

        });
    }
}