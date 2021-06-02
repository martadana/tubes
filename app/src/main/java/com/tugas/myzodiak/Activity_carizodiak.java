package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Activity_carizodiak extends AppCompatActivity {
    public TextView datedisp,dob;

    Button findzodiac;
    DatePickerDialog picker;
    public int intValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carizodiak);

        datedisp = findViewById(R.id.datedisp);
        dob=findViewById(R.id.dob);

        datedisp.setInputType(InputType.TYPE_NULL);
        findzodiac = findViewById(R.id.findzodiac);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                picker = new DatePickerDialog(Activity_carizodiak.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                datedisp.setText(dayOfMonth + "/" + (monthOfYear+1) + "/" + year);
                                if (monthOfYear+1 ==12){

                                    if (dayOfMonth < 22)
                                        intValue = 1;
                                    else
                                        intValue = 2;
                                }

                                if (monthOfYear+1 ==1){

                                    if (dayOfMonth < 20)
                                        intValue = 2;
                                    else
                                        intValue = 3;
                                }

                                if (monthOfYear+1 ==2){

                                    if (dayOfMonth < 19)
                                        intValue = 3;
                                    else
                                        intValue = 4;
                                }

                                if (monthOfYear+1 ==3){

                                    if (dayOfMonth < 21)
                                        intValue = 4;
                                    else
                                        intValue = 5;
                                }
                                if (monthOfYear+1 ==4){

                                    if (dayOfMonth < 20)
                                        intValue = 5;
                                    else
                                        intValue = 6;
                                }

                                if (monthOfYear+1 ==5){

                                    if (dayOfMonth < 21)
                                        intValue = 6;
                                    else
                                        intValue = 7;
                                }

                                if (monthOfYear+1 ==6){

                                    if (dayOfMonth < 21)
                                        intValue = 7;
                                    else
                                        intValue = 8;
                                }

                                if (monthOfYear+1 ==7){

                                    if (dayOfMonth < 23)
                                        intValue = 8;
                                    else
                                        intValue = 9;
                                }

                                if (monthOfYear+1 ==8){

                                    if (dayOfMonth < 23)
                                        intValue = 9;
                                    else
                                        intValue = 10;
                                }

                                if (monthOfYear+1 ==9){

                                    if (dayOfMonth < 23)
                                        intValue = 10;
                                    else
                                        intValue = 11;
                                }

                                if (monthOfYear+1 ==10){

                                    if (dayOfMonth < 23)
                                        intValue = 11;
                                    else
                                        intValue = 12;
                                }

                                if (monthOfYear+1 ==11){

                                    if (dayOfMonth < 22)
                                        intValue = 12;
                                    else
                                        intValue = 1;
                                }

                            }

                        }, year, month, day);
                picker.show();




            }
        });
        findzodiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(datedisp.getText().toString().length() <=4) {
                    Toast.makeText(getApplicationContext(), "Isi tanggal terlebih dahulu!", Toast.LENGTH_LONG).show();
                } else {
                    openNewActivity(view);
                }
            }

            private void openNewActivity(View view) {

                Intent intent= new Intent(view.getContext(), hasil_zodiak.class);

                intent.putExtra("intValue", intValue);
                startActivity(intent);
            }
        });



    }
}

