package com.example.study_nov1_homework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;

public class MyView extends View {
    int w = 100;
    int h = 80;
    int px = 0;
    int py = 0;
    int dx = 20;
    int dy = 20;
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    int bx = 0;
    int by = 0;
    public int max_width = 0, max_height = 0;
    Paint p;


    public MyView(Context context){
        super(context);
        init(context);
    }
    public MyView(Context context, AttributeSet att){
        super(context,att);
        init(context);
    }
    public MyView(Context context,AttributeSet att, int a){
        super(context,att,a);
        init(context);
    }

    private void init(Context context){
        p = new Paint();
        p.setColor(Color.BLUE);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        bx = getWidth()/2;
        by = getHeight()/2;
        max_width = getWidth();
        max_height = getHeight();
        canvas.drawRect(x1+bx,y1+by,x2+bx,y2+by,p);
        //전체 1080에서
    }
}

