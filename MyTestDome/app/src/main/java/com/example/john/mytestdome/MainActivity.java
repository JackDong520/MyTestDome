package com.example.john.mytestdome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.uber).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , com.example.john.mytestdome.Uber.MainActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        findViewById(R.id.imooc_Activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , com.example.john.mytestdome.Imooc_Activity.MainActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}
