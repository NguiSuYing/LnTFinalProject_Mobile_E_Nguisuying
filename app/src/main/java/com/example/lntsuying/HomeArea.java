package com.example.lntsuying;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HomeArea extends Fragment {


    private Button buttonTriangle;
    private Button buttonCircle;
    private Button buttonSquare;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_area, container, false);


        buttonTriangle = view.findViewById(R.id.buttonTriangle);
        buttonCircle = view.findViewById(R.id.buttonCircle);
        buttonSquare = view.findViewById(R.id.buttonSquare);




        buttonTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Trianglearea = new Intent (HomeArea.this,
                        com.example.lntsuying.Trianglearea);
                startActivity(com.example.lntsuying.Trianglearea);
            }
        });

        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Squarearea= new Intent (HomeArea.this, com.example.lntsuying.Squarearea);
                startActivity(com.example.lntsuying.Squarearea);
            }
        });
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Squarearea= new Intent (HomeArea.this,
                        com.example.lntsuying.Circlearea);
                startActivity(com.example.lntsuying.Circlearea);
            }
        });

        return view;
    }
}