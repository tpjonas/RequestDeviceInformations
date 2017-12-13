package cimdata.android.dez2017.requestdeviceinformations.utils;


import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenUtility {

    private double pixelWidth;
    private double pixelHeight;
    private double dpWidth;
    private double dpHeight;
    private double density;

    public ScreenUtility(Activity activity) {

        DisplayMetrics metrics = new DisplayMetrics();
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getMetrics(metrics);

        density = metrics.density;
        pixelWidth = metrics.widthPixels;
        pixelHeight = metrics.heightPixels;
        dpWidth = pixelWidth / density;
        dpHeight = pixelHeight / density;
    }

    public double getPixelWidth() {
        return pixelWidth;
    }

    public double getPixelHeight() {
        return pixelHeight;
    }

    public double getDpWidth() {
        return dpWidth;
    }

    public double getDpHeight() {
        return dpHeight;
    }

    public double getDensity() {
        return density;
    }

}
