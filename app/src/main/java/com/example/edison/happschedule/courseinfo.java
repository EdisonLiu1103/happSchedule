package com.example.edison.happschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class courseinfo extends AppCompatActivity {

    private Button sub;
    private Button cancel;
    private Object strCourseName;
    private Object strAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courseinfo);

        sub = (findViewById(R.id.submit));
        cancel = (findViewById(R.id.cancel));

        ArrayList<Map<String, Object>> listItem = new ArrayList<Map<String, Object>>();

        HashMap<String, Object> item = new HashMap<String, Object>();
        item.put("标题","课程名称");
        item.put("说明",strCourseName);
        listItem.add(item);
        item = new HashMap<String, Object>();
        item.put("标题","上课地点");
        item.put("说明",strAddress);
        listItem.add(item);

    }

}
