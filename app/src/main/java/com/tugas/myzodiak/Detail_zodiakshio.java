package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_zodiakshio extends AppCompatActivity {
   
    TextView tvd_zodiak, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_zodiakshio);


        tvd_zodiak = findViewById(R.id.tvd_zodiak);
        info = findViewById(R.id.detail);
        getIncomingExtra();


    }
    private void getIncomingExtra(){
        Intent mIntent = getIntent();

        String namazodiak = mIntent.getStringExtra("nama_zodiak");
        String moreinfo = mIntent.getStringExtra("info_zodiak");

        setData(namazodiak, moreinfo);
    }
    private  void  setData( String namazodiak, String moreinfo){

        tvd_zodiak.setText(namazodiak);
        info.setText(moreinfo);

    }

}