package com.example.administrator.test2application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class addpicAdapter extends ArrayAdapter {

    private int resourceId; // 添加一个成员
    public addpicAdapter(Context context, int resource, List<addpic> objects) {
        super(context, resource, objects);  //3 个参数: 上下文、ListView 子项布局id 、9数据
        resourceId = resource; // 添加语句
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        addpic addpic1 = (addpic) getItem(position); // 获取当前选中的Fruit实例，将其内容填充到各个位置
        //填充ListView 布局
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView pic1 = (ImageView) view.findViewById(R.id.pic1);
        ImageView pic2 = (ImageView) view.findViewById(R.id.pic2);
        ImageView pic3 = (ImageView) view.findViewById(R.id.pic3);

        pic1.setImageResource(addpic1.getPic1()); //根据图片id值加载图片
        pic2.setImageResource(addpic1.getPic2());
        pic3.setImageResource(addpic1.getPic3());
        return view;
    }







}
