package com.mycompany.week8labactivity2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sound Room
 */
public class Question {

    private String questionText;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String userAnswer;
    private boolean hasBeenAnswered;
    private int optionSelected;

    //to keep track of what question we're on, starts from 0 because it's incremented every time a question is made
    int counter = 0;

    public Question(String questionText, String option1, String option2, String option3, String option4, String correctAnswer, int counter, boolean answered, int optSelected) {

        this.questionText = questionText;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctAnswer = correctAnswer;
        this.counter = counter;
        this.hasBeenAnswered = answered;
        this.optionSelected = optSelected;

    }

    //getters and setters
    public String getQuestionText() {
        return questionText;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isHasBeenAnswered() {
        return hasBeenAnswered;
    }

    //this setter is here to set the user answer from outside
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public void setHasBeenAnswered(boolean hasBeenAnswered) {
        this.hasBeenAnswered = hasBeenAnswered;
    }

    //returns if the answer is correct
    public boolean isCorrect() {

        return correctAnswer.equalsIgnoreCase(userAnswer);

    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

}
