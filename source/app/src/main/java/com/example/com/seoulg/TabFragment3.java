package com.example.com.seoulg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by com on 2016-10-14.
 */
public class TabFragment3 extends Fragment {

    static final int ITEM_SIZE =6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment_3,container,false);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<CourseItem> items = new ArrayList<>();
        CourseItem[] item = new CourseItem[ITEM_SIZE];
        item[0] = new CourseItem(R.drawable.changdeokgung_palace_pic, "Changdeokgung Palace");
        item[1] = new CourseItem(R.drawable.changgyeonggung_palace_pic, "Changgyeonggung Palace");
        item[2] = new CourseItem(R.drawable.deoksugung_palace_pic, "Deoksugung Palace");
        item[3] = new CourseItem(R.drawable.gyeongbokgung_palace_pic, "Gyeongbokgung Palace");
        item[4] = new CourseItem(R.drawable.gyeonghuigung_palace_pic, "Gyeonghuigung Palace");
        item[5] = new CourseItem(R.drawable.jongmyo_pic, "Jongmyo");




        for (int i = 0; i < ITEM_SIZE; i++) {

            items.add(item[i]);
        }

        recyclerView.setAdapter(new CourseAdapter3(getActivity(), items, R.layout.tab_fragment_3));

        return v;
    }
}
