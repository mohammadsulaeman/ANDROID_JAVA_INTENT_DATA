package com.example.detailintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //melakukan inisialisasi nama widget sesuai id
        EditText namaanda = findViewById(R.id.idEdtNamaAnda);
        EditText alamatAnda = findViewById(R.id.idEdtAlamatAnda);
        Button kirim = findViewById(R.id.idButtonKirim);

        //melakukan aksi pada button untuk mengirimkan data ke halaman berikutnya dengan putExtra
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(getApplicationContext(), DetailActivity.class);
                detail.putExtra(DetailActivity.namaAnda, namaanda.getText().toString());
                detail.putExtra(DetailActivity.alamatAnda,alamatAnda.getText().toString());
                startActivity(detail);
            }
        });
    }
}