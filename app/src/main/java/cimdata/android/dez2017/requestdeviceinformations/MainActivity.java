package cimdata.android.dez2017.requestdeviceinformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cimdata.android.dez2017.requestdeviceinformations.utils.ApiUtility;
import cimdata.android.dez2017.requestdeviceinformations.utils.DeviceUtility;
import cimdata.android.dez2017.requestdeviceinformations.utils.ScreenUtility;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView outputText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.txt_acmain_output);

        button = findViewById(R.id.btn_acmain_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                measurePhone();
            }
        });
    }

    private void measurePhone() {
        Toast.makeText(MainActivity.this, "Foobar", Toast.LENGTH_SHORT).show();

        ScreenUtility screenUtility = new ScreenUtility(this);

        int level = ApiUtility.getApiLevel();
        String resVersion = ApiUtility.getReleaseCode();
        String manfacturer = DeviceUtility.getManufacturer();
        String model = DeviceUtility.getModel();

        double density = screenUtility.getDensity();
        double pixelHeight = screenUtility.getPixelHeight();
        double pixelWidth = screenUtility.getPixelWidth();
        double dpHeight = screenUtility.getDpHeight();
        double dpWidth = screenUtility.getDpWidth();

        String out = "API: " + level;
        out += "\nRelease: " + resVersion;
        out += "\nModel: " + model;
        out += "\nManufacturer: " + manfacturer;
        out += "\n\nDensity: " + density;
        out += "\n\nWidth (px): " + pixelWidth;
        out += "\nHeight (px): " + pixelHeight;
        out += "\nWidth (dp): " + dpWidth;
        out += "\nHeight (dp): " + dpHeight;


        outputText.setText(out);
    }
}
