package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Daul on 2017/7/10.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("fl")
    public String feel;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
