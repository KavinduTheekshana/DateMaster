package com.example.datamaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import java.time.Instant;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView mobitel,dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mobitel = (MaterialCardView) findViewById(R.id.btnMobitel);
        dialog = (MaterialCardView) findViewById(R.id.btnDialog);
        mobitel.setOnClickListener(this);
        dialog.setOnClickListener(this);
    }

    public void mobitelView(View view){
        startActivity(new Intent(this, Mobitel.class));
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.btnMobitel : i = new Intent(this,Mobitel.class);startActivity(i); break;
            case R.id.btnDialog : i = new Intent(this,Dialog.class);startActivity(i);  break;
            default:break;
        }

    }
}
