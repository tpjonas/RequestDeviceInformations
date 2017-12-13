package cimdata.android.dez2017.requestdeviceinformations.utils;


import android.os.Build;

public class ApiUtility {

    public static int getApiLevel() {
        int level = Build.VERSION.SDK_INT;
        return level;
    }

    public static String getReleaseCode() {
        String code = Build.VERSION.RELEASE;
        return code;
    }


}

