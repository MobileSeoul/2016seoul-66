package com.example.com.seoulg;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View include1, include2, include3, include4;
    TextView text1, text2, text3, text4;
    ImageView image1, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initTextView();
        initImageView();
        setText();
        setImage();

        buttonClickActivity(include1, MapsActivity.class);
        buttonClickActivity(include2,CourseActivity.class);
        buttonClickActivity(include3,PlaceActivity.class);
        include4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.seoulcitybus.com/sub.php?PN=course_circulation&mainNum=2&subNum=11"));
                startActivity(intent);
            }
        });


    }


    public void buttonClickActivity(View include, final Class activityName) {
        include.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , activityName);
                startActivity(intent);
            }
        });
    }

    public void initView() {
         include1 = findViewById(R.id.include1);
         include2 = findViewById(R.id.include2);
         include3 = findViewById(R.id.include3);
         include4 = findViewById(R.id.include4);
    }

    public void initImageView() {
        image1 = (ImageView) include1.findViewById(R.id.icon);
        image2 = (ImageView) include2.findViewById(R.id.icon);
        image3 = (ImageView) include3.findViewById(R.id.icon);
        image4 = (ImageView) include4.findViewById(R.id.icon);
    }

    public void initTextView() {
        text1 = (TextView) include1.findViewById(R.id.text);
        text2 = (TextView) include2.findViewById(R.id.text);
        text3 = (TextView) include3.findViewById(R.id.text);
        text4 = (TextView) include4.findViewById(R.id.text);
    }

    public void setText() {
        text1.setText("Maps");
        text2.setText("Course");
        text3.setText("Place");
        text4.setText("Tour Bus");
    }

    public void setImage() {
        image1.setImageResource(R.drawable.road);
        image2.setImageResource(R.drawable.park);
        image3.setImageResource(R.drawable.palace);
        image4.setImageResource(R.drawable.map);

    }
}
