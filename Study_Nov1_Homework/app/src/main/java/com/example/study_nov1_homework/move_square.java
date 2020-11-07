package com.example.study_nov1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

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
    int dx = 20;
    int dy = 20;
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;

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
                if(!(mv.py < -570)) {
                    mv.py -= mv.dy;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.right:
                if(!(mv.px > 480)) {
                    mv.px += mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.tleft:
                if(!(mv.py < -570 || mv.px < -480)) {
                    mv.py -= mv.dy;
                    mv.px -= mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.tright:
                if(!(mv.px > 480 || mv.py < -570)) {
                    mv.py -= mv.dy;
                    mv.px += mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.donw1:
                if(!(mv.py > 570)) {
                    mv.py += mv.dy;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.left:
                if(!(mv.px < -480)) {
                    mv.px -= mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.bright:
                if(!(mv.py > 570||mv.px > 480)) {
                    mv.py += mv.dy;
                    mv.px += mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
            case R.id.bleft:
                if(!(mv.py > 570||mv.px < -480)) {
                    mv.py += mv.dy;
                    mv.px -= mv.dx;
                    mv.x1 = (mv.px - mv.w / 2);
                    mv.x2 = (mv.px + mv.w / 2);
                    mv.y1 = (mv.py - mv.h / 2);
                    mv.y2 = (mv.py + mv.h / 2);
                    mv.invalidate();
                }
                break;
        }
    }
}
