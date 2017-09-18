package com.org.bluetoothscantool.di;

import com.org.bluetoothscantool.BaseActivity;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/6/006.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity activity);
}
