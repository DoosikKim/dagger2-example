package github.com.doosikkim.app2.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by 1100038 on 2017. 1. 18..
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
