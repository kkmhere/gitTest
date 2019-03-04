package com.kkm.www.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tamil_Nadu_short extends AppCompatActivity {
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil__nadu_short);

        b1 = findViewById(R.id.chow1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityGreen();
            }
        });
    }

    public void openActivityGreen() {

        Intent intent = new Intent(this, Green.class);
        startActivity(intent);
    }
}
