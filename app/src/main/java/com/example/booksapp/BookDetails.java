package com.example.booksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class BookDetails extends AppCompatActivity {

    ImageView imageView;
    TextView name, desc;
    Button read_btn;
    String book_name, book_desc, pdf_name;
    int imageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        imageView = findViewById(R.id.image);
        name = findViewById(R.id.book_name);
        desc = findViewById(R.id.desc);
        read_btn = findViewById(R.id.readBtn);

        book_name = getIntent().getExtras().getString("book_name");
        imageId = getIntent().getExtras().getInt("book_image");
        book_desc = getIntent().getExtras().getString("book_desc");
        pdf_name = getIntent().getExtras().getString("pdf_name");

        imageView.setImageResource(imageId);
        name.setText(book_name);
        desc.setText(book_desc);

        read_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(BookDetails.this, PdfViewer.class);
                intent.putExtra("pdf_name", pdf_name);
                startActivity(intent);
            }
        });

    }

}