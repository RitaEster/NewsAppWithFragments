package com.example.rita.newsappwithfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int detailId = 0; // fixed detailId for testing purposes

        DetailFragment detailFrag = (DetailFragment)getSupportFragmentManager().
                                     findFragmentById(R.id.fragment_detail);

        if (detailFrag != null){
            detailFrag.setDetailId(detailId);
        }
    }
}
