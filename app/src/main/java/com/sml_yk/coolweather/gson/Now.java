package com.sml_yk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sml_yk on 2016/12/27.
 */

public class Now {
    @SerializedName("tem")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
