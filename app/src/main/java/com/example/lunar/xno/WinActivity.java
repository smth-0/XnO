package com.example.lunar.xno;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        textView = findViewById(R.id.textViewWin);


        if(TableSingleton.getInstance().getWho()){
            textView.setText("WINNER IS O");
        } else {
            textView.setText("WINNER IS X");
        }


    }
}
