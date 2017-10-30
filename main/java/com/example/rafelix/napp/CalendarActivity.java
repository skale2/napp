package com.example.rafelix.napp;

import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alamkanak.weekview.MonthLoader;
import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;

import java.util.ArrayList;
import java.util.List;

public class CalendarActivity extends AppCompatActivity {
    private WeekView mWeekView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        mWeekView = (WeekView) findViewById(R.id.weekView);

    }


}
