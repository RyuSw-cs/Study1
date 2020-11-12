package com.example.study_nov1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

//버튼클릭이벤트 생성 3가지
public class move_square extends AppCompatActivity implements MyView.OnClickListener{
    private MyView view2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view2 = new MyView(this);
        setContentView(R.layout.move_square);
    }

    @Override
    public void onClick(View v) {
        MyView view = (MyView) findViewById(R.id.mv);
        switch (v.getId()) {
            case R.id.up1:
                if (!(view.py < -570)) {
                    view.py -= view.dy;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.right:
                if (!(view.px > 480)) {
                    view.px += view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.tleft:
                if (!(view.py < -570 || view.px < -480)) {
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
                if (!(view.px > 480 || view.py < -570)) {
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
                if (!(view.py > 570)) {
                    view.py += view.dy;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.left:
                if (!(view.px < -480)) {
                    view.px -= view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
            case R.id.bright:
                if (!(view.py > 570 || view.px > 480)) {
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
                if (!(view.py > 570 || view.px < -480)) {
                    view.py += view.dy;
                    view.px -= view.dx;
                    view.x1 = (view.px - view.w / 2);
                    view.x2 = (view.px + view.w / 2);
                    view.y1 = (view.py - view.h / 2);
                    view.y2 = (view.py + view.h / 2);
                    view.invalidate();
                }
                break;
        }
    }
}