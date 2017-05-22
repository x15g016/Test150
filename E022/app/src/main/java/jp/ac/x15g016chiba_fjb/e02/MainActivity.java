package jp.ac.x15g016chiba_fjb.e02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SeekBar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar mSeekR = (SeekBar) findViewById(R.id.seekBarR);
        final SeekBar mSeekG = (SeekBar) findViewById(R.id.seekBarG);
        final SeekBar mSeekB = (SeekBar) findViewById(R.id.seekBarB);
        final FrameLayout mFrameColor = (FrameLayout) findViewById(R.id.framecolor);

        mSeekG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mFrameColor.setBackgroundColor(Color.rgb(mSeekR.getProgress(),mSeekG.getProgress(),mSeekB.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mSeekB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mFrameColor.setBackgroundColor(Color.rgb(mSeekR.getProgress(),mSeekG.getProgress(),mSeekB.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

       mSeekR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               mFrameColor.setBackgroundColor(Color.rgb(mSeekR.getProgress(),mSeekG.getProgress(),mSeekB.getProgress()));
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }

       });

}
}
