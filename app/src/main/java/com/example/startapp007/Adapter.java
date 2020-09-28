package com.example.startapp007;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.*;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<MainInfo> list;

    public Adapter(Context context, List<MainInfo> list) {
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
        MainInfo roster = list.get(position);

        holder.textId.setText(String.valueOf(roster.getId()));
        holder.textName.setText(roster.getName());
        holder.textUsername.setText(roster.getUsername());
        holder.textCompanyName.setText(roster.getCompany().getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName, textUsername, textCompanyName;

        public ViewHolder(View itemView) {
            super(itemView);

            textId = itemView.findViewById(R.id.main_id);
            textName = itemView.findViewById(R.id.main_name);
            textUsername = itemView.findViewById(R.id.main_username);
            textCompanyName = itemView.findViewById(R.id.company_name);

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    Class destinationActivity = NextActivity.class;
                    Intent NextActivity = new Intent(context, destinationActivity);
                    context.startActivity(NextActivity);
                }

//                @Override
//                public void onClick(View view) {
////                    Intent NextActivity = new Intent();
////                    startActivity(NextActivity);
//                }

            });
        }
    }

}