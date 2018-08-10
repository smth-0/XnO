package com.example.lunar.xno;

import java.util.ArrayList;

class TableSingleton {
    private static final TableSingleton ourInstance = new TableSingleton();
    private Boolean who = new Boolean(false);
    private ArrayList<Integer>table;

    static TableSingleton getInstance() {
        return ourInstance;
    }

    public ArrayList<Integer> getTable() {
        return table;
    }

    public Boolean getWho() {
        return who;
    }

    public void setWho(Boolean who) {
        this.who = who;
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
