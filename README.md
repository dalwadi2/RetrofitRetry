# RetrofitRetry

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RetrofitRetry-blue.svg?style=flat)](https://android-arsenal.com/details/1/5739)
[![API](https://img.shields.io/badge/API-14%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![](https://jitpack.io/v/dalwadi2/RetrofitRetry.svg)](https://jitpack.io/#dalwadi2/RetrofitRetry/v1.1)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.dalwadi2/retrofit-retry/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.dalwadi2/retrofit-retry)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## Releases:

#### Current release: 1.2.0.

You can see all the library releases [here](https://github.com/dalwadi2/RetrofitRetry/releases).

How to use this lib in your project: 
## Gradle
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
	compile 'com.github.dalwadi2:RetrofitRetry:v1.2'
}
```
or

```sh
compile 'io.github.dalwadi2:retrofit-retry:1.2.0'
```
## Maven
```sh
<dependency>
    <groupId>io.github.dalwadi2</groupId>
    <artifactId>retrofit-retry</artifactId>
    <version>1.2.0</version>
</dependency>
```
## Sample

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
> PS: If you are using this library, you don't have to add extra Retrofit 2.0 Repository.
I already added bellow Repos in this Library.
```sh
compile 'com.squareup.retrofit2:retrofit:2.2.0'
compile 'com.squareup.retrofit2:converter-gson:2.0.2'
```
## proguard-rules.pro
```
-dontnote retrofit2.Platform
-dontwarn retrofit2.Platform$Java8
-keepattributes Signature
-keepattributes Exceptions
-dontwarn okio.**
```
### Todos

* [ ] Put listener for Every Retries
* [ ] Put method for Each fail Response

> Feel free to Contribute

## License

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
