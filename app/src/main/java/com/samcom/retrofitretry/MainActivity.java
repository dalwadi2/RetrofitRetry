package com.samcom.retrofitretry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.samcom.retrofitretry.network.ApiClient;
import com.samcom.retrofitretry.network.ApiInterface;
import com.samcom.retrofitretry.network.Progress;
import com.samcom.retrofitretry.network.response.Sample;

import harsh.dalwadi.retrofitretryhelper.CustomCallback;
import harsh.dalwadi.retrofitretryhelper.RetryHelper;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Progress progress;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new Progress(this);

        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                progress.createDialog(false);
                progress.DialogMessage("Loading ...");
                progress.showDialog();

                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);
                Call<Sample> responseCall = apiService.VIDEO_NOTY_CALL();

                // Now you can set your own success code for more customization
                RetryHelper.setSuccessCode(200);

                RetryHelper.enqueueRetry(responseCall, 3, new CustomCallback<Sample>() {
                    @Override
                    public void onFailResponse(int errorCode, Call<Sample> call, Response<Sample> response) {
                        progress.hideDialog();
                        Log.e(TAG, "onFailResponse() called with: errorCode = [" + errorCode + "], call = [" + call + "], response = [" + response + "]");
                        Toast.makeText(MainActivity.this, "Failed After Retry", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(Call<Sample> call, Response<Sample> response) {
                        progress.hideDialog();
                        if (!response.body().isError()) {
                            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Sample> call, Throwable t) {
                        progress.hideDialog();
                        Log.e(TAG, "onFailure: " + t.getMessage());
                        Toast.makeText(MainActivity.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
                    }
                });

        }
    }
}
