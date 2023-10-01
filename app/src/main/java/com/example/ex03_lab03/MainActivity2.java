package com.example.ex03_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wv = findViewById(R.id.wv);

        Intent intent = getIntent();

        Intent.createChooser(intent,"");

        wv.loadUrl(intent.getStringExtra("link").toString());
    }
}