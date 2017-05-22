package jp.ac.x15g016chiba_fjb.test06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mText;
    private EditText mEdit1;
    private EditText mEdit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mEdit1 = (EditText) findViewById(R.id.editText4);
         mEdit2 = (EditText) findViewById(R.id.editText3);
        mText = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mText.setText(mEdit1.getText().toString()+":"+
//                mEdit2.getText().toString());
        button.setOnClickListener(this);
            }

    @Override
    public void onClick(View v) {
                
             mText.setText(mEdit1.getText().toString()+":"+
                mEdit2.getText().toString());
    }
}



