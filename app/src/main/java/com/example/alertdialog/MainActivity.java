package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText  editText1,editTex2;
    Button btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et1);
        editTex2 = findViewById(R.id.et2);
        btnsub = findViewById(R.id.button);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = editText1.getText().toString();
                String str2 = editTex2.getText().toString();

                if (str1.equals("utsav") && str2.equals("utsav")) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Are You Sure ?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Bundle bundle = new Bundle();
                            bundle.putString("Username",str1);
                            bundle.putString("Password",str2);
                            Intent intent = new Intent(MainActivity.this,Welcome.class);
                            intent.putExtras(bundle);
                            startActivity(intent);

                        }
                    }).setNegativeButton("Cancel",null);
                    AlertDialog a = alert.create();
                    a.show();
                }

            }
        });
    }
}