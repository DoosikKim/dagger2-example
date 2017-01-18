package github.com.doosikkim.app2.component;

import dagger.Component;
import github.com.doosikkim.app2.MainActivity;
import github.com.doosikkim.app2.module.AppModule;
import github.com.doosikkim.app2.module.HelloModule;
import github.com.doosikkim.app2.scopes.UserScope;

/**
 * Created by 1100038 on 2017. 1. 17..
 */

@UserScope
@Component(modules = {AppModule.class, HelloModule.class})
public interface HelloComponent {
    void inject(MainActivity activity);
}
