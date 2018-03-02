package com.example.example.buttonup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("Activity 2");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnOpenActivity3:
                Intent intent = new Intent(this,Activity3.class);
                /*Bundle bun = new Bundle();
                onSaveInstanceState(bun);
                intentPlatos.putExtras(bun);*/
                startActivity(intent);

                break;

        }

    }
}
