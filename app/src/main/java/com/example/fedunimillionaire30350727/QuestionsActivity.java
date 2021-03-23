package com.example.fedunimillionaire30350727;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fedunimillionaire30350727.Fragments.Question1Fragment;
import com.example.fedunimillionaire30350727.Models.Answer;
import com.example.fedunimillionaire30350727.Models.Question;

import java.util.ArrayList;

public class QuestionsActivity extends AppCompatActivity {

    public ArrayList<Question> questions = new ArrayList<Question>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        Question question1 = new Question();
        Question question2 = new Question();
        Question question3 = new Question();
        Question question4 = new Question();
        Question question5 = new Question();
        Question question6 = new Question();
        Question question7 = new Question();
        Question question8 = new Question();
        Question question9 = new Question();
        Question question10 = new Question();
        Question question11= new Question();

        question1.setText("Famous for his Chinese Theatre, Sid Grauman had earlier opened which other Hollywood theatre in 1922?");
        question3.setText("On the current flag of the United Nations, which country is shown closest to the top of the flag?");
        question2.setText("In 1935, which of these countries became the first to use an image of the future Queen Elizabeth on a bank note?");
        question4.setText("Which of these Gilbert & Sullivan operettas was performed first?");
        question5.setText("How many essential vitamins make up what is known as the 'B-complex'?");
        question6.setText("Which of these popular 60s TV shows premiered first?");
        question7.setText("Who was never 'Time' magazine's 'Man of the Year'?");
        question8.setText("Commonly known by his nickname, what was the full name of 'Banjo' Paterson?");
        question9.setText("Which of Hollywood's four Warner Brothers died on the eve of their landmark premiere of 'The Jazz Singer'?");
        question10.setText("Horowitz is the original surname of which American actor?");
        question11.setText("In which field did 16th century Italian Benvenuto Cellini achieve fame?");

        ArrayList<Answer> question1Answers = new ArrayList<Answer>();
        question1Answers.add(new Answer("A", "Painting"));
        question1Answers.add(new Answer("B", "Architecture"));
        question1Answers.add(new Answer("C", "Music"));
        question1Answers.add(new Answer("D", "Sculpture"));

        ArrayList<Answer> question2Answers = new ArrayList<Answer>();
        question2Answers.add(new Answer("A", "Australia"));
        question2Answers.add(new Answer("B", "New Zealand"));
        question2Answers.add(new Answer("C", "England"));
        question2Answers.add(new Answer("D", "Canada"));

        ArrayList<Answer> question3Answers = new ArrayList<Answer>();
        question3Answers.add(new Answer("A", "New Zealand"));
        question3Answers.add(new Answer("B", "Norway"));
        question3Answers.add(new Answer("C", "Chile"));
        question3Answers.add(new Answer("D", "Iceland"));

        ArrayList<Answer> question4Answers = new ArrayList<Answer>();
        question4Answers.add(new Answer("A", "The Gondoliers"));
        question4Answers.add(new Answer("B", "The Pirates of Penzance"));
        question4Answers.add(new Answer("C", "The Mikado"));
        question4Answers.add(new Answer("D", "The Yeomen og the Guard"));

        ArrayList<Answer> question5Answers = new ArrayList<Answer>();
        question5Answers.add(new Answer("A", "6"));
        question5Answers.add(new Answer("B", "8"));
        question5Answers.add(new Answer("C", "10"));
        question5Answers.add(new Answer("D", "13"));

        ArrayList<Answer> question6Answers = new ArrayList<Answer>();
        question6Answers.add(new Answer("A", "Bewitched"));
        question6Answers.add(new Answer("B", "Get Smart"));
        question6Answers.add(new Answer("C", "Hogan's Heroes"));
        question6Answers.add(new Answer("D", "I dream of Jeannie"));

        ArrayList<Answer> question7Answers = new ArrayList<Answer>();
        question7Answers.add(new Answer("A", "Adolf Hitler"));
        question7Answers.add(new Answer("B", "Ruhollah Khomeini"));
        question7Answers.add(new Answer("C", "Joseph Stalin"));
        question7Answers.add(new Answer("D", "Mao Zedong"));

        ArrayList<Answer> question8Answers = new ArrayList<Answer>();
        question8Answers.add(new Answer("A", "Albert Burke"));
        question8Answers.add(new Answer("B", "Andrew Barton"));
        question8Answers.add(new Answer("C", "Adam Beaufort"));
        question8Answers.add(new Answer("D", "Adrian Banks"));

        ArrayList<Answer> question9Answers = new ArrayList<Answer>();
        question9Answers.add(new Answer("A", "Albert"));
        question9Answers.add(new Answer("B", "Harry"));
        question9Answers.add(new Answer("C", "Jack"));
        question9Answers.add(new Answer("D", "Sam"));


        ArrayList<Answer> question10Answers = new ArrayList<Answer>();
        question10Answers.add(new Answer("A", "Matt Damon"));
        question10Answers.add(new Answer("B", "Johnny Deep"));
        question10Answers.add(new Answer("C", "Julia Roberts"));
        question10Answers.add(new Answer("D", "Winona Ryder"));

        ArrayList<Answer> question11Answers = new ArrayList<Answer>();
        question11Answers.add(new Answer("A", "French"));
        question11Answers.add(new Answer("B", "Egyptian"));
        question11Answers.add(new Answer("C", "Roman"));
        question11Answers.add(new Answer("D", "Arabian"));

        question1.setAnswer(question1Answers);
        question2.setAnswer(question2Answers);
        question3.setAnswer(question3Answers);
        question4.setAnswer(question4Answers);
        question5.setAnswer(question5Answers);
        question6.setAnswer(question6Answers);
        question7.setAnswer(question7Answers);
        question8.setAnswer(question8Answers);
        question9.setAnswer(question9Answers);
        question10.setAnswer(question10Answers);
        question11.setAnswer(question11Answers);

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.questions_holder, new Question1Fragment(questions))
                .commit();
    }
}