package github.com.doosikkim.daggertestproject.component;

import javax.inject.Singleton;

import dagger.Component;
import github.com.doosikkim.daggertestproject.MainActivity;
import github.com.doosikkim.daggertestproject.module.AppModule;
import github.com.doosikkim.daggertestproject.module.NetModule;

/**
 * Created by 1100038 on 2017. 1. 12..
 */

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
