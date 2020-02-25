package com.example.datamaster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.datamaster.Models.Package;
import com.example.datamaster.Models.ServiceProviders;
import com.example.datamaster.Stables.Commons;

import java.util.ArrayList;
import java.util.List;

public class PackageListActivity extends AppCompatActivity {

    private int id;
    private ImageView logoimage;
    Commons commons;
    ServiceProviders serviceProviders;
    ArrayList <Package> packageslist;

    public Button activebtn;

    private RecyclerView mRecycleview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_list);
        Commons.selectedPackage=null;
        logoimage=findViewById(R.id.logoimage);
        commons=new Commons();
        packageslist=new ArrayList<>();

        activebtn=findViewById(R.id.material_unelevated_button);

        if(this.getIntent().getStringExtra("id")!=null){
            id=Integer.parseInt(this.getIntent().getStringExtra("id"));
        }

        for(ServiceProviders serviceProviders:commons.getServiceproviders()){
            if(serviceProviders.getId()==id){
                this.serviceProviders=serviceProviders;
                break;
            }
        }

        if(serviceProviders!=null){
            logoimage.setImageResource(serviceProviders.getImg());

            //getPackages

            for(Package aPackage:new Commons().getPackagers()){
                if(aPackage.getSpid()==id){
                    packageslist.add(aPackage);
                }
            }
            
            if(packageslist.size()>0){
                mRecycleview = findViewById(R.id.allpack);
                mRecycleview.setHasFixedSize(true);
                mLayoutManager = new LinearLayoutManager(this);
                mAdapter = new PackageAdapter(packageslist,this);

                mRecycleview.setLayoutManager(mLayoutManager);
                mRecycleview.setAdapter(mAdapter);

                activebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(Commons.selectedPackage!=null){
                            Toast.makeText(PackageListActivity.this, Commons.selectedPackage.getValue(), Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(PackageListActivity.this, "Please Select Package", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }else{
                Toast.makeText(this, "No Packages Found", Toast.LENGTH_SHORT).show();
            }
        }else{
            goToBack(null);
        }
    }

    public void goToBack(View view){
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
