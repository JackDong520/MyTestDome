package com.example.john.mytestdome.Imooc_Activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.john.mytestdome.R;

/**
 * Created by john on 2016/11/30.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imooc_main_activity);
        findViewById(R.id.button_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri url = Uri.parse("http://www.immoc.com");
                intent.setData(url);
                startActivity(intent);
        }
        });
    }
}
