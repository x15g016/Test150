package jp.ac.x15g016chiba_fjb.k04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int mCount;
    android.os.Handler mHandler;
    private Timer mTimer;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new android.os.Handler();
        Button button = (Button) findViewById(R.id.button4);
        Button button1 = (Button) findViewById(R.id.button5);

    public void onClick(View v) {
        //タイマーが生成されているか確認
        if (mTimer == null) {
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    mCount++;
                    //UI関係の処理をサブスレッドで処理するとエラー
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mTextView.setText(String.valueOf(mCount));
                        }
                    });
                }
            };
            //タイマーの起動
            mTimer = new Timer();
            mTimer.schedule(timerTask, 1000, 1000);

        public void onClick (View v){
            //タイマーが生成されていたら停止
            if (mTimer != null) {
                mTimer.cancel();
                mTimer = null;

            }
        }
    }
    }
    }
