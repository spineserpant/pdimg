package com.example.csel351.pdfimg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfact);
        PDFView pdf = (PDFView)findViewById(R.id.pd);
        pdf.fromAsset("sample.PDF").load();

    }
}
