package com.example.vk;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

public class AdapterFeed extends RecyclerView.Adapter<AdapterFeed.MyViewHolder> {

    Context context;
    boolean check = true;
    ArrayList<ModelFeed> modelFeedArrayList= new ArrayList<>();

    RequestManager glide;
    private static String LIST_STATE="list_state";
    public AdapterFeed(Context context, ArrayList<ModelFeed> modelFeedArrayList){

        this.context=context;
        this.modelFeedArrayList=modelFeedArrayList;
        glide= Glide.with(context);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.vk_feed,parent,false);
       MyViewHolder viewHolder=new MyViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position)  {
        final ModelFeed modelfeed=modelFeedArrayList.get(position);

        holder.tv_name.setText(modelfeed.getName());
        holder.tv_time.setText(modelfeed.getTime());
        holder.tv_status.setText(modelfeed.getStatus());
        holder.tv_like.setText(String.valueOf(modelfeed.getLikes()));
        holder.tv_comment.setText(String.valueOf(modelfeed.getCommments()));
        holder.tv_repost.setText(String.valueOf(modelfeed.getRepost()));
        holder.tv_view.setText(String.valueOf(modelfeed.getView()));

        glide.load(modelfeed.getPropic()).into(holder.iv_proPic);


        if (modelfeed.getPostpic()==0) {
            holder.iv_postPic.setVisibility(View.GONE);

        }
        else{
            holder.iv_postPic.setVisibility(View.VISIBLE);
            glide.load(modelfeed.getPostpic()).into(holder.iv_postPic);



        }
        check = true;

            holder.iv_like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "liked", Toast.LENGTH_SHORT).show();
                    check = false;

                }
            });
            if(check) {
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(v.getContext(), Detail.class);

                        intent.putExtra("name", modelfeed.getName());
                        intent.putExtra("time", modelfeed.getTime());
                        intent.putExtra("status", modelfeed.getStatus());
                        intent.putExtra("proPic", modelfeed.getPropic());
                        intent.putExtra("postPic", modelfeed.getPostpic());
                        intent.putExtra("like", modelfeed.getLikes());
                        intent.putExtra("comment", modelfeed.getCommments());
                        intent.putExtra("repost", modelfeed.getRepost());
                        intent.putExtra("view", modelfeed.getView());


                        v.getContext().startActivity(intent);

                    }
                });
            }






    }

    @Override
    public int getItemCount() {
        return modelFeedArrayList.size();
    }
public class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView tv_name,tv_time,tv_status,tv_like,tv_comment,tv_repost,tv_view;
        ImageView iv_proPic, iv_postPic,iv_like;



        public MyViewHolder(final View itemView){
            super(itemView);





            iv_postPic=(ImageView)itemView.findViewById(R.id.iv_postPic);
            iv_proPic=(ImageView)itemView.findViewById(R.id.iv_proPic);
            iv_like =(ImageView)itemView.findViewById(R.id.iv_like);
            tv_name=(TextView)itemView.findViewById(R.id.tv_name);
            tv_time=(TextView)itemView.findViewById(R.id.tv_time);
            tv_status=(TextView)itemView.findViewById(R.id.tv_status);
            tv_like=(TextView)itemView.findViewById(R.id.tv_like);
            tv_comment=(TextView)itemView.findViewById(R.id.tv_comment);
            tv_repost=(TextView)itemView.findViewById(R.id.tv_repost);
            tv_view=(TextView)itemView.findViewById(R.id.tv_view);



        }
}
}

