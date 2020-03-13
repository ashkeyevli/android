package com.example.vk;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    ImageView like;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView proPic=findViewById(R.id.iv_proPic_detail);
        ImageView postPic=findViewById(R.id.iv_postPic_detail);
        like=findViewById(R.id.likeBtn);

        TextView tvNameDetail=findViewById(R.id.tv_name_detail);
        TextView tvTimeDetail=findViewById(R.id.tv_time_detail);
        TextView tvStatusDetail=findViewById(R.id.tv_status_detail);
        TextView tvLikeDetail=findViewById(R.id.tv_like_detail);
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
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modelFeed.getLikeBtn()==R.drawable.like){
                    like.setImageResource(R.drawable.liked);
                    modelFeed.setLikeBtn(R.drawable.liked);
                }
                else{
                    like.setImageResource(R.drawable.like);
                    modelFeed.setLikeBtn(R.drawable.like);
                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
