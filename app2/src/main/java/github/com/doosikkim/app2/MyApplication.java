package github.com.doosikkim.app2;

import android.app.Application;

import github.com.doosikkim.app2.component.DaggerHelloComponent;
import github.com.doosikkim.app2.component.HelloComponent;
import github.com.doosikkim.app2.module.AppModule;
import github.com.doosikkim.app2.module.HelloModule;

/**
 * Created by 1100038 on 2017. 1. 17..
 */

public class MyApplication extends Application {

    private HelloComponent mHelloComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mHelloComponent = DaggerHelloComponent.builder()
                .appModule(new AppModule(this))
                .helloModule(new HelloModule("HongGilDong"))
                .build();
    }

    public HelloComponent getHelloComponent() {return mHelloComponent;}
}
