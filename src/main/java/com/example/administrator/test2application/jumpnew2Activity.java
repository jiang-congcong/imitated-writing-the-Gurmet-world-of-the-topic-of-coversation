package com.example.administrator.test2application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class jumpnew2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpnew2);


         ImageView headpic= findViewById(R.id.headimg2);
          TextView username = findViewById(R.id.username2);
        TextView commentwords= findViewById(R.id.comment2);
        ImageView foodpic1=findViewById(R.id.food1);
        ImageView foodpic2=findViewById(R.id.food2);
        ImageView foodpic3=findViewById(R.id.food3);
        TextView feed=findViewById(R.id.feed);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        int headimg=bundle.getInt("headpic");
        headpic.setImageResource(headimg);

        String username1=bundle.getString("username");
        username.setText(username1);

        String commentwords1=bundle.getString("commentwords");
         commentwords.setText(commentwords1);

        int foodimg1=bundle.getInt("foodpic1");
        foodpic1.setImageResource(foodimg1);

        int foodimg2=bundle.getInt("foodpic2");
        foodpic2.setImageResource(foodimg2);

        int foodimg3=bundle.getInt("foodpic3");
         foodpic3.setImageResource(foodimg3);

        feed.setText("                                还没人？赶紧抢沙发！        " +"\n"+
                "                  据说第一个评论的人都有枚幸运草");


    }
}
