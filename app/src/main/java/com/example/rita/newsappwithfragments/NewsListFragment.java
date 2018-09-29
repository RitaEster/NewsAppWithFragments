package com.example.rita.newsappwithfragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * A simple {@link ListFragment} subclass.
 */
public class NewsListFragment extends ListFragment {

    public NewsListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // create an array adapter for the headlines.
        // the context of a fragment is provided by the inflater.
        ArrayAdapter<String> headlinesAdapter = new ArrayAdapter<String>
                (inflater.getContext(), android.R.layout.simple_list_item_1,News.getHeadlines());

        setListAdapter(headlinesAdapter);

        // inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_news_list, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
