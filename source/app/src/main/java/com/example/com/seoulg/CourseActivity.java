package com.example.com.seoulg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by com on 2016-10-12.
 */
public class CourseActivity extends AppCompatActivity {
    ImageView imageView;
    int courseId[] = {R.drawable.buckon, R.drawable.cheongdam, R.drawable.dobongsan, R.drawable.dongdaemun, R.drawable.gwanghui, R.drawable.hegisubway
            , R.drawable.hongda, R.drawable.ihwamural, R.drawable.itaewon, R.drawable.jongnoinsa, R.drawable.jongro3, R.drawable.konkuk, R.drawable.myeongdong, R.drawable.namdaemun,
            R.drawable.pajeon, R.drawable.seochon, R.drawable.seongsudong, R.drawable.seorae, R.drawable.sinchon, R.drawable.sinsa, R.drawable.yejidong};
    LinearLayout layout1;
    int i;
    Bitmap orgImage, resize;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_second_dynamic);

        layout1 = (LinearLayout) findViewById(R.id.layout1);

        for (i = 0; i < courseId.length; i++) {
            final BitmapFactory.Options opts = new BitmapFactory.Options();
            opts.inSampleSize =2;

            imageView = new ImageView(this);
            orgImage = BitmapFactory.decodeResource(getResources(), courseId[i],opts);
            imageView.setImageBitmap(orgImage);
            layout1.addView(imageView);
        }
    }

}
