package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ramalan extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images [] = {R.drawable.aries, R.drawable.gemini};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramalan);

        recyclerView = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.zodiak);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}