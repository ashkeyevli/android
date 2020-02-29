package com.example.vk;

import android.widget.ImageView;

public class ModelFeed {
    int id,postpic,propic;
    String name,time, likes, commments,view,repost;

    CharSequence status;



    public ModelFeed(int id, String view,String repost, String likes, String commments, int propic, int postpic, String name, String time, CharSequence status) {
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

    public void setStatus(CharSequence status) {
        this.status = status;
    }
}
