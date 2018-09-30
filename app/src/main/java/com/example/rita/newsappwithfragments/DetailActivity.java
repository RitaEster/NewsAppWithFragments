package com.example.rita.newsappwithfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String DETAIL_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DetailFragment detailFrag = (DetailFragment)getSupportFragmentManager().
                                     findFragmentById(R.id.fragment_detail);

        if (detailFrag != null){
            // the detailId comes from the intent extras
            int detailId = (int) getIntent().getExtras().get(DETAIL_ID);
            // detailId is passed on to the DetailFragment
            detailFrag.setDetailId(detailId);
        }
    }
}
