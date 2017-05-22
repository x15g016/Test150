package jp.ac.x15g016chiba_fjb.test11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.id.button1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタンのインスタンスを受け取る
        Button button = (Button) findViewById(R.id.button);
        //タップイベントを受け取る
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            setContentView(R.layout.layout_sub);
            findViewById(R.id.button2).setOnClickListener(this);
        } else if (v.getId() == R.id.button2) {
            setContentView(R.layout.activity_main);
            findViewById(R.id.button).setOnClickListener(this);
        }
    }
}
