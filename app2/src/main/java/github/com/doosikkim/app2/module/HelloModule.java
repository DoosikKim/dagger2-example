package github.com.doosikkim.app2.module;

import android.app.Application;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import github.com.doosikkim.app2.R;
import github.com.doosikkim.app2.scopes.UserScope;

/**
 * Created by 1100038 on 2017. 1. 17..
 */

@Module
public class HelloModule {

    String name;

    public HelloModule(String name) {
        this.name = name;
    }

    @Provides
    @UserScope
    @Named("hello")
    String providesHelloString(Application application) {
        return application.getResources().getString(R.string.hello);
    }

    @Provides
    @UserScope
    @Named("name")
    String providesNameString() {
        return name;
    }

    @Provides
    @UserScope
    @Named("greet")
    String providesGreetString() {
        return "How are you?";
    }
}
