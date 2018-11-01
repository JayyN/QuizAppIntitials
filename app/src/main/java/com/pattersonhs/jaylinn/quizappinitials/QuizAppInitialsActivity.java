package com.pattersonhs.jaylinn.quizappinitials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizAppInitialsActivity extends AppCompatActivity {
    RadioButton trueButton;
    RadioButton falseButton;
    TextView question;
    TextView right;
    TextView wrong;
    Button Enter;
    int toastmessageID;
    int questionArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app_initials);
        trueButton = (RadioButton) findViewById(R.id.True);
        falseButton = (RadioButton) findViewById(R.id.False);
        question = (TextView) findViewById(R.id.question);
        Enter = (Button) findViewById(R.id.Enter);


        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean givenAnswer=true;
                if (givenAnswer == true)
                {
                    toastmessageID = R.string.Right;
                }
                else
                {
                    toastmessageID = R.string.Wrong;
                }
                Toast.makeText(QuizAppInitialsActivity.this,  "correct", Toast.LENGTH_SHORT).show();
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boolean givenAnswer=false;
                if (givenAnswer == false)
                {
                    toastmessageID = R.string.Right;
                }
                else
                {
                    toastmessageID = R.string.Wrong;
                }
                Toast.makeText(QuizAppInitialsActivity.this,  "incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


