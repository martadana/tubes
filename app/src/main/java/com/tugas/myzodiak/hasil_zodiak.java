package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class hasil_zodiak extends AppCompatActivity {
    TextView txt, points, points2;
    ImageView gambar;
    Button back, bt_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_zodiak);

        gambar = findViewById(R.id.gb_zodiak);
        bt_lanjut = findViewById(R.id.bt_lanjut);
        txt = findViewById(R.id.datedisp);
        points = findViewById(R.id.points);
        back = findViewById(R.id.bt_ramalshio);
        points2 = findViewById(R.id.points2);

        Intent mIntent = getIntent();
        int intValues = mIntent.getIntExtra("intValue", 0);

        if (intValues == 1) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Sagittarius (22 November - 21 Desember)");
            gambar.setImageResource(R.drawable.sagitarius);
            points.setText("Sagitarius dilambangkan sebagai simbol pemanah di dalam eleman api. Oleh sebab itu, Sagitarius digambarkan sebagai orang yang memiliki kepribadian optimis, Sagitarius selalu yakin dengan setiap jalan hidup yang dipili dan kerap menyalurkan energi positif dan mampu menginspirasi orang-orang di sekitarnya.");
        }


        if (intValues == 2) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Capricorn (22 Desember - 19 Januari)");
            gambar.setImageResource(R.drawable.capri);
            points.setText("Capricorn dilambangkan dengan kambing dalam elemen tanah yang menggambarkan pribadi yang handal dalam mengambil keputusan yang baik. Capricorn bisa dengan mudah menentukan keputusan terbaik dalam hidup.");
        }
        if (intValues == 3) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Aquarius (20 Januari - 18 Februari)");
            gambar.setImageResource(R.drawable.aquarius);
            points.setText("Dilambangkan dengan penimba air, Aquarius merupakan zodiak yang memiliki sifat apa adanya. Kamu selalu jujur kepada setiap orang di sekitarmu. Inilah yang membuat orang lain nyaman berada di dekatmu.");
        }

        if (intValues == 4) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Pisces (19 Februari - 20 Maret)");
            gambar.setImageResource(R.drawable.pisces);
            points.setText("Dengan lambang ikan dan air, zodiak Pisces memiliki sifat yang sensitif. Kepekaan menjadi kunci dari zodiak ini untuk memiliki kepedulian dan peka terhadap apa yang orang lain butuhkan. Namun kamu terkadang lupa apa yang sebenarnya kamu butuhkan.");
        }

        if (intValues == 5) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Aries (21 Maret - 19 April)");
            gambar.setImageResource(R.drawable.aries);
            points.setText("Aries masuk ke dalam kategori elemen api dengan simbol domba. Sehingga Aries kerap dikaitkan dengan loyalitas yang tinggi. Aries juga memiliki kepedulian dan selalu mementingkan kebutuhan orang-orang di sekitarnya. Tak heran jika Aries kerap menolong orang dengan usaha terbaiknya.");

        }

        if (intValues == 6) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Taurus (20 April - 20 Mei)");
            gambar.setImageResource(R.drawable.taurus);
            points.setText("Dengan elemen tanah, Taurus dilambangkan dengan simbol banteng atau sapi jantan. Menandaka bahwa Taurus memiliki sifat yang murah hati. Selain itu, Taurus kerap menawarkan bantuan kepada orang lain yang sedang kesulitan.");
        }


        if (intValues == 7) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Gemini (21 Mei - 20 Juni)");
            gambar.setImageResource(R.drawable.gemini);
            points.setText("Pemilik zodiak Gemini kerap digambarkan sebagai orang-orang yang hangat dan mempesona. Gemini adalah tipe orang yang mudah bergaul dan beradaptasi dengan lingkungan pertemanan baru.");
        }

        if (intValues == 8) {
            points2.setText("Zodiak mu adalah :");
            gambar.setImageResource(R.drawable.cencer);
            txt.setText("Cancer (21 Juni - 22 Juli)");
            points.setText("Dengan lambang kepiting, menjadikan Cancer sebagai zodiak yang memiliki sifat empati. Selain itu, Cancer merupakan zodiak yang cukup peka dan mudah merasakan apa yang orang lain rasakan. Terutama di saat orang tersebut mengalami masalah.");
        }


        if (intValues == 9) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Leo (23 Juli - 22 Augustus)");
            gambar.setImageResource(R.drawable.leo);
            points.setText("Memiliki elemen api dan dilambangkan sebagai singa, Leo merupakan seseorang yang pemberani akan hal apapun. Dengan sifat beraninya, Leo pun mampu membuat orang-orang di sekitarnya jatuh cinta. Cara Leo menyelesaikan masalah juga membuat orang lain kagum.");
        }
        if (intValues == 10) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Virgo (23 August - 22 September)");
            gambar.setImageResource(R.drawable.virgo);
            points.setText("Dilambangkan dengan perempuan, Virgo berada dalam kategori elemen tanah yang menjadikannya memiliki sifat yang penuh kebaikan. Virgo akan dengan senang hati menemani teman atau keluarganya melalui masa sulit. Selain itu, Virgo adalah orang yang sangat menggunakan rasionalnya dalam hal apapun.");
        }
        if (intValues == 11) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Libra (23 September - 22 Oktober)");
            gambar.setImageResource(R.drawable.libra);
            points.setText("Libra menjadi zodiak yang mempunyai kepribadian yang tulus hati. Dengan simbol timbangan, Libra selalu melakukan segala sesuatu dengan sepenuh hati. Dengan senang hati, Libra akan senang menolong orang di sekitarnya yang tertimpa masalah tanpa mengharapkan pamrih.");
        }
        if (intValues == 12) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Scorpio (23 Oktober - 21 November)");
            gambar.setImageResource(R.drawable.scorpio);
            points.setText("Sifat yang kuat dari sosok Scorpio dilambangkan oleh kalajengking. Dengan sifatnya ini, Scorpio dapat membuat orang-orang di sekitarnya terjaga dengan aman.");
        }
        bt_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hasil_zodiak.this, ramalan.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}