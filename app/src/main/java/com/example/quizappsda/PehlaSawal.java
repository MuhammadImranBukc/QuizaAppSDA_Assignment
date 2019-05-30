package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

public class PehlaSawal extends AppCompatActivity {
    RadioButton b1, b2, b3;
    static ArrayList<String> correctAns = new ArrayList<String>() {
        {
            add("Aarif Alvi      ");
            add("Imran Khan      ");
            add("Islamabad       ");
            add("Dr. Allama Iqbal");
            add("Markhoor        ");
            add("Chukar          ");
            add("Mango           ");
            add("Jasmine         ");
            add("Mahseer         ");
        }
    };
    static ArrayList<String> Jawabat = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawal_pehla);
        b1 = (RadioButton) findViewById(R.id.A1q1);
        b2 = (RadioButton) findViewById(R.id.A1q2);
        b3 = (RadioButton) findViewById(R.id.A1q3);

    }

    public void nextA1(View view) {
        if (b1.isChecked()) {
            Jawabat.add("Mamnoon Hussain");
        } else if (b2.isChecked()) {
            Jawabat.add("Aarif Alvi");
        } else if (b3.isChecked()) {
            Jawabat.add("Zardari");
        } else {
            Jawabat.add("Koi Jawab Nahi");
        }

        Intent intent = new Intent(PehlaSawal.this, DosraSawal.class);
        startActivity(intent);
        finish();
    }
}
