package com.srz.moudle.presenter;

import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;
import com.srz.net.base.BasePresenter;
import com.srz.net.base.BaseView;

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
 * 2019/12/17 17:06 星期二
 **/
public interface HomeContract  {

    interface  View extends BaseView<HomePresenters> {

        void setResult(BeautyEntity postInfo);

        void setBeautyResult(BeautyEntity postInfo);

        void setConfigList(ConfigListEntity postInfo);
        void setError(String error);

    }

    interface HomePresenters extends BasePresenter {
        void getConfigList(Map<String,String> map);
        void postHeader(RequestBody requestBody);

    }
}
