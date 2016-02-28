package com.studyjam.phandeeyar.data.voc;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by winthanhtike on 2/28/16.
 */
public class EventVO {

    private static final SimpleDateFormat eventTimeRecieve = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
    private static final SimpleDateFormat eventStartDateTime = new SimpleDateFormat("EEE MMM dd hh:mm:ss");
    private static final SimpleDateFormat eventEndDateTime = new SimpleDateFormat("EEE MMM dd hh:mm:ss");

    @SerializedName("event_title")
    private String eventTitle;

    @SerializedName("stock_photo")
    private String stockPhoto;

    @SerializedName("event_desc")
    private String eventDesc;

    @SerializedName("start_time")
    private String startTime;

    @SerializedName("end_time")
    private String endTime;

    public String getEventTitle() {
        return eventTitle;
    }

    public String getStockPhoto() {
        return stockPhoto;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getEventDateTime(){


        try {
            Date startDateTime = eventTimeRecieve.parse(startTime);
            Date endDateTime = eventTimeRecieve.parse(endTime);

            return eventStartDateTime.format(startDateTime)+" - "+ eventEndDateTime.format(endDateTime);

        } catch (ParseException e) {

            e.printStackTrace();

        }

        return "";

    }

}
