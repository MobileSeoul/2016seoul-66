package com.example.com.seoulg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceThirdActivity2 extends AppCompatActivity {
    int park[] = {R.string.boramae, R.string.dream, R.string.glidong, R.string.independence, R.string.iris, R.string.jungnang,
            R.string.namsan, R.string.olympic, R.string.pureun, R.string.sajik, R.string.seonyudo, R.string.seoul, R.string.tabgol,
            R.string.worldcup, R.string.yeouido, R.string.yongsan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_thrid_informaton_layout);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);
        int imgId = intent.getIntExtra("imgId",0);
        int parkId= park[position];
        ImageView img = (ImageView)findViewById(R.id.image);
        TextView txt = (TextView)findViewById(R.id.text);
        img.setBackgroundResource(imgId);
        txt.setText(parkId);

    }

}