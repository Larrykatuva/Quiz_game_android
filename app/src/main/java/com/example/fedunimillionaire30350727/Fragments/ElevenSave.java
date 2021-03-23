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

public class ElevenSave extends Fragment implements View.OnClickListener{

    ArrayList<Question> questions;
    int saved;

    private TextView amount;
    private Button collect, neglect;

    public ElevenSave(ArrayList<Question> questions, int saved){
        this.questions = questions;
        this.saved = saved;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.save_fagment, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        amount = view.findViewById(R.id.amount);
        view.findViewById(R.id.save).setOnClickListener(this);
        view.findViewById(R.id.skip).setOnClickListener(this);

        amount.append("Do you want to save $"+1000000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.save:
                saved = 1000000;
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.questions_holder, new ResultFragment(saved))
                        .commit();
                break;
            case R.id.skip:
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.questions_holder, new ResultFragment(saved))
                        .commit();
                break;
        }
    }
}
