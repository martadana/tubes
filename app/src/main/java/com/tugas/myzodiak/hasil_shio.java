package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hasil_shio extends AppCompatActivity {
    public TextView datedisp,dob;
    TextView txt,txt2, points,points2;
    Button back;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_shio);


        gambar = findViewById(R.id.gb_zodiak);
        txt = findViewById(R.id.shio);
        points = findViewById(R.id.points);
        back = findViewById(R.id.back);
        points2 = findViewById(R.id.points2);

        Intent terima = getIntent();
        int intValues = terima.getIntExtra("intValue", 0);
        String sub = terima.getStringExtra("kirimsub");

        if (intValues == 0) {
            points2.setText("Shio mu adalah :");
            txt.setText("Tikus " + sub );
            gambar.setImageResource(R.drawable.tikus);
            points.setText("Orang yang memiliki shio tikus, banyak dikenal sebagai orang yang optimis dan energetik. Hal ini membuat mereka banyak disukai oleh orang lain. Namun terkadang, karena kemampuan komunikasinya yang lemah, tidak jarang orang dengan shio ini dianggap tidak ramah.");
        }

        if (intValues == 1) {
            points2.setText("Shio mu adalah :");
            txt.setText("Kerbau " + sub );
            gambar.setImageResource(R.drawable.kerbau);
            points.setText("Secara umum, shio kerbau memiliki karater yang pekerja keras, pantang menyerah dan gigih dalam bekerja. Sehingga seseorang yang lahir sebagai shio kerbau, sangat cocok dijadikan sebagai seorang pemimpin, karena sifatnya yang jujur, berani dan bertanggung jawab penuh atas pekerjaannya.");
        }

        if (intValues == 2) {
            points2.setText("Shio mu adalah :");
            txt.setText("Macan "+sub);
            gambar.setImageResource(R.drawable.macan);
            points.setText("shio Macan juga memiliki kepribadian yang bisa menularkan aura positif ke orang lain. Namun, pemilik shio Macan ternyata memiliki pembawaan yang mudah resah, tidak bisa berdiam diri, atau bersikap lebih tenang terhadap sesuatu yang sedang dipikirkannya.");
        }

        if (intValues == 3) {
            points2.setText("Shio mu adalah :");
            txt.setText("Kelinci "+sub);
            gambar.setImageResource(R.drawable.kelinci);
            points.setText("Kelinci melambangkan kesehatan dan umur panjang. Mereka yang terlahir dengan shio kelinci biasanya senang berkumpul bersama sahabat-sahabat terdekat dan keluarga. Pemilik shio ini juga dikenal populer, baik hati, jujur, mencintai kedamaian, ramah, penengah masalah, dan senang mencari solusi.");
        }

        if (intValues == 4) {
            points2.setText("Shio mu adalah :");
            txt.setText("Naga "+sub);
            gambar.setImageResource(R.drawable.naga);
            points.setText("Naga adalah satu-satunya hewan legendaris yang masuk dalam urutan shio. Sebagai hewan legendaris yang dikenal sangat kuat, mereka yang terlahir dengan shio naga biasa dikenal sangat energik, baik hati dan suka menolong. Di Tiongkok, naga juga dipercaya melambangkan keberuntungan, maka dari itu banyak orang Tiongkok yang mengatakan bahwa mereka yang lahir di tahun naga akan sukses di kemudian hari. ");
        }

        if (intValues == 5) {
            points2.setText("Shio mu adalah :");
            txt.setText("Ular "+sub);
            gambar.setImageResource(R.drawable.ular);
            points.setText("Di Tiongkok, ular merepresentasikan kelembutan. Mereka yang memiliki shio ular dikenal bijaksana, pandai menyimpan rahasia, cerdas, memiliki daya tarik tinggi, dan simpatik, Sayangnya, mereka juga dikenal terlalu introvert, sering merasa insecure, mudah iri, pemalas, serakah, serta arogan. Cocok dengan shio ayam dan kerbau.");

        }

        if (intValues == 6) {
            points2.setText("Shio mu adalah :");
            txt.setText("Kuda "+sub);
            gambar.setImageResource(R.drawable.kuda);
            points.setText("Menurut legenda Tiongkok, kuda melambangkan kebebasan. Sebagai pemilik shio kuda, mereka dikenal energik, mandiri, suka traveling, pandai membuat keputusan, memiliki tujuan hidup yang jelas, aktif, populer, namun tidak sabar, egois, arogan dan terlalu percay diri. Cocok dengan shio anjing dan macan.");
        }


        if (intValues == 7) {
            points2.setText("Shio mu adalah :");
            txt.setText("Kambing "+sub);
            gambar.setImageResource(R.drawable.kambing);
            points.setText("Di Tiongkok, shio kambing justru lebih dikenal sebagai shio domba, dan dalam legenda mereka, kambing dikenal melambangkan harmoni atau kebersamaan. Mereka yang lahir di tahun kambing suka dengan kesendirian, kreatif, suka berimajinasi, mementingkan penampilan, memiliki pribadi yang tenang, sopan, dan memiliki selera yang tinggi. ");
        }

        if (intValues == 8) {
            points2.setText("Shio mu adalah :");
            txt.setText("Monyet "+sub);
            gambar.setImageResource(R.drawable.monyet);
            points.setText("Dalam kepercayaan Tiongkok, monyet melambangkan kebahagiaan. Mereka yang terlahir dengan shio monyet gemar mencari kesenangan, sering menjadi life of the party, energik, fleksibel, bijaksana, cerdik, banyak akal, karismatik, loyal dan kreatif. Di sisi lain, pemilik shio monyet juga dikenal ceroboh, egois, mementingkan diri sendiri, tidak setia, arogan, pemalas, dan tidak bisa diam. Cocok dengan shio naga dan tikus.");
        }

        if (intValues == 9) {
            points2.setText("Shio mu adalah :");
            txt.setText("Ayam "+sub);
            gambar.setImageResource(R.drawable.ayam);
            points.setText("Menurut legenda Tiongkok, ayam melambangkan ketelitian. Mereka yang lahir di tahun ayam dikenal praktis, bisa diandalkan, suka menganalisis, jujur, perfeksionis, pekerja keras, serta mandiri. Sayangnya, pemilik shio ini juga dikenal konservatif, arogan, mementingkan diri sendiri, gemar berpikir negatif, serta sulit diatur. Cocok dengan shio kerbau dan ular. ");
        }
        if (intValues == 10) {
            points2.setText("Shio mu adalah :");
            txt.setText("Anjing "+sub);
            gambar.setImageResource(R.drawable.anjing);
            points.setText("Di Tiongkok, anjing dikenal sebagai lambang loyalitas. Mereka yang memiliki shio anjing dikenal sangat setia, jujur, memiliki banyak teman, baik hati, bertanggung jawab, serta pandai dalam berbisnis, namun mereka sulit menemukan pasangan yang tepat, \"penjilat\" yang ulung, sensitif, temperamen, keras kepala, dan kurang disiplin. Cocok dengan shio macan dan kuda.");
        }
        if (intValues == 11) {
            points2.setText("Shio mu adalah :");
            txt.setText("Babi "+sub);
            gambar.setImageResource(R.drawable.babi);
            points.setText("Sebagai hewan yang berada di urutan terakhir dalam shio, babi melambangkan sifat rendah hati. Mereka yang terlahir di tahun babi dikenal akan keramahan dan ketulusan hatinya, sopan, suka menolong, easygoing, jujur, bisa dipercaya dan tulus. Sayangnya, mereka juga dikenal sombong, keras kepala, naif, mementingkan diri sendiri, materialis serta pemalas. Cocok dengan shio kelinci dan kambing. ");
        }






        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}