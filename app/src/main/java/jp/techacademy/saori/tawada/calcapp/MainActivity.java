package jp.techacademy.saori.tawada.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import android.widget.Toast;

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

        try{
            BigDecimal x = new BigDecimal(editText1.getText().toString());
            BigDecimal y = new BigDecimal(editText2.getText().toString());
            BigDecimal a;

            Intent intent = new Intent(this, SecondActivity.class);

                if (v.getId() == R.id.button1) {
                    a = x.add(y);
                    intent.putExtra("VALUE1", a);
                } else if (v.getId() == R.id.button2) {
                    a = x.subtract(y);
                    intent.putExtra("VALUE1", a);
                } else if (v.getId() == R.id.button3) {
                    a = x.multiply(y);
                    intent.putExtra("VALUE1", a);
                } else if (v.getId() == R.id.button4) {
                    if (y.compareTo(BigDecimal.ZERO) == 0) {
                        Toast ts1 = Toast.makeText(this, "0では割れません", Toast.LENGTH_LONG);
                        ts1.show();
                        return;
                    }
                    a = x.divide(y,2,BigDecimal.ROUND_HALF_UP);
                    intent.putExtra("VALUE1", a);
                }

                startActivity(intent);

        } catch (Exception e) {
                Toast ts2 = Toast.makeText(this, "数値を入力してください", Toast.LENGTH_LONG);
                ts2.show();
        }
    }
}