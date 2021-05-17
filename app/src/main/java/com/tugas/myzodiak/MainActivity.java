package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt_cari_zodiak(View view) {
        Intent intent = new Intent(MainActivity.this, cari_zodiak.class);
        startActivity(intent);
    }

    public void ramalan(View view) {
        Intent intent = new Intent(MainActivity.this, ramalan.class);
        startActivity(intent);
    }
}