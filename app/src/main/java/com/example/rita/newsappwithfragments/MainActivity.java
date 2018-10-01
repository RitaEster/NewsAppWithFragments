package com.example.rita.newsappwithfragments;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
                          implements NewsListFragment.Listener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_detail_container);
        if (fragmentContainer != null){ //the app runs on a tablet
            // create a new the DetailFragment
            DetailFragment details = new DetailFragment();
            details.setDetailId((int)id);

            // prepare and commit the fragment transaction
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            // specify the changes
            // fill the fragment_detail_container with the fragment
            ft.replace(R.id.fragment_detail_container, details);
            // old fragment fades out, new fragment fades in
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            // add the fragment transaction to the back stack of the Android system
            ft.addToBackStack(null);
            // finish the transaction and apply the changes
            ft.commit();
        }
        else{
            //the app runs on a phone
            Intent intent = new Intent(this, DetailActivity.class);
            //the id is extra information for the DetailActivity
            intent.putExtra(DetailActivity.DETAIL_ID, (int)id);
            startActivity(intent);
        }
    }
}
