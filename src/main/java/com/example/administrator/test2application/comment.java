package com.example.administrator.test2application;

public class comment {

    private String username;
    private int imageid;
    private String commentwords;
    private int foodimage1;
    private int foodimage2;
    private int foodimage3;

    public comment(String username, int imageid, String commentwords, int foodimage1,int foodimage2,int foodimage3){
        this.username=username;
        this.imageid=imageid;
        this.commentwords=commentwords;
        this.foodimage1=foodimage1;
        this.foodimage2=foodimage2;
        this.foodimage3=foodimage3;
    }

    public comment(String username, int imageid, String commentwords, int foodimage1,int foodimage2){
        this.username=username;
        this.imageid=imageid;
        this.commentwords=commentwords;
        this.foodimage1=foodimage1;
        this.foodimage2=foodimage2;
        this.foodimage3=0;

    }

    public comment(String username, int imageid, String commentwords, int foodimage1){
        this.username=username;
        this.imageid=imageid;
        this.commentwords=commentwords;
        this.foodimage1=foodimage1;
        this.foodimage2=0;
        this.foodimage3=0;
    }


    public String getUsername() {
        return username;
    }

    public int getImageid(){
        return imageid;
    }

    public String getCommentwords() {
        return commentwords;
    }

    public int getFoodimage1() {
        return foodimage1;
    }

    public int getFoodimage2() {
        return foodimage2;
    }

    public int getFoodimage3() {
        return foodimage3;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public void setCommentwords(String commentwords) {
        this.commentwords = commentwords;
    }

    public void setFoodimage(int foodimage1) {
        this.foodimage1 = foodimage1;
    }




}
