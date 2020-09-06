package com.example.startapp007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<ClassFromJsonSchema>> call = apiService.getClassFromJsonSchemas();
        call.enqueue(new Callback<List<ClassFromJsonSchema>>() {
            @Override
            public void onResponse(Call<List<ClassFromJsonSchema>> call, Response<List<ClassFromJsonSchema>> response) {
            }

            @Override
            public void onFailure(Call<List<ClassFromJsonSchema>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }
        });
    }
}