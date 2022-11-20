package com.example.todoapp;

public class ToDo {

    private int id;
    private String item;

    public ToDo(int newId, String newItem){
        setID(newId);
        setItem(newItem);
    }

    private void setID(int newId) {
        id = newId;
    }

    private void setItem(String newItem) {
        item = newItem;
    }

    public String getItem() {
        return item;
    }

    public String toString(){
        return id + "; " + item;
    }

    public int getId() {
        return id;
    }
}
