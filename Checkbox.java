package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {

    private String answerChoiceOne;
    private String answerChoiceTwo;
    private String answerChoiceThree;
    private String answerChoiceFour;
    private boolean isOneCorrect;
    private boolean isTwoCorrect;
    private boolean isThreeCorrect;
    private boolean isFourCorrect;
    private String response;
    private ArrayList<String> responses = new ArrayList<>();
    private ArrayList<String> correctAnswers = new ArrayList<>();
    private boolean choseAllCorrectAnswers;

    Scanner input = new Scanner(System.in);

    public Checkbox(String aQuestion, String aAnswerChoiceOne, String answerChoiceTwo, String answerChoiceThree, String answerChoiceFour, boolean isOneCorrect, boolean isTwoCorrect, boolean isThreeCorrect, boolean isFourCorrect) {
        super(aQuestion);
        this.answerChoiceOne = aAnswerChoiceOne;
        this.answerChoiceTwo = answerChoiceTwo;
        this.answerChoiceThree = answerChoiceThree;
        this.answerChoiceFour = answerChoiceFour;
        this.isOneCorrect = isOneCorrect;
        this.isTwoCorrect = isTwoCorrect;
        this.isThreeCorrect = isThreeCorrect;
        this.isFourCorrect = isFourCorrect;
        this.addCorrectAnswersToArrayList();
    }

    public void displayAnswerOptions(){
        System.out.println("a: " + this.answerChoiceOne + "\nb: " + this.answerChoiceTwo + "\nc: " + this.answerChoiceThree + "\nd: " + this.answerChoiceFour);
    }

    public void addCorrectAnswersToArrayList(){
        if(isOneCorrect) {
            correctAnswers.add("a");
        }
        if(isTwoCorrect) {
            correctAnswers.add("b");
        }
        if(isThreeCorrect) {
            correctAnswers.add("c");
        }
        if(isFourCorrect) {
            correctAnswers.add("d");
        }
    }

    public void getUserResponse(){
        System.out.println("Choose all correct answers. Enter first answer, then press enter. When you have selected all correct answers, press enter again for score.");
        do {
            response = input.nextLine().toLowerCase();
            if(!response.equals("")){
                responses.add(response);
            }
        } while (!response.equals(""));
    }

    public void wasQuestionCorrect(){
        for (String eachResponse: responses) {
            if (responses.size() == correctAnswers.size() && correctAnswers.contains(eachResponse)) {
                choseAllCorrectAnswers = true;
            } else {
                choseAllCorrectAnswers = false;
            }
        } if(choseAllCorrectAnswers) {
                System.out.println("That is correct");
                this.setPoints(this.getPoints() + 1);
            } else {
            System.out.println("That is incorrect");
        }
    }
}
