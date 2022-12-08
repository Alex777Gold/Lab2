package com.example.lab2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class LogicService extends Service {

    public static final String LENGTH_ACTION = "LENGTH_ACTION";
    public static final String START = "START";

    //public static final String LENGTH = "LENGTH";

    public static final String LENGTH1 = "LENGTH1";
    public static final String LENGTH2 = "LENGTH2";
    public static final String LENGTH3 = "LENGTH3";


    /*
    public LengthService() {
    }
    */

    public static double sant (double num, double form, double to){
        return num*form * to;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String action = intent.getStringExtra(START);
        Double first = intent.getDoubleExtra(LENGTH1, 0);
        Double two = intent.getDoubleExtra(LENGTH2, 0);
        Double lengt = intent.getDoubleExtra(LENGTH3, 0);

        String res = String.valueOf(sant(first, lengt, two));

        Toast.makeText(getApplicationContext(), "Service work "+res, Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}