package github.com.doosikkim.app2.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import github.com.doosikkim.app2.scopes.UserScope;

/**
 * Created by 1100038 on 2017. 1. 17..
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @UserScope
    Application providesApplication() {
        return mApplication;
    }
}
