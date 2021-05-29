package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ramalan extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images [] = {R.drawable.aries,R.drawable.taurus, R.drawable.gemini,R.drawable.cencer, R.drawable.leo, R.drawable.virgo, R.drawable.libra, R.drawable.scorpio, R.drawable.sagitarius, R.drawable.capri, R.drawable.aquarius, R.drawable.pisces};

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