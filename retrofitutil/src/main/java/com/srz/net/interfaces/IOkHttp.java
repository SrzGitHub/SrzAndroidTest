package com.srz.net.interfaces;

import java.util.Map;

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
public interface IOkHttp {


    <T> void sendPostAsyn(String url, Map<String,String> parameter, final NetWorkCallback<T> callback);

    <T> void sendPostSynch(Observable<T> observable, final NetWorkCallback<T> callback);


    <T> void sendGetAsyn(Observable<T> observable, final NetWorkCallback<T> callback);

    <T> void sendGetSynch(Observable<T> observable, final NetWorkCallback<T> callback);






}
