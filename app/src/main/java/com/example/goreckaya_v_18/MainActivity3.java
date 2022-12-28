package com.example.goreckaya_v_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageViewbackk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageViewbackk = (ImageView) findViewById(R.id.imageViewbackk);
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(intent);
        }
    });
    }
}