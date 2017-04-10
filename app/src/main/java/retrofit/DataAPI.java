package retrofit;

import bean.CityM;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Blessed-tec1 on 2017/4/10.
 */

public interface DataAPI {

    @POST("citys_data.rm")
    Call<CityM> getCity();
}
