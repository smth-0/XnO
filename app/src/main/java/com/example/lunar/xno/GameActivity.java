package com.example.lunar.xno;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GameActivity extends Activity {

    public ArrayList<Button>buttonTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

////////////////////////////////////////////////////////////////////////////////////////////////////

buttonTable=new ArrayList<>(9);
        buttonTable.set(0, (Button) findViewById(R.id.button1));
        buttonTable.set(1, (Button) findViewById(R.id.button2));
        buttonTable.set(2, (Button) findViewById(R.id.button3));
        buttonTable.set(3, (Button) findViewById(R.id.button3));
        buttonTable.set(4, (Button) findViewById(R.id.button4));
        buttonTable.set(5, (Button) findViewById(R.id.button5));
        buttonTable.set(6, (Button) findViewById(R.id.button6));
        buttonTable.set(7, (Button) findViewById(R.id.button7));
        buttonTable.set(8, (Button) findViewById(R.id.button8));
////////////////////////////////////////////////////////////////////////////////////////////////////

        int INT = 0;

        final int finalINT = INT;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= finalINT;
                
            }
        };

        for(int i=0;i<9;i++) {
            INT = i;
            buttonTable.get(i).setOnClickListener(listener);
        }



    }

    void syncTable(){

        UtilClass util = null;
        TableSingleton instanse = TableSingleton.getInstance();

        for(int i=0;i<9;i++){
            buttonTable
                    .get(i)
                    .setText(
                            util
                                    .genSymbol(
                                            instanse
                                                    .getTable()
                                                    .get(i)
                                    )
                    );
        }
    }

}
