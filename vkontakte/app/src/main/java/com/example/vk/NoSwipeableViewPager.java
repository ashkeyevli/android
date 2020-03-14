package com.example.vk;
import android.content.Context;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.lang.reflect.Field;
import androidx.viewpager.widget.ViewPager;

public class NoSwipeableViewPager extends ViewPager {
    public NoSwipeableViewPager(Context context) {
        super(context);
    }

    public NoSwipeableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        // stop swipe
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // stop switching pages
        return false;
    }

    }



