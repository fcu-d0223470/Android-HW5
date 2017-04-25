package com.example.user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 2017/4/25.
 */

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {
    Context context;

    public AlbumArrayAdapter(Context context,ArrayList<AlbumItem> item){
        super(context,0,item);
        this.context=context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);

        LinearLayout itemlayout = null;
        if(convertView==null){
            itemlayout = (LinearLayout)inflater.inflate(R.layout.a1,null);
        }else{
            itemlayout = (LinearLayout) convertView;
        }
        AlbumItem item = (AlbumItem)getItem(position);
        TextView tv1=(TextView)itemlayout.findViewById(R.id.tv1_name);
        tv1.setText(item.name1);
        TextView tv2=(TextView)itemlayout.findViewById(R.id.tv2_name);
        tv2.setText(item.name2);
        TextView tv11=(TextView)itemlayout.findViewById(R.id.tv1_pt);
        tv11.setText(item.pt1);
        TextView tv21=(TextView)itemlayout.findViewById(R.id.tv2_pt);
        tv21.setText(item.pt2);
        ImageView iv1=(ImageView)itemlayout.findViewById(R.id.iv1);
        iv1.setImageResource(item.imgid1);
        ImageView iv2=(ImageView)itemlayout.findViewById(R.id.iv2);
        iv1.setImageResource(item.imgid2);
        if(item.pt1>item.pt2){
            tv11.setTextColor(0xFF0000);
        }else{
            tv21.setTextColor(0xFF0000);
        }
        return itemlayout;
    }
}
