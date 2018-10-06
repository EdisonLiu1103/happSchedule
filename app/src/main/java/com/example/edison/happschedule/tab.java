package com.example.edison.happschedule;

import android.app.TabActivity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class tab extends TabActivity {
    private final String ALARM_ALERT_INTENT = "com.android.alarmclock.ALARM_ALERT";
    private final String AUDIO_INTENT = "com.android.alarmclock.AUDIO";

    private Intent intent;

    private Button monday;
    private Button tuesday;
    private Button wednesday;
    private Button thursday;
    private Button friday;

    private Button mon_first;
    private Button mon_second;
    private Button mon_third;
    private Button mon_fourth;
    private Button mon_fifth;
    private Button mon_sixth;
    private Button mon_seventh;
    private Button mon_eighth;

    private String mon_first_cName;
    private int mon_first_id;
    private String mon_second_cName;
    private int mon_second_id;
    private String mon_third_cName;
    private int mon_third_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.tab);
        TabHost th = getTabHost();
        LayoutInflater.from(this).inflate(R.layout.tab,th.getTabContentView(),true);
        th.addTab(th.newTabSpec("tab1")
                .setIndicator("行程",getResources().getDrawable(R.drawable.table))
                .setContent(R.id.schooltimetable));
        th.addTab(th.newTabSpec("tab2")
                .setIndicator("周末",getResources().getDrawable(R.drawable.weekend))
                .setContent(R.id.weekend));
        th.addTab(th.newTabSpec("tab3")
                .setIndicator("安排",getResources().getDrawable(R.drawable.plan))
                .setContent(R.id.plan));


        /*-------------------------------行程表-----------------------------*/
        monday = (Button)findViewById(R.id.monday);
        tuesday = (Button)findViewById(R.id.tuesday);
        wednesday = (Button)findViewById(R.id.wednesday);
        thursday = (Button)findViewById(R.id.thursday);
        friday = (Button)findViewById(R.id.friday);

        mon_first = (Button)findViewById(R.id.mon_first);
        mon_second = (Button)findViewById(R.id.mon_second);
        mon_third = (Button)findViewById(R.id.mon_third);
        mon_fourth = (Button)findViewById(R.id.mon_fourth);
        mon_fifth= (Button)findViewById(R.id.mon_first);
        mon_sixth= (Button)findViewById(R.id.mon_sixth);
        mon_seventh = (Button)findViewById(R.id.mon_seventh);
        mon_eighth = (Button)findViewById(R.id.mon_eighth);

        mon_first.setOnClickListener(new MyButtonListener());
        mon_second.setOnClickListener(new MyButtonListener());
        mon_third.setOnClickListener(new MyButtonListener());
        mon_fourth.setOnClickListener(new MyButtonListener());
        mon_fifth.setOnClickListener(new MyButtonListener());
        mon_sixth.setOnClickListener(new MyButtonListener());
        mon_seventh.setOnClickListener(new MyButtonListener());
        mon_eighth.setOnClickListener(new MyButtonListener());
    }

    private class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

        }
    }

    /*-------------------------周一、周五行程表----------------------*/
    //初始化课表
    public void initTable(){
        MyDB db = new MyDB(tab.this);
        Cursor cursor = db.queryAllCourse();
        Base base = new Base();
        while (cursor.moveToNext()){
            String strWeek = cursor.getString(cursor.getColumnIndex("week"));
            String strWhichLesson = cursor.getString(cursor.getColumnIndex("whichLesson"));
            //星期一
            if(strWeek.equals("一") && strWhichLesson.equals("1-2")){
                mon_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_first.setText(base.cutCourseName(mon_first_cName));
                mon_first.setBackgroundResource(R.drawable.bg_alarm);
            }
        }


    }
}
