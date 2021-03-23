package com.example.fedunimillionaire30350727.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fedunimillionaire30350727.Models.Question;
import com.example.fedunimillionaire30350727.R;

import java.util.ArrayList;

public class Question1Fragment extends Fragment implements View.OnClickListener{
    ArrayList<Question> questions;
    int remaining = 1000000;
    private TextView Tquestion, A, B, C, D;
    private Button btnA, btnB, btnC, btnD;
    int saved = 0;

    public Question1Fragment(ArrayList<Question> questions){
        this.questions = questions;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.question_fragment, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Tquestion = view.findViewById(R.id.question);
        A = view.findViewById(R.id.A);
        B = view.findViewById(R.id.B);
        C = view.findViewById(R.id.C);
        D = view.findViewById(R.id.D);

        view.findViewById(R.id.btnA).setOnClickListener(this);
        view.findViewById(R.id.btnB).setOnClickListener(this);
        view.findViewById(R.id.btnC).setOnClickListener(this);
        view.findViewById(R.id.btnD).setOnClickListener(this);

        Question question = questions.get(0);

        String q = question.getText();
        String a = question.getAnswer().get(0).getPartB();
        String b = question.getAnswer().get(1).getPartB();
        String c = question.getAnswer().get(2).getPartB();
        String d = question.getAnswer().get(3).getPartB();

        Tquestion.append("Remaining amount to target: "+ remaining+"\n\n"+q);
        A.append("A. "+a);
        B.append("B. "+b);
        C.append("C. "+c);
        D.append("D. "+d);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnA:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.questions_holder, new OneSave(questions,saved))
                        .commit();
                break;
            case R.id.btnB:
            case R.id.btnC:
            case R.id.btnD:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.questions_holder, new ResultFragment(saved))
                        .commit();
                break;
        }
    }
}
