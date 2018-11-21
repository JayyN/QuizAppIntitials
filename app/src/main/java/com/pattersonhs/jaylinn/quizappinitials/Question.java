package com.pattersonhs.jaylinn.quizappinitials;

import android.widget.EditText;

    public class Question {
    private String qText;
    private boolean correctAnswer;

    public Question(String newqText, boolean newcorrectAnswer){
        qText = newqText;
        correctAnswer = newcorrectAnswer;
    }
    public String getQText(){
        return qText;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setqText (String newQText){
        qText = newQText;


        }
}
