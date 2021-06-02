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
            txt.setText("Tikus" + sub );
            points.setText("Orang yang memiliki shio tikus, banyak dikenal sebagai orang yang optimis dan energetik. Hal ini membuat mereka banyak disukai oleh orang lain. Namun terkadang, karena kemampuan komunikasinya yang lemah, tidak jarang orang dengan shio ini dianggap tidak ramah.");
        }

        if (intValues == 1) {
            points2.setText("Shio mu adalah :");
            txt.setText("Kerbau " + sub );
            points.setText("Secara umum, shio kerbau memiliki karater yang pekerja keras, pantang menyerah dan gigih dalam bekerja. Sehingga seseorang yang lahir sebagai shio kerbau, sangat cocok dijadikan sebagai seorang pemimpin, karena sifatnya yang jujur, berani dan bertanggung jawab penuh atas pekerjaannya.");
        }

        if (intValues == 2) {
            points2.setText("Shio mu adalah :");
            txt.setText("Macan");
            points.setText("shio Macan juga memiliki kepribadian yang bisa menularkan aura positif ke orang lain. Namun, pemilik shio Macan ternyata memiliki pembawaan yang mudah resah, tidak bisa berdiam diri, atau bersikap lebih tenang terhadap sesuatu yang sedang dipikirkannya.");
        }

        if (intValues == 3) {
            points2.setText("Shio mu adalah :");
            txt.setText("Rabbit (February 19 - March 20)");
            points.setText("Pisces, a water sign, is the last constellation of the zodiac. It's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality. As the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. ");
        }

        if (intValues == 4) {
            points2.setText("Shio mu adalah :");
            txt.setText("Naga "+sub);
            points.setText("Pisces, a water sign, is the last constellation of the zodiac. It's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality. As the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. ");
        }

        if (intValues == 5) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Snake (March 21 - April 19)");
            points.setText("Aries loves to be number one, so it’s no surprise that these audacious rams are the first sign of the zodiac. Bold and ambitious, Aries dives headfirst into even the most challenging situations.");

        }

        if (intValues == 6) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Horse (April 20 - May 20)");
            points.setText(
                    "Taurus is an earth sign represented by the bull. Like their celestial spirit animal, Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors\n");
        }


        if (intValues == 7) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Sheep (May 21 - June 20)7");
            points.setText("Have you ever been so busy that you wished you could clone yourself just to get everything done? That’s the Gemini experience in a nutshell. Appropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. ");
        }

        if (intValues == 8) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Monkey (June 21 - July 22)");
            points.setText("Cancer is a cardinal water sign. Represented by the crab, this crustacean seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. Cancers are highly intuitive and their psychic abilities manifest in tangible spaces: For instance, Cancers can effortlessly pick up the energies in a room");
        }


        if (intValues == 9) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Chicken (July 23 - August 22)");
            points.setText("Roll out the red carpet because Leo has arrived. Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle. They’re delighted to embrace their royal status: Vivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves.");
        }
        if (intValues == 10) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Dog (August 23 - September 22)");
            points.setText("Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo’s deep-rooted presence in the material world. Virgos are logical, practical, and systematic in their approach to life. This earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.");
        }
        if (intValues == 11) {
            points2.setText("Your zodiac sign is:");
            txt.setText("Pig (September 23 - October 22)");
            points.setText("Libra is an air sign represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life.");
        }






        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}