package jp.ac.x15g016chiba_fjb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText mEdit;
    private EditText mEdit2;
    private EditText mEdit3;
    private TextView text;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit =(EditText)findViewById(R.id.editText);
        mEdit2 =(EditText)findViewById(R.id.editText2);
       mEdit3 =(EditText)findViewById(R.id.editText3);
        text =(TextView)findViewById(R.id.textView);
        button =(Button) findViewById(R.id.button);

       button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        text.setText(mEdit.getText().toString()+":"+
                mEdit2.getText().toString()+":"+
                mEdit3.getText().toString());
    }
}
