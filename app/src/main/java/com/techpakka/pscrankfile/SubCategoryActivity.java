package com.techpakka.pscrankfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SubCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        Toast.makeText(this, getIntent().getStringExtra("category_name"), Toast.LENGTH_SHORT).show();
    }
}
