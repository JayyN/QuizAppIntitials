package com.pattersonhs.jaylinn.quizappinitials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    Question[] questionArray;
    Question currentQuestion;
    int questionArrayIndex;
    int score;
    boolean givenAnswer;
    ImageView minisheild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app_initials);
        trueButton = (RadioButton) findViewById(R.id.True);
        falseButton = (RadioButton) findViewById(R.id.False);
        question = (TextView) findViewById(R.id.question);
        Enter = (Button) findViewById(R.id.Enter);
        minisheild = (ImageView) findViewById(R.id.Minisheild);
        questionArrayIndex = 0;
        score = 0;
        givenAnswer = false;

        questionArray = new Question[5];
        questionArray[0] = new Question("2 minis get's you to 75% sheild?", false);
        questionArray[1] = new Question ("You can carry more than 2 50 sheilds?",true);
        questionArray[2] = new Question ("Their is 1 day left until season 6?", false);
        questionArray[3] = new Question ("Max bullets for ar's is 1k?", true);
        questionArray[4] = new Question ("You can survive fall damage from max height?", false);

        currentQuestion = questionArray[questionArrayIndex];

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 givenAnswer=true;
                if (givenAnswer == currentQuestion.isCorrectAnswer())
                {
                    toastmessageID = R.string.Right;
                }
                else
                {
                    toastmessageID = R.string.Wrong;
                }
                Toast.makeText(QuizAppInitialsActivity.this,  toastmessageID, Toast.LENGTH_SHORT).show();
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                givenAnswer=false;
                if (givenAnswer == currentQuestion.isCorrectAnswer())
                {
                    toastmessageID = R.string.Right;
                }
                else
                {
                    toastmessageID = R.string.Wrong;
                }
                Toast.makeText(QuizAppInitialsActivity.this,  toastmessageID, Toast.LENGTH_SHORT).show();

            }
        });

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (givenAnswer == currentQuestion.isCorrectAnswer())
                {
                    score +=1;
                }
                else
                {
                    //score -=1;
                }
                if (questionArrayIndex < 4)
                {
                    questionArrayIndex +=1;
                    currentQuestion = questionArray[questionArrayIndex];
                    question.setText(currentQuestion.getQText());
                }
                else
                {
                    Intent ScoreIntent = new Intent(QuizAppInitialsActivity.this, ScoreActivity.class);
                    ScoreIntent.putExtra("Add", score);
                    startActivity(ScoreIntent);
                }

            }
        });
    }
}


