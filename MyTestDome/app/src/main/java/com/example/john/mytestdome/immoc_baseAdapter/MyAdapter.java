package com.example.john.mytestdome.immoc_baseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.john.mytestdome.R;

import java.util.List;

/**
 * Created by john on 2016/11/29.
 */
public class MyAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Bean> mDatas;
    public  MyAdapter(Context context , List<Bean>datas){
        mInflater = LayoutInflater.from(context);
        mDatas = datas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView ==null){
            convertView = mInflater.inflate(R.layout.imooc_adapter_activity_item_listview , parent ,false);
            holder = new ViewHolder();
            holder.mTitle = (TextView) convertView.findViewById(R.id.immoc_id_title);
            holder.mdesc  = (TextView) convertView.findViewById(R.id.immoc_id_desc);
            holder.mtime  = (TextView) convertView.findViewById(R.id.immoc_id_time);
            holder.mpohne = (TextView) convertView.findViewById(R.id.immoc_id_phone);
            convertView.setTag(holder);
        }else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        Bean bean = mDatas.get(position);
        holder.mTitle.setText(bean.getTitle());
        holder.mpohne.setText(bean.getPhone());
        holder.mdesc.setText(bean.getDesc());
        holder.mtime.setText(bean.getTime());

        return convertView;

    }

    public class ViewHolder{
        TextView mTitle = null;
        TextView mdesc = null;
        TextView mtime = null;
        TextView mpohne = null;
    }
}
