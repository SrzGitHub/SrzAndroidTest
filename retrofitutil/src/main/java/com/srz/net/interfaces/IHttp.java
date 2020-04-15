package com.srz.net.interfaces;

import io.reactivex.Observable;
import retrofit2.Call;

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
 * 2019/12/17 15:57 星期二
 **/
public interface IHttp {


    <T> void sendObservableAsyn(Observable<T> observable, final NetWorkCallback<T> callback);

    <T> void sendObservableSynch(Observable<T> observable, final NetWorkCallback<T> callback);

    <T> void uploadFiles(Observable<T> observable,final NetWorkCallback<T> callback);
    <T> void downloadFile(Observable<T> observable,final NetWorkCallback<T> callback);
    <T> void sendCallAsyn(Call<T> observable, final NetWorkCallback<T> callback);

    <T> void sendCallSynch(Call<T> observable, final NetWorkCallback<T> callback);



    <T> T create(Class<T> servert);





}
