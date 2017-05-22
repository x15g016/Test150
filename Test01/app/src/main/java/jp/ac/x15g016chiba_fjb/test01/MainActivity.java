package jp.ac.x15g016chiba_fjb.test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView mTextview;
    private int ｍCount;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mHandler =new Handler();
        mTextview = (TextView) findViewById(R.id.textView);
        ｍCount = 0;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                ｍCount++;
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mTextView.setText(String.valueOf(mCount));
                        //mTextView.setText(""+mCount);
                    }
                });
                mTextview.setText(String.valueOf(ｍCount));
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1000);
    }
    }

