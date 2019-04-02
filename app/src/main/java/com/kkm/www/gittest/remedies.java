package com.kkm.www.gittest;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class remedies extends AppCompatActivity {

    ImageView bud_image;
    ImageView stem_image;

    public void bud_remedy(View view)
    {
        Intent intent=new Intent(this,bud_remedies.class);
        startActivity(intent);
    }

    public void stem_remedy(View view)
    {
        Intent intent=new Intent(this,stem_remedies.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedies);
        bud_image=(ImageView)findViewById(R.id.bud);
        stem_image=(ImageView)findViewById(R.id.stem);
    }
}
