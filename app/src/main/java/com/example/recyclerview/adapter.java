package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<myviewHolder>  {

    Context context;
    List<item> itemList;

    public adapter(Context context, List<item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewHolder(LayoutInflater.from(context).inflate(R.layout.layoutviewholder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.nameView.setText(itemList.get(position).getName());
        holder.emaiView.setText(itemList.get(position).getEmail());
        holder.imageView.setImageResource(itemList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
