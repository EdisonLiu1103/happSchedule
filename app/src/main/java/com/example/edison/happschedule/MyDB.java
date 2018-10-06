package com.example.edison.happschedule;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class MyDB {
    /**
     * 定义一：行程表和计划表中变量
     * @param c
     */
    private static final String DATABASE_NAME = "dbForiTaoke.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME_SCHEDULE = "Tb_schedule";
    private static final String ID = "id";
    private static final String WEEK = "week";
    private static final String WHICH_LESSON = "whichlesson";
    private static final String COURSE_NAME = "cName";
    private static final String PERIOD = "period";
    private static final String START_TIME = "startTime";
    private static final String END_TIME = "endTime";
    private static final String ADDRESS = "address";
    private static final String REMIND_TIME = "remindTime";
    private static final String IS_REMIND = "isRemind";
    private static final String IS_REMIND_BY_VIBRATO = "isRemindByVibrato";
    private static final String IS_REMIND_BY_RING = "isRemmindByRing";
    private static final String TEACHER = "teacher";
    private static final String SUBMIT_DATE = "submitDate";

    private static final String TABLE_NAME_PLAN = "Tb_plan";
    private static final String PNO = "pno";
    private static final String CONTENT = "content";

    MyDBHelper mOpenHelper;
    Context context;

    /*定义二：带Context类型参数的构造方法。向MyDBHelper类提供此参数。*/
    public MyDB(Context c) {
        this.context = c;
        mOpenHelper = new MyDBHelper(context);
    }

    /*定义三：各种对数据库操作的函数*/
    //查询所有课程
    public Cursor queryAllCourse() {
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        String col[] = {ID, WEEK, WHICH_LESSON, COURSE_NAME, PERIOD, START_TIME, END_TIME, ADDRESS, REMIND_TIME, IS_REMIND, IS_REMIND_BY_VIBRATO,
            IS_REMIND_BY_RING, TEACHER, SUBMIT_DATE, TABLE_NAME_PLAN, PNO, CONTENT};
        Cursor c = db.query(TABLE_NAME_SCHEDULE, col, null, null, null, null, null);
        return c;
    }



    /**
     * MyDBHelper是继承SQLiteOpenHelper的
     */
    public static class MyDBHelper extends SQLiteOpenHelper{

        public MyDBHelper(@Nullable Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
