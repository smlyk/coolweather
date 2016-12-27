package com.sml_yk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sml_yk on 2016/12/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;//注解的方式让JSON字段和java字段之间建立映射关系(方便看出字段的含义)

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
