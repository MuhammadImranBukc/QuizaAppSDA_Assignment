package com.example.quizappsda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import static com.example.quizappsda.PehlaSawal.Jawabat;

public class DosraSawal extends AppCompatActivity {
    RadioButton b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sawal_dosra);
        b1=(RadioButton)findViewById(R.id.A21);
        b2=(RadioButton)findViewById(R.id.A22);
        b3=(RadioButton)findViewById(R.id.A23);

    }

    public void nextA2(View view) {

        if(b1.isChecked()){
            Jawabat.add("Imran Khan");
        }
        else if(b2.isChecked()){
            Jawabat.add("Nawaz Sharif");
        }
        else if(b3.isChecked()){
            Jawabat.add("Bilawal Bhutto");
        }else{
            Jawabat.add("Koi Jawab Nahi");        }

        Intent intent = new Intent(DosraSawal.this, TesraSawal.class);
        startActivity(intent);
         finish();
    }
}
