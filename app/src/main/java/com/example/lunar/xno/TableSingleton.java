package com.example.lunar.xno;

import java.util.ArrayList;

class TableSingleton {
    private static final TableSingleton ourInstance = new TableSingleton();


    private ArrayList<Boolean>table;

    static TableSingleton getInstance() {
        return ourInstance;
    }

    public ArrayList<Boolean> getTable() {
        return table;
    }

    public void setTable(ArrayList<Boolean> table) {
        this.table = table;
    }

    private TableSingleton() {
        table= new ArrayList<>(9);
    }

}
