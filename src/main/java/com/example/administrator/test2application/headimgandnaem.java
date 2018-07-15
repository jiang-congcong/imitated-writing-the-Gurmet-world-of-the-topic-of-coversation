package com.example.administrator.test2application;

public class headimgandnaem {
    private int imageid;
    private  String usename;

    public headimgandnaem(int imageid,String usename) {
        this.imageid=imageid;
        this.usename=usename;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public int getImageid() {
        return imageid;
    }

    public String getUsename() {
        return usename;
    }
}
