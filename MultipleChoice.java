package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class MultipleChoice extends Question {

    private String answerChoiceOne;
    private String answerChoiceTwo;
    private String answerChoiceThree;
    private String answerChoiceFour;
    private int correctAnswer;
    private int response;
    Scanner input;

        public MultipleChoice(String aQuestion, String aAnswerChoiceOne, String answerChoiceTwo, String answerChoiceThree, String answerChoiceFour, int correctAnswer) {
        super(aQuestion);
        this.answerChoiceOne = aAnswerChoiceOne;
        this.answerChoiceTwo = answerChoiceTwo;
        this.answerChoiceThree = answerChoiceThree;
        this.answerChoiceFour = answerChoiceFour;
        this.correctAnswer = correctAnswer;
    }

    public void displayAnswerOptions(){
        System.out.println("1: " + this.answerChoiceOne + "\n2: " + this.answerChoiceTwo + "\n3: " + this.answerChoiceThree + "\n4: " + this.answerChoiceFour);
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
