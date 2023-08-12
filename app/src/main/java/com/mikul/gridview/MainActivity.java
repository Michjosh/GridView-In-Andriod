package com.mikul.gridview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    private GridView gridView;
    private ImageAdapter adapter;

    private int[] imageResIds = {
            R.drawable.zainab,
            R.drawable.sew,
            R.drawable.man2,
            R.drawable.tinu,
            R.drawable.michael,
            R.drawable.sam
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        adapter = new ImageAdapter(this, imageResIds);
        gridView.setAdapter(adapter);
    }
}
