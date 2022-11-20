package com.example.todoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import android.widget.RelativeLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseManager dbManager;
    private List RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbManager = new DatabaseManager(this);
        updateView();
    }

    private void updateView(){
        ArrayList<ToDo> tasks = dbManager.selectAll();
        int items = 0;
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
    }
   /* private void updateView() {
        List<ToDo> tasks = dbManager.selectAll();
        tasks = Collections.synchronizedList(tasks);

        RelativeLayout layout = new RelativeLayout(this);
        ScrollView scrollView = new ScrollView(this);
        RadioGroup group = new RadioGroup(this);

        for (ToDo td : tasks) {
            RadioButton rb = new RadioButton(this);
            // ListView lv = new ListView(this);
            rb.setId(td.getId());
            rb.setText(td.toString());
            group.addView(rb);
        }

        scrollView.addView(group);
        layout.addView( scrollView );
        setContentView( layout );


        synchronized (tasks) {
            Iterator<ToDo> itr = tasks.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }


    }*/

   /* private void updateView() {
        ArrayList<ToDo> tasks = dbManager.selectAll();
        RelativeLayout layout = new RelativeLayout(this);
        ScrollView scrollView = new ScrollView(this);
        RadioGroup group = new RadioGroup(this);


        for (ToDo td : tasks) {
            RadioButton rb = new RadioButton(this);
           // ListView lv = new ListView(this);
            rb.setId(td.getId());
            rb.setText(td.toString());
            group.addView(rb);
        }

        scrollView.addView(group);
        layout.addView( scrollView );
        setContentView( layout );

       /* ArrayList<ToDo> tasks = dbManager.selectAll();
        RelativeLayout layout = new RelativeLayout(this);
        ScrollView scrollView = new ScrollView(this);
        ListView list = new ListView(this);

        for (ToDo td : tasks) {
            ListView lv = new ListView(this);
            lv.setId(td.getId());
           // lv.setText(td.toString());
            list.addView(lv);
        }

        scrollView.addView(list);
        layout.addView( scrollView );
        setContentView( layout );

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_add:
                Log.w("MainActivity", "Add Selected");
                Intent insertIntent = new Intent(this, InsertActivity.class);
                this.startActivity(insertIntent);
                return true;
            case R.id.action_delete:
                Log.w("MainActivity", "Delete Selected");
                Intent deleteIntent = new Intent(this, DeleteActivity.class);
                this.startActivity(deleteIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}