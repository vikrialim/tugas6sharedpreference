package com.example.user.tugas6sharedpreference;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class KontrolAdapter extends RecyclerView.Adapter<KontrolAdapter.ViewHolder> {
    Context context;
    List<KontrolModel> kontrolModels = new ArrayList<>();

    public KontrolAdapter(Context context, List<KontrolModel> kontrolModels) {
        this.context = context;
        this.kontrolModels = kontrolModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false); // menghubungkan ke layout
        ViewHolder holder = new ViewHolder(view); // deklarasi class ViewHolder di baris 46
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvNama.setText(kontrolModels.get(i).getNamaKampus());
        viewHolder.ivFoto.setImageResource(kontrolModels.get(i).getPicKampus());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, kontrolModels.get(i).getNamaKampus(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return kontrolModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.pic);
            tvNama = itemView.findViewById(R.id.tv1);
        }
    }
}

