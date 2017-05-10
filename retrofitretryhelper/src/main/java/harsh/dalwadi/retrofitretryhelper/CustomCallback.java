package harsh.dalwadi.retrofitretryhelper;

import retrofit2.Callback;

public interface CustomCallback<T> extends Callback<T> {
    void onFailResponse();
}
