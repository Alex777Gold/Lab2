package com.example.lab2.ui.main;

import android.content.Context;
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

import com.example.lab2.R;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Blank_Weight#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Blank_Weight extends Fragment {

    private TextView textweight;
    String grnum, kinum, tnum, canum, fonum, pudnum;
    String nkinum, ntnum, ncanum, nfonum, npudnum;

    public double locgic_weight(Spinner datatemp_3, Spinner datatemp_4, double datatemp_5, double datatemp_6,
                                double gramm, double kilogramm, double tonna, double carat, double foont, double pud,
                                double nkilogramm, double ntonna, double ncarat, double nfoont, double npud
    ){
        Context context = getActivity();

        switch(datatemp_3.getSelectedItem().toString()) {
            case "gramm":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(gramm, kilogramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(gramm, tonna, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(gramm, carat, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(gramm, foont, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(gramm, pud, datatemp_6, context);
                        break;
                }
                break;
            case "kilogramm":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(nkilogramm, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(nkilogramm, tonna, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(nkilogramm, carat, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(nkilogramm, foont, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(nkilogramm, pud, datatemp_6, context);
                        break;
                }
                break;
            case "tonna":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(ntonna, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(ntonna, kilogramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(ntonna, carat, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(ntonna, foont, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(ntonna, pud, datatemp_6, context);
                        break;
                }
                break;
            case "carat":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(ncarat, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(ncarat, kilogramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(ncarat, tonna, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(ncarat, foont, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(ncarat, pud, datatemp_6, context);
                        break;
                }
                break;
            case "foont":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(nfoont, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(nfoont, kilogramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(nfoont, tonna, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(nfoont, carat, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(nfoont, pud, datatemp_6, context);
                        break;
                }
                break;
            case "pud":
                switch (datatemp_4.getSelectedItem().toString()) {
                    case "gramm":
                        Serviceforlogic.Service(npud, gramm, datatemp_6, context);
                        break;
                    case "kilogramm":
                        Serviceforlogic.Service(npud, kilogramm, datatemp_6, context);
                        break;
                    case "tonna":
                        Serviceforlogic.Service(npud, tonna, datatemp_6, context);
                        break;
                    case "carat":
                        Serviceforlogic.Service(npud, carat, datatemp_6, context);
                        break;
                    case "foont":
                        Serviceforlogic.Service(npud, foont, datatemp_6, context);
                        break;
                    case "pud":
                        Serviceforlogic.Service(gramm, gramm, datatemp_6, context);
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
            InputStream is = context.getAssets().open("dataweight.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(is, null);

            processParsing(parser);

        } catch (XmlPullParserException e) {

        } catch (IOException e) {

        }
    }

    private void processParsing(XmlPullParser parser) throws IOException, XmlPullParserException {
        ArrayList<Weight> weights = new ArrayList<Weight>();
        int eventType = parser.getEventType();
        Weight currenWeight = null;

        while(eventType != XmlPullParser.END_DOCUMENT){
            String eltName = null;

            switch(eventType){
                case XmlPullParser.START_TAG:
                    eltName = parser.getName();
                    //switch no work
                    if ("weight".equals(eltName)) {
                        currenWeight = new Weight();
                        weights.add(currenWeight);
                    } else if (currenWeight != null){
                        if ("kilogram".equals(eltName)) {
                            currenWeight.kilogram = parser.nextText();
                        } else if ("gram".equals(eltName)) {
                            currenWeight.gram = parser.nextText();
                        } else if ("tonna".equals(eltName)) {
                            currenWeight.tonna = parser.nextText();
                        } else if ("carat".equals(eltName)) {
                            currenWeight.carat = parser.nextText();
                        } else if ("foont".equals(eltName)) {
                            currenWeight.foont = parser.nextText();
                        } else if ("pud".equals(eltName)) {
                            currenWeight.pud = parser.nextText();
                        } else if ("nkilogramm".equals(eltName)) {
                            currenWeight.nkilogramm = parser.nextText();
                        } else if ("ntonna".equals(eltName)) {
                            currenWeight.ntonna = parser.nextText();
                        }else if ("ncarat".equals(eltName)) {
                            currenWeight.ncarat = parser.nextText();
                        } else if ("nfoont".equals(eltName)) {
                            currenWeight.nfoont = parser.nextText();
                        } else if ("npud".equals(eltName)) {
                            currenWeight.npud = parser.nextText();
                        }
                    }
                    break;
            }
            eventType = parser.next();
        }
        printWeights(weights);
    }

    private void printWeights(ArrayList<Weight> weights) {
        StringBuilder builder = new StringBuilder();

        for (Weight weight : weights) {
            grnum = weight.gram;
            kinum = weight.kilogram;
            tnum = weight.tonna;
            canum = weight.carat;
            fonum = weight.foont;
            pudnum = weight.pud;
            nkinum = weight.ntonna;
            ntnum = weight.ncarat;
            ncanum = weight.ncarat;
            nfonum = weight.nfoont;
            npudnum = weight.npud;

            builder.append("Gram: ").append(weight.gram).append("\n").
                    append("Kilogram: ").append(weight.kilogram).append("\n").
                    append("Tonna: ").append(weight.tonna).append("\n").
                    append("Carat: ").append(weight.carat).append("\n").
                    append("Foont: ").append(weight.foont).append("\n").
                    append("Pud: ").append(weight.pud).append("\n").
                    append("Dop Kilogramm: ").append(weight.nkilogramm).append("\n").
                    append("Dop Tonna: ").append(weight.ntonna).append("\n").
                    append("Dop Carat: ").append(weight.ncarat).append("\n").
                    append("Dop Foont: ").append(weight.nfoont).append("\n").
                    append("Dop Foot: ").append(weight.nfoont).append("\n").
                    append("Dop Pud: ").append(weight.npud).append("\n")
            ;
        }

        textweight.setText(builder.toString());
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Blank_Weight() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * //@param param1 Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment Blank_Weight.
     */
    // TODO: Rename and change types and number of parameters
    public static Blank_Weight newInstance() {
        Blank_Weight fragment = new Blank_Weight();
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
        return inflater.inflate(R.layout.activity_weight, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Context context = getActivity();

        textweight = view.findViewById(R.id.activity_weight);
        parseXML(context);

        Spinner weightsp3, weightsp4;
        EditText weighted2;
        Button weightb2;

        final double gramm = Double.parseDouble(grnum);
        final double kilogramm = Double.parseDouble(kinum);
        final double tonna = Double.parseDouble(tnum);
        final double carat = Double.parseDouble(canum);
        final double foont = Double.parseDouble(fonum);
        final double pud = Double.parseDouble(pudnum);

        double nkilogramm = Double.parseDouble(nkinum);
        double ntonna = Double.parseDouble(ntnum);
        double ncarat = Double.parseDouble(ncanum);
        double nfoont = Double.parseDouble(nfonum);
        double npud = Double.parseDouble(npudnum);

        weighted2 = view.findViewById(R.id.editTextTextPersonName5);
        weightsp3 = view.findViewById(R.id.spinner8);
        weightsp4 = view.findViewById(R.id.spinner9);
        weightb2 = view.findViewById(R.id.button5);

        String[] from = {"gramm", "kilogramm", "tonna", "carat", "foont", "pud"};
        ArrayAdapter ad3 = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        weightsp3.setAdapter(ad3);

        String[] to = {"gramm", "kilogramm", "tonna", "carat", "foont", "pud"};
        ArrayAdapter ad4 = new ArrayAdapter<String>(context, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
        weightsp4.setAdapter(ad4);

        weightb2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Double weighttot1 = Double.valueOf(0);
                                Double weightamount1 = Double.parseDouble(weighted2.getText().toString());

                                Spinner datatempone = weightsp3;
                                Spinner datatemptwo = weightsp4;
                                Double datatemptree = weightamount1;

                                locgic_weight(datatempone, datatemptwo, weighttot1, datatemptree,
                                        gramm, kilogramm, tonna, carat, foont, pud,
                                        nkilogramm, ntonna, ncarat, nfoont, npud);
                                Toast.makeText(context.getApplicationContext(), "Thread work", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                }).start();
            }
        });
    }
}