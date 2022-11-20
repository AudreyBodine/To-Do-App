package com.example.todoapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InsertActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbManager = new DatabaseManager(this);
        setContentView(R.layout.activity_insert);
    }

    public void insert(View view) {
        // Retrieve to-do list item
        Log.w("InsertActivity", "Insert Button Pushed");
        EditText itemET = findViewById(R.id.list_itemET);
        String item = itemET.getText().toString();

        // Insert into database
        ToDo td = new ToDo(0, item);
        dbManager.insert(td);
        Toast.makeText(this, "Item Added", Toast.LENGTH_SHORT).show();

        // Clear data
        itemET.setText("");
    }

    public void goBack(View view) {
        this.finish();

    }
}


