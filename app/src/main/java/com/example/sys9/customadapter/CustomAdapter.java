package com.example.sys9.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    Context context;
    String[]arr;
    int []images;
    public CustomAdapter(Context context,String[]arr,int[]images)
    {
        this.arr=arr;
    this.images=images;
    this.context=context;
    }

    @Override
    public int getCount() {
        return  arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View customview;
       view= LayoutInflater.from(context).inflate(R.layout.customadapter,viewGroup,false);
        TextView name = view.findViewById(R.id.name);
        ImageView image = view.findViewById(R.id.image);
        image.setImageResource(images[i]);
        name.setText(arr[i]);
        customview = view;
        return customview;

            }
}
