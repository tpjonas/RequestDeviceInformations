package cimdata.android.dez2017.requestdeviceinformations.utils;


import android.os.Build;

public class DeviceUtility {

    public static String getManufacturer() {
        String manufacturer = Build.MANUFACTURER;
        return manufacturer;
    }

    public static String getModel() {
        String model = Build.MODEL;
        return model;
    }

}
