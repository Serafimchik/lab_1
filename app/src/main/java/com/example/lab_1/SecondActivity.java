package com.example.lab_1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.back);
        Intent intent=getIntent();
        String inputColor=intent.getStringExtra("InputColor");
        switch (inputColor){
            case "black":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.black));
                break;
            case "white":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                break;
            case "yellow":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
                break;
            case "red":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case "blue":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.blue));
                break;
            case "pink":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.pink));
                break;
            case "brown":
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.brown));
                break;
            default:
                Toast.makeText(getApplicationContext(),"wrong color", Toast.LENGTH_LONG).show();
        }
    }
}
