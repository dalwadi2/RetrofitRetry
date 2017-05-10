package harsh.dalwadi.retrofitretryhelper;

import retrofit2.Call;
import retrofit2.Response;

public class RetryHelper {
    private static final int DEFAULT_RETRIES = 0;
    private static final int SUCCESS = 200;

    public static <T> void enqueueRetry(Call<T> call, final int retryCount, final CustomCallback<T> callback) {
        call.enqueue(new RetryCallback<T>(call, retryCount) {
            @Override
            public void onFinalFail() {
                callback.onFailResponse();
            }

            @Override
            public void onFinalResponse(Call<T> call, Response<T> response) {
                callback.onResponse(call, response);
            }

            @Override
            public void onFinalFailure(Call<T> call, Throwable t) {
                callback.onFailure(call, t);
            }
        });
    }

    public static <T> void enqueueRetry(Call<T> call, final CustomCallback<T> callback) {
        enqueueRetry(call, DEFAULT_RETRIES, callback);
    }

    static boolean isCallSuccess(Response response) {
        return response.code() == SUCCESS;
    }


}
