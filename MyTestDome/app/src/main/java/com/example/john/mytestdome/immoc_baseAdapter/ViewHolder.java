package com.example.john.mytestdome.immoc_baseAdapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by john on 2016/11/29.
 */
public class ViewHolder  {
    private SparseArray<View> mViews;
    private int mPosition;
    private  View mConvetView;



    public ViewHolder(Context context , ViewGroup parent , int layoutId , int position)
    {
        this.mPosition = position;
        this.mViews = new SparseArray<>();

        mConvetView = LayoutInflater.from(context).inflate(layoutId , parent , false);
        mConvetView.setTag(this);

    }

    public static ViewHolder get (Context context , View convertView ,
                                  ViewGroup parent ,int layoutId,  int position )
    {
        if (convertView == null){
            return  new ViewHolder(context , parent , layoutId , position);
        }else{
            ViewHolder holder = (ViewHolder) convertView.getTag();
            return holder;
        }
    }
    public <T extends  View>T getView(int viewId){
        View view =mViews.get(viewId);

        if (view == null)
        {
            view = mConvetView.findViewById(viewId);
        }
        return (T)view;
    }
    public View getmConvetView() {
        return mConvetView;
    }
}
