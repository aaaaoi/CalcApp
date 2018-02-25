package jp.techacademy.saori.tawada.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        double value3 = intent.getDoubleExtra("VALUE3", 0);
        double value4 = intent.getDoubleExtra("VALUE4", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        if (value1 != 0) {
            textView.setText(String.valueOf(value1));
        } else if (value2 != 0) {
            textView.setText(String.valueOf(value2));
        } else  if (value3 != 0) {
            textView.setText(String.valueOf(value3));
        } else if (value4 != 0) {
            textView.setText(String.valueOf(value4));
        } else {
            textView.setText(String.valueOf(0.0));
        }
    }
}
