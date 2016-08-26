package com.magic.wangdongliang.toucheventsystemtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "touchevent:";
    MyLinearLayout rootLayout;
    MyLinearLayout secondLayout;
    MyTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = (MyLinearLayout) findViewById(R.id.root_layout);
        secondLayout = (MyLinearLayout) findViewById(R.id.second_layout);
        textView = (MyTextView) findViewById(R.id.text_view);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "Activity dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "Activity onTouchEvent");
        return super.onTouchEvent(event);
    }
}
