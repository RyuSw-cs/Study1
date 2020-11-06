package com.example.study_nov1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import android.util.Log;
import android.widget.Button;
import com.example.study_nov1_homework.R;

class MyView extends View {
    public MyView(Context context){
        super(context);
    }
    public MyView(Context context, AttributeSet att){
        super(context,att);
    }
    public MyView(Context context,AttributeSet att, int a){
        super(context,att,a);
    }
    int w = 100;
    int h = 80;
    int px = 0;
    int py = 0;
    int dx = 3;
    int dy = 3;
    int x1;
    int x2;
    int y1;
    int y2;

    @Override
    protected void onDraw(Canvas c){
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        int bx = getWidth()/2;
        int by = getHeight()/2;
        c.drawRect(x1+bx,y1+by,x2+bx,y2+by,paint);
    }
}

public class move_square extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.move_square);
    }
    public void mOnClick(View v){
        MyView mv = (MyView)findViewById(R.id.mv);
        switch (v.getId()){
            case R.id.up1:
                mv.py -= mv.dy;
                mv.x1= (mv.px - mv.w/2);
                mv.x2= (mv.px + mv.w/2);
                mv.y1= (mv.py - mv.h/2);
                mv.y2= (mv.py + mv.h/2);
                mv.invalidate();
            case R.id.tleft:
                mv.py -= mv.dy;
                mv.x1= (mv.px - mv.w/2);
                mv.x2= (mv.px + mv.w/2);
                mv.y1= (mv.py - mv.h/2);
                mv.y2= (mv.py + mv.h/2);
                mv.invalidate();
        }
    }
}
