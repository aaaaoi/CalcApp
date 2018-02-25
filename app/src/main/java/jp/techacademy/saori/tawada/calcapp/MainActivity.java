package jp.techacademy.saori.tawada.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        double x = Double.parseDouble(editText1.getText().toString());
        double y = Double.parseDouble(editText2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        if (v.getId() == R.id.button1) {
            double a = x + y;
            intent.putExtra("VALUE1", a);
        } else if (v.getId() == R.id.button2) {
            double b = x - y;
            intent.putExtra("VALUE2", b);
        } else if (v.getId() == R.id.button3) {
            double c = x * y;
            intent.putExtra("VALUE3", c);
        } else if (v.getId() == R.id.button4) {
            double d = x / y;
            intent.putExtra("VALUE4", d);
        }
        startActivity(intent);
    }
}
