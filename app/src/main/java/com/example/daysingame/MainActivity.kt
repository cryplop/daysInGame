package com.example.daysingame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.daysingame.com.example.daysingame.Character

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        days = findViewById(R.id.days)
    }
    private lateinit var days: TextView
    fun quarterHasPassed(view: View) {

        val intent = Intent(this@MainActivity, Character::class.java)
        startActivity(intent)

        //Увеличиваем счетчик
        val countString = days.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        days.text = count.toString();

        //вывети уведомление, что прошла четверть дня
        Toast.makeText(applicationContext,"Четверть дня пройдена!",Toast.LENGTH_SHORT).show();
    }
}