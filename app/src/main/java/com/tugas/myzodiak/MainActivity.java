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
        datedeparture = findViewById(R.id.datedeparture);
        Tanggal = (EditText) findViewById(R.id.datedeparture);
       // bt_zodiak = (ImageButton) findViewById(R.id.bt_cari_zodiak);

        myCalendar = Calendar.getInstance();
        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                TextView tanggal = findViewById(R.id.datedeparture);
                String myFormat = "dd-MMMM-yyyy";
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
                tanggal.setText(sdf.format(myCalendar.getTime()));
            }
        };

        datedeparture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, date,
                        myCalendar.get(Calendar.YEAR),
                        myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
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
