package github.com.doosikkim.daggertestproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject @Named("cached") OkHttpClient mOkHttpClient;
    @Inject @Named("non_cached") OkHttpClient mOkHttpClientNonCache;
    @Inject SharedPreferences sharedPreferences;
    @Inject Retrofit mRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication)getApplication()).getNetComponent().inject(this);

    }
}
