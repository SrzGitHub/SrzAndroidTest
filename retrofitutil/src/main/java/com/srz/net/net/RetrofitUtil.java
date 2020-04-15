package com.srz.net.net;

import com.srz.net.interfaces.IHttp;
import com.srz.net.interfaces.NetWorkCallback;

import java.io.IOException;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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
 * 2019/12/17 15:37 星期二
 **/
public class RetrofitUtil implements IHttp {

    private static RetrofitUtil instance;

    private final Retrofit retrofit;


    private RetrofitUtil() {
        retrofit = new Retrofit.Builder()
                .client(OkhttpUtil.getInstance().getOkHttpClient())
                .baseUrl("http://192.168.1.171:8888/")
//
                //请求结果使用Rxjava进行处理，主要是把请求接口返回的Call对象转化为Observable对象
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                //响应结果原本是String类型，retrofit默认使用Gson进行解析，封装成对象
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static RetrofitUtil getInstance() {
        if (instance == null)
            synchronized (RetrofitUtil.class){
                instance = new RetrofitUtil();
            }

        return instance;
    }


    @Override
    public <T> void sendObservableAsyn(Observable<T> observable, final NetWorkCallback<T> callback) {
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<T>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(T data) {

                        callback.success(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.failure(e.getMessage());

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public <T> void sendObservableSynch(Observable<T> observable, final NetWorkCallback<T> callback) {


    }

    @Override
    public <T> void uploadFiles(Observable<T> observable, NetWorkCallback<T> callback) {

    }

    @Override
    public <T> void downloadFile(Observable<T> observable, NetWorkCallback<T> callback) {

    }

    @Override
    public <T> void sendCallAsyn(Call<T> call, final NetWorkCallback<T> callback) {
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {


                callback.success(response.body());
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.failure(t.getMessage());
            }
        });
    }

    @Override
    public <T> void sendCallSynch(Call<T> call, NetWorkCallback<T> callback) {

        try {
            Response<T> execute = call.execute();
            callback.success(execute.body());
        } catch (IOException e) {
            callback.failure(e.getMessage());
            e.printStackTrace();
        }


    }

    @Override
    public <T> T create(Class<T> ser) {
        return retrofit.create(ser);
    }


}
