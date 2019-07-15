package com.trevexs.alccodingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

    }

    public void gotoActivityB(View view) {
        startActivity(new Intent(this, ActivityC.class));
    }

    public void gotoActivityC(View view) {
        startActivity(new Intent(this, ActivityB.class));
    }
}
