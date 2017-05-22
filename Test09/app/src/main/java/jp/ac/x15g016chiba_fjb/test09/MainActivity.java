package jp.ac.x15g016chiba_fjb.test09;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトのインスタンス取得
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);

        for(int i =0 ; i<100 ;i++) {
            TextView textView = new TextView(this);
            textView.setText("TextView"+i);
            textView.setBackgroundColor(Color.rgb(255,15,46));
            LinearLayout.LayoutParams p =new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            p.setMargins(10,10,10,10);
            layout.addView(textView,p);
        }
    }
}

