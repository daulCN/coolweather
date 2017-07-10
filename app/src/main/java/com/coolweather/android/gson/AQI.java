package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Daul on 2017/7/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;

        @SerializedName("qlty")
        public String qualityLevel;
    }
}
