package me.ashif.mobileinventory.di.modules;

import android.content.Context;
import android.util.Log;

import java.io.File;

import dagger.Module;
import dagger.Provides;
import me.ashif.mobileinventory.api.InventoryService;
import me.ashif.mobileinventory.app.Constants;
import me.ashif.mobileinventory.di.scopes.PerApp;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by Ashif on 5/4/17,April,2017
 * TechJini Solutions
 * Banglore,India
 */

@Module(includes = ContextModule.class)
public class InventoryAppModule {

    @Provides
    @PerApp
    public InventoryService providesInventoryService(Retrofit retrofit) {
        return retrofit.create(InventoryService.class);
    }

    @Provides
    @PerApp
    public Retrofit providesrRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .baseUrl(Constants.BASE_URL)
                .build();
    }

    @Provides
    @PerApp
    public OkHttpClient providesOkHttpClient(HttpLoggingInterceptor loggingInterceptor, Cache cache) {
        return new
                OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .cache(cache)
                .build();
    }

    @Provides
    @PerApp
    public HttpLoggingInterceptor providesHttpLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.d("HTTP_LOGS", message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return interceptor;

    }

    @Provides
    @PerApp
    public Cache providesCache(Context context) {
        File cacheFile = new File(context.getCacheDir(), "okhttp_cache");
        return new Cache(cacheFile, 10 * 1000 * 1000);
    }
}
