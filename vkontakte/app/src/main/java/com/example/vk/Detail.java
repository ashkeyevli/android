package com.example.vk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView proPic=findViewById(R.id.iv_proPic_detail);
        ImageView postPic=findViewById(R.id.iv_postPic_detail);

        TextView tvNameDetail=findViewById(R.id.tv_name_detail);
        TextView tvTimeDetail=findViewById(R.id.tv_time_detail);
        TextView tvStatusDetail=findViewById(R.id.tv_status_detail);
        TextView tvLikeDetail=findViewById(R.id.tv_like_detail);
        TextView tvCommentDetail=findViewById(R.id.tv_comment_detail);
        TextView tvRepostDetail=findViewById(R.id.tv_repost_detail);
        TextView tvViewDetail=findViewById(R.id.tv_view_detail);



        Intent intent =getIntent();
        String name=intent.getStringExtra("name");
        tvNameDetail.setText(name);
        String time=intent.getStringExtra("time");
        tvTimeDetail.setText(time);
        CharSequence status=intent.getCharSequenceExtra("status");
        tvStatusDetail.setText(status);
        String like=intent.getStringExtra("like");
        tvLikeDetail.setText(like);
        String comment=intent.getStringExtra("comment");
        tvCommentDetail.setText(comment);
        String repost=intent.getStringExtra("repost");
        tvRepostDetail.setText(repost);
        String view =intent.getStringExtra("view");
        tvViewDetail.setText(view);
        Integer key=intent.getIntExtra("proPic",0);
              Glide.with(this).load(key).into(proPic);
        Integer key1=intent.getIntExtra("postPic",0);
        Glide.with(this).load(key1).into(postPic);




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
