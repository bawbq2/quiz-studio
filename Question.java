package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public abstract class Question {

    private String question;
//    private String answerChoiceOne;
//    private String answerChoiceTwo;
//    private String answerChoiceThree;
//    private String answerChoiceFour;
//    private int correctAnswer;
//    private int response;
//    Scanner input;
    private static int points;

//    public Question(String aQuestion, String aAnswerChoiceOne, String answerChoiceTwo, String answerChoiceThree, String answerChoiceFour, int correctAnswer) {
//        this.question = aQuestion;
//        this.answerChoiceOne = aAnswerChoiceOne;
//        this.answerChoiceTwo = answerChoiceTwo;
//        this.answerChoiceThree = answerChoiceThree;
//        this.answerChoiceFour = answerChoiceFour;
//        this.correctAnswer = correctAnswer;
//    }

    public Question(String aQuestion){
        this.question = aQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        Question.points = points;
    }

    //    public String getAnswerChoiceOne() {
//        return answerChoiceOne;
//    }
//
//    public void setAnswerChoiceOne(String answerChoiceOne) {
//        this.answerChoiceOne = answerChoiceOne;
//    }
//
//    public String getAnswerChoiceTwo() {
//        return answerChoiceTwo;
//    }
//
//    public void setAnswerChoiceTwo(String answerChoiceTwo) {
//        this.answerChoiceTwo = answerChoiceTwo;
//    }
//
//    public String getAnswerChoiceThree() {
//        return answerChoiceThree;
//    }
//
//    public void setAnswerChoiceThree(String answerChoiceThree) {
//        this.answerChoiceThree = answerChoiceThree;
//    }
//
//    public String getAnswerChoiceFour() {
//        return answerChoiceFour;
//    }
//
//    public void setAnswerChoiceFour(String answerChoiceFour) {
//        this.answerChoiceFour = answerChoiceFour;
//    }

    public void askQuestion(){
        System.out.println(this.question);
    }

    public abstract void displayAnswerOptions();
//    {
//        System.out.println("1: " + this.answerChoiceOne + "\n2: " + this.answerChoiceTwo + "\n3: " + this.answerChoiceThree + "\n4: " + this.answerChoiceFour);
//    }

    public abstract void getUserResponse();
//    {
//        input = new Scanner(System.in);
//        System.out.println("Please give your answer: ");
//        response = input.nextInt();
//    }

    public abstract void wasQuestionCorrect();
//    {
//        if(this.response == this.correctAnswer) {
//            System.out.println("That is correct");
//            points++;
//        } else {
//            System.out.println("That is incorrect");
//        }
//    }
//this should be in Quiz?
    public static void displayScore(){
        System.out.println("You have " + points + " points");
    }
}
