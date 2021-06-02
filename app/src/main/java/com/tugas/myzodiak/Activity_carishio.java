package com.tugas.myzodiak;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;


public class Activity_carishio extends AppCompatActivity {
    public TextView datedisp,dob;
    Button findshio;
    DatePickerDialog picker;
    public int intValue ;
    public  String subvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carishio);

        datedisp = findViewById(R.id.datedisp);
        dob=findViewById(R.id.dob);

        datedisp.setInputType(InputType.TYPE_NULL);
        findshio = findViewById(R.id.findshio);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);


                picker = new DatePickerDialog(Activity_carishio.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                datedisp.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                int x = (year - 4) % 12;
                                int y = (year - 4) % 10 /2;
                                if (y == 0)  {
                                    subvalue = "Kayu"; // Kayu
                                }
                                if (y == 1) {
                                    subvalue = "Api"; // Api
                                }
                                if (y == 2) {
                                    subvalue = "Tanah"; // Tanah
                                }
                                if (y == 3) {
                                    subvalue = "Logam"; // Logam
                                }
                                if (y == 4) {
                                    subvalue = "Air"; // Air
                                }

                                if (x == 0) {
                                    intValue = 0; // tikus
                                }

                                if (x == 1) {
                                    intValue = 1; //kerbau
                                }

                                if (x == 2) {
                                    intValue = 2; // macan
                                }

                                if (x == 3) {
                                    intValue = 3; //rabbit
                                }

                                if (x == 4) {
                                    intValue = 4; //naga
                                }

                                if (x == 5) {
                                    intValue = 5; //ular
                                }

                                if (x == 6) {
                                    intValue = 6; //kuda
                                }

                                if (x == 7) {
                                    intValue = 7; //kambing
                                }

                                if (x == 8) {
                                    intValue = 8; //Monyet
                                }

                                if (x == 9) {
                                    intValue = 9; //Ayam
                                }

                                if (x == 10) {
                                    intValue = 10; //anjing
                                }

                                if (x == 11) {
                                    intValue = 11; //Babi
                                }





                            }

                        }, year, month, day);
                picker.show();




            }
        });
        findshio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(datedisp.getText().toString().length() <=4) {
                    Toast.makeText(getApplicationContext(), "Isi tanggal terlebih dahulu!", Toast.LENGTH_LONG).show();
                } else {
                   openNewActivity(view);
                }
            }

            private void openNewActivity(View view) {

                Intent intent= new Intent(view.getContext(), hasil_shio.class);
                intent.putExtra("intValue", intValue);
                intent.putExtra("kirimsub", subvalue);
                startActivity(intent);
            }
        });
    }

}

