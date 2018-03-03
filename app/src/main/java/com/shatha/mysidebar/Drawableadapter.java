package com.shatha.mysidebar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sha on 11/9/2017.
 */

public class Drawableadapter extends BaseAdapter {
    Context context;
    ArrayList<Items> newitem;
    public Drawableadapter(Context context2,ArrayList<Items> newitem2)
    {
        context=context2;
        newitem=newitem2;
    }
    @Override
    public int getCount() {
        return newitem.size();
    }

    @Override
    public Object getItem(int i) {
        return newitem.get(1);
    }

    @Override
    public long getItemId(int i) {
        return 0 ;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1;
        if(view ==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view1 = inflater.inflate(R.layout.row,null);
        }
        else {
            view1=view;
        }
        TextView titelview=(TextView)view1.findViewById(R.id.textView);
        TextView subview=(TextView)view1.findViewById(R.id.textView2);
        ImageView imgview=(ImageView)view1.findViewById(R.id.imageView);
        titelview.setText(newitem.get(i).mtitel);
        subview.setText(newitem.get(i).msubtitel);
        imgview.setImageResource(newitem.get(i).imgs);
        return view1;
    }
}
