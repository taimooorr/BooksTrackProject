package com.thecodeguy.libraryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAllBooks,btnAlreadyRead,btnCurrentlyReading,btnWantToRead,
    btnFavoriteBooks,btnabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });

    }
    public void initViews() {
        btnAllBooks = findViewById(R.id.btnAllBook);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnCurrentlyReading = findViewById(R.id.btnCurrentlyReading);
        btnWantToRead = findViewById(R.id.btnWantToRead);
        btnFavoriteBooks = findViewById(R.id.btnFavorite);
        btnabout = findViewById(R.id.btnAbout);

    }

}