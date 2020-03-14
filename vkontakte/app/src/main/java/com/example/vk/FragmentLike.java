package com.example.vk;
import android.app.ActionBar;
import android.content.Context;
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

public class FragmentLike extends Fragment {
    RecyclerView recyclerView;
    private List<ModelFeed> modelFeedArrayList;
    private AdapterLike adapterLike;
    private AdapterLike.ItemClickListener listener;
    private AdapterLike.FragmentLikeListener fragmentLikeListener;
    boolean isLiked;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.
                inflate(R.layout.fragment_like,
                        container, false);
        recyclerView = rootView.findViewById(R.id.like_feed);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        listener = new AdapterLike.ItemClickListener() {
            @Override
            public void ItemClick(int position, ModelFeed item) {
                Intent intent = new Intent(getActivity(), Detail.class);
                intent.putExtra("news", item);
                intent.putExtra("like",item.isLiked());
                startActivity(intent);
            }
            @Override
            public void likeClick(int position, ModelFeed item) {
                isLiked=item.isLiked();
                if (isLiked==false){
                    item.setLiked(true);
                    item.setLikes(String.valueOf(Integer.valueOf(item.getLikes())+1));
                   isLiked=true;
                }else {
                    item.setLiked(false);
                    item.setLikes(String.valueOf(Integer.valueOf(item.getLikes())-1));
                    isLiked=false;
                }

                adapterLike.notifyItemChanged(position);

            }
        };

        fragmentLikeListener = new AdapterLike.FragmentLikeListener() {
            @Override
            public void removeItemLike(ModelFeed modelFeed) {
                ((MainActivity) getActivity()).removeItemLike(modelFeed);
            }
        };
        modelFeedArrayList=new ArrayList<>();
        adapterLike=new AdapterLike( modelFeedArrayList, listener,fragmentLikeListener);
        recyclerView.setAdapter(adapterLike);
        return rootView;
    }

    public void saveNews(ModelFeed modelFeed){
        modelFeedArrayList.add(modelFeed);

        recyclerView.getAdapter().notifyItemInserted( modelFeedArrayList.size()-1);
    }
    public void removeNews(ModelFeed modelFeed){
        if (modelFeedArrayList.indexOf(modelFeed)==0){
            modelFeedArrayList.remove(modelFeed);
        } else {
            int position = modelFeedArrayList.indexOf(modelFeed);
            modelFeedArrayList.remove(modelFeed);
            recyclerView.getAdapter().notifyItemRemoved(position);
        }
    }
    public void removeLike(ModelFeed modelFeed){
        int n = modelFeedArrayList.indexOf(modelFeed);
        this.removeNews(modelFeed);
        adapterLike.notifyItemRemoved(n);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


    }

}
