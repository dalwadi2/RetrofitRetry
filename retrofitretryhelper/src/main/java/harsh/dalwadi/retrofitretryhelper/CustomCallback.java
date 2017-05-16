package harsh.dalwadi.retrofitretryhelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public interface CustomCallback<T> extends Callback<T> {
    void onFailResponse(int errorCode, Call<T> call, Response<T> response);
}
