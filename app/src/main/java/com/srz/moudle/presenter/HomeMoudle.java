package com.srz.moudle.presenter;

import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;
import com.srz.moudle.base.BaseMoudle;
import com.srz.net.interfaces.NetWorkCallback;

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
public interface HomeMoudle extends BaseMoudle {



    void postBeauty(RequestBody requestBody, NetWorkCallback<BeautyEntity> callback);
    void postBeautyHeader(RequestBody requestBody, NetWorkCallback<BeautyEntity> callback);

    void getConfigList(Map<String,String> map, NetWorkCallback<RequestBody> callback);
}
