package com.example.androidmvc.activities;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidmvc.R;
import com.example.androidmvc.models.Model;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {

    private Model myModel;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating relationship between the
        // observable Model and the
        // observer Activity
        myModel = new Model();
        myModel.addObserver(this);

        button = findViewById(R.id.button);
        button.setOnClickListener(v -> myModel.setValue());

    }

    @Override
    // function to update the view after
    // the values are modified by the model
    public void update(Observable arg0, Object arg1) {
        button.setText("Count: " + myModel.getValue());
    }
}