package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private TextView tvJudul, tvGenre, tvDescription;
    private ImageView photo, img;
    String judul, genre, description;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tvJudul);

        tvGenre = findViewById(R.id.tvGenre);

        tvDescription = findViewById(R.id.tvDescription);
        photo = findViewById(R.id.iv_cover);
        img = findViewById(R.id.iv_image);

        judul = getIntent().getStringExtra("name");
        genre = getIntent().getStringExtra("genre");
        description = getIntent().getStringExtra("detail");


        image = getIntent().getIntExtra("photo", 0);
        img.setBackgroundResource(image);
        photo.setImageResource(image);
        tvJudul.setText(judul);
        tvGenre.setText(genre);
        tvDescription.setText(description);



    }

}