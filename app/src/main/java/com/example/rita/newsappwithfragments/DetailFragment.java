package com.example.rita.newsappwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    private int detailId;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            detailId = savedInstanceState.getInt("detailId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView(); // the fragment's root view

        if (view != null){
            // inflate the views of the fragment and set their values.

            TextView heading = (TextView) view.findViewById(R.id.text_Heading);
            heading.setText (News.getHeadline(detailId));

            TextView article = (TextView) view.findViewById(R.id.text_Article);
            article.setText (News.getArticle(detailId));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("detailId", detailId);
    }


    public void setDetailId(int id){
        detailId = id;
    }
}
