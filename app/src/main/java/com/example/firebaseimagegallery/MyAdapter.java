package com.example.firebaseimagegallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private ArrayList<ImageClass> imageList;
    private Context context;

    public MyAdapter(ArrayList<ImageClass> imageList, Context context) {
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(imageList.get(position).getUrl()).into(holder.recyclerImage);
        holder.recyclerCaption.setText(imageList.get(position).getCaption());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView recyclerImage;
        TextView recyclerCaption;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerImage = itemView.findViewById(R.id.recycler_image);
            recyclerCaption = itemView.findViewById(R.id.recycler_caption);

        }


    }

}
