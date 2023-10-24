package com.example.lab_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity{
    EditText input_color;
    Button button;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        input_color=findViewById(R.id.input_color);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputColor=input_color.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("InputColor",inputColor);
                startActivity(intent);
            }
        });
    }
}
