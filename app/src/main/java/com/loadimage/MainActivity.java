package com.loadimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rdoRajesh, rdoDaya, rdoBhuwan;
    ImageView imgHero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoRajesh = findViewById(R.id.rdoRajesh);
        rdoDaya = findViewById(R.id.rdoDaya);
        rdoBhuwan = findViewById(R.id.rdoBhuwan);

        imgHero = findViewById(R.id.imgHero);


        rdoRajesh.setOnClickListener(this);
        rdoDaya.setOnClickListener(this);
        rdoBhuwan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
    switch(v.getId())
    {
        case R.id.rdoRajesh :
            imgHero.setImageResource(R.drawable.rajesh);
            break;

        case R.id.rdoDaya :
            imgHero.setImageResource(R.drawable.dayahang);
            break;

        case R.id.rdoBhuwan :
            imgHero.setImageResource(R.drawable.bhuwan);
            break;


    }
    }
}
