package com.example.lunar.xno;

public class UtilClass {

    Boolean who=false;

    TableSingleton instance=TableSingleton.getInstance();

    public boolean detectWin(){

        //todo:создать систему для определения победа/нет
        return false;
    }

    public String genSymbol(boolean b){
        if(b){
            return "X";
        } else {
            return "O";
        }
    }


}
