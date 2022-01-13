package com.example.mobilki_nowy_rok_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//
        /*var a = 1;
        var obroot = findViewById<EditText>(R.id.obroot).text.toString().toFloat()
        findViewById<Button>(R.id.button2).setOnClickListener{
            a += 1;
            if (a==5){a=1}
            if(a == 1){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1helmetarmory)}
            if(a == 2){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1vestarmory)}
            if(a == 3){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2helmetarmory)}
            if(a == 4){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2vestarmory)}
        }
        findViewById<Button>(R.id.button).setOnClickListener{
            a -= 1;
            if (a==0){a=4}
            if(a == 1){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1helmetarmory)}
            if(a == 2){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1vestarmory)}
            if(a == 3){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2helmetarmory)}
            if(a == 4){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2vestarmory)}
        }

        findViewById<Button>(R.id.lewo).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setRotationY(obroot)
        }*/
    }
}