package com.example.administrator.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import static com.example.administrator.listview.R.drawable.sample_2;
import static com.example.administrator.listview.R.drawable.sample_3;

/**
 * Created by Administrator on 2/7/2017.
 */

public class ImageAdapter extends BaseAdapter
{

    private Context mContext;
    public ImageAdapter(Context c)
    {
        mContext=c;
    }
    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position)
    {
        return null;
    }
    public long getItemId(int position)
    {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {

        ImageView imageview;
        if(convertView==null) {

            imageview = new ImageView(mContext);
            imageview.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        else
        {

            imageview = (ImageView) convertView;
        }

        imageview.setImageResource(mThumbIds[position]);
        return imageview;


    }
    private Integer[] mThumbIds = {
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
    };






}









