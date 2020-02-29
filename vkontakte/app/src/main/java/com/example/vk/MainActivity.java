package com.example.vk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.UnderlineSpan;
import android.widget.LinearLayout;
import android.widget.ScrollView;


import com.bumptech.glide.util.Util;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    NestedScrollView scrollView;
    ArrayList<ModelFeed> modelfeedArrayList=new ArrayList<>();
    AdapterFeed adapterFeed;
    public final static String LIST_STATE_KEY = "recycler_list_state";
    Parcelable listState;
    private static Bundle mBundleRecyclerViewState;
   LayoutManager mLayoutManager;
    int recyclerViewPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=(RecyclerView)findViewById(R.id.recy_feed);
        LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapterFeed=new AdapterFeed(this,modelfeedArrayList);
        recyclerView.setAdapter(adapterFeed);
        populateRecyclerView();


        }

//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putIntArray("ARTICLE_SCROLL_POSITION",
//                new int[]{recyclerView .getScrollX(), recyclerView.getScrollY()});}
//
//
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        final int[] position = savedInstanceState.getIntArray("ARTICLE_SCROLL_POSITION");
//        if(position != null)
//           recyclerView.post(new Runnable() {
//                public void run() {
//                    recyclerView.scrollTo(position[0], position[1]);
//                }
//            });}
    private void populateRecyclerView() {
        ModelFeed modelfeed=new ModelFeed(3,"100", "2", "23", "6", R.drawable.prof4, R.drawable.content4, "Бизнес Тренды" , "час назад", getText(R.string.content4));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(5,"104", "2", "21", "2", R.drawable.prof5, R.drawable.content5, "Александр Романов" , "два часа назад",getText((R.string.content5)));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(6,"1344", "23", "212", "24", R.drawable.prof6, R.drawable.content6, "НЛП-Клуб online" , "два часа назад",getText((R.string.content6)));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(7,"144", "3", "12", "14", R.drawable.prof7, R.drawable.content7, "Идеи для бизнеса | Стартапы" , "три часа назад",getText((R.string.content7)));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(1,"120", "300", "1400", "2300", R.drawable.vkpj, R.drawable.first,"Али Ашкеев", "сейчас","Работает!!!" );
        modelfeedArrayList.add(modelfeed);
        modelfeed=new ModelFeed(2,"130", "3", "13", "2", R.drawable.prof2, R.drawable.content2,"Dr DW | WINDOWS | ANDROID | IOS | APPLE", "час назад","Прежде чем лопать эти пузырики, вспомни, что воздух внутри этих пузыриков прибыл к тебе из Китая." );
        modelfeedArrayList.add(modelfeed);


        modelfeed=new ModelFeed(4,"101", "3", "24", "7", R.drawable.prof3, R.drawable.content3, "Way" , "час назад", "An asphalt road through a dark forest");
        modelfeedArrayList.add((modelfeed));


        modelfeed=new ModelFeed(8,"14", "1", "10", "1", R.drawable.prof8, R.drawable.content8, "TED RUS - ted talks на русском" , "Вчера в 15:09",getText((R.string.content8)));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(9,"1", "1","1" ,"1" , R.drawable.prof9, R.drawable.content9, "Банк бизнес идей" , "Вчера в 17:10",getText((R.string.content9)));
        modelfeedArrayList.add((modelfeed));
        modelfeed=new ModelFeed(10,"15", "1","12" ,"2" , R.drawable.prof10, R.drawable.content10, "DarkWeb" , "Вчера в 00:00",getText((R.string.content10)));
        modelfeedArrayList.add((modelfeed));
        adapterFeed.notifyDataSetChanged();
    }

}
