package com.example.john.mytestdome.AndriodNotes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.john.mytestdome.R;

/**
 * Created by john on 2016/11/30.
 */

public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.android_notes);

        findViewById(R.id.android_notes_05).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,
                        com.example.john.mytestdome.AndriodNotes.Capter_05.MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
