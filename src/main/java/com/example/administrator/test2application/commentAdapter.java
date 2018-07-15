package com.example.administrator.test2application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class commentAdapter extends ArrayAdapter {
    private int resourceId; // 添加一个成员
    public commentAdapter(Context context, int resource, List<comment> objects) {
        super(context, resource, objects);  //3 个参数: 上下文、ListView 子项布局id 、9数据
        resourceId=resource; // 添加语句
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        comment commentment = (comment) getItem(position); // 获取当前选中的Fruit实例，将其内容填充到各个位置
        //填充ListView 布局
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.imageid);
        TextView fruitName = (TextView) view.findViewById(R.id.username);
        TextView commentwords= view.findViewById(R.id.commentwords);
        ImageView foodimg1= view.findViewById(R.id.foodimage1);
        ImageView foodimg2= view.findViewById(R.id.foodimage2);
        ImageView foodimg3= view.findViewById(R.id.foodimage3);
        fruitImage.setImageResource(commentment.getImageid()); //根据图片id值加载图片
        fruitName.setText(commentment.getUsername());
        commentwords.setText(commentment.getCommentwords());
        foodimg1.setImageResource(commentment.getFoodimage1());
        foodimg2.setImageResource(commentment.getFoodimage2());
        foodimg3.setImageResource(commentment.getFoodimage3());
        return view;
    }
}





