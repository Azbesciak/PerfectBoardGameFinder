package com.si.perfectgame;

public class Question {

    private final QuestionVal val;
    private Integer choice;

    public Question(QuestionVal val) {
        this.val = val;
    }

    public QuestionVal getVal() {
        return val;
    }

    public Integer getChoice() {
        return choice;
    }

    public void setChoice(Integer choice) {
        this.choice = choice;
    }
}
