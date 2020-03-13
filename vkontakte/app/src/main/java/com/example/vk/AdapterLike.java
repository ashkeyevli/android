package com.example.vk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;

import java.util.List;

public class AdapterLike  extends RecyclerView.Adapter<AdapterLike.MyViewHolder>{
    private List<ModelFeed> modelFeedArrayList;
    private @Nullable ItemClickListener listener;
    private @Nullable FragmentLikeListener fragmentLikeListener;

    RequestManager glide;

    public AdapterLike(List<ModelFeed> modelFeedArrayList,
                       @Nullable ItemClickListener listener,
                       @Nullable FragmentLikeListener fragmentLikeListener) {
        this.modelFeedArrayList=modelFeedArrayList;
        this.listener=listener;
        this.fragmentLikeListener=fragmentLikeListener;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.vk_feed,parent,false);
             return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final ModelFeed modelfeed = modelFeedArrayList.get(getItemViewType(position));
        holder.iv_proPic.setImageResource(modelfeed.getPropic());
        holder.tv_name.setText(modelfeed.getName());
        holder.tv_time.setText(modelfeed.getTime());
        holder.tv_status.setText(modelfeed.getStatus());
        holder.tv_like.setText(String.valueOf(modelfeed.getLikes()));
        holder.tv_comment.setText(String.valueOf(modelfeed.getCommments()));
        holder.tv_repost.setText(String.valueOf(modelfeed.getRepost()));
        holder.tv_view.setText(String.valueOf(modelfeed.getView()));
        holder.iv_like.setImageResource(R.drawable.liked);
        if (modelfeed.getPostpic() == 0) {
            holder.iv_postPic.setVisibility(View.GONE);

        } else {
            holder.iv_postPic.setVisibility(View.VISIBLE);
            holder.iv_postPic.setImageResource(modelfeed.getPostpic());
        }

        holder.iv_like.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

             if(fragmentLikeListener!=null)
                 fragmentLikeListener.removeItemLike(modelfeed);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(listener!=null)
                    listener.ItemClick(position,modelfeed);
            }
        });
    }



    @Override
    public int getItemCount() {
        return modelFeedArrayList.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView tv_name,tv_time,tv_status,tv_like,tv_comment,tv_repost,tv_view;
        ImageView iv_proPic, iv_postPic,iv_like;



        public MyViewHolder(final View itemView) {
            super(itemView);
            iv_postPic = (ImageView) itemView.findViewById(R.id.iv_postPic);
            iv_proPic = (ImageView) itemView.findViewById(R.id.iv_proPic);
            iv_like = (ImageView) itemView.findViewById(R.id.iv_like);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
            tv_status = (TextView) itemView.findViewById(R.id.tv_status);
            tv_like = (TextView) itemView.findViewById(R.id.tv_like);
            tv_comment = (TextView) itemView.findViewById(R.id.tv_comment);
            tv_repost = (TextView) itemView.findViewById(R.id.tv_repost);
            tv_view = (TextView) itemView.findViewById(R.id.tv_view);



        }
    }
    public int getItemViewType(int position){return position;}

    interface ItemClickListener{
        void ItemClick(int position, ModelFeed item);
    }
    public interface FragmentLikeListener{
        void removeItemLike(ModelFeed feed);
    }

}

