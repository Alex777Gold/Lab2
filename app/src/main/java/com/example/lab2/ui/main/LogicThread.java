package com.example.lab2.ui.main;

public class LogicThread /*extends Thread*/ {

/*
    double meters = null;
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
                    resulted = String.valueOf(LengthService.locgic_length(datalenone, datalentwo, lengthtots, lengthamounts,
                            centimeter, meters, kilometer, inch, foot, mile, yard,
                            nmeters, nkilometer, ninch, nfoot, nmile, nyard));
                    res.setText(resulted);
                    Toast.makeText(context.getApplicationContext(), resulted, Toast.LENGTH_LONG).show();
                    //Service
                    Intent serviceIntent = new Intent(context, LengthService.class);
                    serviceIntent.putExtra(LengthService.LENGTH_ACTION, LengthService.START);
                    serviceIntent.putExtra(LengthService.LENGTH, length);
                    context.startService(serviceIntent);
                }
            });
        }
    }).start();

 */
}