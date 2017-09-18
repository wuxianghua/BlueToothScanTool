package com.org.bluetoothscantool.http;

import com.org.bluetoothscantool.model.ServiceMapInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/9/1/001.
 */

public interface GetVersionByMapIdService {
    String BASE_URL = "http://cindy.palmap.cn";
    @GET("/webapi/BeaconInfo/GetVersionsByMapId/{mapId}")
    Call<List<ServiceMapInfo>> getVersionByMapId(@Path("mapId") long mapId);
}
