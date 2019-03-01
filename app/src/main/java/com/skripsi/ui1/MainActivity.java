package com.skripsi.ui1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp,clover;
    LinearLayout textsplash,texthome,menus;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textSplash);
        texthome = (LinearLayout) findViewById(R.id.textHome);
        menus = (LinearLayout) findViewById(R.id.menus);
        ImageView intentCoin = (ImageView) findViewById(R.id.intentCoin);

        //animasi background
        bgapp.animate().translationY(-1800).setDuration(1000).setStartDelay(600);
        //animasi gambar clover
        clover.animate().alpha(0).setDuration(1000).setStartDelay(600);
        //hilangin linearlayout
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);

        intentCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Coin.class);
                startActivity(intent);
            }
        });



    }
}
