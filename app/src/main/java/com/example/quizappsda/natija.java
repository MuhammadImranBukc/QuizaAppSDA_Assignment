package com.example.quizappsda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.quizappsda.PehlaSawal.Jawabat;
import static com.example.quizappsda.PehlaSawal.correctAns;

public class natija extends AppCompatActivity {
    int totalQ;
    int c, w = 0;
    LinearLayout layout;
    TextView correct, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.natija);
        totalQ = Jawabat.size();
        layout = findViewById(R.id.Layout);
        correct = findViewById(R.id.correct);
        wrong = findViewById(R.id.wrong);


        for (int i = 0; i < totalQ; i++) {

            TextView rowTextView = new TextView(this);

            rowTextView.setTextSize(18);
            rowTextView.setText("         " + correctAns.get(i) + "           " + Jawabat.get(i));
            if (correctAns.get(i).equals(Jawabat.get(i))) {
                c = c + 1;
            } else {
                w = w + 1;
            }

            layout.addView(rowTextView);

        }
        correct.setText("Correct Answers: " + c);
        wrong.setText("Wrong Answers: " + w);
    }
}
