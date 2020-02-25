package com.example.datamaster.Stables;

import com.example.datamaster.Models.Package;
import com.example.datamaster.Models.ServiceProviders;
import com.example.datamaster.R;

import java.util.ArrayList;
import java.util.List;

public class Commons {
    private ArrayList<ServiceProviders> serviceproviders;
    private ArrayList<Package> packagers;

    public static Package selectedPackage;

    public Commons(){
        serviceproviders=new ArrayList<>();
        packagers = new ArrayList<>();

        serviceproviders.add(new ServiceProviders(1, R.drawable.dialogcolor,"Dialog"));
        serviceproviders.add(new ServiceProviders(2, R.drawable.mobitelcolor,"Mobitel"));

        packagers.add(new Package(1,2,"05","43 MB (Any Time)","0 MB (Night Time)","0 MB (4G Bounus)","24 hours"));
        packagers.add(new Package(2,2,"29","163 MB (Any Time)","163 MB (Night Time)","0 MB (4G Bounus)","3 Days"));
        packagers.add(new Package(3,2,"49","326 MB (Any Time)","326 MB (Night Time)","244 MB (4G Bounus)","7 Days"));
        packagers.add(new Package(4,2,"99","652 MB (Any Time)","652 MB (Night Time)","489 MB (4G Bounus)","21 Days"));
        packagers.add(new Package(5,2,"199","1413 MB (Any Time)","1413 MB (Night Time)","1087 MB (4G Bounus)","30 Days"));
        packagers.add(new Package(6,2,"299","2.17 GB (Any Time)","2.17 GB (Night Time)","1.629 GB (4G Bounus)","30 Days"));
        packagers.add(new Package(7,2,"399","2.71 GB (Any Time)","2.71 GB (Night Time)","2.17 GB (4G Bounus)","30 Days"));
        packagers.add(new Package(8,2,"499","4.34 GB (Any Time)","3.25 GB (Night Time)","3.25 GB (4G Bounus)","30 Days"));
        packagers.add(new Package(9,2,"699","6.15 GB (Any Time)","5.43 GB (Night Time)","3.25 GB (4G Bounus)","30 Days"));
        packagers.add(new Package(10,2,"999","8.62 GB (Any Time)","8.62 GB (Night Time)","6.51 GB (4G Bounus)","30 Days"));
        packagers.add(new Package(11,2,"1999","21.73 GB (Any Time)","21.73 GB (Night Time)","16.20 GB (4G Bounus)","365 Days"));


    }

    public ArrayList<ServiceProviders> getServiceproviders() {
        return serviceproviders;
    }

    public ArrayList<Package> getPackagers() {
        return packagers;
    }
}
