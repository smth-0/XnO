package com.example.lunar.xno;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartScreenActivity extends Activity {

    Button oneplayer, twoplayers;
    Intent intent1p, intent2p;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        ////////////////////////////////////////////////////////////////////////////////////////////

        oneplayer=findViewById(R.id.button1player);
        twoplayers=findViewById(R.id.button2players);

        oneplayer.setEnabled(false);

        intent1p=null;
        intent2p=new Intent(this,GameActivity.class);
        ////////////////////////////////////////////////////////////////////////////////////////////


        twoplayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("XNOGAME","Game activity started.");
                startActivity(intent2p);
            }
        });

    }
}
