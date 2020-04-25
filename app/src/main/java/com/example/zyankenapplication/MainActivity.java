package com.example.zyankenapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView judgeText = findViewById(R.id.judge);
        Button thokiBtn = findViewById(R.id.tyoki_btn);
        Button paBtn = findViewById(R.id.pa_btn);
        Button guBtn = findViewById(R.id.gu_btn);
        final TextView answerText = findViewById(R.id.answer_text);
        answerText.setText("最初はグー！");
        final String[] select = {"グー","パー","チョキ"};
        Button back = findViewById(R.id.back_btn);


        thokiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                String Answerjudge = select[random.nextInt(3)];

                answerText.setText(Answerjudge);

                if(answerText.getText().toString() == "チョキ"){
                    judgeText.setText("あいこ");
                }else if(answerText.getText().toString() == "グー"){
                    judgeText.setText("負け");
                }else{
                    judgeText.setText("勝ち");
                }

            }
        });

        guBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                String Answerjudge = select[random.nextInt(3)];

                answerText.setText(Answerjudge);

                if(answerText.getText().toString() == "チョキ"){
                    judgeText.setText("勝ち");
                }else if(answerText.getText().toString() == "グー"){
                    judgeText.setText("あいこ");
                }else {
                    judgeText.setText("負け");
                }
            }
        });

        paBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random random = new Random();
                String Answerjudge = select[random.nextInt(3)];

                answerText.setText(Answerjudge);
                if (answerText.getText().toString() == "チョキ") {
                    judgeText.setText("負け");
                } else if (answerText.getText().toString() == "グー") {
                    judgeText.setText("勝ち");
                } else {
                    judgeText.setText("あいこ");

                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
