package com.example.fedunimillionaire30350727.Models;

import java.util.ArrayList;

public class Question {
    private String text;
    private ArrayList<Answer> answer;

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(ArrayList<Answer> answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Answer> getAnswer() {
        return answer;
    }
}
