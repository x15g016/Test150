package jp.ac.x15g016chiba_fjb.test10;

import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    //プロパティ取得
    int mCount;
    android.os.Handler mHandler;
    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new android.os.Handler();
        //インスタンスを取得
        final TextView textView = (TextView) findViewById(R.id.textView);
        //変数の初期化
        mCount = 0;
        //タイマー処理の作成
        TimerTask timerTask =new TimerTask() {

            @Override
            public void run() {
            mCount++;
               mHandler.post(new Runnable() {
                   @Override
                   public void run() {
                       textView.setText(""+mCount);
                   }
               });
            }
        };
        //タイマーの開始
        mTimer =new Timer();
        mTimer.schedule(timerTask,0,1000);
    }
    @Override
    protected void onPause() {
        mTimer.cancel();
        super.onPause();

    }
}
