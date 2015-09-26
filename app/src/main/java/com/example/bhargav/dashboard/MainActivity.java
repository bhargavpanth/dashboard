package com.example.bhargav.dashboard;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends ActionBarActivity {

    private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> gyro = mSensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        List<Sensor> accln = mSensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null){
            Log.d("Yes","Gyro");
        }
        else{
            Log.d("No","Gyro");
        }
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null){
            Log.d("Yes","Acln");
        }
        else{
            Log.d("No","Acln");
        }

    }
}
