package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import static com.example.quizappsda.PehlaSawal.Jawabat;

public class AthwanSawal extends AppCompatActivity {
    RadioButton b1, b2, b3;
    //RadioGroup btnId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawal_athwan);
        b1 =  findViewById(R.id.A21);
        b2 =  findViewById(R.id.A22);
        b3 =  findViewById(R.id.A23);
           }

    public void nextA8(View view) {

        if (b1.isChecked()) {
            Jawabat.add("Jasmine");
        } else if (b2.isChecked()) {
            Jawabat.add("Lilli");
        } else if (b3.isChecked()) {
            Jawabat.add("Sun Flower");
        } else {
            Jawabat.add("Koi Jawab Nahi");
        }

        Intent intent = new Intent(AthwanSawal.this, NawanSawal.class);

        startActivity(intent);
        finish();
    }
}
