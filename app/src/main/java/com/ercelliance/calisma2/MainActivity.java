package com.ercelliance.calisma2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a;
    int b;
    int toplam;
    EditText number1;
    EditText number2;
    TextView sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1Text);
        number2 = findViewById(R.id.number2Text);
        sonuc = findViewById(R.id.textView);

    }

    public void button(View view) {
        a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        toplam = a + b;
        sonuc.setText("Sonucunuz: " + toplam);
    }

    public void button2(View view) {
        a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        toplam = a - b;
        sonuc.setText("Sonucunuz: " + toplam);
    }

    public void button3(View view) {
        a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        toplam = a * b;
        sonuc.setText("Sonucunuz: " + toplam);
    }

    public void button4(View view) {
        a = Integer.parseInt(number1.getText().toString());
        b = Integer.parseInt(number2.getText().toString());
        if (b == 0) {
            sonuc.setText("Böleniniz 0 olamaz lütfen 0'dan başka sayı giriniz.");
        } else {
            toplam = a / b;
            sonuc.setText("Sonucunuz: " + toplam);
        }
    }
}