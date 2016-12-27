package com.sml_yk.coolweather.gson;

/**
 * Created by sml_yk on 2016/12/27.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
