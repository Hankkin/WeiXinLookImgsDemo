package com.hankkin.WeiXinLookImgsDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.hankkin.WeiXinLookImgsDemo.adapter.MyAdapter;
import com.hankkin.WeiXinLookImgsDemo.model.ContentBean;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {
    /*图片显示列表*/
    private ListView listView;
    /*图片URL数组*/
    private List<ContentBean> contentBeans;

    private MyAdapter adapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initData();
        initViews();
    }

    /**
     * 初始化数据
     * by Hankkin at:2015-11-22 23:21:28
     */
    private void initData(){
        contentBeans = new ArrayList<ContentBean>();
        ArrayList<String> imgUrls1 = new ArrayList<String>();
        imgUrls1.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        ContentBean cb1 = new ContentBean(1,"java","Sun Microsystems",imgUrls1);
        contentBeans.add(cb1);

        ArrayList<String> imgUrls2 = new ArrayList<String>();
        imgUrls2.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls2.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls2.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        ContentBean cb2 = new ContentBean(2,"OC","Stepstone",imgUrls2);
        contentBeans.add(cb2);

        ArrayList<String> imgUrls3 = new ArrayList<String>();
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        imgUrls3.add("http://7xojuc.com1.z0.glb.clouddn.com/110H2E40-6.jpg?attname=&e=1448288962&token=KDsCqUAWz3P-YT6In6oPnT56Eh2cig4zgQd12SJ_:AlTjfYD9SBFOdB4jmmZuKXAMOp8");
        ContentBean cb3 = new ContentBean(3,"python","Guido van Rossum",imgUrls3);
        contentBeans.add(cb3);
    }

    /**
     * 初始化组件
     * by Hankkin at:2015-11-22 23:21:44
     */
    private void initViews(){
        listView = (ListView) findViewById(R.id.lv_my);
        adapter = new MyAdapter(MyActivity.this,contentBeans);
        listView.setAdapter(adapter);
    }
}
