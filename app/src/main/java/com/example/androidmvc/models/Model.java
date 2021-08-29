package com.example.androidmvc.models;

import java.util.Observable;

public class Model extends Observable {

    private int count;

    public Model() {
        count = 0;
    }

    // defining getter and setter functions

    // function to return count
    public int getValue() {
        return count;
    }

    // function to make changes in the activity button's
    // count value when user touch it
    public void setValue() {
        count++;
        setChanged();
        notifyObservers();
    }

}