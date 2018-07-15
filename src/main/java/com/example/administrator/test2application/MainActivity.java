package com.example.administrator.test2application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private RollPagerView mRollViewPager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRollViewPager1 = (RollPagerView) findViewById(R.id.roll_view_pager1);

        //设置播放时间间隔
        mRollViewPager1.setPlayDelay(3000);
        //设置透明度
        mRollViewPager1.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager1.setAdapter(new MainActivity.TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager1.setHintView(new ColorPointHintView(this, Color.YELLOW, Color.WHITE));
        //mRollViewPager.setHintView(new TextHintView(this));
        //mRollViewPager.setHintView(null);


        final ArrayList<comment> list = new ArrayList<comment>();
        comment comment1 = new comment("清晨的一缕",R.drawable.head1, "早餐走起" + "\n" + "美味早餐，开启新的一天，美滋滋", R.drawable.food3, R.drawable.food7, R.drawable.food8);
        comment comment2 = new comment("沁香一片", R.drawable.head2, "吃货就是我" + "\n" + "辛苦工作了一上午，来一份美味中餐回复元气", R.drawable.food4, R.drawable.food5);
        comment comment3=new comment("铃兰蝴蝶",R.drawable.head3,"美味午餐"+"\n"+"我是勤劳的小蜜蜂，为谁辛苦为谁忙？",R.drawable.lunchpic1,R.drawable.lunchpic2,R.drawable.lunchpic3);
        comment comment4=new comment("依旧还是那个路口",R.drawable.head4,"#午餐##午餐#"+"\n"+"周末聚餐,又要长胖了",R.drawable.lunchpic4,R.drawable.lunchpic5,R.drawable.lunchpic6);
        comment comment5 =new comment("梦悦的小灶炉",R.drawable.head5,"简略的中餐"+"\n吃饭的时间都没有，心塞塞！",R.drawable.lunchpic7);
        comment comment6=new comment("中华琪食",R.drawable.head6,"#晚餐##晚餐#"+"\n"+"和老公一起出去吃，开心！",R.drawable.dinnerpic1,R.drawable.dinnerpic2,R.drawable.lunchpic3);
        comment comment7=new comment("江南布衣yuan",R.drawable.head7,"#晚餐##晚餐#"+"\n"+"来来来，吃饭了",R.drawable.dinnerpic4,R.drawable.lunchpic5);
        comment comment8=new comment("小吃货show",R.drawable.head8,"#晚餐##晚餐#"+"\n"+"没有食欲，来一张美食图片，诱惑下自己",R.drawable.lunchpic6);
        comment comment9=new comment("点点朵朵",R.drawable.head9,"#晚餐##晚餐#"+"\n"+"出来浪，首先得对得起自己的胃才行",R.drawable.lunchpic7,R.drawable.dinnerpic8,R.drawable.dinnerpic9);


        list.add(comment1);
        list.add(comment2);
        list.add(comment3);
        list.add(comment4);
        list.add(comment5);
        list.add(comment6);
        list.add(comment7);
        list.add(comment8);
        list.add(comment9);

        commentAdapter adapter = new commentAdapter(
                MainActivity.this,
                R.layout.comment,
                list);
        ListView li = (ListView) findViewById(R.id.listView);
        li.setAdapter(adapter);

        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //方法1：
                // TextView tv=(TextView)view.findViewById(R.id.fruit_name);
                //  Toast.makeText(getApplicationContext(), "选中了："+tv.getText(),Toast.LENGTH_SHORT).show();
                //方法2：
                //  Fruit f=list.get(position); // 从list 中获取对象(list 要加final 声明)
                //  Toast.makeText(getApplicationContext(), "选中了："+f.getName(), Toast.LENGTH_SHORT).show();

                comment comment_jp1 = list.get(position);

                Intent intent = new Intent(MainActivity.this, jumpnew2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("headpic", comment_jp1.getImageid());
                bundle.putString("username", comment_jp1.getUsername());
                bundle.putString("commentwords", comment_jp1.getCommentwords());
                bundle.putInt("foodpic1", comment_jp1.getFoodimage1());
                bundle.putInt("foodpic2", comment_jp1.getFoodimage2());
                bundle.putInt("foodpic3", comment_jp1.getFoodimage3());
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.headpic1,
                R.drawable.headpic2,
                R.drawable.headpic3,
                R.drawable.headpic4,
        };


        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }


    }
}


