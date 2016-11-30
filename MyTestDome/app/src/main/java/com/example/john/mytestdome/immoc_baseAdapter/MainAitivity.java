package com.example.john.mytestdome.immoc_baseAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.john.mytestdome.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2016/11/29.
 */
public class MainAitivity extends Activity {

    private ListView mlistView;
    private List<Bean> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
    }

    private void initView() {
        mlistView = (ListView) findViewById(R.id.imooc_id_listview);
    }
    private void iniDatas(){
        Bean bean = null;
        mDatas = new ArrayList<Bean>();
        bean = new Bean("Andirod新技能Get 1 " ,
                "Andriod打造万能的ListView和GrifView适配器" , "2014-12-12" , "10086");
        mDatas.add(bean );
        bean = new Bean("Andirod新技能Get 2 " ,
                "Andriod打造万能的ListView和GrifView适配器" , "2014-12-12" , "10086");
        mDatas.add(bean );
        bean = new Bean("Andirod新技能Get 3 " ,
                "Andriod打造万能的ListView和GrifView适配器" , "2014-12-12" , "10086");
        mDatas.add(bean );
        bean = new Bean("Andirod新技能Get 4 " ,
                "Andriod打造万能的ListView和GrifView适配器" , "2014-12-12" , "10086");
        mDatas.add(bean );






    }
}
