package org.launchcode.java.studios.quiz;

public class QuizRunner {

    public static void main (String[] args){
       Quiz todayQuiz = new Quiz();
       todayQuiz.runQuiz();
       todayQuiz.gradeQuiz();
    }
}
