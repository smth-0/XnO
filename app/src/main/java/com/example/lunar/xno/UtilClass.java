package com.example.lunar.xno;

import static com.example.lunar.xno.TableSingleton.*;

public class UtilClass {

    Boolean who= Boolean.FALSE;

    TableSingleton instance= getInstance();

    public boolean detectWin(){

        //todo:создать систему для определения победа/нет
        return false;
    }

    public String genSymbol(){
        if(who){
            return "X";
        } else if(!who) {
            return "O";
        } else {
            return " ";
        }
    }

    Boolean putx(int pos){
        if(getInstance().getTable().get(pos)!=2){
            return false;
        }
        getInstance().getTable().set(pos, 2);
        return true;
    }
    Boolean puto(int pos){
        if(getInstance().getTable().get(pos)!=1){
            return false;
        }
        getInstance().getTable().set(pos, 1);
        return true;
    }

}
