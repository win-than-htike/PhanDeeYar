package com.studyjam.phandeeyar.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.studyjam.phandeeyar.R;
import com.studyjam.phandeeyar.data.DataManager;
import com.studyjam.phandeeyar.data.voc.EventVO;
import com.studyjam.phandeeyar.view.ViewItemEvent;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class EventListFragment extends Fragment {

    public EventListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_event_list, container, false);

        LinearLayout llEventRoot = (LinearLayout)rootView.findViewById(R.id.ll_event_root);

        List<EventVO> eventList = DataManager.getInstance().getEventList();

        for (EventVO event : eventList){

            ViewItemEvent viEvent = (ViewItemEvent) inflater.inflate(R.layout.view_item_event,container,false);
            viEvent.setData(event);
            llEventRoot.addView(viEvent);

        }

        return rootView;
    }
}
