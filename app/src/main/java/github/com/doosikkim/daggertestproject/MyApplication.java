package github.com.doosikkim.daggertestproject;

import android.app.Application;

import github.com.doosikkim.daggertestproject.component.DaggerNetComponent;
import github.com.doosikkim.daggertestproject.component.NetComponent;
import github.com.doosikkim.daggertestproject.module.AppModule;
import github.com.doosikkim.daggertestproject.module.NetModule;

/**
 * Created by 1100038 on 2017. 1. 12..
 */

public class MyApplication extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
