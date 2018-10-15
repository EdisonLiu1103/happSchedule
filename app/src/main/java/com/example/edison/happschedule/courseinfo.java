package com.example.edison.happschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class courseinfo extends AppCompatActivity {

    private static SimpleAdapter apater;
    private Button sub;
    private Button cancel;
    private Object strCourseName;
    private Object strAddress;
    private Object strIsRemind ;
    private Object strIsRemindByVibrato;
    private Object strIsRemindByRing;
    private Object strTeacher;
    private ListView courseinfo;



    public static SimpleAdapter getApater() {
        return apater;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courseinfo);

        sub = (findViewById(R.id.submit));
        cancel = (findViewById(R.id.cancel));
        courseinfo = (findViewById(R.id.courseinfo));

        ArrayList<Map<String, Object>> listItem = new ArrayList<Map<String, Object>>();
        String strPeriod = null;
        String foreSetStartHour = null;
        String foreSetStartMinute = null;
        String foreSetEndHour = null;
        String foreSetEndMinute = null;
        String strReminderTime = null;
        HashMap<String, Object> item = new HashMap<String, Object>();
        item.put("标题","课程名称");
        item.put("说明",strCourseName);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","上课地点");
        item.put("说明",strAddress);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","时间("+strPeriod+")");
        item.put("说明",foreSetStartHour+":"+foreSetStartMinute+"-"+foreSetEndHour+":"+foreSetEndMinute);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","提醒时间");
        item.put("说明","提前"+strReminderTime+"分钟");
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","启动提醒");
        item.put("说明",strIsRemind);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","提醒震动");
        item.put("说明",strIsRemindByVibrato);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","提醒铃声");
        item.put("说明",strIsRemindByRing);
        listItem.add(item);

        item = new HashMap<String, Object>();
        item.put("标题","任课老师");
        item.put("说明",strTeacher);
        listItem.add(item);

        SimpleAdapter adapter = new SimpleAdapter(this, listItem,android.R.layout.simple_list_item_2, new String[]{
                "标题","说明"}, new int[]{android.R.id.text1, android.R.id.text2});

        courseinfo.setAdapter(adapter);
        courseinfo.setOnItemClickListener(new MyItemClickListener());
    }


    private class MyItemClickListener implements android.widget.AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        }
    }

    //引用该Activity的Layout布局之外的自定义的时间选择器布局
    public void userExternalLayoutId(){
        View localView = LayoutInflater.from(this).inflate(R.layout.timepicker, null);
    }
}
