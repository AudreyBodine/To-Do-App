package com.example.todoapp;

import android.content.Context;

import androidx.appcompat.widget.AppCompatButton;

public class ToDoButton extends AppCompatButton {
    private ToDo td;

    public ToDoButton(Context context, ToDo newTask ) {
        super( context );
        td = newTask;
    }
}

