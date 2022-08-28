package com.example.booksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pdfview.PDFView;

public class PdfViewer extends AppCompatActivity {

    PDFView pdfView;
    String pdf_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        pdf_name = getIntent().getExtras().getString("pdf_name");

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset(pdf_name).show();
    }
}