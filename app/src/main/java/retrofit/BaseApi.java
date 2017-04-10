package retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Blessed-tec1 on 2017/4/10.
 */

public abstract class BaseApi {
    public static final String API_SERVICE = "http://api.cbjts.net/api/";
    private static Retrofit mRetrofit;

    public static DataAPI getApiService() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(API_SERVICE)
                    //设置转化库,采用Gosn解析
                    .addConverterFactory(GsonConverterFactory.create())
                    //设置回调库，采用RxJava
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mRetrofit.create(DataAPI.class);
    }
}
