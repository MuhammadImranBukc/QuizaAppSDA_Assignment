package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import static com.example.quizappsda.PehlaSawal.Jawabat;

public class NawanSawal extends AppCompatActivity {
    RadioButton b1, b2, b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawal_nawan);
        b1 = findViewById(R.id.A21);
        b2 = findViewById(R.id.A22);
        b3 = findViewById(R.id.A23);

    }

    public void nextA9(View view) {

        if (b1.isChecked()) {
            Jawabat.add("Jelly Fish");
        } else if (b2.isChecked()) {
            Jawabat.add("Dolphin");
        } else if (b3.isChecked()) {
            Jawabat.add("Mahseer");
        } else {
            Jawabat.add("Koi Jawab Nahi");        }

        Intent intent = new Intent(NawanSawal.this, natija.class);
        startActivity(intent);
        finish();
    }
}
