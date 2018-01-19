package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void makeText(View view){
       EditText textbox = findViewById(R.id.editText);
       String input = textbox.getText().toString();

       TextView display = findViewById(R.id.displayText);

       display.setText(input);

    }
}
