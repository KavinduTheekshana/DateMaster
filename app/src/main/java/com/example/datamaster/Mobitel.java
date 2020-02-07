package com.example.datamaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Mobitel extends AppCompatActivity {
    private Button btn_mobitel_back,btn_btnM03;
    NestedScrollView nestedScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobitel);
        btn_mobitel_back=(Button) findViewById(R.id.mobitel_back);
        btn_mobitel_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity();
            }
        });



    }

    public void HomeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }



}
