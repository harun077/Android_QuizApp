package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private  Button startbutton;
    private  Button aboutbutton;
    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startbutton =  findViewById(R.id.button);
        aboutbutton = findViewById(R.id.button2);
        nameText = findViewById(R.id.editName);

        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameText.getText().toString();
                Intent intent = new Intent(getApplicationContext(),QuestionsActivity.class);
                intent.putExtra("myname",name);
                startActivity(intent);

            }
        });

        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),DevoloperActivity.class);
                startActivity(intent);
            }
        });

    }
}