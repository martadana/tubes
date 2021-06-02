package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.app.DatePickerDialog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    EditText Tanggal;
    ImageButton bt_zodiak;
    Calendar myCalendar;
    DatePickerDialog.OnDateSetListener date;

    TextView datedeparture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt_ramalan_zodiak(View view) {
        Intent intent = new Intent(MainActivity.this, ramalan.class);
        startActivity(intent);
      //  overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }
    public void bt_ramalanshio(View view) {
        Intent intent = new Intent(MainActivity.this, Activity_ramalan_shio.class);
        startActivity(intent);
        //  overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }
    public void bt_carishio (View view) {
        Intent intent = new Intent(MainActivity.this, Activity_carishio.class);
        startActivity(intent);
        //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }
    public void bt_carizodiak (View view) {
        Intent intent = new Intent(MainActivity.this, Activity_carizodiak.class);
        startActivity(intent);
       // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
    }

}
