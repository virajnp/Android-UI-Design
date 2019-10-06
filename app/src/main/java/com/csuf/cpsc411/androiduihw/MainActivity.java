package com.csuf.cpsc411.androiduihw;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView(R.layout.activity_main);


        TextView tv;
        LinearLayout ll1, ll2;
        LinearLayout.LayoutParams params;


        HorizontalScrollView scroll = new HorizontalScrollView(this);
        scroll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setOrientation(LinearLayout.VERTICAL);
        mainlayout.setBackgroundColor(Color.BLACK);
        mainlayout.setLayoutParams(new ViewGroup.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));


        // Row number 1

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 70);
        params.setMargins(2, 2, 2, 2);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("1");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(2, 2, 2, 2);
        tv.setLayoutParams(params);
        tv.setText("Rules void hello1(int hour)");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 2


        ll2 = new LinearLayout(this);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        params.setMargins(1, 1, 1, 1);
        ll2.setLayoutParams(params);

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.VERTICAL);
        ll1.setLayoutParams(new ViewGroup.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("2");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        // Row Number 3

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("3");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        ll1.addView(tv);
        tv.setTextSize(18);
        ll2.addView(ll1);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, 150);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("properties");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.whiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll2.addView(tv);


        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.VERTICAL);
        params = new LinearLayout.LayoutParams(800, 150);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("name");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.whiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("category");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.whiteLite));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        ll2.addView(ll1);

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.VERTICAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 150);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Day Hour Classification");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.whiteLite));
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Day and Time");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.whiteLite));
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(18);
        tv.setSingleLine(true);
        ll1.addView(tv);

        ll2.addView(ll1);
        mainlayout.addView(ll2);

        //Row number 4

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 70);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("4");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Rule");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("C1");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("A1");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);

        //Row number 5

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("5");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(800, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText(getResources().getString(R.string.s1));
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText(getResources().getString(R.string.s2));
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row 6

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("6");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("int min");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("int max");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("String greeting");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 7

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 75);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setLayoutParams(params);
        tv.setText("7");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("Rule");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("From");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        params.gravity = Gravity.CENTER;
        tv.setLayoutParams(params);
        tv.setText("To");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Greeting");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.cyan));
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 8

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(1, 1, 1, 1);
        ll1.setLayoutParams(params);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("8");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R10");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.white));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("0");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("11");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Morning");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.orange));
        tv.setTextSize(18);
        tv.setPadding(1, 1, 1, 1);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 9

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        ll1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("9");
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R20");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.white));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("12");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("17");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Afternoon");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.orange));
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 10

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        ll1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("10");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R30");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.white));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("18");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("21");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Evening");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.orange));
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        //Row number 11

        ll1 = new LinearLayout(this);
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        ll1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(90, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("11");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.GRAY);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(16);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("R40");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.white));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("22");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);

        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT);
        params.setMargins(1, 1, 1, 1);
        tv.setGravity(Gravity.RIGHT);
        tv.setLayoutParams(params);
        tv.setText("23");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.yellow));
        tv.setTextSize(18);
        ll1.addView(tv);


        tv = new TextView(this);
        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // params.gravity = Gravity.CENTER;
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        tv.setText("Good Night");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(getResources().getColor(R.color.orange));
        tv.setTextSize(18);
        ll1.addView(tv);

        mainlayout.addView(ll1);


        scroll.addView(mainlayout);
        setContentView(scroll);


    }
}
