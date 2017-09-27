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

public class TabFragment1 extends Fragment {

        static final int ITEM_SIZE =20;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_fragment_1,container,false);


        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<CourseItem> items = new ArrayList<>();
        CourseItem[] item = new CourseItem[ITEM_SIZE];
        item[0] = new CourseItem(R.drawable.bossam_alley_pic, "Bossam Alley");
        item[1] = new CourseItem(R.drawable.bukchon_village_pic, "Bukchon Village");
        item[2] = new CourseItem(R.drawable.central_asia_street_pic, "Gwanghui Central Asia Street");
        item[3] = new CourseItem(R.drawable.dubu_alley_pic, "Dobongsan Dubu(tofu) Alley");
        item[4] = new CourseItem(R.drawable.garosu_gil_pic, "Sinsadong Garosu Gil");
        item[5] = new CourseItem(R.drawable.insa_dong_street_pic, "Jongno Insadong Street");
        item[6] = new CourseItem(R.drawable.jaemi_ro_pic, "Myeongdong Jaemi Ro");
        item[7] = new CourseItem(R.drawable.k_star_road_pic, "Cheongdam K-Star Road");
        item[8] = new CourseItem(R.drawable.kalguksu_alley_pic, "Namdaemoon Kalguksu Alley");
        item[9] = new CourseItem(R.drawable.lamb_kebab_alley_pic, "KonKuk UniversityLamb Kebab Alley");
        item[10] = new CourseItem(R.drawable.mural_village_pic, "Ihwa Mural Village");
        item[11] = new CourseItem(R.drawable.pajeon_alley_pic, "Hoegi Subway Station Pajeon Alley");
        item[12] = new CourseItem(R.drawable.saengseon_gui_alley_pic, "Dondaemoon Saengseon Gui Alley");
        item[13] = new CourseItem(R.drawable.seochon_village_pic, "Jongno Seochon Village");
        item[14] = new CourseItem(R.drawable.seorae_cafe_street_pic, "Seorae Cafe Street");
        item[15] = new CourseItem(R.drawable.shoes_street_pic, "Seongsudong Handmade Shoes Street");
        item[16] = new CourseItem(R.drawable.ttaeng_ttaeng_street_pic, "Hongdae University ttaeng ttaeng Street");
        item[17] = new CourseItem(R.drawable.usadan_gil_pic, "Itaewon Usadan Gil");
        item[18] = new CourseItem(R.drawable.watch_alley_pic, "Yejidong Watch Alley");
        item[19] = new CourseItem(R.drawable.yonsei_ro_pic, "Sinchon Yonsei Ro");


        for (int i = 0; i < ITEM_SIZE; i++) {

            items.add(item[i]);
        }

        recyclerView.setAdapter(new CourseAdapter(getActivity(), items, R.layout.tab_fragment_1));

        return v;
    }
}
