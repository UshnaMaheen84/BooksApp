package com.example.booksapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BooksAdapter   extends RecyclerView.Adapter<BooksAdapter.MyViewHolder> {
    ArrayList<dataModel> data ;
    Context context;

    public BooksAdapter(ArrayList<dataModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public BooksAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull BooksAdapter.MyViewHolder holder, int position) {

        dataModel modelData = data.get(position);
        holder.bookName.setText(modelData.getName());
        holder.imageView.setImageResource(modelData.getImageId());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent =  new Intent(context, BookDetails.class);
                 intent.putExtra("book_name",modelData.getName());
                 intent.putExtra("book_desc",modelData.getDesc());
                 intent.putExtra("book_image",modelData.getImageId());
                 intent.putExtra("pdf_name",modelData.getPdf());
                 context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public CardView mCardView;
        public TextView bookName;
        public ImageView imageView;

        public MyViewHolder(View v){
            super(v);

            mCardView = (CardView) v.findViewById(R.id.cardview1);
            bookName = (TextView) v.findViewById(R.id.name);
            imageView = (ImageView) v.findViewById(R.id.imageView);

        }
    }

}
