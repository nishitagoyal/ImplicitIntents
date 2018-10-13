package com.example.goyal.implicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BrowserActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        textView=findViewById(R.id.textview);
        Intent intent = getIntent();
        String data = intent.getStringExtra(intent.EXTRA_TEXT);
        textView.setText(data);
    }
}
