package com.srz.net.net;

import android.util.Log;

import com.srz.net.interfaces.IOkHttp;
import com.srz.net.interfaces.NetWorkCallback;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * //                    .::::.
 * //                  .::::::::.
 * //                 :::::::::::  FUCK YOU
 * //             ..:::::::::::'
 * //           '::::::::::::'
 * //             .::::::::::
 * //        '::::::::::::::..
 * //             ..::::::::::::.
 * //           ``::::::::::::::::
 * //            ::::``:::::::::'        .:::.
 * //           ::::'   ':::::'       .::::::::.
 * //         .::::'      ::::     .:::::::'::::.
 * //        .:::'       :::::  .:::::::::' ':::::.
 * //       .::'        :::::.:::::::::'      ':::::.
 * //      .::'         ::::::::::::::'         ``::::.
 * //  ...:::           ::::::::::::'              ``::.
 * // ```` ':.          ':::::::::'                  ::::..
 * //                    '.:::::'                    ':'````..
 * ===========================================================
 * You may think you know what the following code does.
 * But you dont. Trust me.
 * Fiddle with it, and youll spend many a sleepless
 * night cursing the moment you thought youd be clever
 * enough to "optimize" the code below.
 * Now close this file and go play with something else.
 * <p>
 * 2019/12/18 12:37 星期三
 **/
public class OkhttpUtil implements IOkHttp {

    private  static OkHttpClient.Builder httpClientBuilder;

    private static OkhttpUtil okhttpUtil;
    private HttpLoggingInterceptor loggingInterceptor;


    private long readTimOut =10;
    private long writeTimeOut=10;
    private long connectTimeout =10;

    public  static OkhttpUtil getInstance(){
        if (okhttpUtil==null){
          synchronized (OkhttpUtil.class){
              okhttpUtil =new OkhttpUtil();
          }
        }

        return okhttpUtil;
    }


    public  OkHttpClient getOkHttpClient() {
        loggingInterceptor = new HttpLoggingInterceptor(new HttpLogInterceptor());
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        httpClientBuilder = new OkHttpClient.Builder();

        httpClientBuilder.addInterceptor(loggingInterceptor);

        HttpInterceptor httpInterceptor = new HttpInterceptor();

        httpInterceptor.setHeader(httpInterceptor.getMap());
        httpClientBuilder.addInterceptor(httpInterceptor);
        httpClientBuilder
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(readTimOut, TimeUnit.SECONDS)
                .writeTimeout(writeTimeOut, TimeUnit.SECONDS);
        return httpClientBuilder.build();
    }


    @Override
    public <T> void sendPostAsyn(String url, Map<String, String> parameter, NetWorkCallback<T> callback) {

    }

    @Override
    public <T> void sendPostSynch(Observable<T> observable, NetWorkCallback<T> callback) {

    }

    @Override
    public <T> void sendGetAsyn(Observable<T> observable, NetWorkCallback<T> callback) {

    }

    @Override
    public <T> void sendGetSynch(Observable<T> observable, NetWorkCallback<T> callback) {

    }
}
