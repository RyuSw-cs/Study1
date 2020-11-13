package com.example.study_nov1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
=======

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
>>>>>>> 8c20582ae7e2a3dd9fb48382c4e24ecded811707

//버튼클릭이벤트 생성 3가지
public class move_square extends AppCompatActivity implements MyView.OnClickListener{
    private MyView view2;
    protected int max_x = 0;
    protected int max_y = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view2 = new MyView(this);
        setContentView(R.layout.move_square);
    }

    @Override
    public void onClick(View v) {
        MyView view = (MyView)findViewById(R.id.mv);
        switch (v.getId()) {
            case R.id.up1:
<<<<<<< HEAD
                //0으로만 저장됨 ㅠㅠ
                if (!(view.y1 < -(view.max_height/2))) {
                    view.py -= view.dy;//y의 좌표를 -20
                    view.x1 = (view.px - view.w / 2);//x좌표 - 사각형의 가로의 반(?)
                    view.x2 = (view.px + view.w / 2);//x좌표 + 사각형의 가로
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.right:
                if (!(view.x2 > view.max_width/2)) {
                    view.px += view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.tleft:
                if (!(view.y1 < -(view.max_height/2) || view.x1 < -(view.max_width)/2)) {
                    view.py -= view.dy;
                    view.px -= view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.tright:
                if (!(view.x2 > view.max_width/2 || view.y1 < -(view.max_height)/2)) {
                    view.py -= view.dy;
                    view.px += view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.donw1:
                if (!(view.y2 > view.max_height/2)) {
                    view.py += view.dy;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.left:
                if (!(view.x1 < -(view.max_width)/2)) {
                    view.px -= view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.bright:
                if (!(view.y2 > view.max_height/2 || view.x2 > view.max_width/2)) {
                    view.py += view.dy;
                    view.px += view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.bleft:
                if (!(view.y2 > view.max_height/2 || view.x1 < -(view.max_width/2))) {
                    view.py += view.dy;
                    view.px -= view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
=======
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
>>>>>>> 8c20582ae7e2a3dd9fb48382c4e24ecded811707
                }
                break;
        }
    }
}