package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Activity_ramalan_shio extends AppCompatActivity {
    RecyclerView rcy_shio;

    String s1[], s2[];
    int images [] = {R.drawable.tikus,R.drawable.kambing, R.drawable.macan,R.drawable.kelinci, R.drawable.naga, R.drawable.ular, R.drawable.kuda, R.drawable.kambing, R.drawable.monyet, R.drawable.ayam, R.drawable.anjing, R.drawable.babi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramalan_shio);

        rcy_shio = findViewById(R.id.rcy_shio);

        s1 = getResources().getStringArray(R.array.shio);
        s2 = getResources().getStringArray(R.array.ramalan);

        MyAdapter Adapter2 = new MyAdapter(this, s1,s2,images);
        rcy_shio.setAdapter(Adapter2);
        rcy_shio.setLayoutManager(new LinearLayoutManager(this));
    }
}