package org.launchcode.java.studios.quiz;

public class QuizRunner {

    public static void main (String[] args){
        Question barbisQuestion = new MultipleChoice("who am I?", "Barbi", "Ryan", "Elena", "No One", 1);
        Question ryansQuestion = new MultipleChoice("who am I?", "Barbi", "Ryan", "Elena", "No One", 2);
        Question elenasQuestion = new TrueFalse("Is Elena Cute",  1);
        barbisQuestion.askQuestion();
        barbisQuestion.displayAnswerOptions();
        barbisQuestion.getUserResponse();
        barbisQuestion.wasQuestionCorrect();
        ryansQuestion.askQuestion();
        ryansQuestion.displayAnswerOptions();
        ryansQuestion.getUserResponse();
        ryansQuestion.wasQuestionCorrect();
        elenasQuestion.askQuestion();
        elenasQuestion.displayAnswerOptions();
        elenasQuestion.getUserResponse();
        elenasQuestion.wasQuestionCorrect();
        barbisQuestion.displayScore();
    }
}
