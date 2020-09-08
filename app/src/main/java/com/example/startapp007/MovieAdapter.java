package com.example.startapp007;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.*;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<ClassFromJsonSchema> list;

    public MovieAdapter(Context context, List<ClassFromJsonSchema> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ClassFromJsonSchema movie = list.get(position);

        holder.textId.setText(String.valueOf(movie.getId()));
        holder.textName.setText(movie.getName());
        holder.textUsername.setText(movie.getUsername());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName, textUsername;

        public ViewHolder(View itemView) {
            super(itemView);

            textId = itemView.findViewById(R.id.main_id);
            textName = itemView.findViewById(R.id.main_name);
            textUsername = itemView.findViewById(R.id.main_username);
        }
    }
}