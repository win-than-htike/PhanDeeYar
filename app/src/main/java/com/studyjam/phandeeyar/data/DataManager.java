package com.studyjam.phandeeyar.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.studyjam.phandeeyar.data.voc.EventVO;
import com.studyjam.phandeeyar.utils.JsonUtils;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by winthanhtike on 2/28/16.
 */
public class DataManager  {

    private static DataManager objInstance;

    private List<EventVO> eventList;

    private DataManager(){}

    public static DataManager getInstance(){

        if (objInstance == null){

            objInstance = new DataManager();

        }

        return objInstance;

    }

    public void loadEventList(){

        Gson gson = new Gson();

        try {

            String dummyEventList = JsonUtils.getInstance().loadDummyData("event_list.json");
            Type listType = new TypeToken<List<EventVO>>(){}.getType();
            eventList = gson.fromJson(dummyEventList, listType);

        } catch (IOException e) {

            e.printStackTrace();

        } catch (JSONException e) {

            e.printStackTrace();

        }

    }

    public List<EventVO> getEventList(){

        return eventList;

    }

}
