package com.xiang.map.demoproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2016/8/3.
 */
public class ListAdapter extends BaseAdapter {
    Context context;
    List<Persen> persens;

    public ListAdapter(Context context, List<Persen> persens) {
        this.context = context;
        this.persens = persens;
    }

    @Override
    public int getCount() {
        return persens.size();
    }

    @Override
    public Object getItem(int position) {
        return persens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        ImageView imageIV = (ImageView) convertView.findViewById(R.id.image);
        imageIV.setImageResource(R.drawable.datu);
        return convertView;
    }

}
