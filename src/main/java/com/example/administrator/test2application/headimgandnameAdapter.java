package com.example.administrator.test2application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class headimgandnameAdapter extends ArrayAdapter {

    private int resourceId; // 添加一个成员
    public headimgandnameAdapter(Context context, int resource, ArrayList<headimgandnaem> objects) {
        super(context, resource, objects);  //3 个参数: 上下文、ListView 子项布局id 、9数据
        resourceId=resource; // 添加语句
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        headimgandnaem headimgandnaem1 = (headimgandnaem) getItem(position); // 获取当前选中的Fruit实例，将其内容填充到各个位置
        //填充ListView 布局
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView headimg = (ImageView) view.findViewById(R.id.headimg);
        TextView username = (TextView) view.findViewById(R.id.headuser);

        headimg.setImageResource(headimgandnaem1.getImageid()); //根据图片id值加载图片
        username.setText(headimgandnaem1.getUsename());

        return view;
    }



}
