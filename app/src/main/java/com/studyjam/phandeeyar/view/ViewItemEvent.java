package com.studyjam.phandeeyar.view;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.studyjam.phandeeyar.R;
import com.studyjam.phandeeyar.data.voc.EventVO;

/**
 * Created by winthanhtike on 2/28/16.
 */
public class ViewItemEvent extends CardView{

    private TextView tvEventTitle;
    private ImageView ivStockPhoto;
    private TextView tvEventDesc;
    private TextView tvEventTime;

    public ViewItemEvent(Context context) {
        super(context);
    }

    public ViewItemEvent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewItemEvent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        tvEventTitle = (TextView)findViewById(R.id.tv_event_title);
        ivStockPhoto = (ImageView)findViewById(R.id.iv_stock_photo);
        tvEventDesc = (TextView)findViewById(R.id.tv_event_desc);
        tvEventTime = (TextView)findViewById(R.id.tv_event_time);


    }

    public void setData(EventVO event){

        tvEventTitle.setText(event.getEventTitle());
        tvEventDesc.setText(event.getEventDesc());
        Glide.with(getContext())
                .load(event.getStockPhoto())
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .crossFade()
                .into(ivStockPhoto);
        tvEventTime.setText(event.getEventDateTime());

    }

}
