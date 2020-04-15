package com.srz.moudle.presenter;

import com.srz.moudle.ResponseConvert;
import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;
import com.srz.net.interfaces.NetWorkCallback;
import com.srz.net.util.SLog;

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
 * 2019/12/17 17:08 星期二
 **/
public class HomePresenter implements HomeContract.HomePresenters {


    private HomeContract.View homeView;
    private HomeMoudle homeMoudle;

    public HomePresenter(HomeContract.View homeView) {
        this.homeView = homeView;
        homeView.setPresenter(this);
        homeMoudle =new HomeImpl();
    }


    @Override
    public void start(RequestBody requestBody) {

        homeMoudle.postBeauty(requestBody, new NetWorkCallback<BeautyEntity>() {
            @Override
            public void success(BeautyEntity data) {
                homeView.setResult(data);
            }

            @Override
            public void failure(String error) {
                homeView.setError(error);
            }
        });
    }

    @Override
    public void getConfigList(Map<String, String> map) {
        homeMoudle.getConfigList(map, new NetWorkCallback<RequestBody>() {
            @Override
            public void success(RequestBody data) {


                ResponseConvert responseConvert = ResponseConvert.create();


//                homeView.setConfigList((ConfigListEntity) data);
            }

            @Override
            public void failure(String error) {
                homeView.setError(error);
            }
        });
    }



    @Override
    public void postHeader(RequestBody requestBody) {
        homeMoudle.postBeautyHeader(requestBody, new NetWorkCallback<BeautyEntity>() {
            @Override
            public void success(BeautyEntity data) {
                homeView.setBeautyResult((BeautyEntity) data);
            }

            @Override
            public void failure(String error) {
                homeView.setError(error);
            }
        });
    }



}
