package com.example.com.seoulg;

/**
 * Created by com on 2016-10-12.
 */
public class CourseItem {
    int image;
    String title;

    int getImage() {
        return this.image;
    }

    String getTitle() {
        return this.title;
    }

    CourseItem(int image, String title) {
        this.image = image;
        this.title = title;
    }
}

