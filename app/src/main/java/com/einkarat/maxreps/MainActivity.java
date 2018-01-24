package com.einkarat.maxreps;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler seekBarHandler = new Handler(); // must be created in the same thread that created the SeekBar
        SeekBar seekBar_gewicht = (SeekBar) findViewById(R.id.seekBar_gewicht);
        // you should define max in xml, but if you need to do this by code, you must set max as 0 and then your desired value. this is because a bug in SeekBar (issue 12945) (don't really checked if it was corrected)
        seekBar_gewicht.setMax(0);
        seekBar_gewicht.setMax(50);
        seekBar_gewicht.setProgress(10);

        final TextView zahl_gewicht = (TextView) findViewById(R.id.gewicht_zahl);
        int pro=seekBar_gewicht.getProgress();
        zahl_gewicht.setText(String.valueOf(pro));

        seekBar_gewicht.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                zahl_gewicht.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

    }
}
