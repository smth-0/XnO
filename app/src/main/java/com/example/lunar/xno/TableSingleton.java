package com.example.lunar.xno;

import java.util.ArrayList;

class TableSingleton {
    private static final TableSingleton ourInstance = new TableSingleton();


    private ArrayList<Integer>table;

    static TableSingleton getInstance() {
        return ourInstance;
    }

    public ArrayList<Integer> getTable() {
        return table;
    }

    public void setTable(ArrayList<Integer> table) {
        this.table = table;
    }

    private TableSingleton() {
        table= new ArrayList<>(9);
        for(int i=0;i<9;i++){
            table.add(0);
        }
    }

}
