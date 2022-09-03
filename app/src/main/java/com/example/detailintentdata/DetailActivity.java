package com.example.detailintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //menyimpan data dari inputan di halaman awal dengan putextra di panggil dengan getStringExtra
    public static final String namaAnda = "com.example.detailintentdata.namaAnda";
    public static final String alamatAnda = "com.example.detailintentdata.alamatAnda";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //memanggil data dari halaman pertama untuk di tampilkan
        Intent intent = getIntent();
        String nama = intent.getStringExtra(namaAnda);
        String alamat  = intent.getStringExtra(alamatAnda);

        // inisialisasi naama widget sesuai id
        TextView Nama = findViewById(R.id.idTvNamaAnda);
        TextView Alamat = findViewById(R.id.idTvAlamatAnda);
        Nama.setText(nama);
        Alamat.setText(alamat);
    }
}