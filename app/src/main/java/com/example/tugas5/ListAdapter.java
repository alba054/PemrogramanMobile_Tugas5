package com.example.tugas5;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private ArrayList<Anime> listAnime;

    public  ListAdapter(ArrayList<Anime> list){
        this.listAnime = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design, parent, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Anime anime = listAnime.get(position);
//        Glide.with(holder.itemView.getContext()).load(anime.getPhoto()).apply(new RequestOptions().override(55, 55));
        holder.tvName.setText(anime.getName());
        holder.tvGenre.setText(anime.getGenre());
        holder.imgPhoto.setBackgroundResource(anime.getPhoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onItemClickCallback.onItemClicked(listAnime.get(holder.getAdapterPosition()));
                Intent intent = new Intent(holder.itemView.getContext(), Detail.class);
                intent.putExtra("photo", anime.getPhoto());
                intent.putExtra("name", anime.getName());
                intent.putExtra("genre", anime.getGenre());
                intent.putExtra("detail", anime.getDetail());

                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvGenre;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.photo);
            tvName = itemView.findViewById(R.id.tvJudul);
            tvGenre = itemView.findViewById(R.id.tvGenre);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Anime data);
    }
}
