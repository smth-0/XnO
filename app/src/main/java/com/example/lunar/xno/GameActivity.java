package com.example.lunar.xno;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends Activity {

    public ArrayList<Button>buttonTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
////////////////////////////////////////////////////////////////////////////////////////////////////

buttonTable=new ArrayList<>(9);

        Log.d("XNOGAME","building buttons...");

        buttonTable.add((Button) findViewById(R.id.button1));
        buttonTable.add((Button) findViewById(R.id.button2));
        buttonTable.add((Button) findViewById(R.id.button3));
        buttonTable.add((Button) findViewById(R.id.button3));
        buttonTable.add((Button) findViewById(R.id.button4));
        buttonTable.add((Button) findViewById(R.id.button5));
        buttonTable.add((Button) findViewById(R.id.button6));
        buttonTable.add((Button) findViewById(R.id.button7));
        buttonTable.add((Button) findViewById(R.id.button8));

        syncTable();

        Log.d("XNOGAME","buttons build successful, Table synced");
////////////////////////////////////////////////////////////////////////////////////////////////////

        int INT = 0;

        final int finalINT = INT;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= finalINT;
                UtilClass utilClass = new UtilClass();
                if(utilClass.who){ //если ход Х
                    Log.d("XNOGAME","X was put");
                    if(utilClass.putx(i)){
                        //nothing
                        syncTable();

                    } else {
                        showToast(getResources().getString(R.string.cantput));
                    }

                } else { //если ход O
                    Log.d("XNOGAME","O was put");
                    if(utilClass.puto(i)){
                        //nothing
                        syncTable();

                    } else {
                        showToast(getResources().getString(R.string.cantput));
                    }
                }
                utilClass.detectWin();
                syncTable();
            }
        };

        for(int i=0;i<9;i++) {
            INT = i;
            buttonTable.get(i).setOnClickListener(listener);
            Log.d("XNOGAME","Button no. "+i+" was synced");
        }

        Log.d("XNOGAME","OnCreate finished");

    }

    void syncTable(){

        UtilClass util = new UtilClass();
        TableSingleton instanse = TableSingleton.getInstance();

        for(int i=0;i<9;i++){
            buttonTable
                    .get(i)
                    .setText(
                            util
                                    .genSymbol()
                    );
        }
    }

    void showToast(String text){
        Toast.makeText(GameActivity.this,text,Toast.LENGTH_SHORT);
        Log.d("XNOGAME","Toast with text '"+text+"' was shown");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("XNOGAME","GameActivity destroyed");
    }
}
