package com.example.rita.newsappwithfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link ListFragment} subclass.
 */
public class NewsListFragment extends ListFragment {

    interface Listener{
        // this method has to be implemented
        //by any activity using the NewsListFragment
        void itemClicked(long id);
    }

    private Listener mListener;

    public NewsListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // create an array adapter for the headlines.
        // the context of the fragment is provided by the inflater.
        ArrayAdapter<String> headlinesAdapter = new ArrayAdapter<String>
                        (inflater.getContext(),
                        android.R.layout.simple_list_item_1,
                        News.getHeadlines());

        setListAdapter(headlinesAdapter); //from the ListFragment class

        // inflate the layout for this fragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    //is called when the NewsListFragment
    // is attached to an activity (i.e.the context)
    public void onAttach (Context context){
        super.onAttach(context);
        // sets the NewsListFragment's mListener
        // to the listener as defined in the context activity
        this.mListener = (Listener)context;
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView, int position, long id){
        if (mListener != null){
            // id is the ID of the news item clicked on
            mListener.itemClicked(id);
        }
    }

}
