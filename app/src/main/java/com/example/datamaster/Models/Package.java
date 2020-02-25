package com.example.datamaster.Models;

public class Package {
    private int id,spid;
    private String Value,PackageDataAnyTime,PackageDataNightTime,PackageData4G,PackageValidity;


    public Package(int id, int spid, String value, String packageDataAnyTime, String packageDataNightTime, String packageData4G, String packageValidity) {
        this.id = id;
        this.spid = spid;
        Value = value;
        PackageDataAnyTime = packageDataAnyTime;
        PackageDataNightTime = packageDataNightTime;
        PackageData4G = packageData4G;
        PackageValidity = packageValidity;
    }

    public int getId() {
        return id;
    }

    public int getSpid() {
        return spid;
    }

    public String getValue() {
        return Value;
    }

    public String getPackageDataAnyTime() {
        return PackageDataAnyTime;
    }

    public String getPackageDataNightTime() {
        return PackageDataNightTime;
    }

    public String getPackageData4G() {
        return PackageData4G;
    }

    public String getPackageValidity() {
        return PackageValidity;
    }
}
