package com.example.butamap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TentangMapActivity2 extends AppCompatActivity {

    //deklarasi
    ImageView TentangMapActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_map2);

        //menghubungkan komponen logic dengan komponen layout
        TentangMapActivity2 = findViewById(R.id.tentangbutamap);

          //ketika menu tentang map di klik
        TentangMapActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //di bagian kode inilah respon diberikan
                //kita munculkan Toast

                Toast.makeText(TentangMapActivity2.this, "Menu A Diklik", Toast.LENGTH_SHORT).show();

                //memberi respon pindah halaman


                //buat object dari class intent
                Intent linkToMap = new Intent(y.this,TentangMapActivity2.class);
                //mengatifkan link nya
                startActivity(linkToMap);

            }
        });
    }
}