package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView;
    TextView emaiView;

    public myviewHolder(@NonNull View itemView){
        super(itemView);
        imageView =itemView.findViewById(R.id.img);
        nameView=itemView.findViewById(R.id.name);
        emaiView=itemView.findViewById(R.id.email);
    }
}
