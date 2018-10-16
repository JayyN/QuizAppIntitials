package com.pattersonhs.jaylinn.quizappinitials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizAppInitialsActivity extends AppCompatActivity {
    RadioButton True;
    RadioButton False;
    TextView question;
    TextView right;
    TextView wrong;
    Button Enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app_initials);
        true = (RadioButton) findViewById(R.id.true);
        false = (RadioButton) findViewById(R.id.false);
        question = (TextView) findViewById(R.id.question);
        right = (TextView) findViewById(R.id.right);
        wrong = (TextView) findViewById(R.id.Wrong);
        Enter = (Button) findViewById(R.id.Enter);
    }
    //public void onClick (View view){
        //Intent scoreintent1 = new Intent ( packageContext; MainActivity.this, Main2Activity.class);
        //startActivity(scoreIntent1);

    //public void onClick2 (View view){
        //Intent scoreintent2 = new Intent ( packageContext; MainActivity.this, Main3Activity.class);
        //startActivity(scoreIntent2);
        public Question[] questionsArray = new Question[5];
        public Question[0] questionsArray = new Question1;
    }
}
