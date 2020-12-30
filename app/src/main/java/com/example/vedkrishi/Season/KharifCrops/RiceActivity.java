package com.example.vedkrishi.Season.KharifCrops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkrishi.R;

public class RiceActivity extends AppCompatActivity {
    String crop;
    TextView title, desc, lifeSpan, soil, sow, harvest, region, temp, rain, ferti, pesti;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice);

        title = findViewById(R.id.hd_rice);
        desc = findViewById(R.id.desc_rice);
        lifeSpan = findViewById(R.id.life_rice_desc);
        soil = findViewById(R.id.soil_desc);
        sow = findViewById(R.id.sow_desc);
        harvest = findViewById(R.id.harvest_desc);
        region = findViewById(R.id.region_desc);
        temp = findViewById(R.id.temp_desc);
        rain = findViewById(R.id.rain_desc);
        ferti = findViewById(R.id.ferti_desc);
        pesti = findViewById(R.id.pesti_desc);
        image = findViewById(R.id.img_rice);

        crop = getIntent().getStringExtra("crop");

        if (crop.equals("Rice")) {
            title.setText("Rice");
            desc.setText("India is one of the world's largest producers of rice");
            lifeSpan.setText("3-4 months");
            soil.setText("Loamy soil");
            sow.setText("June-July");
            harvest.setText("Nov-Dec");
            region.setText("West Bengal, Punjab ,Uttar Pradesh");
            temp.setText("24 C");
            rain.setText("150 cm");
            ferti.setText("105 pounds of nitrogen per acre preflood followed by 45 pounds of nitrogen per acre between green ring and 0.5-inch internode elongation for varieties such as Ahrent, Bengal, Cocodrie, Francis, and Wells");
            pesti.setText("Lambda-cyhalothrin, malathion and zeta-cypermethrin are all broad-spectrum pesticides used on rice.");
            image.setImageResource(R.drawable.rice);

        } else if (crop.equals("Cotton")) {
            title.setText("Cotton");
            desc.setText("Cotton is one of the most important fiber and cash crop of India and plays a dominant role in the industrial and agricultural economy of the country. It provides the basic raw material (cotton fibre) to cotton textile industry.");
            lifeSpan.setText("4-5 months");
            soil.setText("alluvial, clayey and red sandy loam");
            sow.setText("April-May");
            harvest.setText("Dec-Jan");
            region.setText("Maharashtra, Gujarat, Telangana");
            temp.setText("21-30 C");
            rain.setText("50-100 cm");
            ferti.setText("Nitrogen, Phosphorus, potassium");
            pesti.setText("Endosulfan 35 EC 2.5 lit/ha");
            image.setImageResource(R.drawable.cotton);

        } else if (crop.equals("Wheat")) {
            title.setText("Wheat");
            desc.setText("Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food.");
            lifeSpan.setText("4-6 months");
            soil.setText("Loam");
            sow.setText("Oct-Dec");
            harvest.setText("Feb-May");
            region.setText("Uttar Pradesh, Punjab, Haryana, Madhya Pradesh, Rajasthan, Bihar and Gujarat");
            temp.setText("17-20 c");
            rain.setText("75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Imidachloride 17.8");
            image.setImageResource(R.drawable.wheat);

        } else if (crop.equals("Mustard")) {
            title.setText("Mustard");
            desc.setText("\"Mustard (Brassica spp.), a native to temperate regions of Europe, was one of the first domesticated crops. This crop’s economic value resulted in its wide dispersal and it has been grown as a herb in Asia, North Africa, and Europe for thousands of years. Mustard has been cultivated as early as 5000 BC.\n" +
                    "\n" +
                    "Brassica (rapeseed‐mustard) is the second most important edible oilseed crop in India after groundnut and accounts for nearly 30% of the total oilseeds produced in the country. India is one of the largest rapeseed‐mustard growing countries in the world, accounting for 21.7 % and 10.7% of the total acreage and production occupying the first position in Area and second position in Production after China. The most important states growing these crops are Uttar Pradesh, Rajasthan, Madhya Pradesh, Haryana, Punjab, Orissa, Assam, Bihar, Gujarat and West Bengal. The world production of Rapeseed/Mustard has been increasing at a rapid rate in several countries largely in response to the continuing increase in demand for edible oils and its products.");
            lifeSpan.setText("3-4 months");
            soil.setText("Loam");
            sow.setText("Oct-Dec");
            harvest.setText("Feb-May");
            region.setText("Uttar Pradesh, Punjab, Haryana, Madhya Pradesh, Rajasthan, Bihar and Gujarat");
            temp.setText("15-20 c");
            rain.setText("75-100 cm");
            ferti.setText("Nitrogen,Potasm");
            pesti.setText("spinosad,bifenthrin");
            image.setImageResource(R.drawable.mustard);


        } else if (crop.equals("Bajra")) {
            title.setText("Bajra");
            desc.setText("Bajra popularly known as Pearl millet, cattail millet or bulrush belongs to the family Graminea. The crop is cultivated for grain as well as for fodder in the arid region of Africa and Asia and as a pasture in U.S.A. It is originated in India or Africa. It is grown all over India except Assam and part of northeast India.");
            lifeSpan.setText("3-4 months");
            soil.setText("loam");
            sow.setText("july-aug");
            harvest.setText("nov-march");
            region.setText("Andhra Pradesh, Madhya Pradesh, Gujarat, Maharashtra");
            temp.setText("17-25 c");
            rain.setText("40-50 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Eldrin 20 c.c");
            image.setImageResource(R.drawable.bajra);

        } else if (crop.equals("Oat")) {
            title.setText("Oat");
            desc.setText("Oats area and production in the World are about 27m ha and 40m tones, respectively. ... In India, Punjab, Haryana, UP and limited areas in MP, Orissa, Bihar, West Bengal are the Oats growing states.");
            lifeSpan.setText("3-4 months");
            soil.setText("loamy soil");
            sow.setText("nov-dec");
            harvest.setText("april-may");
            region.setText("punjab,haryana,mp,bihar,odisa");
            temp.setText("17-25 c");
            rain.setText("50-75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");

            image.setImageResource(R.drawable.oat);
        } else if (crop.equals("Peas")) {
            title.setText("Peas");
            desc.setText(" is a cool season crop grown throughout the world. Green pods are used for vegetable purpose and dried peas are used as pulse");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText("  Himachal Pradesh, Madhya Pradesh, Rajasthan, Maharashtra, Punjab, Haryana, Karnataka and Bihar");
            temp.setText("17-25 c");
            rain.setText("50-75 cm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Dimethoate 30 EC or Phosphamidon 40 SL");
            image.setImageResource(R.drawable.peas);


        } else if (crop.equals("Chickpeas")) {
            title.setText("Chickpeas");
            desc.setText(" Chickpea varieties developed by pure line selection in India. The world's total production of chickpeas hovers around 8.5 million metric tons annually and is grown over 10 million hectares of land approximately. The Desi type chickpea contribute to around 80% and the Kabuli type around 20% of the total production.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("sept-oct");
            harvest.setText("dec-jan");
            region.setText("  Himachal Pradesh, Madhya Pradesh, Rajasthan, Maharashtra, Punjab, Haryana, Karnataka and Bihar");
            temp.setText("24-30c");
            rain.setText("65 to 95 cm");
            ferti.setText("Phosphorus,Nitrogen,diammonium phosphate ");
            pesti.setText("Thiram (1:1)");
            image.setImageResource(R.drawable.chickpeas);
        } else if (crop.equals("Masoor")) {
            title.setText("Masoor");
            desc.setText("  It is one of the most important protein rich pulse crop. It is mostly eaten as Dal by splitting into 2 cotyledons, deep orange red or orange yellow in color. Whole grain is also used in various dishes. Lentil also provide a source of starch for textiles and printing. It is mixed with wheat flour in bread and cake production. India is the highest producer of lentil in the world.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText("  mp,up,bihar");
            temp.setText("18°C - 20°C");
            rain.setText("100cm");
            ferti.setText("urea ");
            pesti.setText("Hexavin 50WP");
            image.setImageResource(R.drawable.Masoor);
        } else if (crop.equals("Moong")) {
            title.setText("Moong");
            desc.setText("  Green gram also known as moong is one of the main pulse crop of India. It is a rich source of Protein along with fibre and iron. It can be cultivated as Kharif as well as summer crop");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText(" assam,meghalya,bihar,odisa");
            temp.setText("25°C - 35°C");
            rain.setText("60-90cm");
            ferti.setText("urea ");

            image.setImageResource(R.drawable.Moong);

        } else if (crop.equals("carrot")) {
            title.setText("carrot");
            desc.setText("  Carrot is a cool season crop and will develop a good colour when grown at 15°C to 20°C. The crop needs deep loose loamy soil. It requires a pH ranging from 6.0 to 7.0 for higher production. Carrot can be grown throughout the year at an elevation above 1500 metres with assured irrigation.");
            lifeSpan.setText("1-2 months");
            soil.setText("heavy soils, black cotton soils, and sandy loam soils.");
            sow.setText("oct-nov");
            harvest.setText("dec-jan");
            region.setText(" assam,meghalya,bihar,odisa");
            temp.setText("15°C to 20°C");
            rain.setText("20-50cm");
            ferti.setText("urea ");

            image.setImageResource(R.drawable.carrot);


        }
        else if (crop.equals("Raddish")) {
            title.setText("Radish");
            desc.setText(" Radish, edible root vegetable belongs to family of Cruciferae and its origin is in Mediterranean. It is crop of tropical and temperate region. It is a quick growing annual or biannual herb. Its edible roots are having different color from white to red.");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth,black soil");
            sow.setText("nov-dec");
            harvest.setText("feb-mar");
            region.setText("   West Bengal, Bihar, Uttar Pradesh, Karnataka, Punjab and Assam");
            temp.setText("17-25 c");
            rain.setText("100-225mm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Malathion 50EC");
            image.setImageResource(R.drawable.radish);
        }
        else if (crop.equals("Cauliflower")) {
            title.setText("Cauliflower");
            desc.setText(" Cauliflower is one of several vegetables in the species Brassica oleracea in the genus Brassica, which is in the Brassicaceae (or Mustard) family. ... The cauliflower head is composed of a white inflorescence meristem. Cauliflower heads resemble those in broccoli, which differs in having flower buds as the edible portion.");
            lifeSpan.setText("1-2 months");
            soil.setText("loam,fine tilth,black soil");
            sow.setText("aug-nov");
            harvest.setText("feb-mar");
            region.setText("  north,east india" );
            temp.setText("12-30°C");
            rain.setText("120-125mm");
            ferti.setText("Phosphorus,Nitrogen,Potasm");
            pesti.setText("Bt formulations");
            image.setImageResource(R.drawable.cauliflower);
    }
}