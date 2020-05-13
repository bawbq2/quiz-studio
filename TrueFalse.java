package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class TrueFalse extends Question {

    private String answerChoiceOne;
    private String answerChoiceTwo;
    private int correctAnswer;
    private int response;
    Scanner input;

    public TrueFalse(String aQuestion, int correctAnswer) {
        super(aQuestion);
        this.answerChoiceOne = "true";
        this.answerChoiceTwo = "false";
        this.correctAnswer = correctAnswer;
    }

    public void displayAnswerOptions(){
        System.out.println("1: " + this.answerChoiceOne + "\n2: " + this.answerChoiceTwo);
    }

    public void getUserResponse(){
        input = new Scanner(System.in);
        System.out.println("Please give your answer: ");
        response = input.nextInt();
    }

    public void wasQuestionCorrect(){
        if(this.response == this.correctAnswer) {
            System.out.println("That is correct");
            this.setPoints(this.getPoints() + 1);
        } else {
            System.out.println("That is incorrect");
        }
    }
}
