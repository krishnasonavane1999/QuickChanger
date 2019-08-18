package com.example.quickchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);

        radioGroup = findViewById(R.id.R_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {

                switch (checkedID){

                    case R.id.Red_button:
                        layout.setBackgroundColor(Color.parseColor("#E71C23"));
                        break;

                    case R.id.Green_button:
                        layout.setBackgroundColor(Color.parseColor("#019031"));
                        break;

                    case R.id.Blue_button:
                        layout.setBackgroundColor(Color.parseColor("#3C40C6"));
                        break;
                    case R.id.Dark:
                        layout.setBackgroundColor(Color.parseColor("#616C6F"));

                }
            }
        });


    }
}
