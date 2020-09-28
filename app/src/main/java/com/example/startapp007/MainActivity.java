package com.example.startapp007;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_item);

        RecyclerView recyclerView = findViewById(R.id.list);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<MainInfo>> call = apiService.getMainInfo();
        call.enqueue(new Callback<List<MainInfo>>() {
            @Override
            public void onResponse(Call<List<MainInfo>> call, Response<List<MainInfo>> response) {
                Adapter Adapter = new Adapter(MainActivity.this, response.body());
                recyclerView.setAdapter(Adapter);
            }

            @Override
            public void onFailure(Call<List<MainInfo>> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());

            }
        });

        initListener();

    }

    private void initListener() {

        Adapter.setOnItemClickListener((view, position) -> {

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            Article article = articles.get(position);
            Log.d(TAG, "onItemClick: GET ARTICLE DATA " + article.getSource().getName());
            intent.putExtra(Article.class.getSimpleName(), article);

            startActivity(intent);

            Log.d(TAG, "onItemClick: FILL all info and send to detail activity");

        });

    }


//       Button_f1.setOnClickListener(new View.OnClickListener() {
//
//        @Override
//        public void onClick(View view) {
//            //сохраняем в переменную, написанное в поле ввода
//            String text_of_letter = EditText_f1.getText().toString();
//
//            //передаем контекст в качестве аргумента (?)
//            Context context = MainActivity.this;
//
//            //получаем класс Acivity, которое желаем запустить ("место назначения")
//            Class destinationActivity = MainActivity2.class;
//
//            //создаем Intent (намерение)
//            Intent NextActivity = new Intent(context, destinationActivity);
//
//            //для передачи данных применяем метод putExtra(), где Intent.EXTRA_TEXT - ключ (можно,
//            // но не нужно, использовать любой), text_of_letter - связанное с ним значение
//            NextActivity.putExtra(Intent.EXTRA_TEXT, text_of_letter);
//
//            //вызываем метод startActivity для явного перехода или startActivityForResult для неявного
//            startActivity(NextActivity);
//        }
//    });
    }
