package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button click1,click2,click3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        click1 = findViewById(R.id.button4);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        click2 = findViewById(R.id.button5);
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });

        click3 = findViewById(R.id.button6);
        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });

    }

    public void openActivity5() {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent1 = new Intent(this, Main6Activity.class);
        startActivity(intent1);
    }

    public void openActivity7(){
        Intent intent2 = new Intent(this, Main7Activity.class);
        startActivity(intent2);
    }
}