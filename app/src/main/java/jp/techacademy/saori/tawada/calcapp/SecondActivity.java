package jp.techacademy.saori.tawada.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import java.math.BigDecimal;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        BigDecimal value1 = (BigDecimal) intent.getSerializableExtra("VALUE1");

        TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1));
    }
}
