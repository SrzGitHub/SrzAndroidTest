package com.srz.moudle;

import androidx.annotation.Nullable;

import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

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
 * 2019/12/18 11:31 星期三
 **/
public interface ApiServer {


    /**
     * 单个参数请求
     *
     * @param appid value
     * @return
     */
    @GET("bmsClient/api/configList")
    Observable<ConfigListEntity> beltparames(@Query("appId") @Nullable String appid);

    /**
     * 多个参数请求
     *
     * @param map key & value
     * @return
     */
    @GET("bmsClient/api/configList")
    Observable<RequestBody> getConfigList(@QueryMap Map<String, String> map);



    /**
     * 自定义url 多参数请求
     *
     * @param url    拼接地址
     * @param params 参数集合
     * @return
     */
    @GET()
    Observable<ConfigListEntity> beltUrlKeyValue(@Url String url, @QueryMap Map<String, String> params);


    /**
     * 带地址 header 多单数请求
     *
     * @param url
     * @param headerMap
     * @param params
     * @return
     */
    @GET()
    Observable<ConfigListEntity> beltMultiParames(@Url String url, @HeaderMap Map<String, String> headerMap, @QueryMap Map<String, String> params);


    @POST()
    Observable<BeautyEntity> postBeauty(@Url String url, @Body RequestBody requestBody);


    @POST("cmsClient/content/getContentList")
    Observable<BeautyEntity> postBeautyHeader(@HeaderMap Map<String, String> headerMap, @Body RequestBody requestBody);



    @Multipart
    @POST
    Observable<RequestBody> upLoadFile(@Url String url, @Part MultipartBody.Part body);

    @Multipart
    @POST()
    Observable<RequestBody> upLoadFiles(@Url String url, @PartMap Map<String, RequestBody> requestBodyMap);





}
