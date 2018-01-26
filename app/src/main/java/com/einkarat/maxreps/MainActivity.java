package com.einkarat.maxreps;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar_gewicht = findViewById(R.id.seekBar_gewicht);
        // you should define max in xml, but if you need to do this by code, you must set max as 0 and then your desired value. this is because a bug in SeekBar (issue 12945) (don't really checked if it was corrected)
        seekBar_gewicht.setMax(0);
        seekBar_gewicht.setMax(50);
        seekBar_gewicht.setProgress(10);

        final EditText zahl_gewicht = (EditText) findViewById(R.id.gewicht_zahl);
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

        SeekBar seekBar_wh = findViewById(R.id.seekBar_wh);
        // you should define max in xml, but if you need to do this by code, you must set max as 0 and then your desired value. this is because a bug in SeekBar (issue 12945) (don't really checked if it was corrected)
        seekBar_wh.setMax(0);
        seekBar_wh.setMax(50);
        seekBar_wh.setProgress(10);

        final EditText zahl_wh = findViewById(R.id.wh_zahl);
        int pro_wh=seekBar_gewicht.getProgress();
        zahl_wh.setText(String.valueOf(pro_wh));

        seekBar_wh.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                zahl_wh.setText(String.valueOf(progress));
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
