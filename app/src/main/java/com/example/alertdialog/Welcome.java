package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tv = findViewById(R.id.textView);
        Bundle bundle =getIntent().getExtras();
        String str1 = bundle.getString("Username");
        String str2 = bundle.getString("Password");
        tv.setText("Welcome " + str1 +"\n Your Password is:  "+str2);

    }
}