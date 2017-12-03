package com.baldboyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 98318 on 2017/12/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
