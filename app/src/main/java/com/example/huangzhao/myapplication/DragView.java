package com.example.huangzhao.myapplication;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huangzhao on 2016/3/25.
 */
public class DragView extends ViewGroup {

    private ViewDragHelper mViewHelper;

    private ViewDragHelper.Callback callback = new ViewDragHelper.Callback(){
        @Override
        public boolean tryCaptureView(View view, int i) {
            return false;
        }

        @Override
        public int clampViewPositionHorizontal(View child, int left, int dx) {
            return super.clampViewPositionHorizontal(child, left, dx);
        }

        @Override
        public int clampViewPositionVertical(View child, int top, int dy) {
            return super.clampViewPositionVertical(child, top, dy);
        }
    };


    public DragView(Context context) {
        super(context);
    }

    public DragView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DragView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    private void init(Context context){
//        mViewHelper = ViewDragHelper.create(this, ca)
    }
}
