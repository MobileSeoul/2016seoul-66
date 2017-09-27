package com.example.com.seoulg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by SimJoonwoo on 2016-10-29.
 */

public class MapsActivity extends AppCompatActivity {


    LinearLayout backgroundLayout;
    ScrollView mainScroll, roadScroll, parkScroll, palaceScroll;

    Button mainRoad, mainPark, mainPalace;
    Button road1, road2, road3, road4, road5, road6, road7, road8, road9, road10,
            road11, road12, road13, road14, road15, road16, road17, road18, road19, road20;

    Button park1, park2, park3, park4, park5, park6, park7, park8, park9, park10,
            park11, park12, park13, park14, park15, park16, park17;

    Button palace1, palace2, palace3, palace4, palace5, palace6, palace7;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_second_layout);

        backgroundLayout = (LinearLayout)findViewById(R.id.BackgroundLayout);
        mainScroll = (ScrollView)findViewById(R.id.optionScroll);
        roadScroll = (ScrollView)findViewById(R.id.roadScroll);
        parkScroll = (ScrollView)findViewById(R.id.parkScroll);
        palaceScroll = (ScrollView)findViewById(R.id.palaceScroll);

        mainRoad = (Button)findViewById(R.id.road);
        mainPark = (Button)findViewById(R.id.park);
        mainPalace = (Button)findViewById(R.id.palace);

        road1 = (Button)findViewById(R.id.road1); road8 = (Button)findViewById(R.id.road8); road15 = (Button)findViewById(R.id.road15);
        road2 = (Button)findViewById(R.id.road2); road9 = (Button)findViewById(R.id.road9); road16 = (Button)findViewById(R.id.road16);
        road3 = (Button)findViewById(R.id.road3); road10 = (Button)findViewById(R.id.road10); road17 = (Button)findViewById(R.id.road17);
        road4 = (Button)findViewById(R.id.road4); road11 = (Button)findViewById(R.id.road11); road18 = (Button)findViewById(R.id.road18);
        road5 = (Button)findViewById(R.id.road5); road12 = (Button)findViewById(R.id.road12); road19 = (Button)findViewById(R.id.road19);
        road6 = (Button)findViewById(R.id.road6); road13 = (Button)findViewById(R.id.road13); road20 = (Button)findViewById(R.id.road20);
        road7 = (Button)findViewById(R.id.road7); road14 = (Button)findViewById(R.id.road14);

        park1 = (Button)findViewById(R.id.park1); park7 = (Button)findViewById(R.id.park7); park13 = (Button)findViewById(R.id.park13);
        park2 = (Button)findViewById(R.id.park2); park8 = (Button)findViewById(R.id.park8); park14 = (Button)findViewById(R.id.park14);
        park3 = (Button)findViewById(R.id.park3); park9 = (Button)findViewById(R.id.park9); park15 = (Button)findViewById(R.id.park15);
        park4 = (Button)findViewById(R.id.park4); park10 = (Button)findViewById(R.id.park10); park16 = (Button)findViewById(R.id.park16);
        park5 = (Button)findViewById(R.id.park5); park11 = (Button)findViewById(R.id.park11); park17 = (Button)findViewById(R.id.park17);
        park6 = (Button)findViewById(R.id.park6); park12 = (Button)findViewById(R.id.park12);


        palace1 = (Button)findViewById(R.id.palace1); palace4 = (Button)findViewById(R.id.palace4); palace6 = (Button)findViewById(R.id.palace6);
        palace2 = (Button)findViewById(R.id.palace2); palace5 = (Button)findViewById(R.id.palace5);
        palace3 = (Button)findViewById(R.id.palace3);

        mainRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainScroll.setVisibility(View.GONE);
                roadScroll.setVisibility(View.VISIBLE);

            }
        });

        road1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bukchon_hanok_village));

            }
        });
        road2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.cheongdam_k_star_road));

            }
        }); road3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.sinchon_yonsei_ro));

            }
        }); road4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.dobongsan_dubu_tofu_alley));

            }
        }); road5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.sinsa_dong_garosu_gil));

            }
        }); road6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.dongdaemun_saengseon_gui_alley));

            }
        }); road7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.gwanghui_dong_central_asia_street));

            }
        }); road8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.yeji_dong_watch_shop_alley));

            }
        }); road9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.hoegi_subway_station_pajeon_alley));

            }
        }); road10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.hongdae_ttaeng_ttaeng_street));

            }
        }); road11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.ihwa_mural_village));

            }
        }); road12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.itaewon_usadan_gil));

            }
        }); road13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.jongno_3_ga_bossam_alley));

            }
        }); road14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.jongno_insa_dong_street));

            }
        }); road15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.jongno_seochon_village));

            }
        }); road16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.konkuk_university_lamb_kebab_alley));

            }
        }); road17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.myeong_dong_jaemiro));

            }
        }); road18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.namdaemun_kal_guksu_alley));

            }
        }); road19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.seongsu_dong_handmade_shoes_street));

            }
        }); road20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.seorae_village_cafe_street));

            }
        });

        mainPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainScroll.setVisibility(view.GONE);
                parkScroll.setVisibility(View.VISIBLE);
            }
        });



        park1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.boramae_park));

            }
        });
        park2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.dream_forest));

            }
        });
        park3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.gildong_park));

            }
        });
        park4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.iris_garden));

            }
        });
        park5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.jungnang_park));

            }
        });
        park6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.independence_park));

            }
        });
        park7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.namsan_park));

            }
        });
        park8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.olympic_park));

            }
        });
        park9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.pureun_arboretum));

            }
        });
        park10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.sajik_park));

            }
        });
        park11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.seonyudo_park));

            }
        });
        park12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.seoseoul_park));

            }
        });
        park13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.seoul_forest));

            }
        });
        park14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.tabgol_park));

            }
        });
        park15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.world_cup_park));

            }
        });
        park16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.yeouido_park));

            }
        });
        park17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.yongsan_park));

            }
        });
        mainPalace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainScroll.setVisibility(View.GONE);
                palaceScroll.setVisibility(View.VISIBLE);
            }
        });
        palace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.changdeokgung_palace));

            }
        });
        palace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.changgyeonggung_palace));

            }
        });
        palace3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.deoksugung_palace));

            }
        });
        palace4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.gyeongbokgung_palace));

            }
        });
        palace5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.gyeonghuigung_palace));

            }
        });
        palace6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundLayout.setBackgroundDrawable(
                        getResources().getDrawable(R.drawable.jongmyo));

            }
        });

    }
}
