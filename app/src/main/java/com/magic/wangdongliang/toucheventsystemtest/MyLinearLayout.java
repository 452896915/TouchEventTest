package com.magic.wangdongliang.toucheventsystemtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by wangdongliang on 16/6/23.
 */
public class MyLinearLayout extends LinearLayout {
    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(MainActivity.TAG, getId() + " MyLinearLayout onInterceptTouchEvent");
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(MainActivity.TAG, getId() + " MyLinearLayout dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(MainActivity.TAG, getId() + " MyLinearLayout onTouchEvent");
        return true;
    }
}
