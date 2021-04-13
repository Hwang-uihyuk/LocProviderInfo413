package com.example.locproviderinfo413;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mtxtInfo;
    LocationManager locManager;
    List<String> locProviderList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtInfo = findViewById(R.id.textInfo);

        locManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locProviderList = locManager.getAllProviders();
        mtxtInfo.setText("");
        for(String locProvider : locProviderList){
            mtxtInfo.append("Loc. Provider: " + locProvider + "\n");
            mtxtInfo.append("Enable: " + locManager.isProviderEnabled(locProvider)+"\n\n");
        }
    }
}