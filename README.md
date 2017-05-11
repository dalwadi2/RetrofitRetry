# RetrofitRetry

[![](https://jitpack.io/v/dalwadi2/RetrofitRetry.svg)](https://jitpack.io/#dalwadi2/RetrofitRetry)

How to use this lib in your project: 
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```sh
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency
```sh

	dependencies {
		compile 'com.github.User:Repo:Tag'
	}
```

### Todos

 - Put listener for Every Retries

> Feel free to Contribute

### Sample

- First you have to Create Object of your ApiInterface like below : 
```sh
ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);
                Call<Sample> responseCall = apiService.VIDEO_NOTY_CALL();
```
- After then you have to Implement this method (Here Default Retry Count is 0)
```sh
 RetryHelper.enqueueRetry(responseCall, 3, new CustomCallback<Sample>() {
                    @Override
                    public void onFailResponse() {
                        // Here you get the fail callback
                        Toast.makeText(MainActivity.this, "Failed After Retry", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(Call<Sample> call, Response<Sample> response) {
                        // Code of Success
                    }

                    @Override
                    public void onFailure(Call<Sample> call, Throwable t) {
                        // Code of Failure
                    }
                });
```

License
--------

    Copyright 2017 Harsh Dalwadi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
