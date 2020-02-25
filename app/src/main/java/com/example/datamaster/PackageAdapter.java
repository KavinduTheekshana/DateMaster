package com.example.datamaster;

import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datamaster.Models.Package;
import com.example.datamaster.Stables.Commons;

import java.util.ArrayList;

public class PackageAdapter extends RecyclerView.Adapter<PackageAdapter.PackageViewHolder> {
    private ArrayList<Package> mPackageList;
    public PackageListActivity packageListActivity;

    public static class PackageViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public TextView mTextView4;
        public TextView mTextView5;
        public TextView mTextView6;
        public CardView btnM05;

        public PackageViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.PackageLKR);
            mTextView2 = itemView.findViewById(R.id.PackagePrice);
            mTextView3 = itemView.findViewById(R.id.PackageDataAnyTime);
            mTextView4 = itemView.findViewById(R.id.PackageDataNightTime);
            mTextView5 = itemView.findViewById(R.id.PackageData4G);
            mTextView6 = itemView.findViewById(R.id.PackageValidity);
            btnM05= itemView.findViewById(R.id.btnM05);
        }
    }

    public PackageAdapter(ArrayList<Package> packageList,PackageListActivity packageListActivity){
        mPackageList = packageList;
        this.packageListActivity=packageListActivity;
    }
    @NonNull
    @Override
    public PackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.package_item,parent,false);
        PackageViewHolder pvh = new PackageViewHolder(v);
        return pvh;
    }

    int index;
    int fir=0;

    @Override
    public void onBindViewHolder(@NonNull final PackageViewHolder holder, final int position) {
        final Package currentItem = mPackageList.get(position);

        holder.mTextView1.setText("LKR");
        holder.mTextView2.setText(currentItem.getValue());
        holder.mTextView3.setText(currentItem.getPackageDataAnyTime());
        holder.mTextView4.setText(currentItem.getPackageDataNightTime());
        holder.mTextView5.setText(currentItem.getPackageData4G());
        holder.mTextView6.setText("Validity : " + currentItem.getPackageValidity());

        holder.btnM05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                index=position;
                notifyDataSetChanged();

                doProcess();
                sendMessage(currentItem);


            }
        });

        if(fir!=0){
            if(index==position){
                holder.btnM05.setBackgroundColor(Color.CYAN);
            }else{
                holder.btnM05.setBackgroundColor(Color.WHITE);
            }
        }else{
            fir++;
        }

    }

    @Override
    public int getItemCount() {
        return mPackageList.size();
    }

    public void doProcess(){
        this.packageListActivity.activebtn.setEnabled(true);
    }

    public void sendMessage(Package aPackage){
        Commons.selectedPackage=aPackage;
    }
}
