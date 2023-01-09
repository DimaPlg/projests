package com.example.scorekeep

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var team1cn = 0;
        var team2cn = 0;

        val buttonTI1 = findViewById<Button>(R.id.team1increment)
        val buttonTI2 = findViewById<Button>(R.id.team2increment)
        val buttonTD1 = findViewById<Button>(R.id.team1decrement)
        val buttonTD2 = findViewById<Button>(R.id.team2decrement)
        val team1 = findViewById<TextView>(R.id.team1score)
        val team2 = findViewById<TextView>(R.id.team2score)

        buttonTD1.setOnClickListener{
            team1cn--;
            team1.text = team1cn.toString()
        }
        buttonTD2.setOnClickListener{
            team2cn--;
            team2.text = team2cn.toString()
        }

        buttonTI1.setOnClickListener{
            team1cn++;
            team1.text = team1cn.toString()
        }
        buttonTI2.setOnClickListener{
            team2cn++;
            team2.text = team2cn.toString()
        }
    }
}