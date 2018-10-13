package com.example.goyal.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void shareText(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        startActivity(intent);
    }
    public void mailText(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        Uri uri = Uri.parse("mailto:goyalnishita07@gmail.com");
        intent.setData(uri);
        startActivity(intent);
    }
    public void aboutUs(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        Uri uri = Uri.parse("http://sheandtech.com");
        intent.setData(uri);
        startActivity(intent);
    }
    public void dial(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        Uri uri = Uri.parse("tel:9958392968");
        intent.setData(uri);
        startActivity(intent);
    }
    public void call(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT,"abcd");
        Uri uri = Uri.parse("tel:9958392968");
        intent.setData(uri);
        startActivity(intent);
    }
\
}
