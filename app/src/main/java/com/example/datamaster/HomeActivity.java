package com.example.datamaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import java.time.Instant;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView mobitel,dialog,hutch,airtel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mobitel = (MaterialCardView) findViewById(R.id.btnMobitel);
        dialog = (MaterialCardView) findViewById(R.id.btnDialog);
        hutch = (MaterialCardView) findViewById(R.id.btnHutch);
        airtel = (MaterialCardView) findViewById(R.id.btnAirtel);

        mobitel.setOnClickListener(this);
        dialog.setOnClickListener(this);
        hutch.setOnClickListener(this);
        airtel.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.btnMobitel : i = new Intent(this,PackageListActivity.class).putExtra("id","2") ;startActivity(i); break;

//            case R.id.btnHutch : i = new Intent(this,Hutch.class);startActivity(i);  break;
//            case R.id.btnAirtel : i = new Intent(this,Airtel.class);startActivity(i);  break;
            default:break;
        }

    }
}
