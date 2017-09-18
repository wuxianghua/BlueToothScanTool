package com.org.bluetoothscantool.http;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/8/17/017.
 */

public interface DeleteBeaconsInfoService {
    String BASE_URL = "http://cindy.palmap.cn";
    @GET("/webapi/BeaconInfo/GetDeleteBeaconInfo/{minor}")
    Call<HttpResult> deleteBeaconsInfo(@Path("minor") long minor);
}
