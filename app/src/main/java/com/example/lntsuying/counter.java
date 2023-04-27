package com.example.lntsuying;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class counter extends Fragment {


    private TextView counterTextView;
    private Button incrementButton;
    private Button decrementButton;
    private Button resetButton;
    private int counterValue;

    public counter() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);


        counterTextView = view.findViewById(R.id.counter_textview);
        incrementButton = view.findViewById(R.id.increment_button);
        decrementButton = view.findViewById(R.id.decrement_button);
        resetButton = view.findViewById(R.id.reset_button);

        counterValue = 0;
        counterTextView.setText(String.valueOf(counterValue));

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue++;
                counterTextView.setText(String.valueOf(counterValue));
            }
        });

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue--;
                counterTextView.setText(String.valueOf(counterValue));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue = 0;
                counterTextView.setText(String.valueOf(counterValue));
            }
        });

        return view;
    }
}