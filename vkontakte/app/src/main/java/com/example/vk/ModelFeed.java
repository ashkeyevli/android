package com.example.vk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ModelFeed implements Serializable {
    public static List<ModelFeed> modelFeedArrayList=new ArrayList<>();
    private int id,postpic,propic;
    private String name,time, likes, commments,view,repost;
    private boolean isLiked;
    private int likeBtn;
    private   String status;


    public boolean isLiked(){return isLiked;}
    public void setLiked(boolean liked){
        isLiked=liked;
    }

    public ModelFeed(int id, String view,String repost, String likes, String commments, int propic, int postpic, String name, String time, String status) {
        this.id = id;
        this.likes = likes;
        this.commments = commments;
        this.propic = propic;
        this.postpic = postpic;
        this.name = name;
        this.time = time;
        this.status = status;
        this.view = view;
        this.repost = repost;
        this.likeBtn=R.drawable.like;
        this.isLiked=false;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getRepost() {
        return repost;
    }

    public void setRepost(String repost) {
        this.repost = repost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikeBtn(){ return likeBtn;}
    public void setLikeBtn(int likeBtn){this.likeBtn=likeBtn;}

    public String  getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getCommments() {
        return commments;
    }

    public void setCommments(String commments) {
        this.commments = commments;
    }

    public int getPropic() {
        return propic;
    }

    public void setPropic(int propic) {
        this.propic = propic;
    }

    public int getPostpic() {
        return postpic;
    }

    public void setPostpic(int postpic) {
        this.postpic = postpic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CharSequence getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
