package com.org.bluetoothscantool.di;

import android.content.Intent;
import com.google.gson.Gson;
import com.org.bluetoothscantool.BaseActivity;
import com.org.bluetoothscantool.Mark;
import com.org.bluetoothscantool.model.BeaconInfo;
import com.org.bluetoothscantool.widget.ProgressDialogDelegate;
import com.palmaplus.nagrand.view.MapOptions;
import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/9/6/006.
 */
@Module
public class ActivityModule {

    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    BaseActivity activity() {
        return this.activity;
    }


    @Provides
    Gson providesGson() {
        return new Gson();
    }

    @Provides
    ArrayList<String> providesArrayListKey() {
        return new ArrayList<>();
    }

    @Provides
    ArrayList<BeaconInfo> providesArrayListBea() {
        return new ArrayList<>();
    }

    @Provides
    MapOptions providesMapOptions() {
        return new MapOptions();
    }

    @Provides
    Intent providesIntent() {
        return new Intent();
    }

    @Provides
    ArrayList<Mark> providesArrayListMark() {
        return new ArrayList<>();
    }

    @Provides
    ProgressDialogDelegate providesDelegate(BaseActivity activity) {
        return new ProgressDialogDelegate(activity, "提示", "加载中...");
    }

}
