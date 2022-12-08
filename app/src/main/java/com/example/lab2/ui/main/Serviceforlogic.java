package com.example.lab2.ui.main;

import android.content.Context;
import android.content.Intent;

import com.example.lab2.LogicService;

public class Serviceforlogic {
    public static double Service(double first, double two, double three, Context context) {
        Intent serviceIntent = new Intent(context, LogicService.class);
        serviceIntent.putExtra(LogicService.LENGTH_ACTION, LogicService.START);
        serviceIntent.putExtra(LogicService.LENGTH1, first);
        serviceIntent.putExtra(LogicService.LENGTH2, two);
        serviceIntent.putExtra(LogicService.LENGTH3, three);
        context.startService(serviceIntent);
        return 0;
    }
}
