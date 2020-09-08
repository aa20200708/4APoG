package com.example.startapp007;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("users")
    // getClassFromJsonSchemas - что-то тут надо переименовать
    Call<List<ClassFromJsonSchema>> getClassFromJsonSchemas();
}
