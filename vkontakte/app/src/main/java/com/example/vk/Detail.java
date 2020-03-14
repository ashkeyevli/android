package com.example.vk;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    ImageView like;
    boolean isLiked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView proPic=findViewById(R.id.iv_proPic_detail);
        ImageView postPic=findViewById(R.id.iv_postPic_detail);
        like=findViewById(R.id.likeBtn);
        boolean likes;

        TextView tvNameDetail=findViewById(R.id.tv_name_detail);
        TextView tvTimeDetail=findViewById(R.id.tv_time_detail);
        TextView tvStatusDetail=findViewById(R.id.tv_status_detail);
        final TextView tvLikeDetail=findViewById(R.id.tv_like_detail);
        likes=getIntent().getExtras().getBoolean("like");
        TextView tvCommentDetail=findViewById(R.id.tv_comment_detail);
        TextView tvRepostDetail=findViewById(R.id.tv_repost_detail);
        TextView tvViewDetail=findViewById(R.id.tv_view_detail);
        final ModelFeed modelFeed=(ModelFeed)getIntent().getSerializableExtra("news");


        proPic.setImageResource(modelFeed.getPropic());
        postPic.setImageResource(modelFeed.getPostpic());
        tvNameDetail.setText(modelFeed.getName());
        tvTimeDetail.setText(modelFeed.getTime());
        tvStatusDetail.setText(modelFeed.getStatus());
        tvLikeDetail.setText(modelFeed.getLikes());
        tvCommentDetail.setText(modelFeed.getCommments());
        tvRepostDetail.setText(modelFeed.getRepost());
        tvViewDetail.setText(modelFeed.getView());
        modelFeed.setLiked(likes);
        isLiked=likes;

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLiked==false){
                    modelFeed.setLiked(true);
                    modelFeed.setLikes(String.valueOf(Integer.valueOf(modelFeed.getLikes())+1));
                    tvLikeDetail.setText(String.valueOf(modelFeed.getLikes()));
                    isLiked=true;
                    like.setImageResource(R.drawable.liked);

                }else {
                    like.setImageResource(R.drawable.like);
                    modelFeed.setLiked(false);
                    modelFeed.setLikes(String.valueOf(Integer.valueOf(modelFeed.getLikes())-1));
                    tvLikeDetail.setText(String.valueOf(modelFeed.getLikes()));
                    isLiked=false;

                }

            }
        });
        if (isLiked==true){
            like.setImageResource(R.drawable.liked);

        }else
            like.setImageResource(R.drawable.like);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Детали");
    }
}
