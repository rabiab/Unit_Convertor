package com.example.hp.unitconvertor;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class HomeActivity extends ActionBarActivity {
    private static int SPLASH_TIME_OUT=3000;
    private TextView e1;
    private ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        e1=(TextView)findViewById(R.id.edit1);
        im1=(ImageView)findViewById(R.id.r);
        Animation anim;
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        e1.startAnimation(anim);
        im1.startAnimation(anim);

        new Handler().postDelayed(new Runnable(){


            @Override
            public void run() {
                Intent homeintent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }


}
