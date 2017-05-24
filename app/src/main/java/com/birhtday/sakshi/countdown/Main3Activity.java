package com.birhtday.sakshi.countdown;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int year = 2017, month = 3, day = 4, hourOfDay = 6, minute = 27;


        Button next = (Button) findViewById(R.id.button3);

        next.setOnClickListener(this);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View view) {
        TextView tv = (TextView) findViewById(R.id.textView3);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Context context = getApplicationContext();
        CharSequence st = "Wait till the next hour!";

        int duration = Toast.LENGTH_SHORT;



        if (view.getId() == R.id.button3) {
            if (hour >= 0) {
                startActivity(new Intent(this, Main4Activity.class));
            }
            else {
                Toast toast = Toast.makeText(context, st, duration);
                toast.show();
            }
        }

    }
}