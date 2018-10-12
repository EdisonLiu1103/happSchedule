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

    //Monday
    private Button mon_first;
    private Button mon_second;
    private Button mon_third;
    private Button mon_fourth;
    private Button mon_fifth;
    private Button mon_sixth;
    private Button mon_seventh;
    private Button mon_eighth;

    //Tuesday
    private Button tus_first;
    private Button tus_second;
    private Button tus_third;
    private Button tus_fourth;
    private Button tus_fifth;
    private Button tus_sixth;
    private Button tus_seventh;
    private Button tus_eighth;

    //Wednesday
    private Button wed_first;
    private Button wed_second;
    private Button wed_third;
    private Button wed_fourth;
    private Button wed_fifth;
    private Button wed_sixth;
    private Button wed_seventh;
    private Button wed_eighth;

    //Thursday
    private Button thu_first;
    private Button thu_second;
    private Button thu_third;
    private Button thu_fourth;
    private Button thu_fifth;
    private Button thu_sixth;
    private Button thu_seventh;
    private Button thu_eighth;

    //Friday
    private Button fri_first;
    private Button fri_second;
    private Button fri_third;
    private Button fri_fourth;
    private Button fri_fifth;
    private Button fri_sixth;
    private Button fri_seventh;
    private Button fri_eighth;

    private String mon_first_cName;
    private int mon_first_id;
    private String mon_second_cName;
    private int mon_second_id;
    private String mon_third_cName;
    private int mon_third_id;
    private String mon_fourth_cName;
    private int mon_fourth_id;
    private String mon_fifth_cName;
    private int mon_fifth_id;
    private String mon_sixth_cName;
    private int mon_sixth_id;
    private String mon_seventh_cName;
    private int mon_seventh_id;
    private String mon_eighth_cName;
    private int mon_eighth_id;

    //tuesday cName id
    private String tus_first_cName;
    private int tus_first_id;
    private String tus_second_cName;
    private int tus_second_id;
    private String tus_third_cName;
    private int tus_third_id;
    private String tus_fourth_cName;
    private int tus_fourth_id;
    private String tus_fifth_cName;
    private int tus_fifth_id;
    private String tus_sixth_cName;
    private int tus_sixth_id;
    private String tus_seventh_cName;
    private int tus_seventh_id;
    private String tus_eighth_cName;
    private int tus_eighth_id;

    //wednesday cName id
    private String wed_first_cName;
    private int wed_first_id;
    private String wed_second_cName;
    private int wed_second_id;
    private String wed_third_cName;
    private int wed_third_id;
    private String wed_fourth_cName;
    private int wed_fourth_id;
    private String wed_fifth_cName;
    private int wed_fifth_id;
    private String wed_sixth_cName;
    private int wed_sixth_id;
    private String wed_seventh_cName;
    private int wed_seventh_id;
    private String wed_eighth_cName;
    private int wed_eighth_id;

    //thursday cName id
    private String thu_first_cName;
    private int thu_first_id;
    private String thu_second_cName;
    private int thu_second_id;
    private String thu_third_cName;
    private int thu_third_id;
    private String thu_fourth_cName;
    private int thu_fourth_id;
    private String thu_fifth_cName;
    private int thu_fifth_id;
    private String thu_sixth_cName;
    private int thu_sixth_id;
    private String thu_seventh_cName;
    private int thu_seventh_id;
    private String thu_eighth_cName;
    private int thu_eighth_id;

    //Friday cName id
    private String fri_first_cName;
    private int fri_first_id;
    private String fri_second_cName;
    private int fri_second_id;
    private String fri_third_cName;
    private int fri_third_id;
    private String fri_fourth_cName;
    private int fri_fourth_id;
    private String fri_fifth_cName;
    private int fri_fifth_id;
    private String fri_sixth_cName;
    private int fri_sixth_id;
    private String fri_seventh_cName;
    private int fri_seventh_id;
    private String fri_eighth_cName;
    private int fri_eighth_id;

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
        while (cursor.moveToNext()) {
            String strWeek = cursor.getString(cursor.getColumnIndex("week"));
            String strWhichLesson = cursor.getString(cursor.getColumnIndex("whichLesson"));
            //星期一
            if (strWeek.equals("一") && strWhichLesson.equals("1-2")) {
                mon_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_first.setText(base.cutCourseName(mon_first_cName));
                mon_first.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("3-4")) {
                mon_second_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_second_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_second.setText(base.cutCourseName(mon_second_cName));
                mon_second.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("5-6")) {
                mon_third_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_third_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_third.setText(base.cutCourseName(mon_third_cName));
                mon_third.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("7-8")) {
                mon_fourth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_fourth_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_fourth.setText(base.cutCourseName(mon_fourth_cName));
                mon_fourth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("9-10")) {
                mon_fifth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_fifth_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_fifth.setText(base.cutCourseName(mon_fifth_cName));
                mon_fifth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("11-12")) {
                mon_sixth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_sixth_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_sixth.setText(base.cutCourseName(mon_sixth_cName));
                mon_sixth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("13-14")) {
                mon_seventh_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_seventh_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_seventh.setText(base.cutCourseName(mon_seventh_cName));
                mon_seventh.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if (strWeek.equals("一") && strWhichLesson.equals("15-16")) {
                mon_eighth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                mon_eighth_id = cursor.getInt(cursor.getColumnIndex("id"));
                mon_eighth.setText(base.cutCourseName(mon_eighth_cName));
                mon_eighth.setBackgroundResource(R.drawable.bg_alarm);
            }

            //星期二
            if(strWeek.equals("二") && strWhichLesson.equals("1-2")){
                tus_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_first.setText(base.cutCourseName(tus_first_cName));
                tus_first.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("3-4")){
                tus_second_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_second_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_second.setText(base.cutCourseName(tus_second_cName));
                tus_second.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("5-6")){
                tus_third_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_third_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_third.setText(base.cutCourseName(tus_third_cName));
                tus_third.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("7-8")){
                tus_fourth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_fourth_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_fourth.setText(base.cutCourseName(tus_fourth_cName));
                tus_fourth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("9-10")){
                tus_fifth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_fifth_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_fifth.setText(base.cutCourseName(tus_fifth_cName));
                tus_fifth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("11-12")){
                tus_sixth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_sixth_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_sixth.setText(base.cutCourseName(tus_sixth_cName));
                tus_sixth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("13-14")){
                tus_seventh_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_seventh_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_seventh.setText(base.cutCourseName(tus_seventh_cName));
                tus_seventh.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("二") && strWhichLesson.equals("15-16")){
                tus_eighth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                tus_eighth_id = cursor.getInt(cursor.getColumnIndex("id"));
                tus_eighth.setText(base.cutCourseName(tus_eighth_cName));
                tus_eighth.setBackgroundResource(R.drawable.bg_alarm);
            }

            //星期三
            if(strWeek.equals("三") && strWhichLesson.equals("1-2")){
                wed_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_first.setText(base.cutCourseName(wed_first_cName));
                wed_first.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("3-4")){
                wed_second_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_second_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_second.setText(base.cutCourseName(wed_second_cName));
                wed_second.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("5-6")){
                wed_third_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_third_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_third.setText(base.cutCourseName(wed_third_cName));
                wed_third.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("7-8")){
                wed_fourth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_fourth_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_fourth.setText(base.cutCourseName(wed_fourth_cName));
                wed_fourth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("9-10")){
                wed_fifth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_fifth_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_fifth.setText(base.cutCourseName(wed_fifth_cName));
                wed_fifth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("11-12")){
                wed_sixth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_sixth_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_sixth.setText(base.cutCourseName(wed_sixth_cName));
                wed_sixth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("13-14")){
                wed_seventh_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_seventh_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_seventh.setText(base.cutCourseName(wed_seventh_cName));
                wed_seventh.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("三") && strWhichLesson.equals("15-16")){
                wed_eighth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                wed_eighth_id = cursor.getInt(cursor.getColumnIndex("id"));
                wed_eighth.setText(base.cutCourseName(wed_eighth_cName));
                wed_eighth.setBackgroundResource(R.drawable.bg_alarm);
            }

            //星期四
            if(strWeek.equals("四") && strWhichLesson.equals("1-2")){
                thu_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_first.setText(base.cutCourseName(thu_first_cName));
                thu_first.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("3-4")){
                thu_second_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_second_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_second.setText(base.cutCourseName(thu_second_cName));
                thu_second.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("5-6")){
                thu_third_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_third_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_third.setText(base.cutCourseName(thu_third_cName));
                thu_third.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("7-8")){
                thu_fourth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_fourth_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_fourth.setText(base.cutCourseName(tus_fourth_cName));
                thu_fourth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("9-10")){
                thu_fifth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_fifth_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_fifth.setText(base.cutCourseName(thu_fifth_cName));
                thu_fifth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("11-12")){
                thu_sixth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_sixth_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_sixth.setText(base.cutCourseName(thu_sixth_cName));
                thu_sixth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("13-14")){
                thu_seventh_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_seventh_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_seventh.setText(base.cutCourseName(thu_seventh_cName));
                thu_seventh.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("四") && strWhichLesson.equals("15-16")){
                thu_eighth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                thu_eighth_id = cursor.getInt(cursor.getColumnIndex("id"));
                thu_eighth.setText(base.cutCourseName(thu_eighth_cName));
                thu_eighth.setBackgroundResource(R.drawable.bg_alarm);
            }

            //星期五
            if(strWeek.equals("五") && strWhichLesson.equals("1-2")){
                fri_first_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_first_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_first.setText(base.cutCourseName(fri_first_cName));
                fri_first.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("3-4")){
                fri_second_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_second_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_second.setText(base.cutCourseName(fri_second_cName));
                fri_second.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("5-6")){
                fri_third_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_third_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_third.setText(base.cutCourseName(fri_third_cName));
                fri_third.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("7-8")){
                fri_fourth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_fourth_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_fourth.setText(base.cutCourseName(fri_fourth_cName));
                fri_fourth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("9-10")){
                fri_fifth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_fifth_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_fifth.setText(base.cutCourseName(fri_fifth_cName));
                fri_fifth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("11-12")){
                fri_sixth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_sixth_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_sixth.setText(base.cutCourseName(fri_sixth_cName));
                fri_sixth.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("13-14")){
                fri_seventh_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_seventh_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_seventh.setText(base.cutCourseName(fri_seventh_cName));
                fri_seventh.setBackgroundResource(R.drawable.bg_alarm);
            }
            else if(strWeek.equals("五") && strWhichLesson.equals("15-16")){
                fri_eighth_cName = cursor.getString(cursor.getColumnIndex("cName"));
                fri_eighth_id = cursor.getInt(cursor.getColumnIndex("id"));
                fri_eighth.setText(base.cutCourseName(fri_eighth_cName));
                fri_eighth.setBackgroundResource(R.drawable.bg_alarm);
            }
        }
    }
}
