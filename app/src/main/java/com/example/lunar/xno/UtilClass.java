package com.example.lunar.xno;

import android.util.Log;

import java.util.ArrayList;

import static com.example.lunar.xno.TableSingleton.*;

public class UtilClass {



    TableSingleton instance= getInstance();

    public boolean detectWin(){

        //todo:создать систему для определения победа/нет
        return false;
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
