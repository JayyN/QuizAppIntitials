package com.pattersonhs.jaylinn.quizappinitials;

public class Question {
    private String qText;
    private boolean correctAnswer;

    public Question(String qText, boolean correctAnswer){
        qText = "";
        correctAnswer = true;
    }
    public String getQText(){
        return qText;
    }
    public void setqText (String newQText){
        qText = newQText;
    }
}
