package com.alpesh1.tic_tac_toe_game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    int check;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img1.setImageResource(R.drawable.imgx);
                }else {

                    img1.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img2.setImageResource(R.drawable.imgx);
                }else {

                    img2.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img3.setImageResource(R.drawable.imgx);
                }else {

                    img3.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img4.setImageResource(R.drawable.imgx);
                }else {

                    img4.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img5.setImageResource(R.drawable.imgx);
                }else {

                    img5.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img6.setImageResource(R.drawable.imgx);
                }else {

                    img6.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img7.setImageResource(R.drawable.imgx);
                }else {

                    img7.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img8.setImageResource(R.drawable.imgx);
                }else {

                    img8.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img9.setImageResource(R.drawable.imgx);
                }else {

                    img9.setImageResource(R.drawable.imgo);
                }
                check++;
            }
        });
    }
}
