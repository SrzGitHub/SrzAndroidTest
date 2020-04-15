package com.srz.moudle.presenter;

import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;
import com.srz.net.interfaces.NetWorkCallback;


import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;

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
 * 2019/12/17 16:56 星期二
 **/
public class HomeImpl implements HomeMoudle {




    private Map<String,String> getMap(){
        Map<String,String> map =new HashMap<>();
        map.put("Content-Type","application/json;charset=utf-8");
        map.put("mac","A89CED82308C");
        map.put("token","eyJhbGciOiJIUzI1NiJ9.eyJhdXRob3JpdGllcyI6IuinkuiJsuWIl-ihqCIsInN1YiI6IjE4MjEwNDcwMjcxIiwiZXhwIjoxNTc3MDYzODEwfQ.sPp1OR4Mirg1zN_Wf3vZU6SX1JowWtozqN5Pjgt2n04");
        map.put("filmId","123456");
        map.put("userId","18210470271");
        return map;
    }




    @Override
    public void postBeauty(RequestBody requestBody, NetWorkCallback<BeautyEntity> callback) {

        iHttp.sendObservableAsyn(apiServer.postBeauty("cmsClient/content/getContentList",requestBody),callback);
    }
    @Override
    public void postBeautyHeader(RequestBody requestBody, NetWorkCallback<BeautyEntity> callback) {

        iHttp.sendObservableAsyn(apiServer.postBeautyHeader(getMap(),requestBody),callback);
    }



    @Override
    public void getConfigList(Map<String, String> map, NetWorkCallback<RequestBody> callback) {

        iHttp.sendObservableAsyn(apiServer.getConfigList(map),callback);
    }

}
