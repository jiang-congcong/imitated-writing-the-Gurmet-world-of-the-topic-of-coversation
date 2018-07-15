package com.example.administrator.test2application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class jumpnewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumpnew);

       // ImageView headpic= findViewById(R.id.headpic);
      //  TextView username = findViewById(R.id.headname);
        TextView commentwords= findViewById(R.id.commentwords);
        ImageView foodpic1=findViewById(R.id.foodpic1);
        ImageView foodpic2=findViewById(R.id.foodpic2);
        ImageView foodpic3=findViewById(R.id.foodpic3);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        int headimg=bundle.getInt("headpic");
        //headpic.setImageResource(headimg);

        String username1=bundle.getString("username");
        //username.setText(username1);

        String commentwords1=bundle.getString("commentwords");
       // commentwords.setText(commentwords1);

        int foodimg1=bundle.getInt("foodpic1");
        //foodpic1.setImageResource(foodimg1);

        int foodimg2=bundle.getInt("foodpic2");
        //foodpic2.setImageResource(foodimg2);

        int foodimg3=bundle.getInt("foodpic3");
       // foodpic3.setImageResource(foodimg3);


       headimgandnaem headimgandnaem1=new  headimgandnaem(headimg,username1);

        ArrayList<headimgandnaem> list1 = new ArrayList<headimgandnaem>();
        list1.add(headimgandnaem1);
        headimgandnameAdapter adapter = new headimgandnameAdapter(
                jumpnewActivity.this,
                R.layout.headimgandname,
                list1 );
        ListView li1=(ListView)findViewById(R.id.ListView2);
        li1.setAdapter(adapter);

        addpic addpic1=new addpic(foodimg1,foodimg2,foodimg3);
        ArrayList<addpic> list2 = new ArrayList<addpic>();
        list2.add(addpic1);
        addpicAdapter adapter1=new addpicAdapter(
                jumpnewActivity.this,
                R.layout.addpic,
                list2
        );
        ListView li2=(ListView)findViewById(R.id.ListView);
        li2.setAdapter(adapter1);

        //ScrollView

    }
}
