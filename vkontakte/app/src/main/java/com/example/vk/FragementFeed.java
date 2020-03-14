package com.example.vk;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragementFeed extends Fragment {

    RecyclerView recyclerView;
    private AdapterFeed.ItemClickListener listener;
    private AdapterFeed.FragmentButtonListener fragmentButtonListener=null;
    private AdapterFeed.FragmentLikeListener fragmentLikeListener=null;
    private AdapterFeed adapterFeed;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.
                inflate(R.layout.fragment_feed,
                        container, false);
        recyclerView = rootView.findViewById(R.id.recy_feed);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        listener = new AdapterFeed.ItemClickListener() {

            @Override
            public void ItemClick(int position, ModelFeed item) {
                Intent intent = new Intent(getActivity(), Detail.class);
                intent.putExtra("news", item);
                startActivity(intent);
            }
        };
        fragmentButtonListener= new AdapterFeed.FragmentButtonListener() {
            @Override
            public void myClick(ModelFeed modelFeed, int option) {
                ((MainActivity)getActivity()).myClick(modelFeed,option);
            }
        };
        fragmentLikeListener = new AdapterFeed.FragmentLikeListener() {
            @Override
            public void removeItemLike(ModelFeed modelFeed) {
                ((MainActivity) getActivity()).removeItemLike(modelFeed);
            }
        };
        adapterFeed=new AdapterFeed(newsGenerator(),listener,fragmentButtonListener,fragmentLikeListener);
        recyclerView.setAdapter(adapterFeed);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        return rootView;
    }

    private List<ModelFeed> newsGenerator() {
        List<ModelFeed> items=new ArrayList<>();
        ModelFeed feed1= new ModelFeed(1,"100", "2", "23", "6", R.drawable.prof4, R.drawable.content4, "Бизнес Тренды" , "час назад", getString(R.string.content4));
        items.add(feed1);
        ModelFeed feed2= new ModelFeed(2,"104", "2", "21", "2", R.drawable.prof5, R.drawable.content5, "Александр Романов" , "два часа назад",getString((R.string.content5)));
        items.add(feed2);
        ModelFeed feed3= new ModelFeed(3,"1344", "23", "212", "24", R.drawable.prof6, R.drawable.content6, "НЛП-Клуб online" , "два часа назад",getString((R.string.content6)));
        items.add(feed3);
        ModelFeed feed4= new ModelFeed(4,"144", "3", "12", "14", R.drawable.prof7, R.drawable.content7, "Идеи для бизнеса | Стартапы" , "три часа назад",getString((R.string.content7)));
        items.add(feed4);
        ModelFeed feed5=new ModelFeed(5,"120", "300", "140", "230", R.drawable.vkpj, R.drawable.first,"Али Ашкеев", "сейчас","Работает!!!" );
        items.add(feed5);
        ModelFeed feed6=new ModelFeed(6,"130", "3", "13", "2", R.drawable.prof2, R.drawable.content2,"Dr DW | WINDOWS | ANDROID | IOS | APPLE", "час назад","Прежде чем лопать эти пузырики, вспомни, что воздух внутри этих пузыриков прибыл к тебе из Китая." );
        items.add(feed6);
        ModelFeed feed7=new ModelFeed(7,"101", "3", "24", "7", R.drawable.prof3, R.drawable.content3, "Way" , "час назад", "An asphalt road through a dark forest");
        items.add(feed7);
        ModelFeed feed8=new ModelFeed(8,"14", "1", "10", "1", R.drawable.prof8, R.drawable.content8, "TED RUS - ted talks на русском" , "Вчера в 15:09",getString((R.string.content8)));
        items.add(feed8);
        ModelFeed feed9=new ModelFeed(9,"1", "1","1" ,"1" , R.drawable.prof9, R.drawable.content9, "Банк бизнес идей" , "Вчера в 17:10",getString((R.string.content9)));
        items.add(feed9);
        ModelFeed feed10=new ModelFeed(10,"15", "1","12" ,"2" , R.drawable.prof10, R.drawable.content10, "DarkWeb" , "Вчера в 00:00",getString((R.string.content10)));
        items.add(feed10);
        ModelFeed feed11= new ModelFeed(11,"3","1","2","1", R.drawable.prof11, R.drawable.content11,"ART BOX", "Сегодня в 2:46",getString(R.string.content11));
        items.add(feed11);
        ModelFeed feed12= new ModelFeed(12,"15","2","3","1", R.drawable.prof12, R.drawable.content12,"Page OVERLORDS", "22 фев в 16:18 ",getString(R.string.content12));
        items.add(feed12);
        ModelFeed feed13= new ModelFeed(13,"34","12","25","6", R.drawable.prof13, R.drawable.content13,"Джон Рокфеллер и другие ", "15 июл 2019",getString(R.string.content13));
        items.add(feed13);
        ModelFeed feed14= new ModelFeed(14,"33","12","21","5", R.drawable.prof14, R.drawable.content14,"overpublic1", "Сегодня в 2:46",getString(R.string.content14));
        items.add(feed14);
        ModelFeed feed15= new ModelFeed(15,"46","15","26","11", R.drawable.prof15, R.drawable.content15,"Wasted","38 минут назад" ,getString(R.string.content15));
        items.add(feed15);
        ModelFeed feed16= new ModelFeed(16,"37","13","24","17", R.drawable.prof16, R.drawable.content16,"Кладбище тупых диалогов", "15 минут назад",getString(R.string.content16));
        items.add(feed16);
        ModelFeed feed17= new ModelFeed(17,"65","14","46","66", R.drawable.prof17, R.drawable.content17,"Academic Architecture", "28 минут назад",getString(R.string.content17));
        items.add(feed17);
        ModelFeed feed18= new ModelFeed(18,"70","33","48","75", R.drawable.prof18, R.drawable.content18,"Мир Аниме - World of Anime", "вчера в 17:02",getString(R.string.content18));
        items.add(feed18);
        ModelFeed feed19= new ModelFeed(19,"64","13","54","10", R.drawable.prof19, R.drawable.content19,"KBTU Startup Incubator", "30 окт 2018",getString(R.string.content19));
        items.add(feed19);
        ModelFeed feed20= new ModelFeed(20,"375","63","274","178", R.drawable.prof20, R.drawable.content20,"Как Челентано", "два часа назад",getString(R.string.content20));
        items.add(feed20);
     return items;
    }

    public void removeLike(ModelFeed modelFeed){
        adapterFeed.removeLike(modelFeed);
    }
}
