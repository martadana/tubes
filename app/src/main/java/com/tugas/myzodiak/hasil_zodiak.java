package com.tugas.myzodiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil_zodiak extends AppCompatActivity {
    TextView txt, points, points2;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_zodiak);
        txt = findViewById(R.id.datedisp);
        points = findViewById(R.id.points);
        back = findViewById(R.id.back);
        points2 = findViewById(R.id.points2);

        Intent mIntent = getIntent();
        int intValues = mIntent.getIntExtra("intValue", 0);
        if (intValues == 0) {
            points2.setText("");
            txt.setText("please select the date and try again to find your zodiac sign");
            points.setText("");
        }
        if (intValues == 1) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Sagittarius (November 22 - December 21)");
            points.setText("Represented by the archer, Sagittarians are always on a quest for knowledge. The last fire sign of the zodiac, Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures. ");
        }


        if (intValues == 2) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Capricorn (December 22 - January 19)");
            points.setText("The last earth sign of the zodiac, Capricorn is represented by the sea goat, a mythological creature with the body of a goat and tail of a fish. Accordingly, Capricorns are skilled at navigating both the material and emotional realms.\n");
        }
        if (intValues == 3) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Aquarius (January 20 - February 18)");
            points.setText("Despite the “aqua” in its name, Aquarius is actually the last air sign of the zodiac. Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land. Accordingly, Aquarius is the most humanitarian astrological sign.\n");
        }


        if (intValues == 4) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Pisces (February 19 - March 20)");
            points.setText("Pisces, a water sign, is the last constellation of the zodiac. It's symbolized by two fish swimming in opposite directions, representing the constant division of Pisces' attention between fantasy and reality. As the final sign, Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears — learned by all of the other signs. ");
        }

        if (intValues == 5) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Aries (March 21 - April 19)");
            points.setText("Aries loves to be number one, so it’s no surprise that these audacious rams are the first sign of the zodiac. Bold and ambitious, Aries dives headfirst into even the most challenging situations.");

        }

        if (intValues == 6) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Taurus (April 20 - May 20)");
            points.setText(
                    "Taurus adalah orang yang keras kepala (BATU) yang suka menggantung wanita yang menyukainya dan cenderung selalu disakiti padahal karena karmanya terdahulu \n");
        }


        if (intValues == 7) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Gemini (May 21 - June 20)7");
            points.setText("Have you ever been so busy that you wished you could clone yourself just to get everything done? That’s the Gemini experience in a nutshell. Appropriately symbolized by the celestial twins, this air sign was interested in so many pursuits that it had to double itself. ");
        }

        if (intValues == 8) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Cancer (June 21 - July 22)");
            points.setText("Cancer is a cardinal water sign. Represented by the crab, this crustacean seamlessly weaves between the sea and shore representing Cancer’s ability to exist in both emotional and material realms. Cancers are highly intuitive and their psychic abilities manifest in tangible spaces: For instance, Cancers can effortlessly pick up the energies in a room");
        }


        if (intValues == 9) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Leo (July 23 - August 22)");
            points.setText("Roll out the red carpet because Leo has arrived. Leo is represented by the lion and these spirited fire signs are the kings and queens of the celestial jungle. They’re delighted to embrace their royal status: Vivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves.");
        }
        if (intValues == 10) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Virgo (August 23 - September 22)");
            points.setText("Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association that speaks to Virgo’s deep-rooted presence in the material world. Virgos are logical, practical, and systematic in their approach to life. This earth sign is a perfectionist at heart and isn’t afraid to improve skills through diligent and consistent practice.");
        }
        if (intValues == 11) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Libra (September 23 - October 22)");
            points.setText(
                    "Libra is an air sign represented by the scales (interestingly, the only inanimate object of the zodiac), an association that reflects Libra's fixation on balance and harmony. Libra is obsessed with symmetry and strives to create equilibrium in all areas of life.");
        }
        if (intValues == 12) {
            points2.setText("Zodiak mu adalah :");
            txt.setText("Scorpio (October 23 - November 21)");
            points.setText("Scorpio is one of the most misunderstood signs of the zodiac. Because of its incredible passion and power, Scorpio is often mistaken for a fire sign. In fact, Scorpio is a water sign that derives its strength from the psychic, emotional realm");
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}