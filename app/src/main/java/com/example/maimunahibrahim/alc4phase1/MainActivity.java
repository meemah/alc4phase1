package com.example.maimunahibrahim.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAbout(View view){
        Intent intent = new Intent(this,AboutAlcActivity.class);
        startActivity(intent);
    }
    public void onMyProfile(View view){
        Intent intent = new Intent(this,profileActivity.class);
        startActivity(intent);
    }
}
