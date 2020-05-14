package org.launchcode.java.studios.quiz;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> quizQuestions= new ArrayList<>();

    public Quiz(){
        Question barbisQuestion = new MultipleChoice("who am I?", "Barbi", "Ryan", "Elena", "No One", 1);
        Question ryansQuestion = new MultipleChoice("who am I?", "Barbi", "Ryan", "Elena", "No One", 2);
        Question elenasQuestion = new TrueFalse("Is Elena Cute",  1);
        Question stupidQuestion = new Checkbox("Choose a & c", "A", "B", "C", "D", true, false, true, false);
        quizQuestions.add(barbisQuestion);
        quizQuestions.add(ryansQuestion);
        quizQuestions.add(elenasQuestion);
        quizQuestions.add(stupidQuestion);
    }

    public void runQuiz(){
        for(Question eachQuestion: quizQuestions){
            eachQuestion.askQuestion();
            eachQuestion.displayAnswerOptions();
            eachQuestion.getUserResponse();
            eachQuestion.wasQuestionCorrect();
        }

    }

    public void gradeQuiz(){
        Question.displayScore();
    }
}
