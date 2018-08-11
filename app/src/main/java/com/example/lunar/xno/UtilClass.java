package com.example.lunar.xno;

import android.util.Log;

import java.util.ArrayList;

public class UtilClass {



    TableSingleton instance= TableSingleton.getInstance();

    public boolean detectWin(){

        int[] cells = new int[10];
        for(int i=0;i<9;i++) {
            cells[i] = TableSingleton.getInstance().getTable().get(i);
        }
        for(int i = 0; i < 3; i++) { //Для победы нужны 3 клеточки
            if (cells[i * 3] == cells[i * 3 + 1] && cells[i * 3 + 1] == cells[i * 3 + 2] && cells[i * 3 + 2] != 0) //Комбинации для победы вычисляются по
                return true; //разным формулам, эта - по горизонтали
                //0-1-2, 3-4-5 и 6-7-8
                //нумерация в массиве начинается с 0
            else if (cells[i] == cells[i + 3] && cells[i + 3] == cells[i + 6] && cells[i + 6] != 0) //Вертикальная
                return true; //0-3-6, 1-4-7 и 2-5-8
            else if ((cells[2] == cells[4] && cells[4] == cells[6]) || (cells[0] == cells[4] && cells[4] == cells[8]) && cells[4] != 0)
                return true;
        }
            return false;
    }

    private int[] convert() {
        int[] cells = new int[10];


        return cells;
    }
    private boolean intTobool(int x){
        boolean y = false;
        if(x==2) {
            y=true;
        }
        return y;
    }

    public String genSymbol(int i){
        if(instance.getTable().get(i)==2){
            return "X";
        } else if(instance.getTable().get(i)==1) {
            return "O";
        } else {
            return " ";
        }
    }

    Boolean putx(int pos){
  //*
        if(TableSingleton.getInstance().getTable().get(pos)==2){
            return false;
        }
//*/

        instance.getTable().set(pos, 2);
        //switchWho();
        TableSingleton.getInstance().setWho(false);
        Log.d("XNOGAME","X was putted on id no. "+pos);
        return true;
    }
    Boolean puto(int pos){
        //*
        if(TableSingleton.getInstance().getTable().get(pos)==1){
            return false;
        }
//*/

        instance.getTable().set(pos, 1);
        //switchWho();
        TableSingleton.getInstance().setWho(true);
        Log.d("XNOGAME","O was putted on id no. "+pos);
        return true;
    }

    void clearTable(){
        TableSingleton.getInstance().setTable(new ArrayList<Integer>(9));
        for(int i=0;i<9;i++)
        TableSingleton.getInstance().getTable().add(0);
    }

    void switchWho(){
        if(!TableSingleton.getInstance().getWho()){TableSingleton.getInstance().setWho(false); return;}
        if( TableSingleton.getInstance().getWho()){TableSingleton.getInstance().setWho(true ); return;}
        Log.d("XNOGAME","table switched to "+TableSingleton.getInstance().getWho());
    }
}
