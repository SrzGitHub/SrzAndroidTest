package com.srz.moudle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.srz.moudle.entity.BeautyEntity;
import com.srz.moudle.entity.ConfigListEntity;
import com.srz.moudle.presenter.HomeContract;
import com.srz.moudle.presenter.HomePresenter;
import com.srz.net.util.RequestBodyUtil;

import java.util.HashMap;
import java.util.Map;

import okhttp3.RequestBody;

public class MainActivity extends AppCompatActivity implements HomeContract.View {


    private HomeContract.HomePresenters homePresenters;

    private Map<String,String> map =new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homePresenters =new HomePresenter(this);


        map.put("page","1");
        map.put("size","10");
        map.put("columnId","69");
        RequestBody requestBody = RequestBodyUtil.getRequestBody(map);

        homePresenters.start(requestBody);
        homePresenters.postHeader(requestBody);
//



        map.clear();
        map.put("appId","123456");
        homePresenters.getConfigList(map);

    }

    @Override
    public void setResult(BeautyEntity postInfo) {

        Log.v("Srz","Beauty  "+postInfo.getMsg());

    }

    @Override
    public void setBeautyResult(BeautyEntity postInfo) {
        Log.v("Srz","BeautyHeder "+postInfo.getMsg());
    }



    @Override
    public void setConfigList(ConfigListEntity postInfo) {
        Log.v("Srz","confgList  "+postInfo.getMsg());
    }

    @Override
    public void setError(String error) {
        Log.v("Srz","Srz  >>>  "+error);
    }

    @Override
    public void setPresenter(HomeContract.HomePresenters homePresenters) {
        this.homePresenters=homePresenters;
    }

}
