package com.hankkin.WeiXinLookImgsDemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hankkin.WeiXinLookImgsDemo.activty.ImagePagerActivity;
import com.hankkin.WeiXinLookImgsDemo.model.ContentBean;
import com.hankkin.WeiXinLookImgsDemo.view.NoScrollGridView;
import com.hankkin.WeiXinLookImgsDemo.R;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Hankkin on 15/11/22.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<ContentBean> data;

    public MyAdapter(Context context, List<ContentBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = View.inflate(context, R.layout.item, null);
            holder.gridView = (NoScrollGridView) view.findViewById(R.id.gridview);
            holder.tvName = (TextView) view.findViewById(R.id.tv_name);
            holder.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        final ContentBean bean = data.get(i);

        holder.tvName.setText(bean.getName());
        holder.tvTitle.setText(bean.getTitle());

        if (data != null && data.size() > 0) {
            holder.gridView.setAdapter(new ImageGridAdapter(context, bean.getImgUrls()));
        }

        /**
         * 图片列表点击事件
         */
        holder.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context, ImagePagerActivity.class);
                intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_URLS, (Serializable) bean.getImgUrls());
                intent.putExtra(ImagePagerActivity.EXTRA_IMAGE_INDEX, i);
                context.startActivity(intent);
            }
        });

        return view;
    }

    class ViewHolder {
        TextView tvName, tvTitle;
        NoScrollGridView gridView;
    }
}
