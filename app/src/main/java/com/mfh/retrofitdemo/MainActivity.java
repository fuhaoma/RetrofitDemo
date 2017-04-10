package com.mfh.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import bean.CityM;
import retrofit.BaseApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enqueue是进行异步请求
        //execute是进行同步请求
        BaseApi.getApiService().getCity().enqueue(new Callback<CityM>() {
            @Override
            public void onResponse(Call<CityM> call, Response<CityM> response) {
                if (response.isSuccessful()){
                    //请求成功参数，注意response中body只能取一次。
                    Log.i("AAA", "onResponse:"+response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<CityM> call, Throwable t) {

            }
        });

    }
}
